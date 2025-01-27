public class MainClass {
	private static final University NaUKMA = new University();

	public static void main(String[] args) {
		while (true) {
			System.out.println("                            Welcome to our program!    " + '\n'
					+ "Choose the options: " + '\n' + "1 - create/edit/delete faculty" + '\n'
					+ "2 - create/edit/delete cathedra" + '\n' + "3 - create/edit/delete student/lecturer"
					+ '\n' + "4 - find student/lecturer" + '\n' + "5 - print all students using courses"
					+ '\n' + "6 - print all students/lecturers using alphaphetic order" + '\n'
					+ "7 - print all students of some cathedra using courses" + '\n'
					+ "8 - print all students/lecturers of specific cathedra using alphaphetic order"
					+ '\n' + "9 - print all students of specific cathedra of specific course" + '\n'
					+ "10 - print all stundets of specific cathedra of specific"
					+ " course using alphaphetic order");

			int number = DataInput.getInt("Enter number: ");
			switch (number) {
			case 1: {
				while (true) {
					System.out.println("What do you want to do? " + '\n' + "To create faculty, press 1"
							+ '\n' + "To edit faculty, press 2" + '\n' + "To delete faculty, press 3"
							+ '\n' + "To exit the faculty editor press any other number: ");
					int choice = DataInput.getInt("Choose: ");
					if (choice == 1) {
						Faculty faculty = new Faculty(DataInput.getStr("Enter faculty: "));
						NaUKMA.addFaculty(faculty);
						System.out.println(faculty.getName());
					} else if (choice == 2) {
						NaUKMA.printAllFaculties();
						NaUKMA.editFaculty(DataInput.getStr("Enter faculty to edit: "));
					} else if (choice == 3) {
						NaUKMA.printAllFaculties();
						NaUKMA.deleteFaculty(DataInput.getStr("Enter faculty to delete: "));
					} else
						break;
				}
				break;
			}
			case 2: {
				while (true) {
					System.out.println("What do you want to do? " + '\n' + "To create cathedra, press 1"
							+ '\n' + "To edit cathedra, press 2" + '\n' + "To delete cathedra, press 3"
							+ '\n' + "To exit the cathedra editor, press any other number: ");
					int choice = DataInput.getInt("Choose: ");
					if (choice == 1) {
						NaUKMA.addCathedra();
					} else if (choice == 2) {
						NaUKMA.editCathedra();
					} else if (choice == 3) {
						NaUKMA.deleteCathedra();
					} else
						break;
				}
			}
				break;
			case 3: {
				while (true) {
					System.out.println(
							"What do you want to do? " + '\n' + "To create student/lecturer, press 1"
									+ '\n' + "To edit student/lecturer, press 2" + '\n'
									+ "To delete student/lecturer, press 3" + '\n'
									+ "To exit the student/lecturer editor, press any other number: ");
					int choice = DataInput.getInt("Choose: ");
					if (choice == 1) {
						int choice1 = DataInput
								.getInt("If you want to add lecturer, press 1, for student, press 2."
										+ " Your choice: ");
						if (choice1 == 1) {
							NaUKMA.addLecturer();
						} else if (choice1 == 2) {
							NaUKMA.addStudent();
						} else
							System.out.println("Wrong number. ");
					} else if (choice == 2) {
						int choice2 = DataInput
								.getInt("To edit lecturer, press 1, students - 2. Your choice: ");
						if (choice2 == 1) {
							NaUKMA.editLecturer();
						} else if (choice2 == 2) {
							NaUKMA.editStudent();
						} else
							System.out.println("Wrong number. ");
					} else if (choice == 3) {
						int choice3 = DataInput
								.getInt("To delete lecturer, press 1, students - 2. Your choice: ");
						if (choice3 == 1) {
							NaUKMA.deleteLecturer();
						} else if (choice3 == 2) {
							NaUKMA.deleteStudent();
						} else
							System.out.println("Wrong number. ");
					} else
						break;
				}
				break;
			}
			case 4: {
				while (true) {
					System.out.println(
							"What do yo want to do? " + '\n' + "To find student/lecturer by name, press 1"
									+ '\n' + "To find students by course, press 2" + '\n'
									+ "To find students by group, press 3" + '\n'
									+ "To exit the student/lecturer finder, press any other number: ");
					int choice = DataInput.getInt("Choose: ");
					if (choice == 1) {
						int choice1 = DataInput.getInt("To find lecturer, press 1, student - 2: ");
						if (choice1 == 1) {
							Utilities.findLecturerByName(NaUKMA,
									DataInput.getStr("Enter the name of lecturer you want to find: "));
						} else if (choice1 == 2) {
							Utilities.findStudentByName(NaUKMA,
									DataInput.getStr("Enter the name of student you want to find: "));
						} else
							System.out.println("Wrong number. ");
					} else if (choice == 2) {
						Utilities.findStudentsByCourse(NaUKMA,
								DataInput.getInt("Enter the course of person you want to find: "));
					} else if (choice == 3) {
						Utilities.findStudentsByGroup(NaUKMA,
								DataInput.getStr("Enter the group of student you want to find: "));
					} else
						break;
				}
				break;
			}
			case 5: {
				Utilities.sortByCourse(Utilities.getAllStudents(NaUKMA));
			}
			case 6: {
				Utilities.sortFacultyPersonsByAlphabeticOrder(NaUKMA);
			}
			case 7: {
				Utilities.sortCathedrasStudentsByCourses(NaUKMA);
			}
			case 8: {
				Utilities.sortCathedrasPersonsByAlphabeticOrder(NaUKMA);
			}
			case 9: {
				for (Student student : Utilities.findCathedrasStudentsByCourse(NaUKMA)) {
					System.out.println(
							student.getName() + ", " + student.getCourse() + ", " + student.getGroup());
				}
			}
			case 10: {
				Utilities.sortStudentsByAlphabet(Utilities.findCathedrasStudentsByCourse(NaUKMA));
			}
			}
		}
	}

}
