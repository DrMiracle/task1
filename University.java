import java.util.Arrays;

public class University {
	private Faculty[] faculties = {};

	public University() {
		super();
	}

	public void addFaculty(Faculty faculty) {
		Faculty[] temp = new Faculty[faculties.length + 1];
		System.arraycopy(faculties, 0, temp, 0, faculties.length);
		temp[faculties.length] = faculty;
		faculties = temp;
	}

	public void editFaculty(String facultyName) {
		Faculty faculty = findFacultyByName(facultyName);
		if (faculty == null) {
			System.out.println("Faculty " + facultyName + " was not found");
			return;
		}
		String result = DataInput.getStr("Change name: ");
		faculty.setName(result);
		System.out.println("Faculty " + facultyName + " was succesfully edited");
	}

	public void deleteFaculty(String facultyName) {
		Faculty faculty = findFacultyByName(facultyName);
		if (faculty == null) {
			System.out.println("Faculty " + facultyName + " was not found");
			return;
		}
		Faculty[] temp = new Faculty[faculties.length - 1];
		for (int i = 0, k = 0; i < faculties.length; i++) {

			if (faculties[i].equals(faculty)) {
				System.out.println("Faculty " + faculty + " was succesfully deleted");
				continue;

			}
			temp[k++] = faculties[i];
		}
		faculties = temp;
		System.out.println(Arrays.toString(faculties));

	}

	public Faculty findFacultyByName(String facultyName) {
		for (int i = 0; i < faculties.length; i++) {
			if (faculties[i].getName().equals(facultyName)) {
				return faculties[i];
			}
		}
		return null;
	}

	public void printAllFaculties() {
		if (faculties.length != 0) {
			System.out.println("Faculties: ");
		}
		for (int i = 0; i < faculties.length; i++) {
			System.out.println(i + 1 + ". " + faculties[i].getName());
		}
	}

}
