package examination;

import java.util.Scanner;

public class Menu {
		
	Scanner input = new Scanner(System.in);
	String player;
	String ride;
	
	//personer (objekt)
	Person bjorn;
	Person ida;
	
	//karuseller
	RadioCars radioCars;
	Rollercoaster rollercoaster;

	public void text(){
		bjorn = new Person("bjorn", 180, 1000, 23);
		ida = new Person("ida", 165, 1000, 28);
		player = input.next();
		if (player.equals("bjorn")){  
			bjorn.text();
			
		}
		else if (player.equals("ida")){
			ida.idaText();
		}
		else{
			System.out.println("player finns inte");
		}
		
		radioCars = new RadioCars("radioCars", 120, 20);
		rollercoaster = new Rollercoaster("rollercoaster", 90, 30);
		ride = input.next();

		if (ride.equals("radioCars")){
			radioCars.rcText();
			if (bjorn.getHeight()>=(radioCars.getMinHeight())){
					System.out.println("du får åka radiocars");
			}else if (ida.getHeight()>=(radioCars.getMinHeight())){
				System.out.println("du får åka radiocars");
			}
			else{
				System.out.println("välj radio cars eller rollercoaster");
		}
			}
		
	
		ride = input.next();
		if (ride.equals("rollercoaster")){
			rollercoaster.rollText();
			System.out.println("välkommen till rollercoaster");
				
		if (bjorn.getHeight()>=rollercoaster.getMinHeight()){
				System.out.println("du får åka rollercoaster");
		
		}else if (ida.getHeight()>=(radioCars.getMinHeight())){
			System.out.println("du får åka radiocars");
		}
		else{
				System.out.println("välj radio cars eller rollercoaster");
		}
		}
	}

}
