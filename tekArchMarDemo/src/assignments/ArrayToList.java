package assignments;

//1.Convert Array content to List content.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String [] inputArray = {"Jyothi","Advaith","Kannan","Appu"};

		List<String> aList = Arrays.asList(inputArray);
		
		System.out.println(aList);
//another way to display		
		for(String o: aList) {
			System.out.println(o);
		}


	}

}
