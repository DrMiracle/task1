public class MainClass {
	private static final University NaUKMA = new University();

	public static void main(String[] args) {
		while (true) {
			System.out.println("                            Welcome to our program!    " + '\n'
					+ "Choose the options: " + '\n' + "1 - create/edit/delete faculty" + '\n'
					+ "2 - create/edit/delete cathedra" + '\n' + "3 - create/edit/delete student/lecturer"
					+ '\n' + "4 - find student/lecturer" + '\n' + "5 - print all students using courses"
					+ '\n' + "6 - print all students/lecturers using alphaphet order" + '\n'
					+ "7 - print all students of some cathedra using courses" + '\n'
					+ "8 - print all students/lecturers of some cathedra using alphaphet order" + '\n'
					+ "9 - print all students of some cathedra of some course" + '\n'
					+ "10 - print all stundets of some cathedra of some course using alphaphet order");

			int number = DataInput.getInt("Enter number: ");
			switch (number) {
			case 1: {
				while (true) {
					System.out.println("What do yo want to do? " + '\n' + "To create faculty, press 1"
							+ '\n' + "To edit faculty, press 2" + '\n' + "To delete faculty, press 3"
							+ '\n' + "To exit the faculty editor press any other number: ");
					int choice = DataInput.getInt("Choose: ");
					if (choice == 1) {
						Faculty faculty = new Faculty(DataInput.getStr("Enter faculty: "));
						NaUKMA.addFaculty(faculty);
						System.out.println(faculty.getName());
					} else if (choice == 2) {
						NaUKMA.editFaculty(DataInput.getStr("Enter faculty to edit: "));
					} else if (choice == 3) {
						NaUKMA.deleteFaculty(DataInput.getStr("Enter faculty to delete: "));
					} else
						break;
				}
				break;
			}
			case 2: {
				while (true) {
					System.out.println("What do yo want to do? " + '\n' + "To create cathedra, press 1"
							+ '\n' + "To edit cathedra, press 2" + '\n' + "To delete cathedra, press 3"
							+ '\n' + "To exit the cathedra editor, press any other number: ");
					int choice = DataInput.getInt("Choose: ");
					if (choice == 1) {
						NaUKMA.printAllFaculties();
						Faculty cathedraFaculty = NaUKMA
								.findFacultyByName(DataInput.getStr("Enter faculty of cathedra: "));
						if (cathedraFaculty == null) {
							System.out.println("Faculty is not found.");
						} else {
							Cathedra cathedra = new Cathedra(DataInput.getStr("Enter cathedra's name: "));
							cathedraFaculty.addCathedra(cathedra);
							System.out.println(cathedra.getName());
						}
					} else if (choice == 2) {
						NaUKMA.printAllFaculties();
						Faculty cathedraFaculty = NaUKMA.findFacultyByName(
								DataInput.getStr("Enter faculty of cathedra to edit: "));
						if (cathedraFaculty == null) {
							System.out.println("Faculty is not found.");
						} else {
							cathedraFaculty.printAllCathedras();
							cathedraFaculty.editCathedra(DataInput.getStr("Enter cathedra to edit: "));
						}
					} else if (choice == 3) {
						NaUKMA.printAllFaculties();
						Faculty cathedraFaculty = NaUKMA.findFacultyByName(
								DataInput.getStr("Enter faculty of cathedra to delete: "));
						if (cathedraFaculty == null) {
							System.out.println("Faculty is not found.");
						} else {
							cathedraFaculty.printAllCathedras();
							cathedraFaculty.deleteCathedra(DataInput.getStr("Enter cathedra to delete: "));
						}
					} else
						break;
				}
			}
				break;
//			case 3: {
//				while (true) {
//					System.out.println(
//							"What do yo want to do? " + '\n' + "To create student/lecturer, press 1" + '\n'
//									+ "To edit student/lecturer, press 2" + '\n'
//									+ "To delete student/lecturer, press 3" + '\n'
//									+ "To exit the student/lecturer editor, press any other number: ");
//					int choice = DataInput.getInt("Choose: ");
//					if (choice == 1) {
//						int choice1 = DataInput
//								.getInt("If you want to add lecturer, press 1, for student, press 2."
//										+ " Your choice: ");
//						if (choice1 == 1) {
//							lecturers.addLecturer(DataInput.getStr("Enter name: "),
//									DataInput.getStr("Enter cathedra: "));
//							System.out.println(lecturers);
//						} else if (choice1 == 2) {
//							students.addStudent(DataInput.getStr("Enter name: "),
//									DataInput.getStr("Enter cathedra: "),
//									DataInput.getInt("Enter course: "));
//							System.out.println(students);
//						} else
//							System.out.println("Wrong number. ");
//					} else if (choice == 2) {
//						int choice2 = DataInput
//								.getInt("To edit lecturer, press 1, students - 2. Your choice: ");
//						if (choice2 == 1) {
//							lecturers.editor(DataInput.getStr("What's old name? "));
//						} else if (choice2 == 2) {
//							students.editor(DataInput.getStr("What's old name? "));
//						} else
//							System.out.println("Wrong number. ");
//					} else if (choice == 3) {
//						int choice3 = DataInput
//								.getInt("To delete lecturer, press 1, students - 2. Your choice: ");
//						if (choice3 == 1) {
//							lecturers.delete(DataInput.getStr("What's old name? "));
//						} else if (choice3 == 2) {
//							students.delete(DataInput.getStr("What's old name? "));
//						} else
//							System.out.println("Wrong number. ");
//					} else
//						break;
//				}
//				break;
//			}
//			case 4: {
//				while (true) {
//					System.out.println(
//							"What do yo want to do? " + '\n' + "To find student/lecturer by name, press 1"
//									+ '\n' + "To find student by course, press 2" + '\n'
//									+ "To find student/lecturer by cathedra, press 3" + '\n'
//									+ "To exit the student/lecturer finder, press any other number: ");
//					int choice = DataInput.getInt("Choose: ");
//					if (choice == 1) {
//						int choice1 = DataInput.getInt("To find lecturer, press 1, student - 2: ");
//						if (choice1 == 1) {
//							lecturers.finderByName(
//									DataInput.getStr("Enter the name of person you want to find: "));
//						} else if (choice1 == 2) {
//							students.finderByName(
//									DataInput.getStr("Enter the name of person you want to find: "));
//						} else
//							System.out.println("Wrong number. ");
////					} else if (choice == 2) {
////						int choice1 = DataInput.getInt("To find lecturer, press 1, student - 2: ");
////						if (choice1 == 1) {
////							lecturers.finderByCathedra(
////									DataInput.getStr("Enter the cathedra of person you want to find: "));
////						} else if (choice1 == 2) {
////							students.finderByCathedra(
////									DataInput.getStr("Enter the cathedra of person you want to find: "));
////						} else
////							System.out.println("Wrong number. ");
////					} else if (choice == 3) {
////						int choice1 = DataInput.getInt("To find lecturer, press 1, student - 2: ");
////						if (choice1 == 1) {
////							lecturers.finderByCourse(
////									DataInput.getStr("Enter the course of student you want to find: "));
////						} else if (choice1 == 2) {
////							students.finderByCourse(
////									DataInput.getStr("Enter the course of student you want to find: "));
////						} else
////							System.out.println("Wrong number. ");
//					} else
//						break;
//				}
//				break;
//			}
			}
		}
	}

}
