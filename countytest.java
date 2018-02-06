package work;
import java.util.Scanner;
public class countytest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is th County Name?");
		String Cname= scanner.nextLine();
		
		System.out.println("What is the Population?");
		String Cpop=scanner.nextLine();
		
		System.out.println("What year was the established?");
		int Cestab=scanner.nextInt();
		
		System.out.println("What is the land voluome?");
		double Clandv=scanner.nextDouble();
		
		county county1= new county(Cname, Cpop, Cestab, Clandv);
		
		System.out.println(county1.CountyName);
		

	}

}
