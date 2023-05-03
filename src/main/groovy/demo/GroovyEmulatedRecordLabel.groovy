package demo

import groovy.transform.RecordOptions
import groovy.transform.RecordTypeMode
import groovy.transform.TupleConstructor
//import groovy.transform.EqualsAndHashCode

@RecordOptions(toList = false, toMap = false, size = false, getAt = false, mode = RecordTypeMode.EMULATE)
@TupleConstructor(defaults = false, namedVariant = false)
//@EqualsAndHashCode(useGetters = true)
record GroovyEmulatedRecordLabel(String x0, String x1, String x2, String x3, String x4) {
//    String x1() { x1.toUpperCase() }
//    int hashCode() {
//        return Arrays.hashCode(new Object[]{x0, x1, x2, x3, x4})
//    }
}
