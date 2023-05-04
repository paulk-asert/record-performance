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

import groovy.transform.EqualsAndHashCode
import groovy.transform.RecordOptions
import groovy.transform.RecordTypeMode
import groovy.transform.TupleConstructor

@RecordOptions(toList = false, toMap = false, size = false, getAt = false, mode = RecordTypeMode.EMULATE)
@TupleConstructor(defaults = false, namedVariant = false)
@EqualsAndHashCode(useGetters = false, cache = true)
record GroovyRecordWithCacheLabel(String x0, String x1, String x2, String x3, String x4) {
}