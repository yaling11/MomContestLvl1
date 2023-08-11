import java.util.*;
public class Class5LCD {

	public static char [][] num = new char[10][7];
	
	public static char[][] NUMBER = {{'-','|','|',' ','|','|','-'}, {' ',' ','|',' ',' ','|',' '},	//0,1
									 {'-',' ','|','-','|',' ','-'}, {'-',' ','|','-',' ','|','-'},	//2,3
									 {' ','|','|','-',' ','|',' '}, {'-','|',' ','-',' ','|','-'},	//4,5
									 {'-','|',' ','-','|','|','-'}, {'-',' ','|',' ',' ','|',' '},	//6,7
									 {'-','|','|','-','|','|','-'}, {'-','|','|','-',' ','|','-'}  	//8,9
	};
	
	public static void printLine036(int num, int pos, int s) {
		// This function to print char position at 0, 3, 6
		System.out.print(" ");		// To print left-side  
		for (int i=0; i<s; i++) {	// To print middle repetitive part	
			System.out.print(NUMBER[num][pos]);
		}
		System.out.print(" ");		// To print right-side
	}
	
	public static void printLine1245(int num, int pos, int s) {
		// This function to print char position at 1 and 2, or 4 and 5
		System.out.print(NUMBER[num][pos]);	// To print char position at 1 or 4 first
		for (int j=0; j<s; j++) {
			System.out.print(" "); 			// To print blank spaces between position 1 and 2, or 4 and 5
		}
		System.out.print(NUMBER[num][pos+1]);	// To print char position at 2 or 5 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, n;
			
		while (true) {
			s = sc.nextInt();
			n = sc.nextInt();
			
			if ((s==0) && (n==0)) { 
				System.out.println("End!");
				break;
			} else if ((s<1) || (s>10) || (n<0)) {	
				System.out.println("The first number should be within the range of 1..10. The 2nd number should be greater than 0.");
			} else {
				String str = String.valueOf(n);  // To store the number into a Integer List
				List<Integer> myList = new ArrayList<Integer>();
				for (int i=0; i<str.length(); i++) {
					myList.add((int)(str.charAt(i)-'0'));
				}
				
				for (int i=0; i<myList.size(); i++) {		// To print the 1st line of every digit
					printLine036(myList.get(i), 0, s);
					System.out.print(" "); 	// To print a <Space> after one digit
				}
				System.out.println(""); 	// To print the <Enter> after the 1st line
				
				for (int j=0; j<s; j++) { 	// To print how many lines of char position at 1 and 2				
					for (int i=0; i<myList.size(); i++) { 	// To print char position at 1 and 2
						printLine1245(myList.get(i), 1, s);	
						System.out.print(" "); 	// To print a <Space> after one digit
					}
					System.out.println("  ");
				}
				
				for (int i=0; i<myList.size(); i++) {		// To print the middle line of every digit
					printLine036(myList.get(i), 3, s);
					System.out.print(" "); 	// To print a <Space> after one digit
				}
				System.out.println(""); 	// To print the <Enter> after the middle line
				
				for (int j=0; j<s; j++) { 	// To print how many lines of char position at 4 and 5				
					for (int i=0; i<myList.size(); i++) { 	// To print char position at 4 and 5
						printLine1245(myList.get(i), 4, s);	
						System.out.print(" "); // To print a <Space> after one digit
					}
					System.out.println("  ");
				}
				
				for (int i=0; i<myList.size(); i++) {		// To print the last line of every digit
					printLine036(myList.get(i), 6, s);
					System.out.print(" "); 	// To print a <Space> after one digit
				}
				System.out.println(""); 	// To print the <Enter> after the last line
				
				System.out.println("  ");  	// To print a blank line after each number
			}
		}
		sc.close();			
	}
}
