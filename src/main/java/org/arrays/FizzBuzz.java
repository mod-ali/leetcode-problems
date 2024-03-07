 /* Max created on 3/18/2023 inside the package - org.arrays */

 package org.arrays;

 import java.util.ArrayList;
 import java.util.List;

 public class FizzBuzz {

     public List<String> fizzBuzz(int n) {
         List<String> result = new ArrayList<>();
         for (int i = 1; i <= n; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                 result.add("FizzBuzz");
             } else if (i % 3 == 0) {
                 result.add("Fizz");
             } else if (i % 5 == 0) {
                 result.add("Buzz");
             } else {
                 result.add(String.valueOf(i));
             }
         }
         return result;
     }

 }
