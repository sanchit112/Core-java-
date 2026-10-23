package Abstract;

import java.util.Scanner;

public class Sanchit_Int implements Client_Int{

	String Name;
	double Salary;

	@Override
	public void Input() {
		Scanner Sc=new Scanner(System.in);
		
		System.out.println(" Enter Name : ");
		Name=Sc.nextLine();
		//setName(Sc.next());
		System.out.println(" Enter Salary :");
		Salary=Sc.nextDouble();
		//setSalary(Sc.nextDouble()); 
		
	}
	@Override
	public void Output() {
		System.out.println(Name+" "+Salary);
		
//		 System.out.println(" NAME : "+getName());
//		 System.out.println(" SALARY : "+getSalary());
		
	}
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public double getSalary() {
//		return Salary;
//	}
//	public void setSalary(double salary) {
//		Salary = salary;
//	}
	public static void main(String[] args) {
		Client_Int s=new Sanchit_Int();
		s.Input();
		s.Output();
	}
}
