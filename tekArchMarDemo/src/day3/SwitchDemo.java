package day3;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
	Scanner inputScan = new Scanner(System.in);
	System.out.println("enter the MOT");
	String sMOT = inputScan.nextLine().toLowerCase();
	inputScan.close();
	switch (sMOT)
	{ 
	case "bus":
	    System.out.println("bus");
		break;
	case "train":
	    System.out.println("train");
		break;
    default:
    	System.out.println("please give available options ");
	}

}
}
