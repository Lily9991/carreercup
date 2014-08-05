import java.util.HashSet;


public class IsUniqueChar {
	
    //the most general solution for strings with all general characters.
	public static boolean isUniqueGeneral(String target){
		
		//if it is empty string.
		if(target == null || target.length() == 0){
			
			return false;
		}
		
		//a hash set used to store all uniquely occurred chars in the string
		HashSet<Character> occurence = new HashSet<Character>();
		
		char c ;
		
		for(int i = 0; i < target.length(); i++){
			
			c = target.charAt(i);
			
			if(occurence.contains(c)){
				
				return false;
				
			}else{
				
				occurence.add(c);
			}
		}
		
		return true;
		
	}
	
	/** 
	 * Assume characters in this string are all ASCII characters.
	 * @param target
	 * @return
	 */
	public static boolean isUniqueASCIIChars(String target){
		
		if(target == null || target.length() == 0){
			
			return false;
		}
		
		
		boolean[] occurred = new boolean[256];
		char c;
		
		for(int i = 0; i < target.length(); i++){
			
			c = target.charAt(i);
			
			if(occurred[c]){
				
				return false;
				
			}else{
				
				occurred[c] = true;
				
			}
		}
		
		return true;
		
		
	}

}
