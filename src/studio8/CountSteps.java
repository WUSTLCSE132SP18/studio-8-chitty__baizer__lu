package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import studio5.SerialComm;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

public class CountSteps{
	public static void main() throws FileNotFoundException {
		File data = new File("data.csv");
		Scanner sys = new Scanner(data);
		//SerialComm newCom = new SerialComm("/dev/cu.usbserial-DN03FRQP", true);
		
		while(sys.hasNextLine()) {
			String line = sys.nextLine();
			System.out.println(line);
			String []array = line.split(",", 5);
			for (String a: array) {
				System.out.println(a);
			}
		}
		sys.close();
	}
}