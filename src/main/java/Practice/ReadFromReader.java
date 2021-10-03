package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		System.out.println(s);
		
	}

}
