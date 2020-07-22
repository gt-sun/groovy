#!groovy

j = new groovy.json.JsonSlurper().parseText(new URL("https://httpbin.org/get").getText())

println j.headers["User-Agent"]


// GET

def get = new URL("https://httpbin.org/get").openConnection();
def getRC = get.getResponseCode();
println(getRC);
if(getRC.equals(200)) {
    println(get.getInputStream().getText());
}

// OR
def res = new URL("http://10.12.145.79:8080/header")
        .getText(connectTimeout: 5000, 
                readTimeout: 10000, 
                useCaches: true, 
                allowUserInteraction: false, 
                requestProperties: ['Content-Type': 'application/json', 'User-agent': 'curl'])

println res        

// POST
def post = new URL("https://httpbin.org/post").openConnection();
def message = '{"message":"this is a message"}'
post.setRequestMethod("POST")
post.setDoOutput(true)
post.setRequestProperty("Content-Type", "application/json2")
post.getOutputStream().write(message.getBytes("UTF-8"));
def postRC = post.getResponseCode();
println(postRC);
if(postRC.equals(200)) {
    println(post.getInputStream().getText());
}