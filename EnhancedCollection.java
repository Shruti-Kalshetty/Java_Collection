import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;
 
public class Test1 {
 
	public static void main(String[] args) {

		//List<String>l1=new ArrayList<String>();

		ArrayList<String >l1=new ArrayList<String>();

		l1.add("Ajay");

		l1.add("vijay");

		l1.add("sujay");

		l1.add("Ajay");

		l1.add("ramesh");

		System.out.println(l1);

		System.out.println(l1.get(3));

		System.out.println(l1.indexOf("ramesh"));

		System.out.println(l1.size());

		for(int i=0;i<l1.size();i++) {

			System.out.println(l1.get(i));

		}

		System.out.println("Enhansed for loop");

		for(String x:l1) {

			System.out.println(x);

		}

		System.out.println("Using Iterator ");

		Iterator<String>itr=l1.iterator();

		while(itr.hasNext()) {

			System.out.println(itr.next());

		}

 
	}
 
}

 