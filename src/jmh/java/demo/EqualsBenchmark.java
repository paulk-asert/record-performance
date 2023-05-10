/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
    private static final JavaRecordLabel JAVA_RECORD_LABEL = new JavaRecordLabel(X0, X1, X2, X3, X4);
    private static final JavaRecordLabel JAVA_RECORD_LABEL_2 = new JavaRecordLabel(X0, X1, X2, X3, X4);
    private static final GroovyRecordLabel GROOVY_RECORD_LABEL = new GroovyRecordLabel(X0, X1, X2, X3, X4);
    private static final GroovyRecordLabel GROOVY_RECORD_LABEL_2 = new GroovyRecordLabel(X0, X1, X2, X3, X4);
    private static final GroovyEmulatedRecordLabel GROOVY_EMULATED_RECORD_LABEL = new GroovyEmulatedRecordLabel(X0, X1, X2, X3, X4);
    private static final GroovyEmulatedRecordLabel GROOVY_EMULATED_RECORD_LABEL_2 = new GroovyEmulatedRecordLabel(X0, X1, X2, X3, X4);
    // private static final GroovyRecordWithEqualsUsingGettersUpperLabel GROOVY_RECORD_WITH_EQUALS_USING_GETTERS_UPPER_LABEL = new GroovyRecordWithEqualsUsingGettersUpperLabel(X0, X1, X2, X3, X4);
    // private static final GroovyRecordWithEqualsUsingGettersUpperLabel GROOVY_RECORD_WITH_EQUALS_USING_GETTERS_UPPER_LABEL_2 = new GroovyRecordWithEqualsUsingGettersUpperLabel(X0, X1, X2, X3, X4);
    private static final LombokDirectDataLabel LOMBOK_DIRECT_DATA_LABEL = new LombokDirectDataLabel(X0, X1, X2, X3, X4);
    private static final LombokDirectDataLabel LOMBOK_DIRECT_DATA_LABEL_2 = new LombokDirectDataLabel(X0, X1, X2, X3, X4);
    private static final LombokDataLabel LOMBOK_DATA_LABEL = new LombokDataLabel(X0, X1, X2, X3, X4);
    private static final LombokDataLabel LOMBOK_DATA_LABEL_2 = new LombokDataLabel(X0, X1, X2, X3, X4);
    private static final KotlinDataLabel KOTLIN_DATA_LABEL = new KotlinDataLabel(X0, X1, X2, X3, X4);
    private static final KotlinDataLabel KOTLIN_DATA_LABEL_2 = new KotlinDataLabel(X0, X1, X2, X3, X4);
    private static final ScalaCaseLabel SCALA_CASE_LABEL = new ScalaCaseLabel(X0, X1, X2, X3, X4);
    private static final ScalaCaseLabel SCALA_CASE_LABEL_2 = new ScalaCaseLabel(X0, X1, X2, X3, X4);

    @Benchmark
    public void equalsJavaRecord(Blackhole bh) {
        bh.consume(JAVA_RECORD_LABEL.equals(JAVA_RECORD_LABEL_2));
    }

    @Benchmark
    public void equalsGroovyRecord(Blackhole bh) {
        bh.consume(GROOVY_RECORD_LABEL.equals(GROOVY_RECORD_LABEL_2));
    }

    @Benchmark
    public void equalsGroovyEmulatedRecord(Blackhole bh) {
        bh.consume(GROOVY_EMULATED_RECORD_LABEL.equals(GROOVY_EMULATED_RECORD_LABEL_2));
    }

//    @Benchmark
//    public void equalsGroovyEmulatedGetterRecord(Blackhole bh) {
//        bh.consume(GROOVY_RECORD_WITH_EQUALS_USING_GETTERS_UPPER_LABEL.equals(GROOVY_RECORD_WITH_EQUALS_USING_GETTERS_UPPER_LABEL_2));
//    }

    @Benchmark
    public void equalsLombokDirectDataLabel(Blackhole bh) {
        bh.consume(LOMBOK_DIRECT_DATA_LABEL.equals(LOMBOK_DIRECT_DATA_LABEL_2));
    }

    @Benchmark
    public void equalsLombokDataLabel(Blackhole bh) {
        bh.consume(LOMBOK_DATA_LABEL.equals(LOMBOK_DATA_LABEL_2));
    }

    @Benchmark
    public void equalsKotlinDataLabel(Blackhole bh) {
        bh.consume(KOTLIN_DATA_LABEL.equals(KOTLIN_DATA_LABEL_2));
    }

    @Benchmark
    public void equalsScalaCaseLabel(Blackhole bh) {
        bh.consume(SCALA_CASE_LABEL.equals(SCALA_CASE_LABEL_2));
    }
}
