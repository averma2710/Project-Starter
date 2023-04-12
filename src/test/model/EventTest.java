package model;

import model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Event class
 */
public class EventTest {
    private Event e;
    private Date d;
    private Event t;
    private Event t1;
    private Event t2;
    private int i = 1;


    //NOTE: these tests might fail if time at which line (2) below is executed
    //is different from time that line (1) is executed.  Lines (1) and (2) must
    //run in same millisecond for this test to make sense and pass.

    @BeforeEach
    public void runBefore() {
        e = new Event("Sensor open at door");   // (1)
        d = Calendar.getInstance().getTime();   // (2)
    }

    @Test
    public void testEvent() {
        assertEquals("Sensor open at door", e.getDescription());
        assertEquals(d.toString(), e.getDate().toString());
    }

    @Test
    public void testToString() {
        assertEquals(d.toString() + "\n" + "Sensor open at door", e.toString());
    }

    @Test
    public void tester() {
        t = new Event("added something");
        t1 = new Event("added something");
        t2 = new Event("removed something");

        assertEquals(t,t1);
        assertFalse(t == null);
        assertNotEquals(t1, t2);
        Event t3;

        t3 = new Event("added something");
        assertNotEquals(t,t3);
        assertNotEquals(t1,t3);
        assertNotEquals(t2,t3);
        assertEquals(t.hashCode(), t1.hashCode());
        assertNotEquals(t.hashCode(), t2.hashCode());




    }
}


