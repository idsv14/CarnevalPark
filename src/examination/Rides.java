package examination;

import java.util.Scanner;

//construktur
public class Rides {
	private String rideName;
	private int minHeight;
	private int rideMoney;
	
public Rides(String RideName, int MinHeight, int RideMoney){
	
	rideName = RideName;
	minHeight = MinHeight;
	rideMoney = RideMoney;
	
}



public String getRideName(){
	return rideName;
}
public int getMinHeight(){
	return minHeight;
}
public int getRideMoney(){
	return rideMoney;
}
public void rcText(){
	System.out.println(getRideName()+ "\n" +"minsta längd "+ getMinHeight()+" pengar "+ getRideMoney());
}
public void rollText(){
	System.out.println(getRideName()+ "\n" +"minsta längd "+ getMinHeight()+"pengar "+ getRideMoney());
}
}