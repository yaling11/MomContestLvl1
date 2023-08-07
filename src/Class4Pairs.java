import java.util.*;
public class Class4Pairs {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Scanner sc = new Scanner(System.in);
		int num;
		Map<String,String> mymap = new HashMap<>();
		boolean r = true;
		
		System.out.println("Please enter how many people in the list?");
		num = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter all first names in the list(seperated by one space),");
		System.out.println("  then enter his/her "
				+ "pair's first name in the 2nd line.");
//		for (int i=0; i<num; i++) {
//			mymap.put(i,sc.next());
//			System.out.println("You just entered:" + mymap);
//		}
//		sc.nextLine(); //get rid of the end-of-line sign
		String[] list1 = sc.nextLine().split(" ");
		String[] list2 = sc.nextLine().split(" ");
		
		for (int i=0; i<num; i++) {
			if (mymap.containsKey(list2[i])) {	// First check if the key has been in the map
				if ( !(mymap.get(list2[i]) .equals(list1[i])) ) {	// Then check if the pair in map agrees with current
					r = false;
					break;
				}
			} else if (list2[i] .equals(list1[i])) {  // False if one person pairs with himself
				r = false;
				break;
			} else {			// Added into the map if this is a new key(new pair)	
				mymap.put(list1[i], list2[i]);	
			}
			
		}
		
		System.out.println(r? "good": "bad");
		sc.close();
		long endTime = System.nanoTime();
		System.out.println("Runtime: " + (endTime-startTime));
		
	}

}
