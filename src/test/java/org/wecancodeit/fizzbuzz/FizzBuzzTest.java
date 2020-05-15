package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

    /*@Test
    public void additionAdds1and1TogetherToMake2() {
        //arrangement
        //action
        int result = addition(1,1);
        //assertion
        assertEquals(2,result);
    }

    private int addition(int baseNumber, int numberToAdd) {
        return 0;
    }*/
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void secondFizzBuzzClass() {
        FizzBuzz Test = new FizzBuzz();
    }

    @Test
    public void oneEquals1() {
       FizzBuzz Test = new FizzBuzz();
       String answer = Test.say(1);
       assertEquals("1", answer);
    }

    @Test
    public void twoEquals2() {
        FizzBuzz Test = new FizzBuzz();
        String answer = Test.say(2);
        assertEquals("Fizz", answer);
    }
    @Test
    public void threeEquals3() {
        FizzBuzz Test = new FizzBuzz();
        String answer = Test.say(3);
        assertEquals("3", answer);
    }
    @Test
    public void fiveEquals5() {
        FizzBuzz Test = new FizzBuzz();
        String answer = Test.say(5);
        assertEquals("Buzz", answer);
    }
    @Test
    public void sixEquals6() {
        FizzBuzz Test = new FizzBuzz();
        String answer = Test.say(6);
        assertEquals("Fizz", answer);
    }
    @Test
    public void tenEquals10() {
        FizzBuzz Test = new FizzBuzz();
        String answer = Test.say(10);
        assertEquals("Fizz Buzz", answer);
    }
    @Test
    public void elevenEquals11() {
        FizzBuzz Test = new FizzBuzz();
        String answer = Test.say(11);
        assertEquals("Bang", answer);
    }



}