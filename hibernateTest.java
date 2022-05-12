package hibernaterelation;

import java.util.ArrayList;

public class hibernateTest {
	public static void main(String args[]){
		ArrayList subjectList1 = new ArrayList();
		subjectList1.add(new Subject("Data Structure"));
		subjectList1.add(new Subject("Operting System"));
 
		ArrayList subjectList2 = new ArrayList();
		subjectList2.add(new Subject("Compiler"));
		subjectList2.add(new Subject("Networking"));
		subjectList2.add(new Subject("DBMS"));
 
		//Create the student object.
		Student student1 = new Student("Raz", "Kansal", 
				"BCA final", "MCA/07/71", 26);
		//Student student2 = new Student("Sunil", "Kumar", 
		//		"MCA final", "MCA/07/73", 32);
 
		student1.setSubjects(subjectList1);
		//student2.setSubjects(subjectList2);
 
		StudentDBOperations obj = new StudentDBOperations();
		//insert student object.
		obj.addStudent(student1);
		//obj.addStudent(student2);
 
		//show all student object.
		obj.showAllStudentDetails();
//	
 
	}
}

