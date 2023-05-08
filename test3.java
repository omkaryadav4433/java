package Tester;
import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.app.core.Student;
import com.app.core.Subject;


@SuppressWarnings("unused")
public class test3 {
  //3. Display all student details(list) sorted as per GPA Use custom ordering
	public static void main(String[] args) {
		List<Student> list =populateList();
		System.out.println("student details list");
		list.forEach(s->System.out.println(s));
		System.out.println("-----");
		list.stream().sorted((d1,d2) -> ((Double)d1.getGpa()).compareTo(d2.getGpa())).forEach(p->System.out.println(p));
		Map<String,Student> map=populateMap(list);
		//String subject="DBT";
		//map.values().stream().filter(p-> p.getSubject().equals(Subject.valueOf(subject.toUpperCase()))).forEach(p->System.out.println(p));;
		
	}

}
