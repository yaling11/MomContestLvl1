import java.io.*;
import java.util.*;


public class Class1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String field[];
		String result[];
		System.out.println("Please enter your mine dimension: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine(); // To read thru the rest of the whole line
		System.out.println("Please enter your mine field: ");
		field = new String[n];
		for (int i = 0; i < n; ++i) {
			field[i] = sc.nextLine();
		}
	
	  
		int i=0;  
		result = new String[n];
		for (i = 0; i < n; i++) {
			result[i] = "";
			for (int j = 0; j < m; j++) {
				char ch = field[i].charAt(j);
				int mines = 0;

				if (ch == '*') {
					result[i] += "*";
				} else {
					if (((i - 1) >= 0) && ((j - 1) >= 0))
						if (field[i - 1].charAt(j - 1) == '*') {
							mines++;
						}
					if ((i - 1) >= 0) {
						if (field[i - 1].charAt(j) == '*') {
							mines++;
						}
					}
					if (((i - 1) >= 0) && ((j + 1 < m))) {
						if (field[i - 1].charAt(j + 1) == '*') {
							mines++;
						}
					}
					if ((j - 1) >= 0) {
						if (field[i].charAt(j - 1) == '*') {
							mines++;
						}
					}
					if ((j + 1) < m) {
						if (field[i].charAt(j + 1) == '*') {
							mines++;
						}
					}
					if (((i + 1) < n) && ((j - 1) >= 0)) {
						if (field[i + 1].charAt(j - 1) == '*') {
							mines++;
						}
					}
					if ((i + 1) < n) {
						if (field[i + 1].charAt(j) == '*') {
							mines++;
						}
					}
					if (((i + 1) < n) && ((j + 1) < m)) {
						if (field[i + 1].charAt(j + 1) == '*') {
							mines++;
						}
					}
					result[i] += mines;

				}
			}
			System.out.println(result[i]);
		}

	}
}
