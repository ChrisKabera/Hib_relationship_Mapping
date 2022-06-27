/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDB;

import java.util.ArrayList;
import java.util.List;
import mapping.Faculty;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class FacultyDB {
    
    public void saveFaculty(Faculty f){
    
    Session session= NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(f);
    session.getTransaction().commit();
    session.close();
    
    
    }
    public List<Faculty>Display(){
        
        List<Faculty> ls=new ArrayList<>();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query q=session.createQuery("from Faculty");
        ls=q.list();
        
        session.close();
        
    return ls;
    }
    public void UpdateF(Faculty f){
    Session session= NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.update(f);
    session.getTransaction().commit();
    session.close();
    
    
    
    }
    public void DeleteF(Faculty f){
    Session session= NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.delete(f);
    session.getTransaction().commit();
    session.close();
    
    }
    
    
}
