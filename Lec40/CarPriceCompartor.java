package Lec40;

import java.util.Comparator;

public class CarPriceCompartor implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o2.price-o1.price;
	}

}
