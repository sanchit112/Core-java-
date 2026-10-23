package Constructor;

public class Demo {

		private static Demo d1;
		
		private Demo() {
			System.out.println("D-Class"+d1);
		}
		
		public static Demo getDemoClassObject() {
			if(d1==null) {
				d1=new Demo();
			}
			
			return d1;
		}
}
