package comm;

	import java.util.Scanner;
	public class Pattern2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Taking user input for the number
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();

	        for (int i = 0; i < n; i++) {
	            // Print leading spaces
	            for (int j = 0; j < i * 3; j++) {
	                System.out.print(" ");
	            }

	            // Print numbers in decreasing order
	            for (int j = n; j > i; j--) {
	                System.out.print(j + " ");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


