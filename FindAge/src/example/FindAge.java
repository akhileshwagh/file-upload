package example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindAge {
	
	public static void main(String[] args) {
		
		//creating a scanner object to read user input
		try(Scanner sc= new Scanner(System.in)){
			
			System.out.println("Enter your birthdate (YYYY-MM-DD)");

			String birthDateString = sc.nextLine();
			
			LocalDate birthDate = LocalDate.parse(birthDateString);
			
			//get current Date
			
			LocalDate currentDate = LocalDate.now();
			
			Period age=Period.between(birthDate, currentDate);
			
			System.out.print("your age is " + age.getYears()+ " years old");
			
			
			
			
		}
	}

}
