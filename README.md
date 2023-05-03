# record-performance

Results:

    Benchmark                                             Mode  Cnt   Score   Error  Units
    EqualsBenchmark.equalsGroovyEmulatedGetterRecord      avgt   10  17.810 ± 0.631  ns/op
    EqualsBenchmark.equalsGroovyEmulatedRecord            avgt   10  11.047 ± 0.329  ns/op
    EqualsBenchmark.equalsGroovyRecord                    avgt   10   0.365 ± 0.007  ns/op
    EqualsBenchmark.equalsJavaRecord                      avgt   10   0.366 ± 0.006  ns/op
    EqualsBenchmark.equalsKotlinDataLabel                 avgt   10   2.178 ± 0.030  ns/op
    EqualsBenchmark.equalsLombokDataLabel                 avgt   10  18.308 ± 0.558  ns/op
    EqualsBenchmark.equalsScalaCaseLabel                  avgt   10  18.015 ± 0.568  ns/op
    HashCodeBenchmark.hashcodeGroovyEmulatedGetterRecord  avgt   10  18.862 ± 0.442  ns/op
    HashCodeBenchmark.hashcodeGroovyEmulatedRecord        avgt   10   2.108 ± 0.128  ns/op
    HashCodeBenchmark.hashcodeGroovyRecord                avgt   10   2.249 ± 0.078  ns/op
    HashCodeBenchmark.hashcodeJavaRecord                  avgt   10   2.238 ± 0.060  ns/op
    HashCodeBenchmark.hashcodeKotlinDataLabel             avgt   10   4.355 ± 0.102  ns/op
    HashCodeBenchmark.hashcodeLombokDataLabel             avgt   10  12.294 ± 0.337  ns/op
    HashCodeBenchmark.hashcodeScalaCaseLabel              avgt   10  12.521 ± 0.300  ns/op
