package Collection;

import java.util.ArrayList;

public class ArrayList1 {
     public static void main(String[] args) {
    	 ArrayList<ArrayList<String>> students = new ArrayList<>();
    	 ArrayList<String> s1 = new ArrayList<>();
    	 s1.add("Rahul"); s1.add("22"); s1.add("Pune");
    	 ArrayList<String> s2 = new ArrayList<>();
    	 s2.add("Priya"); s2.add("25"); s2.add("Mumbai");
    	 ArrayList<String> s3 = new ArrayList<>();
    	 s3.add("Amit"); s3.add("20"); s3.add("Pune");
    	 ArrayList<String> s4 = new ArrayList<>();
    	 s4.add("Sneha"); s4.add("24"); s4.add("Nagpur");
    	 ArrayList<String> s5 = new ArrayList<>();
    	 s5.add("Raj"); s5.add("27"); s5.add("Mumbai");
    	 students.add(s1);
    	 students.add(s2);
    	 students.add(s3);
    	 students.add(s4);
    	 students.add(s5);
    	 
    	// System.out.println(students);
    	 for(int i=0; i<students.size();i++) {
    		 ArrayList<String> alstud=students.get(i);
    		 for(int j=0;j<alstud.size();j++) {
    			 String studata=alstud.get(j);
    			 System.out.println(studata);
    		 }
    		 
    		 for(ArrayList<String> alstu : students) {
    			 
    			 for(String studata:alstu) {
    				 System.out.println(studata);
    			 }
    		 }
    		 
    	 }
    	 
	}
}
