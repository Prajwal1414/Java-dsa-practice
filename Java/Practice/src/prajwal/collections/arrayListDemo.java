package prajwal.collections;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("prajwal");
		names.add("harshita");
		
		System.out.println(names);
		
		ArrayList<String> newNames = new ArrayList<>();
		newNames.add("Manjula");
		newNames.add("Narendra Babu");
		
		names.addAll(newNames);
		System.out.println(names);
		
		names.add(0,"Parappa");
		System.out.println(names);
		
	}

}
