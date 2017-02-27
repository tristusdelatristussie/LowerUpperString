package loweruppercase.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;



/**
 * Unit test for simple App.
 */
public class LoweruppercaseTest
{
    @org.junit.Test
    public void Loweruppercase(){
        //set
        Loweruppercase loweruppercaseTest = new Loweruppercase();
        //test
        String result = loweruppercaseTest.Loweruppercase("altERnaTIng cAsE");
        //assert
        assertEquals("ALTerNAtiNG CaSe",result);
    }


}


