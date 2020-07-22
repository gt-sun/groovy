#!groovy
def res = new URL("http://10.12.145.79:8080/header")
        .getText(connectTimeout: 5000, 
                readTimeout: 10000, 
                useCaches: true, 
                allowUserInteraction: false, 
                requestProperties: ['Content-Type': 'application/json', 'User-agent': 'curl'])

println res        