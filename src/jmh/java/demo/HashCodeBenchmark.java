package demo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class HashCodeBenchmark {
	private static final String X0 = "X0";
	private static final String X1 = "XX11";
	private static final String X2 = "XXX222";
	private static final String X3 = "XXXX3333";
	private static final String X4 = "XXXXX44444";
	private static final JavaRecordLabel javaRecordLabel = new JavaRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyRecordLabel groovyRecordLabel = new GroovyRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyEmulatedRecordLabel groovyEmulatedRecordLabel = new GroovyEmulatedRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyEmulatedRecordGetterLabel groovyEmulatedRecordGetterLabel = new GroovyEmulatedRecordGetterLabel(X0, X1, X2, X3, X4);
	private static final LombokDataLabel lombokDataLabel = new LombokDataLabel(X0, X1, X2, X3, X4);
	private static final KotlinDataLabel kotlinDataLabel = new KotlinDataLabel(X0, X1, X2, X3, X4);
	private static final ScalaCaseLabel scalaCaseLabel = new ScalaCaseLabel(X0, X1, X2, X3, X4);

    @Benchmark
    public void hashcodeJavaRecord(Blackhole bh) {
        bh.consume(javaRecordLabel.hashCode());
    }

    @Benchmark
    public void hashcodeGroovyRecord(Blackhole bh) {
        bh.consume(groovyRecordLabel.hashCode());
    }

    @Benchmark
    public void hashcodeGroovyEmulatedRecord(Blackhole bh) {
        bh.consume(groovyEmulatedRecordLabel.hashCode());
    }

    @Benchmark
    public void hashcodeGroovyEmulatedGetterRecord(Blackhole bh) {
        bh.consume(groovyEmulatedRecordGetterLabel.hashCode());
    }

    @Benchmark
    public void hashcodeLombokDataLabel(Blackhole bh) {
        bh.consume(lombokDataLabel.hashCode());
    }

    @Benchmark
    public void hashcodeKotlinDataLabel(Blackhole bh) {
        bh.consume(kotlinDataLabel.hashCode());
    }

    @Benchmark
    public void hashcodeScalaCaseLabel(Blackhole bh) {
        bh.consume(scalaCaseLabel.hashCode());
    }
}
