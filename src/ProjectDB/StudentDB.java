/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDB;

import java.util.ArrayList;
import java.util.List;
import mapping.Student;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class StudentDB {
    
    public void SaveStudent(Student s){
    
      Session session=NewHibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        session.close(); 
        
    }
    
    public List<Student> DisplayStudents(){
       
    List<Student> ls=new ArrayList<>();
     Session session=NewHibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     Query q=session.createQuery("from Student");
     ls=q.list();
     
    
    
   return ls; 
    }
    
    public void UpdateStudent(Student s){
    
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.update(s);
    session.getTransaction().commit();
    session.close();
    
    
    }
    
    public void DeleleStudet(Student s){
    
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.delete(s);
    session.getTransaction().commit();
    session.close();
    
    
    }
    
  public Student findByID(String id){
      
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    Student st=(Student) session.get(Student.class, id);
    
    session.close();  
     return st; 
  }

}

