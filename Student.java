

public class Student {
 
	int sid;

	String sname;

	int age;

	public Student(int sid, String sname, int age) {

		super();

		this.sid = sid;

		this.sname = sname;

		this.age = age;

	}

	@Override

	public String toString() {

		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + "]";

	}

}

 