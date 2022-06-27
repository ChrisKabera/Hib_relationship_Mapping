/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDB;

import java.util.ArrayList;
import java.util.List;
import mapping.Course;
import mapping.Faculty;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class CoursesDB {
      public void saveCourse( Course c){
    
    Session session= NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(c);
    session.getTransaction().commit();
    session.close();
    
    
    }
    public List<Course>CDisplay(){
        
        List<Course> ls=new ArrayList<>();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query q=session.createQuery("from Course");
        
        ls=q.list();
        
        session.close();
        
    return ls;
    }
    public void Cupdate(Course c){
    
    Session session= NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.update(c);
    session.getTransaction().commit();
    session.close();
    
    
    
    
    }
    public void CDelete(Course c){
    
    Session session= NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.delete(c);
    session.getTransaction().commit();
    session.close();
    
    
    }
    
    
}
