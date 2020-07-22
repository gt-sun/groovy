#!groovy

//定义输出流和错误流
def sout = new StringBuilder(), serr = new StringBuilder()
//定义shell
def proc = 'hostname'.execute()
//执行shell并获取输出和异常
proc.consumeProcessOutput(sout, serr)
//设置超时时间
proc.waitForOrKill(1000)
//打印输出和错误信息（假如有的话）
println "out> $sout err> $serr"