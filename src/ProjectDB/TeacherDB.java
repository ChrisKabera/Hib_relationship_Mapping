/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDB;

import java.util.ArrayList;
import java.util.List;
import mapping.Student;
import mapping.Teacher;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class TeacherDB {
     public void SaveTeacher(Teacher t){
    
      Session session=NewHibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close(); 
        
    }
    
    public List<Teacher> Display(){
       
    List<Teacher> ls=new ArrayList<>();
     Session session= NewHibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     Query q=session.createQuery("from Teacher");
     ls=q.list();
     
    
    
   return ls; 
    }
    
    public void UpdateTeacher(Teacher t){
    
    Session session=NewHibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.update(t);
        session.getTransaction().commit();
        session.close();
    }
    
    public void DeleteTeacher(Teacher t){
    
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();
        session.close();
    }
}
