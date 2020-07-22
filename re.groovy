#!groovy

def ipAddress = ~/([0-9]+\.[0-9]+\.[0-9]+\.[0-9]+)/
println ipAddress.class.name



//定义正则，L开头并以e结尾
def pattern = ~'L....e'
 
//尝试匹配
println pattern.matcher("Little").matches() // true



//定义正则表达式
def isCasePattern = ~/L\w+e/
//判断是否匹配    
println isCasePattern.isCase("Little")



//定义一个正则：A开头和字母结尾
def grepPattern = ~/A\w+/
//定义一个列表
def cities = ['Alabama', 'Los Angeles', 'Arizona']
//在list中按照正则表达式查找  
println cities.grep(grepPattern) // [Alabama, Arizona]

assert 'xxx' == '123'.replaceAll(/\d/,'x')