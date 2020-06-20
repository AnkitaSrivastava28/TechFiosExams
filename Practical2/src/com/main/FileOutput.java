/**
 * 
 */
package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Anni
 *
 */
public class FileOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			  System.out.print("Enter the file path: ");
			  Scanner scanner = new Scanner(System.in);
			  String filePath = scanner.next();
			
		      Scanner myReader = doesFileExist(filePath);
		      int j =1;
		      while (myReader.hasNextLine()) {
		        String[] data = myReader.nextLine().split("-");
		        String word = data[0];
		        System.out.println("word"+j+":"+word);
		        j++;
		        String[] meanings = data[1].split(",");
		        for(int i=0 ; i<meanings.length; i++) {
		        	int k = i+1;
		        	System.out.println("meaning"+k+": "+meanings[i]);
		        }
		        //System.out.println(data);
		      }
		      myReader.close();
		    } catch (Exception e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}
	
	public static Scanner doesFileExist(String path) {
		Scanner myReader = null;
		try {
			//.\\resource\\Dictionary
		    File myObj = new File(path);
		    myReader = new Scanner(myObj);
		      
		} catch (FileNotFoundException e) {
		      System.out.println("An error occurred. File doesnt exist");
		      e.printStackTrace();
		    }
		return myReader;
	}

}
