package com.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompetitionTest {
    
    @Test
    public void EndingTestFive() {
        Assertions.assertTrue(Competition.removePosition(2).get(3).equals("5th"));
    }
    
    @Test
    public void EndingTestThirteen() {
        Assertions.assertTrue(Competition.removePosition(66).get(12).equals("13th"));
    }    
    
    @Test
    public void EndingTestTwentyOne() {
        Assertions.assertTrue(Competition.removePosition(5).get(19).equals("21st"));
    }    
    
    @Test
    public void EndingTestThirtyThree() {
        Assertions.assertTrue(Competition.removePosition(100).get(32).endsWith("33rd"));
    }

    @Test
    public void EndingTestOneHundred() {
        Assertions.assertTrue(Competition.removePosition(1).get(98).equals("100th"));
    }

    @Test
    public void SizeTestNinetyNine() {
        Assertions.assertEquals(99, Competition.removePosition(97).size());
    }
  
    @Test
    public void CheckPositionTestFortyFour() {
        Assertions.assertTrue(Competition.removePosition(44).get(43).equals("45th"));
    }
   
    public void CheckPositionTestBelowFortyFour() {
        Assertions.assertTrue(Competition.removePosition(44).get(42).equals("43rd"));
    }
}
