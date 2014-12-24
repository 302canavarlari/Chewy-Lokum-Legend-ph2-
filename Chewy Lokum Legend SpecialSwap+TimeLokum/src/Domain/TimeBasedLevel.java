package Domain;

/**
 * This class contains the basic elements 
 * and functions that every time based level should contain
 */

public class TimeBasedLevel extends Level {
	
	int targetTimeInSeconds;
	
	
	/**
	 * create the time based level
	 * 
	 * @param level number
	 * @param target time
	 * @modifies type
	 * @modifies levelNumber
	 * @modifies targetTimeInSeconds
	 */
	public TimeBasedLevel (int target,int row, int column,int moveLeft,boolean isUnlocked) {
		super(2,row,column,target,moveLeft,isUnlocked);
		targetTimeInSeconds = target;
		
	}

}
