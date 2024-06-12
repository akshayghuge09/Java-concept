package FileHandling_1;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Abc_file {
	public static void main(String[] args) {
// to create object of file

		File f = new File("xyzfile.txt");

// this f reference gives us only metadata about file

		if (f.exists()) {
			System.out.println("file is exist");
		} else {
			System.out.println("file does not exist");
		}

		try {
//true : data append
			FileOutputStream fout = new FileOutputStream(f);
			FileOutputStream fout1 = new FileOutputStream("output.txt");
			String str = "hellow word";
//we can not pass string as parameter hence we create byte arr
			byte[] brr = str.getBytes();
			fout1.write(97);
			fout1.write(brr);

			FileOutputStream fout2 = new FileOutputStream("output1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout2);
			DataOutputStream dout = new DataOutputStream(bout);

			String str1 = "using buffer stream";
			dout.writeUTF(str1);

//      data will written in file when we---->		
//      close all the stream	or	when buffer is full or using flush
//      its recommended do not use flush method		

			dout.close();
			bout.close();
			fout2.close();
			fout1.close();
			fout.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
