package fileHandling_2;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApp {
	public static void main(String[] args) {

		Student_class s = new Student_class(101, "ganesh", 70);

		try {

			FileOutputStream fout = new FileOutputStream("Student.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout); 
			DataOutputStream dout = new DataOutputStream(bout);
			ObjectOutputStream dout1 = new ObjectOutputStream(bout); 
			
			/*
			 * dout.writeByte(s.getRoll()); dout.writeUTF(s.getName());
			 * dout.writeInt(s.getMarks());
			 */
			dout1.writeObject(s);

			dout1.close();
			bout.close();
			fout.close();
			dout.close();

			FileInputStream fin = new FileInputStream("Student.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Student_class s2 = (Student_class) oin.readObject();
			System.out.println("roll :" + s2.getRoll());
			System.out.println("name :" + s2.getName());
			System.out.println("Marks :" + s2.getMarks());
//by implementing serialization interface os tell to jvm that 
//we can write this type of data				    

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException | ClassCastException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
