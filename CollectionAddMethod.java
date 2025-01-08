import java.util.ArrayList;
 
public class Test3 {
 
	public static void main(String[] args) {

		ArrayList<Student>st=new ArrayList<Student>();

		st.add(new Student(101,"jhon",15));

		st.add(new Student(99,"sam",14));

		st.add(new Student(50,"Ajay",15));

		st.add(new Student(6,"ramesh",20));

		System.out.println(st.toString());

	}
 
}

 