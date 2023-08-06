import java.util.*;

public class Class3Deal {

	public static void main(String[] args) {

		int dollarlist[] = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
		int sum, num1,num2,banker,avg;
		Scanner sc = new Scanner(System.in);
		sum=0;
		for (int i=0; i<10; i++) {
			sum += dollarlist[i];
		}
		System.out.println("total : "+sum);
		System.out.println("Average :" + sum/10);
		
		System.out.println("Please enter how many boxes you want to open? 1<= N <10");
		num1 = sc.nextInt();
		
		//List<Integer> myList = new ArrayLinkedList<Integer>();
		LinkedList mylist = new LinkedList();
		System.out.println("Please enter the No. of boxes you want to open :");
		for (int i=0; i<num1; i++) {
			num2 = sc.nextInt();
			mylist.add(dollarlist[num2-1]);
			sum -= dollarlist[num2-1];
		}
		avg = sum/(10-num1);
		System.out.println("Mylist is "+ mylist);
		System.out.println("Now the sum is " + sum);
		System.out.println("The average is " + avg );
		
		System.out.println("Please enter the Banker's offer");
		banker = sc.nextInt();
		if (banker > avg )
			System.out.println("Deal");
		else
			System.out.println("No Deal");
		
		sc.close();
	}

}
