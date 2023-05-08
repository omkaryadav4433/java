package Tester;
import static utils.StudentCollectionUtils.*;

import java.util.List;
import java.util.Map;

import com.app.core.Student;
@SuppressWarnings("unused")
public class test2 {

	//2. Display all student details from a student map
	
	public static void main(String[] args, List<Student> list) {
		System.out.println("display all student deatils ");
		Map<String,Student> map= populateMap(list);
		map.forEach((k,v) -> System.out.println(k+" "+v));
		System.out.println("----");

	}

}
