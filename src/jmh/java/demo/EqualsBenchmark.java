package demo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class EqualsBenchmark {
	private static final String X0 = "X0";
	private static final String X1 = "XX11";
	private static final String X2 = "XXX222";
	private static final String X3 = "XXXX3333";
	private static final String X4 = "XXXXX44444";
	private static final JavaRecordLabel javaRecordLabel = new JavaRecordLabel(X0, X1, X2, X3, X4);
	private static final JavaRecordLabel javaRecordLabel2 = new JavaRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyRecordLabel groovyRecordLabel = new GroovyRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyRecordLabel groovyRecordLabel2 = new GroovyRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyEmulatedRecordLabel groovyEmulatedRecordLabel = new GroovyEmulatedRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyEmulatedRecordLabel groovyEmulatedRecordLabel2 = new GroovyEmulatedRecordLabel(X0, X1, X2, X3, X4);
	private static final GroovyEmulatedRecordGetterLabel groovyEmulatedRecordGetterLabel = new GroovyEmulatedRecordGetterLabel(X0, X1, X2, X3, X4);
	private static final GroovyEmulatedRecordGetterLabel groovyEmulatedRecordGetterLabel2 = new GroovyEmulatedRecordGetterLabel(X0, X1, X2, X3, X4);
	private static final LombokDataLabel lombokDataLabel = new LombokDataLabel(X0, X1, X2, X3, X4);
	private static final LombokDataLabel lombokDataLabel2 = new LombokDataLabel(X0, X1, X2, X3, X4);
	private static final KotlinDataLabel kotlinDataLabel = new KotlinDataLabel(X0, X1, X2, X3, X4);
	private static final KotlinDataLabel kotlinDataLabel2 = new KotlinDataLabel(X0, X1, X2, X3, X4);
	private static final ScalaCaseLabel scalaCaseLabel = new ScalaCaseLabel(X0, X1, X2, X3, X4);
	private static final ScalaCaseLabel scalaCaseLabel2 = new ScalaCaseLabel(X0, X1, X2, X3, X4);

    @Benchmark
    public void equalsJavaRecord(Blackhole bh) {
        bh.consume(javaRecordLabel.equals(javaRecordLabel2));
    }

    @Benchmark
    public void equalsGroovyRecord(Blackhole bh) {
        bh.consume(groovyRecordLabel.equals(groovyRecordLabel2));
    }

    @Benchmark
    public void equalsGroovyEmulatedRecord(Blackhole bh) {
        bh.consume(groovyEmulatedRecordLabel.equals(groovyEmulatedRecordLabel2));
    }

    @Benchmark
    public void equalsGroovyEmulatedGetterRecord(Blackhole bh) {
        bh.consume(groovyEmulatedRecordGetterLabel.equals(groovyEmulatedRecordGetterLabel2));
    }

    @Benchmark
    public void equalsLombokDataLabel(Blackhole bh) {
        bh.consume(lombokDataLabel.equals(lombokDataLabel2));
    }

    @Benchmark
    public void equalsKotlinDataLabel(Blackhole bh) {
        bh.consume(kotlinDataLabel.equals(kotlinDataLabel2));
    }

    @Benchmark
    public void equalsScalaCaseLabel(Blackhole bh) {
        bh.consume(scalaCaseLabel.equals(scalaCaseLabel2));
    }
}
