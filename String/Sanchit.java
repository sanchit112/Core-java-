package String;

public class Sanchit {
	
	public static void main(String[] args) {
		
		String s1=" Sanchit patil ";
		String s2=" sanchit patil ";
		
		System.out.println(s1.startsWith(" Sa"));
		System.out.println(s1.charAt(7));              //  CharAt()
		System.out.println(s1.length());               //  length()         String madhe kitti ahe words/letter
		System.out.println(s1.indexOf('a'));           //  indexOf()        Starting point index
		System.out.println(s1.lastIndexOf('h', 'i'));  //  lastIndexOf()    Ending POint index
	    System.out.println(s2.concat(s1));             //  concat()
		System.out.println(s1.equals(s2));             //  equals()
		System.out.println(s2.lastIndexOf('i'));       //  lastIndexOf()
		System.out.println(s2.isEmpty());              //  isEmpty()
		System.out.println(s2.isBlank());              //  isBlank()
		System.out.println(s1.replace('p', 'P'));      //  replace()
		System.out.println(s1.toUpperCase());          //  toUpperCase()
		System.out.println(s1.valueOf(9));             //  valueOf()
		System.out.println(s1.repeat(5));              //  repeat ()
		System.out.println(s1.matches(s2));            //  matches()
		System.out.println(s1.stripLeading());         //  stripLeading()
		 
		 
		
		
		
	}  
}
 