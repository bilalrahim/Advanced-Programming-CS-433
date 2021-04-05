import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// To store objects to files we use Serialization.
// Similar to pickle python used to save state of ML models.
// For object serilization just implement Serilizable interface.

class Model implements Serializable{
    public int accu = 70;
    public int loss = 30;
}

class Serilization{
    public static void main(String[] args) {
        
        Model obj = new Model();
        String address = "./serilization.txt";
        
        // Saving model state.
        
        try 
        {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(address));
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Reading Model back.

        try 
        {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(address));
            Model load;
            load = (Model)objectInputStream.readObject();
            System.out.println(load.accu);
            objectInputStream.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}