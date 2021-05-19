abstract class Abstraction{
    public abstract void sound();
}

class Use extends Abstraction{
    public void sound(){
        System.out.println("Makes Noise!");
    }

    public static void main(String[] args) {
        Use u =  new Use();
        u.sound();
    }
}