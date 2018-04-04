package examination;

import java.util.Scanner;

public class Person extends Menu{
	//fält
	public String name;
	public int height;
	public int money;
	public int age;
	 
	//constructor 
public Person(String Name, int Height, int Money, int Age){
	
	name = Name;
	height = Height;
	money = Money;
	age = Age;
	
}

public String getName(){
	return name;
}

public int getHeight(){
	return height;
}

public int getMoney(){
	return money;
}
public int getAge(){
	return age;
}
public void text(){
	System.out.println(getName()+ "\n" +"  ålder:"+ getAge()+"  längd:"+ getHeight()+"  pengar:"+ getMoney());
}
public void idaText(){
	System.out.println(getName()+ "\n" +"  ålder:"+ getAge()+"  längd:"+ getHeight()+"  pengar:"+ getMoney());
	}
}
