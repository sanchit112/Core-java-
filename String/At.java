package String;

public class At {
	public static void main(String[] args)  {
		String s3="Java is an Object Oriented Programming Language";
		char ch1=s3.charAt(14);
		System.out.println(ch1);
		
		int code=s3.codePointAt(14);
		System.out.println(code);
		System.out.println();
		
		String s2="Orange";
		String s1=s2.concat("Color");
		System.out.println(s1);
		s1=String.join("_","Fruit","Banana");
		System.out.println(s1);
		System.out.println();
		int y=100;
		
		At d1=new At();
		s1=String.valueOf(y);
		System.out.println(s1);
		s1=String.valueOf(d1);
		System.out.println(s1);
		
		 
	}

}
