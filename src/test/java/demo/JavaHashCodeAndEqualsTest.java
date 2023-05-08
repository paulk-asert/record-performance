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

class JavaHashCodeAndEqualsTest {

    private static final JavaRecordLabel JAVA_RECORD_LABEL = new JavaRecordLabel("x0", "x1", "x2", "x3", "x4");
    private static final JavaRecordLabel JAVA_RECORD_LABEL_2 = new JavaRecordLabel("x0", "X1", "x2", "x3", "x4");
    private static final JavaRecordLabelUpper JAVA_RECORD_LABEL_UPPER
        = new JavaRecordLabelUpper("a", "b", "c");
    private static final JavaRecordLabelUpper JAVA_RECORD_LABEL_UPPER_2
        = new JavaRecordLabelUpper("a", "B", "c");

    @Test
    void testJavaHashCodeImplementations() {
        assertTrue(JAVA_RECORD_LABEL.hashCode() != 0);
    }

    @Test
    void testJavaEqualsImplementations() {
        assertNotEquals(JAVA_RECORD_LABEL, JAVA_RECORD_LABEL_2);
        assertEquals(JAVA_RECORD_LABEL_UPPER.x0(), JAVA_RECORD_LABEL_UPPER_2.x0());
        assertEquals(JAVA_RECORD_LABEL_UPPER.x1(), JAVA_RECORD_LABEL_UPPER_2.x1());
        assertEquals(JAVA_RECORD_LABEL_UPPER.x2(), JAVA_RECORD_LABEL_UPPER_2.x2());
        assertNotEquals(JAVA_RECORD_LABEL_UPPER.hashCode(), JAVA_RECORD_LABEL_UPPER_2.hashCode());
        assertNotEquals(JAVA_RECORD_LABEL_UPPER, JAVA_RECORD_LABEL_UPPER_2);
    }
}
