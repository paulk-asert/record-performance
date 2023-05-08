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
package demo

import com.google.common.hash.HashFunction
import com.google.common.hash.Hashing
import groovy.transform.RecordOptions
import groovy.transform.TupleConstructor

import static org.apache.commons.codec.digest.MurmurHash3.hash32x86

@RecordOptions(toList = false, toMap = false, size = false, getAt = false)
@TupleConstructor(defaults = false, namedVariant = false)
record GroovyRecordCommonsCodecMurmur3Label(String x0, String x1, String x2, String x3, String x4) {
    private static HashFunction murmur3 = Hashing.murmur3_32_fixed()

    int hashCode() {
        int result = hash32x86(x0.bytes)
        result = 31 * result + hash32x86(x1.bytes)
        result = 31 * result + hash32x86(x2.bytes)
        result = 31 * result + hash32x86(x3.bytes)
        31 * result + hash32x86(x4.bytes)
    }
}
