class Container <T>{
    T value;

    public T hello(T x){
        System.out.println(x);
        return x;
    }
}


public class Generic {
    public static void main(String[] args) {

        Container<Integer> obj = new Container<>();
        obj.value = 2000;
        obj.hello(20000);
        
    }
}
