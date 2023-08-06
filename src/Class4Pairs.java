import java.util.*;
public class Class4Pairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		Map<Integer,String> mymap = new HashMap<>();
		
		System.out.println("Please enter how many people in the list?");
		num = sc.nextInt();
//		if ((num%2)!= 0 ) {
//			break; // Odd number of people can not be paired properly
//		}
		System.out.println("Please enter all first names in the list(seperated by one space), then enter his/her "
				+ "pair's first name in the 2nd line.");
		
		for (int i=0; i<num; i++) {
			mymap.put(i,sc.next());
			System.out.println("i="+i);
		}
		sc.nextLine();
		System.out.println("You just entered:" + mymap);
		sc.close();
	}

}
