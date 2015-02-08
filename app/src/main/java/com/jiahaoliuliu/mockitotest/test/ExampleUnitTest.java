package com.jiahaoliuliu.mockitotest.test;

import android.test.InstrumentationTestCase;

/**
 * Created by jiahao on 2/8/15.
 */
public class ExampleUnitTest extends InstrumentationTestCase {

    public void testMatch() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}
