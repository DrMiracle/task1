import java.util.Arrays;
import java.util.Comparator;

public class Utilities {

	public static void findStudentByName(Student[] students, String name) {
		for (int i = 0; i < students.length; i++) {

			if (students[i].getName().equals(name)) {
				System.out.println("Student " + name + " was succesfully found. Course: "
						+ students[i].getCourse() + ", group: " + students[i].getGroup());
				break;
			}
			if (i == students.length - 1) {
				System.out.println("Student " + name + " was not found.");
			}
		}
	}

	public static void findLecturerByName(Lecturer[] lecturers, String name) {
		for (int i = 0; i < lecturers.length; i++) {

			if (lecturers[i].getName().equals(name)) {
				System.out.println("Lecturer " + name + " was succesfully found.");
				break;
			}
			if (i == lecturers.length - 1) {
				System.out.println("Lecturer " + name + " was not found.");
			}
		}
	}

	public static void findStudentsByCourse(Student[] students, int course) {
		int i = 0;
		boolean notFound = true;
		System.out.println("Students on " + course + " course:");
		for (; i < students.length; i++) {
			if (students[i].getCourse() == course) {
				System.out.println(
						i + 1 + ". Name: " + students[i].getName() + ", group: " + students[i].getGroup());
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("No students were found.");
		}
	}

	public static void findStudentsByGroup(Student[] students, String group) {
		int i = 0;
		boolean notFound = true;
		System.out.println("Students in \"" + group + "\" group:");
		for (; i < students.length; i++) {
			if (students[i].getGroup().equals(group)) {
				System.out.println(i + 1 + ". Name: " + students[i].getName() + ", course: "
						+ students[i].getCourse());
				notFound = false;
			}
		}
		if (notFound) {
			System.out.println("No students were found.");
		}
	}

	public static void sortByCourse(Student[] students) {
		Arrays.sort(students, new CourseComparator());
		for (Student student : students) {
			System.out.println(" Course: " + student.getCourse() + ", name: " + student.getName()
					+ ", group: " + student.getGroup());
		}
	}

	public static void sortByAlphabet(Student[] students) {
		Arrays.sort(students, new NameComparator());
		for (Student student : students) {
			System.out.println(" Name: " + student.getName() + ", course: " + student.getCourse()
					+ ", group: " + student.getGroup());
		}
	}
}

class CourseComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return a.getCourse() < b.getCourse() ? -1 : a.getCourse() == b.getCourse() ? 0 : 1;
	}
}

class NameComparator implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		return a.getName().compareToIgnoreCase(b.getName());
	}
}
