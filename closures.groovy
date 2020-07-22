#!/usr/bin/env groovy

def addNumbers = {a,b -> a+b}
println addNumbers(1,9)



// find 闭包
def a = [1, 2, 3, 4, 5, 6, 7]

a.find { 
    if (it > 5) return true // 退出遍历
    println it  // 执行遍历操作
    return false // 继续遍历
}


// 不定长参数
def combine = { String... names ->    
    println names
    names.join(',')    
}    
     
println combine('John', 'Doe', 'Betty') // John,Doe,Betty

// ref:
// - https://www.tutorialspoint.com/groovy/groovy_closures.htm