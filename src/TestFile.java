import java.util.*;

public class MinesweeperV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, fieldcount;
		
		fieldcount=0;
		System.out.println("Please enter the dimension of the field: N M");
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			if (!((N>0) && (M>0)))
				break;
			else {
				String field[] = new String[N+1];
				String result[] = new String[N+1];
				fieldcount++;
				System.out.println("Please enter your field:");
				for (int i=0; i<(N+1); ++i) {
					field[i] = sc.nextLine();
				}
				
				System.out.print("Field#"+fieldcount);
				  
				int i=0;  
				for (i = 0; i < (N+1); i++) {
					result[i] = "";
					for (int j = 0; j < (M); j++) {
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
							if (((i - 1) >= 0) && ((j + 1 < (M+1)))) {
								if (field[i - 1].charAt(j + 1) == '*') {
									mines++;
								}
							}
							if ((j - 1) >= 0) {
								if (field[i].charAt(j - 1) == '*') {
									mines++;
								}
							}
							if ((j + 1) < (M+1)) {
								if (field[i].charAt(j + 1) == '*') {
									mines++;
								}
							}
							if (((i + 1) < (N+1)) && ((j - 1) >= 0)) {
								if (field[i + 1].charAt(j - 1) == '*') {
									mines++;
								}
							}
							if ((i + 1) < (N+1)) {
								if (field[i + 1].charAt(j) == '*') {
									mines++;
								}
							}
							if (((i + 1) < (N+1)) && ((j + 1) < (M+1))) {
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
			sc.close();
			}
}
