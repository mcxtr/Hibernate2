package org.example;

import org.example.repository.StudentRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        StudentRepository studentRepository = new StudentRepository();
        System.out.println(studentRepository.findById(1L));
    }
}
