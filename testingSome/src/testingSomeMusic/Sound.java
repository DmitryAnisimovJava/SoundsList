package testingSomeMusic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.io.FileUtils;

public class Sound {

	public static int getRandom(String originURL, String choiceURL, int numberInOrigin) throws IOException {
		
		int randomNumber = ThreadLocalRandom.current().nextInt(1, new File(choiceURL).listFiles().length);
		File originFile = new File(choiceURL + "\\" + randomNumber + ".mp3");
		File choice = new File(originURL + "\\" + numberInOrigin + ".mp3");
		FileUtils.copyFile(originFile, choice);
		return randomNumber;
	}
}
