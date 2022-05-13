import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		StudentDao prove = new StudentDao();
		List<Student> prove2 = prove.clone();
		prove2.add(new Student("S3", "Clone", "Clone"));
		
		for (Student element : prove.getAllStudent()) {
			System.out.println(element);
		}
		
		for (Student element : prove2) {
			System.out.println(element);
		}
	}

}
