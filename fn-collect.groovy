#!/usr/bin/env groovy
    
def int countSize(List<String> strings) {
    return strings.collect{it.size()}.sum()
}

assert countSize(['a','bb','ccc']) == 6

// 'it' is the default name of the parameter
assert ['cat', 'dog', 'fish'].collect{it.length()}.sum() == 10
// 手动指定name
assert ['cat', 'dog', 'fish'].collect{this -> this.length()}.sum() == 10


// 
def lst = [1,2,3,4];
def newlst = [];
newlst = lst.collect {element -> return element * element}
println(newlst);