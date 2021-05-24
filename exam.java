import java.util.Stack;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Exam{
    public static void main(String[] args) throws Exception {

        String strArray[] = {"1","2","3"};  
        List <String> strList = Arrays.asList(strArray);

        
        List <Integer> updatedList = strList.stream()
            .map(value -> Integer.parseInt(value))
            .collect(Collectors.toList());
        
        int total = updatedList.stream()
                    .reduce(0, (t, arg) -> t = t +arg);  
        
        System.out.println(total);
        





        
        String value = "(a)(";
        Stack<Integer> stk = new Stack<>();

        for (int i = 0 ; i < value.length() ; i ++){
            if (value.charAt(i) == '('){
                stk.push(1);
            }
            if(value.charAt(i) == ')' ){
                stk.pop();
            }
        }
        if(stk.empty()){
            System.out.println("Correct Input");
        }
        else{
            throw new Exception("Missing Paranthesis");
        }
    }
}