package hibernate.main;

import hibernate.entity.Gender;
import hibernate.entity.Student;
import hibernate.service.StudentService;

public class App {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();

		System.out.println(studentService.findStudentById(1L));

		Student s2 = new Student("Student 919", Gender.M);
		studentService.saveStudent(s2);

//		Student s3 = studentService.findStudentById(6L);
//		s3.setName("Student9999999");
//		studentService.updateStudent(s3);
//
//		Student s4 = studentService.findStudentById(1L);
//		studentService.deleteStudent(s4);
	}

}
