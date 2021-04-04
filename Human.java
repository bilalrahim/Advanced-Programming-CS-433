// Lambda expression provides implementation of functional interface. 
// An interface which has only one abstract method is called functional interface
// Syntax is similar to JavaScript's arrow function.

interface Soul{
    public void getSoul();
}

public class Human {
    
    public static void main(String[] args) {
        
        // Implementation without Lambda.
        Soul noLambdaSoul = new Soul(){
            public void getSoul(){
                System.out.println("Yes, every human has a soul! (Implemented Without Lambda)");
            }
        };
        noLambdaSoul.getSoul();

        // Implementation with Lambda.
        Soul lambdaSoul = () -> System.out.println("Yes, every human has soul! (Implemented with lambda)"); // If lambda body only has one statement then no need for curly brackets.
        lambdaSoul.getSoul();
    }
}
