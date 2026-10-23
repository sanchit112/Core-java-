package Array_Sorting;

public class Sorting1 {
	 public static void main(String[] args) {
	  int jio[]=new int[5]; {
	 	for(int p=0;p<jio.length;p++) {
		 for(int j=p+1;j<jio.length;j++) {
			  int k=jio[p];
			   jio[p]=jio[j];
			   jio[j]=k;
			  }
	       }
     	}
	 }
}