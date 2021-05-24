import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaApi2 {
   public static void main(String[] args) {
       
    Integer intArray[] ={1,2,3,4,5,6,7,8,9,10};
    List <Integer> intList  = Arrays.asList(intArray);

    intList.stream()
    .distinct()
    .skip(2)
    .forEach(x -> System.out.print(x + " "));

    int total = IntStream.range(1,10)
                .reduce(0, (s, arg)-> s = s + arg);

    System.out.println(total);

    Integer arr[] = {1,2,3,4};
    List <Integer> tempArr = Arrays.asList(arr);
    
    int total_X = tempArr.stream()
                .reduce(1, (s, arg) -> s = s*arg);
    System.out.println(total_X);

   } 
}
