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
public class HashCodeCacheBenchmark {
    private static final String X0 = "X0";
    private static final String X1 = "XX11";
    private static final String X2 = "XXX222";
    private static final String X3 = "XXXX3333";
    private static final String X4 = "XXXXX44444";
    private static final JavaRecordLabel JAVA_RECORD_LABEL = new JavaRecordLabel(X0, X1, X2, X3, X4);
    private static final GroovyRecordWithCacheLabel GROOVY_RECORD_WITH_CACHE_LABEL = new GroovyRecordWithCacheLabel(X0, X1, X2, X3, X4);

    @Benchmark
    public void hashcodeJavaRecord(Blackhole bh) {
        bh.consume(JAVA_RECORD_LABEL.hashCode()
            + JAVA_RECORD_LABEL.hashCode()
            + JAVA_RECORD_LABEL.hashCode()
            + JAVA_RECORD_LABEL.hashCode()
            + JAVA_RECORD_LABEL.hashCode());
    }

    @Benchmark
    public void hashcodeGroovyCacheRecord(Blackhole bh) {
        bh.consume(GROOVY_RECORD_WITH_CACHE_LABEL.hashCode()
            + GROOVY_RECORD_WITH_CACHE_LABEL.hashCode()
            + GROOVY_RECORD_WITH_CACHE_LABEL.hashCode()
            + GROOVY_RECORD_WITH_CACHE_LABEL.hashCode()
            + GROOVY_RECORD_WITH_CACHE_LABEL.hashCode());
    }

}
