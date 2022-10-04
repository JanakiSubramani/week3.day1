package overload;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Id of student is: "+id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Id is: "+id +" Name is: "+name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email is: "+email +"  phonenumber is: "+phoneNumber);
	}

	public static void main(String[] args) {
		Students ss=new Students();
		ss.getStudentInfo(20);
		ss.getStudentInfo(20, "Janaki");
		ss.getStudentInfo("1234ss@gmail.com", 987654321);
	}
}
