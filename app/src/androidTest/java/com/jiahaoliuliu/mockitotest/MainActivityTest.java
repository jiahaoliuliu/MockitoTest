package com.jiahaoliuliu.mockitotest;

import android.test.ActivityInstrumentationTestCase2;
import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by jiahao on 2/5/15.
 */
//@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest extends InstrumentationTestCase{

    @Test
    public void testMainActivity() throws Exception {

        //Testing mockito
//        List mockedList = mock(List.class);

        // Using mock object
        //mockedList.add("one");
        //mockedList.clear();

        // Verification
//        verify(mockedList).add("one");
//        verify(mockedList).clear();

        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);

    }
}
