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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HashCodeTest {

    public static final JavaRecordLabel JAVA_RECORD_LABEL = new JavaRecordLabel("x0", "x1", "x2", "x3", "x4");
    public static final JavaRecordLabel JAVA_RECORD_LABEL_2 = new JavaRecordLabel("x0", "X1", "x2", "x3", "x4");
    public static final JavaRecordLabelUpper JAVA_RECORD_LABEL_UPPER = new JavaRecordLabelUpper("x0", "x1", "x2");
    public static final JavaRecordLabelUpper JAVA_RECORD_LABEL_UPPER_2 = new JavaRecordLabelUpper("x0", "X1", "x2");
    public static final GroovyRecordLabel GROOVY_RECORD_LABEL = new GroovyRecordLabel("x0", "x1", "x2", "x3", "x4");
    public static final GroovyRecordLabel GROOVY_RECORD_LABEL_2 = new GroovyRecordLabel("x0", "X1", "x2", "x3", "x4");
    public static final GroovyRecordLabelUpper GROOVY_RECORD_LABEL_UPPER = new GroovyRecordLabelUpper("x0", "x1", "x2");
    public static final GroovyRecordLabelUpper GROOVY_RECORD_LABEL_UPPER_2 = new GroovyRecordLabelUpper("x0", "X1", "x2");
    public static final GroovyEmulatedRecordLabel GROOVY_EMULATED_RECORD_LABEL = new GroovyEmulatedRecordLabel("x0", "x1", "x2", "x3", "x4");
    public static final GroovyEmulatedRecordLabel GROOVY_EMULATED_RECORD_LABEL_2 = new GroovyEmulatedRecordLabel("x0", "X1", "x2", "x3", "x4");
    public static final GroovyRecordWithEqualsUsingGettersUpperLabel GROOVY_RECORD_UPPER_GETTER_LABEL = new GroovyRecordWithEqualsUsingGettersUpperLabel("x0", "x1", "x2", "x3", "x4");
    public static final GroovyRecordWithEqualsUsingGettersUpperLabel GROOVY_RECORD_UPPER_GETTER_LABEL_2 = new GroovyRecordWithEqualsUsingGettersUpperLabel("x0", "X1", "x2", "x3", "x4");

    @Test
    void testHashCodeImplementations() {
//        System.out.println("javaRecordLabel = " + javaRecordLabel + " (" + javaRecordLabel.hashCode() + ")");
//        System.out.println("javaRecordLabel2 = " + javaRecordLabel2 + " (" + javaRecordLabel2.hashCode() + ")");
//        System.out.println("javaRecordLabelUpper = " + javaRecordLabelUpper + " (" + javaRecordLabelUpper.hashCode() + ")");
//        System.out.println("javaRecordLabelUpper2 = " + javaRecordLabelUpper2 + " (" + javaRecordLabelUpper2.hashCode() + ")");
//        System.out.println("javaRecordLabel2 == javaRecordLabel: " + javaRecordLabel2.equals(javaRecordLabel));
//        System.out.println("javaRecordLabelUpper2 == javaRecordLabelUpper: " + javaRecordLabelUpper2.equals(javaRecordLabelUpper));
//        System.out.println("groovyRecordLabel = " + groovyRecordLabel + " (" + groovyRecordLabel.hashCode() + ")");
//        System.out.println("groovyRecordLabel2 = " + groovyRecordLabel2 + " (" + groovyRecordLabel2.hashCode() + ")");
//        System.out.println("groovyRecordLabelUpper = " + groovyRecordLabelUpper + " (" + groovyRecordLabelUpper.hashCode() + ")");
//        System.out.println("groovyRecordLabelUpper2 = " + groovyRecordLabelUpper2 + " (" + groovyRecordLabelUpper2.hashCode() + ")");
//        System.out.println("groovyEmulatedRecordLabel = " + groovyEmulatedRecordLabel + " (" + groovyEmulatedRecordLabel.hashCode() + ")");
//        System.out.println("groovyEmulatedRecordLabel2 = " + groovyEmulatedRecordLabel2 + " (" + groovyEmulatedRecordLabel2.hashCode() + ")");
//        System.out.println("groovyRecordLabel2 == groovyRecordLabel: " + groovyRecordLabel2.equals(groovyRecordLabel));
//        System.out.println("groovyRecordLabelUpper2 == groovyRecordLabelUpper: " + groovyRecordLabelUpper2.equals(groovyRecordLabelUpper));
//        System.out.println("groovyEmulatedRecordLabel2 == groovyEmulatedRecordLabel: " + groovyEmulatedRecordLabel2.equals(groovyEmulatedRecordLabel));
        assertTrue(JAVA_RECORD_LABEL.hashCode() != 0);
        assertTrue(GROOVY_RECORD_LABEL.hashCode() != 0);
        assertTrue(new GroovyEmulatedRecordLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
        assertTrue(new LombokDataLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
        assertTrue(new KotlinDataLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
        assertTrue(new ScalaCaseLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
    }

    @Test
    void testEqualsImplementations() {
        assertFalse(JAVA_RECORD_LABEL.equals(JAVA_RECORD_LABEL_2));
        assertFalse(JAVA_RECORD_LABEL_UPPER.equals(JAVA_RECORD_LABEL_UPPER_2));
        assertFalse(GROOVY_RECORD_LABEL.equals(GROOVY_RECORD_LABEL_2));
        assertFalse(GROOVY_RECORD_LABEL_UPPER.equals(GROOVY_RECORD_LABEL_UPPER_2));
        assertTrue(GROOVY_RECORD_UPPER_GETTER_LABEL.equals(GROOVY_RECORD_UPPER_GETTER_LABEL_2));
    }
}
