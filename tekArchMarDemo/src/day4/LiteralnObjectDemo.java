package day4;

public class LiteralnObjectDemo {

	public static void main(String[] args) {
		String str1 = "Jyothi";
		String str2 = "Jyothi";
		
		String s1 = new String("Jyothi");
		String s2 = new String("Jyothi");
		
		System.out.println(str1==str2);//true
		System.out.println(str1.equals(str2));//true
		
		System.out.println(s1==s2);//false
		System.out.println(str1.equals(str2));//true

	}

}
