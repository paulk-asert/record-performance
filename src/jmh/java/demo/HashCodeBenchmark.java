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
public class HashCodeBenchmark {
    private static final String X0 = "X0";
    private static final String X1 = "XX11";
    private static final String X2 = "XXX222";
    private static final String X3 = "XXXX3333";
    private static final String X4 = "XXXXX44444";
    private static final JavaRecordLabel JAVA_RECORD_LABEL = new JavaRecordLabel(X0, X1, X2, X3, X4);
    private static final GroovyRecordLabel GROOVY_RECORD_LABEL = new GroovyRecordLabel(X0, X1, X2, X3, X4);
    private static final GroovyRecordScalaMurmur3Label GROOVY_RECORD_SCALA_MURMUR_3_LABEL = new GroovyRecordScalaMurmur3Label(X0, X1, X2, X3, X4);
//    private static final GroovyRecordGuavaMurmur3Label GROOVY_RECORD_GUAVA_MURMUR_3_LABEL = new GroovyRecordGuavaMurmur3Label(X0, X1, X2, X3, X4);
//    private static final GroovyRecordCommonsCodecMurmur3Label GROOVY_RECORD_COMMONS_CODEC_MURMUR_3_LABEL = new GroovyRecordCommonsCodecMurmur3Label(X0, X1, X2, X3, X4);
    private static final GroovyEmulatedRecordLabel GROOVY_EMULATED_RECORD_LABEL = new GroovyEmulatedRecordLabel(X0, X1, X2, X3, X4);
//    private static final GroovyEmulatedRecordUsingGettersLabel GROOVY_EMULATED_RECORD_USING_GETTERS_LABEL = new GroovyEmulatedRecordUsingGettersLabel(X0, X1, X2, X3, X4);
    private static final LombokDataLabel LOMBOK_DATA_LABEL = new LombokDataLabel(X0, X1, X2, X3, X4);
    private static final KotlinDataLabel KOTLIN_DATA_LABEL = new KotlinDataLabel(X0, X1, X2, X3, X4);
    private static final ScalaCaseLabel SCALA_CASE_LABEL = new ScalaCaseLabel(X0, X1, X2, X3, X4);

    @Benchmark
    public void hashcodeJavaRecord(Blackhole bh) {
        bh.consume(JAVA_RECORD_LABEL.hashCode());
    }

    @Benchmark
    public void hashcodeGroovyRecord(Blackhole bh) {
        bh.consume(GROOVY_RECORD_LABEL.hashCode());
    }

    @Benchmark
    public void hashcodeGroovyEmulatedRecord(Blackhole bh) {
        bh.consume(GROOVY_EMULATED_RECORD_LABEL.hashCode());
    }

    @Benchmark
    public void hashcodeGroovyScalaMurmur3Record(Blackhole bh) {
        bh.consume(GROOVY_RECORD_SCALA_MURMUR_3_LABEL.hashCode());
    }

//    @Benchmark
//    public void hashcodeGroovyGuavaMurmur3Record(Blackhole bh) {
//        bh.consume(GROOVY_RECORD_GUAVA_MURMUR_3_LABEL.hashCode());
//    }

//    @Benchmark
//    public void hashcodeGroovyApacheMurmur3Record(Blackhole bh) {
//        bh.consume(GROOVY_RECORD_COMMONS_CODEC_MURMUR_3_LABEL.hashCode());
//    }

//    @Benchmark
//    public void hashcodeGroovyEmulatedGetterRecord(Blackhole bh) {
//        bh.consume(GROOVY_EMULATED_RECORD_USING_GETTERS_LABEL.hashCode());
//    }

    @Benchmark
    public void hashcodeLombokDataLabel(Blackhole bh) {
        bh.consume(LOMBOK_DATA_LABEL.hashCode());
    }

    @Benchmark
    public void hashcodeKotlinDataLabel(Blackhole bh) {
        bh.consume(KOTLIN_DATA_LABEL.hashCode());
    }

    @Benchmark
    public void hashcodeScalaCaseLabel(Blackhole bh) {
        bh.consume(SCALA_CASE_LABEL.hashCode());
    }
}
