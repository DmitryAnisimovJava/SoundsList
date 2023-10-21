package testingSomeMusic;

import java.io.File;
import java.io.IOException;

public class JustWatch {
	
	public static final String MP3 = ".mp3";
	public static final String URL_TEMP = "C:\\Temp\\final";
	public static int choiceOne;

	public static void part1() throws IOException {
		
		String URL_PART = "E:\\soundlist\\justWatch\\part1\\";
		String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\1.mp3";
		choiceOne = Sound.getRandom(URL_PART, "E:\\soundlist\\justWatch\\choice1", 14);
			
		  int j = new File(URL_PART).listFiles().length;
		  System.out.println(j);
		  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
		  for (int i = 3; i <= j; i++) {
			  if(i != j) {
				  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
			  } else {
				  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
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
		
		String URL_PART = "E:\\soundlist\\justWatch\\part2\\";
		String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\2.mp3";
		
		
		
		  int j = new File(URL_PART).listFiles().length;
		  System.out.println(j);
		  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
		  for (int i = 3; i <= j; i++) {
			  if(i != j) {
				  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
			  } else {
				  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
			}
			  
		} 
		  File dir = new File("C:\\Temp");
		  for(File file: dir.listFiles()) {
			  if (!file.isDirectory()) {
				file.delete();		
				}
		  } 
	}

public static void part3() throws IOException {
	
	String URL_PART = "E:\\soundlist\\justWatch\\part3\\";
	String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\3.mp3";
	
	
	
	  int j = new File(URL_PART).listFiles().length;
	  System.out.println(j);
	  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
	  for (int i = 3; i <= j; i++) {
		  if(i != j) {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
		  } else {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
		}
		  
	} 
	  File dir = new File("C:\\Temp");
	  for(File file: dir.listFiles()) {
		  if (!file.isDirectory()) {
			file.delete();		
			}
	  } 
}

public static void part4() throws IOException {
	
	String URL_PART = "E:\\soundlist\\justWatch\\part4\\";
	String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\4.mp3";
	
	
	
	  int j = new File(URL_PART).listFiles().length;
	  System.out.println(j);
	  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
	  for (int i = 3; i <= j; i++) {
		  if(i != j) {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
		  } else {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
		}
		  
	} 
	  File dir = new File("C:\\Temp");
	  for(File file: dir.listFiles()) {
		  if (!file.isDirectory()) {
			file.delete();		
			}
	  } 
}

public static void part5() throws IOException {
	
	String URL_PART = "E:\\soundlist\\justWatch\\part5\\";
	String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\5.mp3";
	
	
	
	  int j = new File(URL_PART).listFiles().length;
	  System.out.println(j);
	  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
	  for (int i = 3; i <= j; i++) {
		  if(i != j) {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
		  } else {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
		}
		  
	} 
	  File dir = new File("C:\\Temp");
	  for(File file: dir.listFiles()) {
		  if (!file.isDirectory()) {
			file.delete();		
			}
	  } 
}

public static void part6() throws IOException {
	
	String URL_PART = "E:\\soundlist\\justWatch\\part6\\";
	String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\6.mp3";
	
	
	
	  int j = new File(URL_PART).listFiles().length;
	  System.out.println(j);
	  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
	  for (int i = 3; i <= j; i++) {
		  if(i != j) {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
		  } else {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
		}
		  
	} 
	  File dir = new File("C:\\Temp");
	  for(File file: dir.listFiles()) {
		  if (!file.isDirectory()) {
			file.delete();		
			}
	  } 
}

public static void part7() throws IOException {
	
	String URL_PART = "E:\\soundlist\\justWatch\\part7\\";
	String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\7.mp3";
	if (choiceOne == 1) {
		Sound.getRandom(URL_PART, "E:\\soundlist\\justWatch\\choice21", 7);
	} else {
		Sound.getRandom(URL_PART, "E:\\soundlist\\justWatch\\choice22", 7);
	}
	
	
	  int j = new File(URL_PART).listFiles().length;
	  System.out.println(j);
	  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
	  for (int i = 3; i <= j; i++) {
		  if(i != j) {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
		  } else {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
		}
		  
	} 
	  File dir = new File("C:\\Temp");
	  for(File file: dir.listFiles()) {
		  if (!file.isDirectory()) {
			file.delete();		
			}
	  } 
}

public static void part8() throws IOException {
	
	String URL_PART = "E:\\soundlist\\justWatch\\part8\\";
	String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\8.mp3";
	
	
	
	  int j = new File(URL_PART).listFiles().length;
	  System.out.println(j);
	  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
	  for (int i = 3; i <= j; i++) {
		  if(i != j) {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
		  } else {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
		}
		  
	} 
	  File dir = new File("C:\\Temp");
	  for(File file: dir.listFiles()) {
		  if (!file.isDirectory()) {
			file.delete();		
			}
	  } 
}

public static void part9() throws IOException {
	
	String URL_PART = "E:\\soundlist\\justWatch\\part9\\";
	String FINAL_FILE = "E:\\soundlist\\justWatch\\finals\\9.mp3";
	
	
	
	  int j = new File(URL_PART).listFiles().length;
	  System.out.println(j);
	  TwoFiles.getTwo(URL_PART + 1 + MP3, URL_PART + 2 + MP3, URL_TEMP + 3 + MP3);
	  for (int i = 3; i <= j; i++) {
		  if(i != j) {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, URL_TEMP + (i + 1) + MP3);
		  } else {
			  TwoFiles.getTwo(URL_TEMP + i + MP3, URL_PART + i + MP3, FINAL_FILE);
		}
		  
	} 
	  File dir = new File("C:\\Temp");
	  for(File file: dir.listFiles()) {
		  if (!file.isDirectory()) {
			file.delete();		
			}
	  } 
}

public static void result() throws IOException {
		
		 JustWatch.part1();
		 JustWatch.part2();
		 JustWatch.part3();
		 JustWatch.part4();
		 JustWatch.part5();
		 JustWatch.part6();
		 JustWatch.part7();
	     JustWatch.part8();
	     JustWatch.part9(); 

		String URL = "E:\\soundlist\\justWatch\\finals\\";
		String RESULT = "E:\\soundlist\\justWatch\\finalsResult.mp3";
		
		  int j = new File(URL).listFiles().length;
		  TwoFiles.getTwo(URL + 1 + MP3, URL + 2 + MP3, URL_TEMP + 3 + MP3);
		  for (int i = 3; i <= j; i++) {
			  if(i != j) {
				  TwoFiles.getTwo(URL_TEMP + i + MP3, URL + i + MP3, URL_TEMP + (i + 1) + MP3);
			  } else {
				  TwoFiles.getTwo(URL_TEMP + i + MP3, URL + i + MP3, RESULT);
			}
			  
		} 
		  File dir = new File("C:\\Temp");
		  for(File file: dir.listFiles()) {
			  if (!file.isDirectory()) {
				file.delete();		
				}
		  } 
	} 
}
