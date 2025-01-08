import java.util.ArrayList;
 
public class Test2 {
 
	public static void main(String[] args) {

		ArrayList<Integer>l1=new ArrayList<Integer>();

		l1.add(100);

		l1.add(5);

		l1.add(20);

		System.out.println(l1);

		ArrayList<Integer>l2=new ArrayList<Integer>();

		l2.add(50);

		l1.add(85);

		l2.add(55);

		l1.addAll(l2);

		System.out.println(l1);

		l1.addAll(1, l2);

		System.out.println(l1);

		if(l1.isEmpty()) {

			System.out.println("Data is no found");

		}

		else {

			System.out.println("Data is available");

		}
 
		l1.remove(1);

		System.out.println(l1);

		l1.clear();

		System.out.println(l1);

		if(l1.isEmpty()) {

			System.out.println("Data is no found");

		}

		else {

			System.out.println("Data is available");

		}

	}
 
}

 