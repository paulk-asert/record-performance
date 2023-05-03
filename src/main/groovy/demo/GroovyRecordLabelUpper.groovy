package demo

import groovy.transform.RecordOptions
import groovy.transform.TupleConstructor

@RecordOptions(toList = false, toMap = false, size = false, getAt = false)
@TupleConstructor(defaults = false, namedVariant = false)
record GroovyRecordLabelUpper(String x0, String x1, String x2) {
    String x1() { x1.toUpperCase() }
}
