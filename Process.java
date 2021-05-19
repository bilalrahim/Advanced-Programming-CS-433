// Implementation of threads in Java.
// This class is named Process because main function is treated like a process.

class even extends Thread{
    @Override
    public void run(){
        int counter = 0 ;

        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0){
                counter += 1;
            }
        }
        System.out.println("Even numbers in range 0 to 10000 : " + counter);
        System.out.println("Calculated by Thread : " + Thread.currentThread().getName()); 
    }
}
class prime extends Thread{
    @Override
    public void run(){
        int num = 0;
        int primeNumbers = 0 ;
        
        for ( int i = 0; i < 10000; i++ ) {
            int counter = 0;
            
            for ( num = i ; num >=1 ; num --){
                if ( i%num == 0 ){
                    counter += 1;
                }
                if ( counter > 2){
                    break ; // Loop will break incase counter's value is greater than 2, hence ehancing speed.
                }
            }
            if ( counter == 2 ){
                primeNumbers += 1 ;
            }
        }
        System.out.println("Prime Number in range 10000 : " + primeNumbers);
        System.out.println("Calculated by Thread : " + Thread.currentThread().getName());
    }
}

class Process{
    public static void main(String[] args) throws InterruptedException {
        even thread =new even();
        prime thread2 = new prime();

        // Calculating execution time with thread.
        long startTime = System.nanoTime();
        thread.start();
        thread2.start();
	thread2.join();
        long stopTime = System.nanoTime();
       
        
        System.out.print("Execution Time in nanoseconds: ");
        System.out.println(stopTime - startTime);

        // Execution time without threads.
        startTime = System.nanoTime();
        thread.run();
        thread2.run();
        stopTime = System.nanoTime();

        System.out.print("Execution Time in nanoseconds: ");
        System.out.println(stopTime - startTime);
    }
}
