package assignments;

import java.util.HashMap;

/*
 * Find the frequency of each character in a given string
 * String: "Java is an object oriented programming launguage"
 * 
 */
public class FequencyCharacterString {

	public static void main(String[] args) {
		String inputString = "Java is an object oriented programming launguage";
		inputString = inputString.replace(" ", "");
		HashMap<Character,Integer> freqMap = new HashMap<>(); 
//Iterate over String		
		for(int i=0; i<inputString.length(); i++) {
			Character ch = inputString.charAt(i);
			
/*  make count to 1 if HashMap do not contain the character and 
 *  put it in HashMap with key as Character and count as value	
 *  If HashMap already have the character, increment its count by 1	          
 */			
			if(freqMap.containsKey(ch)) {
				int count = freqMap.get(ch);
				freqMap.put(ch, count+1);
			}
			else {
				freqMap.put(ch,1);
			}
		}
		
       System.out.println(freqMap);
	}

}
