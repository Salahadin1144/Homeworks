package problem.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List<Student> studentList = new ArrayList<>();
		for (Object o : studentArray) {
			Student student = (Student) o;
			studentList.add(student);
		}
		return studentList;
	}

	public static double computeAverageGpa(List<Student> studentList) {
		Iterator<Student> studList = studentList.iterator();
		double cGPA = 0;
		while (studList.hasNext()) {
			Student student = studList.next();
			cGPA += student.computeGPA();
		}
		return cGPA / studentList.size();
	}
}
