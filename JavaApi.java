import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaApi {
    public static void main(String[] args) {
        
        Integer intArray[] = {10,40,10,50,20,30,50,01,02,20};
        List <Integer> intList = Arrays.asList(intArray);

        // Manipulating List.
        // Works in three steps
        intList.stream()    // Step 1 data aquiring.
        .distinct()         // Step 2 data processing.
        .skip(2)
        .sorted()
        .forEach(x -> System.out.print(x + " "));    // Step 3 Printing out the manipulated list.

        // Using IntStream to get numbers from 1 to 100.
        // And then using Reduce to sum the array.

        int total = IntStream.range(1,101)
        .reduce(0, (t, arg) -> t = t +arg);   // Reduce takes in 2 arguments. 1 a starting point and another an arrow function.
                                              // arrow function has two parameters first gets the starting point value as argument and another an arg
        System.out.println(total);

        // Calculating factorial using reduce.

        int factorial = IntStream.range(1,5)
        .reduce(1, (fac, arg) -> fac = fac * arg );

        System.out.println("Factorial is " + factorial);

        // Using map to change each words first letter to upper case and rest to lower case.

        String words[] = {"aPPle", "dEll","goOgle"};
        List <String> wordsList = Arrays.asList(words);

        List <String> finalList = wordsList.stream()
            .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1, word.length()).toLowerCase())
            .collect(Collectors.toList());
        
        finalList.stream()
        .forEach(word -> System.out.println(word));        
    }
}
