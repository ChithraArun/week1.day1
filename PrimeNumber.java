package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an int Input and assign a value 13

		int number= 13; 
		int i = 2;
int reminder=0;
				// Declare a boolean variable flag as false
boolean flag = false;
				// Iterate from 2 to half of the inpu
				for(i=2;i<=(number/2);i++) {
					// Divide the input with each for loop variable and check the remainder

					reminder = number%i;
					 if(reminder==0) {
					// Set the flag as true when there is no remainder
						 flag = true;	
					// break the iterator
					 }
					 else
					 { flag = false;
					 }
					 }
				// Check the flag (Provide a condition)
					 if(flag==true) {
System.out.println("The Number is not prime");
					 }
					 else {
						 System.out.println("The Number is prime");
					 }
					// Print 'Prime' when the condition matches
					// Print 'Not a Prime' when the condition doesn't match 

		   }

		}
	
