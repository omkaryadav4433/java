package Tester;
import static utils.StudentCollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;
@SuppressWarnings("unused")
public class test1 {

	
	//1. Display all student details from a student list

	public static void main(String[] args) {
		// 1) Display all student Details from Student list
		List <Student> studentList =populateList();
		System.out.println("Students");
		studentList.forEach(s-> System.out.println(s));
       
		// 2) Display all student details from a student map hint->forEach(Biconsumer)
//		List <Student> studentList1 = populateList();
//		studentList.forEach(s-> System.out.println(s));
		
	}

}
