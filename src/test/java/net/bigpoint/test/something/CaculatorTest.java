package net.bigpoint.test.something;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Date: 4/17/13
 * Time: 12:46 PM
 *
 * @author lkleen
 * @version version?
 */
public class CaculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, new Calculator().add(3, 2));
    }

}
