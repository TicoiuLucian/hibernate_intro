package hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.entity.Student;
import hibernate.util.HibernateUtil;

public class StudentDao {

	private Session session;
	private Transaction transaction;

	public Session openSession() {
		session = HibernateUtil.getSessionFactory().openSession();
		return session;
	}

	public Session openSessionWithTransaction() {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		return session;
	}

	public void closeSession() {
		session.close();
	}

	public void closeSessionWithTransaction() {
		transaction.commit();
		session.close();
	}

	public Student findById(long id) {
		return session.find(Student.class, id);
	}

	public void saveStudent(Student student) {
		session.save(student);
	}

	public void updateStudent(Student student) {
		session.update(student);
	}

	public void deleteStudent(Student student) {
		session.delete(student);
	}

}
