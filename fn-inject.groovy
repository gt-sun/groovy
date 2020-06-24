#!/usr/bin/env groovy

def String convertToCSV( List<String> list ) { if (list == null) {
        return '' }
    return list.inject( '' ) { result, item ->
        result + ( result && item ? ',' : '' ) + ( item ? "${item.trim()}" : '' )
} }
assert convertToCSV( null ) == ''
assert convertToCSV( ['aaa', 'bbb ', null, ' ccc '] ) == 'aaa,bbb,ccc'

assert [1, 2, 3].inject(0) { sum, value -> sum + value } == 6  // 0 + 1 + 2 + 3
