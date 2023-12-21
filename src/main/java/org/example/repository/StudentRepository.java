package org.example.repository;

import org.example.DBConnection;
import org.example.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentRepository {
    private final SessionFactory sessionFactory = DBConnection.getSessionFactory();
    StudentRepository studentRepository = new StudentRepository();
    public void save(Student student){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
    public Student findById(Long id){
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }
    public List<Student>findAll(){
    Session session = sessionFactory.openSession();
        Query<Student> query = session.createQuery("select s from Student s");

    }
}
