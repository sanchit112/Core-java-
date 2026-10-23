package String;

public class Palindome {
	
	
	public void RemoveSpace(String s) {
		 s=s.toLowerCase();
		 String s1="";
		 for(int k=0; k<s.length();k++) {
			 if(s.codePointAt(k)>=97 && s.codePointAt(k)<=122) 
				 s1=s1+s.charAt(k); 
		 } 
		 System.out.println(s1);
	}
	
	public void checkPalindrome(String s) { 
	     s = s.toLowerCase(); 
		 boolean isPalindrome = true;  
		 for (int i = 0; i < s.length() / 2; i++) {
		 if (s.charAt(i) != s.charAt(s.length() - 1 - i)) { 
		 isPalindrome = false; 
		 break;
		 } 
	}
		if (isPalindrome) { 
			System.out.println("Palindrome");  
			} else {
			System.out.println("Not palindrome");
			}
	    }
	
	public static void main(String[] args) {
		Palindome pa=new Palindome();
		pa.RemoveSpace(" Java Is A Programming Language ");
		pa.checkPalindrome("Java Is A Programming Language");
	}

} 