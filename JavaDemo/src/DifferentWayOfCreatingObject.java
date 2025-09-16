import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DifferentWayOfCreatingObject {
    public static void main(String[] args) {
        // Using the new keyword
        DifferentWayOfCreatingObject obj = new DifferentWayOfCreatingObject();
        DifferentWayOfCreatingObject obj2 = null;
        // Cloning an object
        try {
            obj2 = (DifferentWayOfCreatingObject) obj.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        // Creating an object using reflection
        Class<DifferentWayOfCreatingObject> clazz = DifferentWayOfCreatingObject.class;
        Class<? extends Class> obj3 = clazz.getClass();

        // Creating an object through deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"));
        DifferentWayOfCreatingObject obj4 = (DifferentWayOfCreatingObject) in.readObject();
    }
}
