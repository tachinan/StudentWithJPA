/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentjpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class StudentJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student(1,"Alice",3.25);
        Student st2 = new Student(2,"Bob",3.50);
        StudentTable.insertStudent(st1);
        StudentTable.insertStudent(st2);

//        Student st3 = new Student(3,"Sli",5.0);
//        StudentTable.insertStudent(st3);

// Student st;
//       st = StudentTable.findStudentById(1);
//       if (st != null) {
//           st.setName("Alisa");
//           StudentTable.removeStudent(st);
//           StudentTable.updateEmployee(st);
//       }
//       List<Student> stList = StudentTable.findStudentByName("Alisa"); 
        
       List<Student> stList = StudentTable.findAllStudent();
        printAllStudent(stList);
        
    }
    
     public static void printAllStudent(List<Student> studentList) {
        for(Student emp : studentList) {
           System.out.print(emp.getId() + " ");
           System.out.print(emp.getName() + " ");
           System.out.println(emp.getGpa() + " ");
       }
    }
    
}
