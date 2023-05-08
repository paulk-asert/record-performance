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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HashCodeAndEqualsTest {

    private static final GroovyRecordLabel GROOVY_RECORD_LABEL = new GroovyRecordLabel("x0", "x1", "x2", "x3", "x4");
    private static final GroovyRecordLabel GROOVY_RECORD_LABEL_2 = new GroovyRecordLabel("x0", "X1", "x2", "x3", "x4");
    private static final GroovyRecordLabelUpper GROOVY_RECORD_LABEL_UPPER = new GroovyRecordLabelUpper("a", "b", "c");
    private static final GroovyRecordLabelUpper GROOVY_RECORD_LABEL_UPPER_2 = new GroovyRecordLabelUpper("a", "B", "c");
    private static final GroovyRecordLabelUpperGetter GROOVY_RECORD_LABEL_UPPER_GETTER
        = new GroovyRecordLabelUpperGetter("a", "b", "c");
    private static final GroovyRecordLabelUpperGetter GROOVY_RECORD_LABEL_UPPER_GETTER_2
        = new GroovyRecordLabelUpperGetter("a", "B", "c");

    @Test
    void testGroovyHashCodeImplementations() {
        assertTrue(GROOVY_RECORD_LABEL.hashCode() != 0);
        assertTrue(new GroovyEmulatedRecordLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
        assertNotEquals(GROOVY_RECORD_LABEL_UPPER.hashCode(), GROOVY_RECORD_LABEL_UPPER_2.hashCode());
        assertEquals(GROOVY_RECORD_LABEL_UPPER_GETTER.hashCode(),
                     GROOVY_RECORD_LABEL_UPPER_GETTER_2.hashCode());
    }
    @Test
    void testLombokHashCodeImplementations() {
        assertTrue(new LombokDataLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
    }
    @Test
    void testKotlinHashCodeImplementations() {
        assertTrue(new KotlinDataLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
    }
    @Test
    void testScalaHashCodeImplementations() {
        assertTrue(new ScalaCaseLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
    }

    @Test
    void testGroovyEqualsImplementations() {
        assertNotEquals(GROOVY_RECORD_LABEL, GROOVY_RECORD_LABEL_2);
        assertNotEquals(GROOVY_RECORD_LABEL_UPPER, GROOVY_RECORD_LABEL_UPPER_2);
        assertEquals(GROOVY_RECORD_LABEL_UPPER_GETTER, GROOVY_RECORD_LABEL_UPPER_GETTER_2);
    }
}
