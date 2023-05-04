# record-performance

Results:

    Benchmark                                             Mode  Cnt   Score   Error  Units
    EqualsBenchmark.equalsGroovyEmulatedRecord            avgt   10  10.741 ± 0.246  ns/op
    EqualsBenchmark.equalsGroovyRecord                    avgt   10   0.359 ± 0.005  ns/op
    EqualsBenchmark.equalsJavaRecord                      avgt   10   0.368 ± 0.013  ns/op
    EqualsBenchmark.equalsKotlinDataLabel                 avgt   10   2.147 ± 0.017  ns/op
    EqualsBenchmark.equalsLombokDataLabel                 avgt   10  17.723 ± 0.226  ns/op
    EqualsBenchmark.equalsScalaCaseLabel                  avgt   10  17.925 ± 0.353  ns/op

    HashCodeBenchmark.hashcodeGroovyEmulatedRecord        avgt   10   1.936 ± 0.038  ns/op
    HashCodeBenchmark.hashcodeGroovyRecord                avgt   10   1.983 ± 0.020  ns/op
    HashCodeBenchmark.hashcodeJavaRecord                  avgt   10   2.410 ± 0.047  ns/op
    HashCodeBenchmark.hashcodeKotlinDataLabel             avgt   10   4.325 ± 0.046  ns/op
    HashCodeBenchmark.hashcodeLombokDataLabel             avgt   10  12.281 ± 0.161  ns/op
    HashCodeBenchmark.hashcodeScalaCaseLabel              avgt   10  12.100 ± 0.255  ns/op

    HashCodeCacheBenchmark.hashcodeGroovyCacheRecord      avgt   10   3.165 ± 0.036  ns/op
    HashCodeCacheBenchmark.hashcodeJavaRecord             avgt   10  16.749 ± 0.261  ns/op
