package org.wecancodeit.fizzbuzz;
/* use % for 3 and 5
The tasks
•	Write a method that takes an integer and returns a string. This represents the act of saying a number.
•	The string should be the numerical characters that represent the value of the integer that was passed, EXCEPT:
o	When the integer passed is a multiple of 3, the method should say Fizz.
o	When the integer passed is a multiple of 5, the method should say Buzz.

 */

public class FizzBuzz {
    public String say(int numberToTranslate) {
        if (numberToTranslate<0){
            return "Error";
        }
        if (numberToTranslate%5 == 0 && numberToTranslate%2 ==0) {
            return "Fizz Buzz";
        }
        if (numberToTranslate%2 == 0) {
            return "Fizz";
        }
        if (numberToTranslate%5 == 0) {
            return "Buzz";
        }
        if (numberToTranslate%11 == 0) {
            return "Bang";
        }

        return "" + numberToTranslate;
    }


}
