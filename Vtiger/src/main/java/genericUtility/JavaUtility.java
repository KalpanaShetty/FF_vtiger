package genericUtility;

import java.util.Random;

public class JavaUtility {
	
	/**
	 * This method Will give the Random Number
	 * @author KalpanaShetty
	 * @return
	 */
public int getRandomNumber() {
	Random random= new Random();
	int randomNum = random.nextInt(10000);
	return randomNum;
}

}
