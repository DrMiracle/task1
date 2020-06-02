import java.util.Arrays;

public class Cathedra {
	private String name;
	private Student[] students = {};
	private Lecturer[] lecturers = {};

	public Cathedra(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addStudent(Student student) {
		Student[] temp = new Student[students.length + 1];
		System.arraycopy(students, 0, temp, 0, students.length);
		temp[students.length] = student;
		students = temp;
	}

	public void addLecturer(Lecturer lecturer) {
		Lecturer[] temp = new Lecturer[lecturers.length + 1];
		System.arraycopy(lecturers, 0, temp, 0, lecturers.length);
		temp[lecturers.length] = lecturer;
		lecturers = temp;
	}

	public void editStudent(String oldName) {
		String result = DataInput.getStr("Change name: ");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(oldName)) {
				students[i].setName(result);
				System.out.println("Student " + oldName + " was succesfully edited");
				break;
			}
			if (i == students.length - 1) {
				System.out.println("Student " + oldName + " was not found");
			}
		}
	}

	public void editLecturer(String oldName) {
		String result = DataInput.getStr("Change name: ");
		for (int i = 0; i < lecturers.length; i++) {
			if (lecturers[i].getName().equals(oldName)) {
				lecturers[i].setName(result);
				System.out.println("Lecturer " + oldName + " was succesfully edited");
				break;
			}
			if (i == lecturers.length - 1) {
				System.out.println("Lecturer " + oldName + " was not found");
			}
		}
	}

	public void deleteStudent(String oldName) {
		Student[] temp;
		if (students.length == 0) {
			temp = new Student[students.length];
		} else {
			temp = new Student[students.length - 1];
		}
		for (int i = 0, k = 0; i < students.length; i++) {
			if (students[i].getName().equals(oldName)) {
				System.out.println("Student " + oldName + " was succesfully deleted");
				continue;
			}
			temp[k++] = students[i];
		}
		students = temp;
		System.out.println(Arrays.toString(students));
	}

	public void deleteLecturer(String oldName) {
		Lecturer[] temp;
		if (lecturers.length == 0) {
			temp = new Lecturer[lecturers.length];
		} else {
			temp = new Lecturer[lecturers.length - 1];
		}
		for (int i = 0, k = 0; i < lecturers.length; i++) {
			if (lecturers[i].getName().equals(oldName)) {
				System.out.println("Lecturer " + oldName + " was succesfully deleted");
				continue;
			}
			temp[k++] = lecturers[i];
		}
		lecturers = temp;
		System.out.println(Arrays.toString(lecturers));
	}
}
