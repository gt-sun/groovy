#!groovy

import groovy.json.JsonSlurper
import groovy.json.*
 
def jsonObj = new JsonSlurper().parseText( '{ "name":"Peter", "age": 23}' )
 
assert jsonObj.name == "Peter"
assert jsonObj.age == 23
assert jsonObj.gender == null


// 将对象转为json的示例代码如下:
class Me {
    String name
}
 
def o = new Me( name: 'tim' )
 
println new JsonBuilder( o ).toPrettyString() 