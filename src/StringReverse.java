
public class StringReverse {
	
	/**
	 * Reverse null-terminated string.
	 * @param target
	 */
	public static void reverse(String target){
		
		String newStr="";
		for(int i = target.length() - 1; i >= 0; i--){
			
			newStr = newStr + target.charAt(i);
		}
		
		
		System.out.println(newStr);
	}
	
	public static void reverse1(String target){
		
		StringBuffer st = new StringBuffer(target);
		st.reverse();
		System.out.println(st.toString());
	}
	
	public static void reverse2(String target){
		
		char[] st = target.toCharArray();
		int front = 0;
		int tail = target.length()-1;
		
		while(front < tail){
			
			swap(st,front,tail);
			front++;
			tail--;
		}
		
		System.out.println(String.valueOf(st));
		
		
	}
	
	
	public static void swap(char[] st,int a,int b){
		
		char temp;
		temp = st[a];
		st[a] = st[b];
		st[b] = temp;
	}
	
	public static void main(String[] args){
		
		String s1 = "a";
		String s2 = "Lily";
		String s3 = "Lily9991";
		String s4 = "";
		String s5 = "eee";
		
		reverse(s1);
		reverse1(s1);
		reverse2(s1);
		
		reverse(s2);
		reverse1(s2);
		reverse2(s2);
		
		reverse(s3);
		reverse1(s3);
		reverse2(s3);
		
		reverse(s4);
		reverse1(s4);
		reverse2(s4);
		
		reverse(s5);
		reverse1(s5);
		reverse2(s5);
		
	}

}
