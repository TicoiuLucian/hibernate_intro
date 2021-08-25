package hibernate.service;

import org.apache.log4j.Logger;

import hibernate.dao.StudentDao;
import hibernate.entity.Student;

public class StudentService {

	private StudentDao studentDao = new StudentDao();
	private static Logger log = Logger.getLogger(StudentService.class);

	public Student findStudentById(long id) {
		log.info("Find student with id " + id);
		studentDao.openSession();
		Student student = studentDao.findById(id);
		studentDao.closeSession();
		return student;
	}

	public void saveStudent(Student s) {
		studentDao.openSessionWithTransaction();
		studentDao.saveStudent(s);
		studentDao.closeSessionWithTransaction();
	}

	public void updateStudent(Student s) {
		studentDao.openSessionWithTransaction();
		studentDao.updateStudent(s);
		studentDao.closeSessionWithTransaction();
	}

	public void deleteStudent(Student s) {
		studentDao.openSessionWithTransaction();
		studentDao.deleteStudent(s);
		studentDao.closeSessionWithTransaction();
	}
}
