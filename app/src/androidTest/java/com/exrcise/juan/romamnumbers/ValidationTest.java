package com.exrcise.juan.romamnumbers;

import junit.framework.TestCase;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * Created by Juan on 31/08/2015.
 * Test for validate the validator
 */
public class ValidationTest extends TestCase {

    //initialize
    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }

    @SmallTest
    public void testValidator(){
        String entryTest = "MCMXIV";

        boolean bl_result;

        Validation objValidation = new Validation();
        bl_result = objValidation.Validator(entryTest);
        //Verify the test
        assertEquals(true, bl_result);

    }

    //End
    @Override
    protected void tearDown() throws Exception{
        super.tearDown();
    }

}
