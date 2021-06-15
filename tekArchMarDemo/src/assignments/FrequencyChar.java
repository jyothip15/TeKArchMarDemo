package assignments;

import java.util.HashMap;

public class FrequencyChar {
		   public static void main(String[] args) {
		      String str = "java2blog";
		 
		      HashMap<Character,Integer> charFreqMap = new HashMap<>();
//Iterate over String		      
		      for(int i= 0 ; i< str.length() ; i++) {
		    	  
		          Character ch=str.charAt(i);
		          
/*  make count to 1 if HashMap do not contain the character and 
 *  put it in HashMap with key as Character and count as value	
 *  If HashMap already have the character, increment its count by 1	          
 */
		         if(charFreqMap.containsKey(ch)) {
		        	 
		            int count = charFreqMap.get(ch);
		            
		            charFreqMap.put(ch,count+1);
		            
		         } else {
		             charFreqMap.put(ch,1);
		         }
		      }
		      System.out.println(charFreqMap);
		   }
		}
