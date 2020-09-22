package com.revature.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
	
	public void checkedExceptionTryCatch() {
		FileReader fr = null;
		try {
			fr = new FileReader("file.txt");
		}
		catch 
			(FileNotFoundException e){
				//TODO Auto-generated catch block
				e.printStackTrace();
		}
		finally {
			//This code will always run regardless of if an exception is thrown
		}
	}
	
	public void checkedExceptionsThrows() throws FileNotFoundException {
		FileReader fr = new FileReader("file.txt");
	}
	
	public void moreTryCatch() {
		try {
			FileReader fr = new FileReader("file.txt");
			fr.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void throwAnException (int i) throws Exception {
		if (i > 10) {
			throw new Exception("I is too big");
		}
	}
	

}
