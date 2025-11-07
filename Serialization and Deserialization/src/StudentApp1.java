import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {  
	   Student s = new Student(123, "Ramesh", 99);
		System.out.println(s.name + " " + s.id + " " + s.marks);
		FileOutputStream fos = new FileOutputStream("D:\\Example\\Serialization.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
      }
   catch (Exception e) {
	     e.printStackTrace();
      }
	}

}
