import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentApp2 {
 public static void main(String[] args) {
	try {
		String path = "D:\\Example\\Serialization.text";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student) ois.readObject();
		System.out.println(s.name + " " + s.id + " " + s.marks);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
