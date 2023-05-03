package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HashCodeTest {
    @Test
    void testHashCodeImplementations() {
        JavaRecordLabel javaRecordLabel = new JavaRecordLabel("x0", "x1", "x2", "x3", "x4");
        JavaRecordLabel javaRecordLabel2 = new JavaRecordLabel("x0", "X1", "x2", "x3", "x4");
        JavaRecordLabelUpper javaRecordLabelUpper = new JavaRecordLabelUpper("x0", "x1", "x2");
        JavaRecordLabelUpper javaRecordLabelUpper2 = new JavaRecordLabelUpper("x0", "X1", "x2");
        System.out.println("javaRecordLabel = " + javaRecordLabel + " (" + javaRecordLabel.hashCode() + ")");
        System.out.println("javaRecordLabel2 = " + javaRecordLabel2 + " (" + javaRecordLabel2.hashCode() + ")");
        System.out.println("javaRecordLabelUpper = " + javaRecordLabelUpper + " (" + javaRecordLabelUpper.hashCode() + ")");
        System.out.println("javaRecordLabelUpper2 = " + javaRecordLabelUpper2 + " (" + javaRecordLabelUpper2.hashCode() + ")");
        System.out.println("javaRecordLabel2 == javaRecordLabel: " + javaRecordLabel2.equals(javaRecordLabel));
        System.out.println("javaRecordLabelUpper2 == javaRecordLabelUpper: " + javaRecordLabelUpper2.equals(javaRecordLabelUpper));
        GroovyRecordLabel groovyRecordLabel = new GroovyRecordLabel("x0", "x1", "x2", "x3", "x4");
        GroovyRecordLabel groovyRecordLabel2 = new GroovyRecordLabel("x0", "X1", "x2", "x3", "x4");
        GroovyRecordLabelUpper groovyRecordLabelUpper = new GroovyRecordLabelUpper("x0", "x1", "x2");
        GroovyRecordLabelUpper groovyRecordLabelUpper2 = new GroovyRecordLabelUpper("x0", "X1", "x2");
        GroovyEmulatedRecordLabel groovyEmulatedRecordLabel = new GroovyEmulatedRecordLabel("x0", "x1", "x2", "x3", "x4");
        GroovyEmulatedRecordLabel groovyEmulatedRecordLabel2 = new GroovyEmulatedRecordLabel("x0", "X1", "x2", "x3", "x4");
        System.out.println("groovyRecordLabel = " + groovyRecordLabel + " (" + groovyRecordLabel.hashCode() + ")");
        System.out.println("groovyRecordLabel2 = " + groovyRecordLabel2 + " (" + groovyRecordLabel2.hashCode() + ")");
        System.out.println("groovyRecordLabelUpper = " + groovyRecordLabelUpper + " (" + groovyRecordLabelUpper.hashCode() + ")");
        System.out.println("groovyRecordLabelUpper2 = " + groovyRecordLabelUpper2 + " (" + groovyRecordLabelUpper2.hashCode() + ")");
        System.out.println("groovyEmulatedRecordLabel = " + groovyEmulatedRecordLabel + " (" + groovyEmulatedRecordLabel.hashCode() + ")");
        System.out.println("groovyEmulatedRecordLabel2 = " + groovyEmulatedRecordLabel2 + " (" + groovyEmulatedRecordLabel2.hashCode() + ")");
        System.out.println("groovyRecordLabel2 == groovyRecordLabel: " + groovyRecordLabel2.equals(groovyRecordLabel));
        System.out.println("groovyRecordLabelUpper2 == groovyRecordLabelUpper: " + groovyRecordLabelUpper2.equals(groovyRecordLabelUpper));
        System.out.println("groovyEmulatedRecordLabel2 == groovyEmulatedRecordLabel: " + groovyEmulatedRecordLabel2.equals(groovyEmulatedRecordLabel));
        assertTrue(javaRecordLabel.hashCode() != 0);
        assertTrue(groovyRecordLabel.hashCode() != 0);
        assertTrue(new GroovyEmulatedRecordLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
        assertTrue(new LombokDataLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
        assertTrue(new KotlinDataLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
        assertTrue(new ScalaCaseLabel("x0", "x1", "x2", "x3", "x4").hashCode() != 0);
//        assertTrue(new JavaRecordLabel("x0", "x1", "x2", "x3", "x4").equals(new JavaRecordLabel("x0", "X1", "x2", "x3", "x4")));
//        assertTrue(new GroovyRecordLabel("x0", "x1", "x2", "x3", "x4").equals(new GroovyRecordLabel("x0", "X1", "x2", "x3", "x4")));
//        assertTrue(new GroovyEmulatedRecordLabel("x0", "x1", "x2", "x3", "x4").equals(new GroovyEmulatedRecordLabel("x0", "X1", "x2", "x3", "x4")));
    }
}
