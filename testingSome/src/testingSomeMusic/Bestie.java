package testingSomeMusic;

import java.io.File;
import java.io.IOException;

public class Bestie {
	public static final String MP3 = ".mp3";
	public static final String URL_FINAL = "C:\\Temp\\final";
	public static final String RESULT = "E:\\soundlist\\bestie\\result.mp3";
	public static final String FINAL_FILE1 = "E:\\soundlist\\bestie\\final1.mp3";
	public static final String FINAL_FILE2 = "E:\\soundlist\\bestie\\final2.mp3";
	public static final String URL_PART1 = "E:\\soundlist\\bestie\\part1\\";
	public static final String URL_PART2 = "E:\\soundlist\\bestie\\part2\\";
	public static void part1() throws IOException {
		  int j = new File(URL_PART1).listFiles().length;
		  TwoFiles.getTwo(URL_PART1 + 1 + MP3, URL_PART1 + 2 + MP3, URL_FINAL + 3 + MP3);
		  for (int i = 3; i <= j; i++) {
			  if(i != j) {
				  TwoFiles.getTwo(URL_FINAL + i + MP3, URL_PART1 + i + MP3, URL_FINAL + (i + 1) + MP3);
			  } else {
				  TwoFiles.getTwo(URL_FINAL + i + MP3, URL_PART1 + i + MP3, FINAL_FILE1);
			}
			  
		} 
		  File dir = new File("C:\\Temp");
		  for(File file: dir.listFiles()) {
			  if (!file.isDirectory()) {
				file.delete();		
				}
		  } 
	}

	public static void part2() throws IOException {
		 int j = new File(URL_PART2).listFiles().length;
		  TwoFiles.getTwo(URL_PART2 + 1 + MP3, URL_PART2 + 2 + MP3, URL_FINAL + 3 + MP3);
		  for (int i = 3; i <= j; i++) {
			  if(i != j) {
				  TwoFiles.getTwo(URL_FINAL + i + MP3, URL_PART2 + i + MP3, URL_FINAL + (i + 1) + MP3);
			  } else {
				  TwoFiles.getTwo(URL_FINAL + i + MP3, URL_PART2 + i + MP3, FINAL_FILE2);
			}
			  
		} 
		  File dir = new File("C:\\Temp");
		  for(File file: dir.listFiles()) {
			  if (!file.isDirectory()) {
				file.delete();		
				}
		  } 
	}
	
	public static void getResult() throws IOException {
		TwoFiles.getTwo(FINAL_FILE1, FINAL_FILE2, RESULT);
	}
}
