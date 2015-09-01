package com.exrcise.juan.romamnumbers;

import junit.framework.TestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by Juan on 31/08/2015.
 * Test for validate the converter
 */
public class ConvertionTest extends TestCase {

    //initialize
    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }

    @SmallTest
    public void testValidator(){
        String entryTest = "MCMXIV";

        int i_result;

        Convertion objConvertion = new Convertion();

        i_result = objConvertion.Calculation(entryTest);
        //Verify the test
        assertEquals(1914, i_result);
    }

    //End
    @Override
    protected void tearDown() throws Exception{
        super.tearDown();
    }

}
