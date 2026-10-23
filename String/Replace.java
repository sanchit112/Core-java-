package String;

public class Replace {
 public static void main(String[] args) {

	 String s3="Java is an Object Oriented programming language";
			 System.out.println(s3);
			 String s2=s3.replace('a', 'Z');//char change
			 System.out.println(s2);
			 s2=s3.replace("Java", "SQL");//word change
			 System.out.println(s2);
			 s2=s3.replaceAll("0","TT");
			 System.out.println(s2);
	 
	 
 }
}
