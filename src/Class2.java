import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {

		System.out.println("Please enter two numbers as the range:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();
		sc.close();		
		
		int maxLen=0;
		for (int i=num1; i<(num2+1); ++i) {
			int len = 0;
			int num3 = i;
			while (true) {
				if (num3 == 1) {
					len += 1;
					break;
				} else if (num3 % 2 == 0) {
					num3 = num3 / 2;
					len += 1;
				} else {
					num3 = num3 * 3 + 1;
					len += 1;
				}
			}
			if (maxLen < len) {
				maxLen = len;
		    }
		}

		System.out.println(num1 + " " + num2 + " " + maxLen);
	}

}
