import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Cloneable {

	private static List<Student> listStudent;
	
	public StudentDao () {
		listStudent = new ArrayList<Student>();
		Student student = new Student ();
		student.setId("S1");
		student.setName("Test");
		student.setLastname("TestLast");
		
		Student student2 = new Student ();
		student2.setId("S2");
		student2.setName("Test2");
		student2.setLastname("TestLast2");
		
		listStudent.add(student);
		listStudent.add(student2);
		
	}
	
	public List<Student> getAllStudent (){
		return listStudent;
	}
	
	@Override
	protected List<Student> clone() throws CloneNotSupportedException {
		List<Student> listStudentClone = new ArrayList<Student>();
		for (Student element : listStudent) {
			listStudentClone.add(element);
		}
		
		return listStudentClone;
	}
	
}
