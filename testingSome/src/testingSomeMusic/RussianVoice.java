package testingSomeMusic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RussianVoice {
	
	public static void part1() throws IOException {
		  int l;
		  int j = 16;
		  for (int i = 2; i <= j; i++) {
			  l = i + 1;
			  if(i == 2) {
				  TwoFiles.getTwo("E:\\soundlist\\project\\part1\\1.mp3", "E:\\soundlist\\project\\part1\\2.mp3", "C:\\Temp\\final" + l +".mp3");
			  } else if(i != j) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part1\\" + i +".mp3", "C:\\Temp\\final" + l +".mp3");
			  } else {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part1\\" + i +".mp3", "E:\\soundlist\\project\\final1.mp3");
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
		  int l;
		  int j = 15;
		  int myChoice = 1;
		  for (int i = 2; i <= j; i++) {
			  l = i + 1;
			  if(i == 2) {
				  TwoFiles.getTwo("E:\\soundlist\\project\\part2\\1.mp3", "E:\\soundlist\\project\\part2\\2.mp3", "C:\\Temp\\final" + l +".mp3");
			  } else if(i != j && i == 7) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part2\\choice1\\" + myChoice +".mp3", "C:\\Temp\\final" + l +".mp3");
				  l++; 
			  } else if (i != j) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part2\\" + i +".mp3", "C:\\Temp\\final" + l +".mp3");
			}
			  else {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part2\\" + i +".mp3", "E:\\soundlist\\project\\final2.mp3");
			}
			  
		}
		  File dir = new File("C:\\Temp");
		  for(File file: dir.listFiles()) {
			  if (!file.isDirectory()) {
				file.delete();		
				}
		  } 
	}

	public static List<Integer> part3() throws IOException {
		  int l;
		  int j = 24;
		  int randomOne = ThreadLocalRandom.current().nextInt(1,3);
		  int randomTwo = ThreadLocalRandom.current().nextInt(1,3);
		  int randomThree = ThreadLocalRandom.current().nextInt(1,15);
		  int randomFour = ThreadLocalRandom.current().nextInt(1,15);
		  for (int i = 2; i <= j; i++) {
			  while (randomThree == randomFour) {
				  randomFour = ThreadLocalRandom.current().nextInt(1,15);
			}
			  l = i + 1;
			  if(i == 2) {
				  TwoFiles.getTwo("E:\\soundlist\\project\\part3\\1.mp3", "E:\\soundlist\\project\\part3\\2.mp3", "C:\\Temp\\final" + l +".mp3");
			  } else if(i != j && i == 4) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part3\\choice1\\" + randomOne +".mp3", "C:\\Temp\\final" + l +".mp3");
				  l++; 
			  } else if(i != j && i == 10) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part3\\choice2\\" + randomTwo +".mp3", "C:\\Temp\\final" + l +".mp3");
				  l++; 
			  } else if(i != j && i == 19) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part3\\choice3\\" + randomThree +".mp3", "C:\\Temp\\final" + l +".mp3");
				  l++; 
			  } else if(i != j && i == 23) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part3\\choice3\\" + randomFour +".mp3", "C:\\Temp\\final" + l +".mp3");
				  l++; 
			  } else if (i != j) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part3\\" + i +".mp3", "C:\\Temp\\final" + l +".mp3");
			}
			  else {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part3\\" + i +".mp3", "E:\\soundlist\\project\\final3.mp3");
			}
			  
		}
		  File dir = new File("C:\\Temp");
		  for(File file: dir.listFiles()) {
			  if (!file.isDirectory()) {
				file.delete();		
				}
		  }
		  List<Integer> resulList = new ArrayList<>();
		  resulList.add(randomOne);
		  resulList.add(randomTwo);
		  return resulList;
	}

	public static void part4(List<Integer> prevResults) throws IOException {
		  int l;
		  int j = 33;
		  int randomOne = ThreadLocalRandom.current().nextInt(1,3);
		  int randomTwo = ThreadLocalRandom.current().nextInt(1,3);
		  for (int i = 2; i <= j; i++) {
			  l = i + 1;
			  if(i == 2) {
				  TwoFiles.getTwo("E:\\soundlist\\project\\part4\\1.mp3", "E:\\soundlist\\project\\part4\\2.mp3", "C:\\Temp\\final" + l +".mp3");
			  } else if(i != j && i == 12) {
				  if (prevResults.get(0) == 1) {
					  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\choice1\\1" + randomOne +".mp3", "C:\\Temp\\final" + l +".mp3");
					  l++; 
				} else {
					TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\choice1\\2" + randomTwo +".mp3", "C:\\Temp\\final" + l +".mp3");
					  l++; 
				}
			  } else if(i != j && i == 16) {
				  if (prevResults.get(1) == 1) {
					  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\choice2\\" + prevResults.get(1)+".mp3", "C:\\Temp\\final" + l +".mp3");
					  l++; 
				} else {
					TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\choice2\\2.mp3", "C:\\Temp\\final" + l +".mp3");
					  l++; 
				}
			  }  else if (i != j) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\" + i +".mp3", "C:\\Temp\\final" + l +".mp3");
			}
			  else {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\" + i +".mp3", "E:\\soundlist\\project\\final4.mp3");
			}
			  
		}
		  File dir = new File("C:\\Temp");
		  for(File file: dir.listFiles()) {
			  if (!file.isDirectory()) {
				file.delete();		
				}
		  }
	}

	public static void getChoice() throws IOException {
		  int l;
		  int j = 6;
		  for (int i = 2; i <= j; i++) {
			  l = i + 1;
			  if(i == 2) {
				  TwoFiles.getTwo("E:\\soundlist\\project\\part4\\choice2\\1.mp3", "E:\\soundlist\\project\\part4\\choice2\\2.mp3", "C:\\Temp\\final" + l +".mp3");
			  }  else if (i != j) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\choice2\\" + i +".mp3", "C:\\Temp\\final" + l +".mp3");
			}
			  else {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\part4\\choice2\\" + i +".mp3", "E:\\soundlist\\project\\finalChoice.mp3");
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
		  int l;
		  int j = 4;
		  for (int i = 2; i <= j; i++) {
			  l = i + 1;
			  if(i == 2) {
				  TwoFiles.getTwo("E:\\soundlist\\project\\final1.mp3", "E:\\soundlist\\project\\final2.mp3", "C:\\Temp\\final" + l +".mp3");
			  }  else if (i != j) {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\final" + i +".mp3", "C:\\Temp\\final" + l +".mp3");
			}
			  else {
				  TwoFiles.getTwo("C:\\Temp\\final" + (l - 1) +".mp3", "E:\\soundlist\\project\\final" + i +".mp3", "E:\\soundlist\\project\\result.mp3");
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
