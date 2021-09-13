package Lec40;

public class Car {//implements Comparable<Car>{
	
	int price;
	int speed;
	String color;
	
	public Car()
	{
		
	}
	public Car(int p,int s,String c)
	{
		price = p;
		speed = s;
		color = c;
	}
	
	@Override
	public String toString()
	{
		return "P: "+price+" S: "+speed+" C: "+color ;
	}
	
	
//	@Override
//	public int compareTo(Car o2) {
//		// TODO Auto-generated method stub
////		return this.speed-o2.speed;
////		return o2.price - this.price;
//		return this.color.compareTo(o2.color);
//	}

}
