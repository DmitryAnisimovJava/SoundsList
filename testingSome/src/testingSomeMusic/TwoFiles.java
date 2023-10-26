package testingSomeMusic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class TwoFiles {
	
	public static void getTwo(String file1, String file2, String out) throws IOException {
		FileInputStream fistream1 = new FileInputStream(file1);  // first source file
	    FileInputStream fistream2 = new FileInputStream(file2);//second source file
	    SequenceInputStream sistream = new SequenceInputStream(fistream1, fistream2);
	    FileOutputStream fostream = new FileOutputStream(out);//destinationfile

	    int temp;

	    while( ( temp = sistream.read() ) != -1)
	    {
	      // System.out.print( (char) temp ); // to print at DOS prompt
	      fostream.write(temp);   // to write to file
	    }
	    fostream.close();
	    sistream.close();
	    fistream1.close();
	    fistream2.close();
	}
	
}

