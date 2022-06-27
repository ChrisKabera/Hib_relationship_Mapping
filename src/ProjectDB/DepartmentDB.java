/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDB;

import java.util.ArrayList;
import java.util.List;
import mapping.Departments;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class DepartmentDB {
    
    public void saveDepartment(Departments d){
    
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(d);
    
    session.getTransaction().commit();
    session.close();
    }
    
    public List<Departments>DisplayD(){
    List<Departments> ls=new ArrayList<>();
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    
    Query q=session.createQuery("from Departments");
    ls=q.list();
    session.close();
    
    
    return ls;
    }
    public void UpdateDepart( Departments d){
    
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.update(d);
    session.getTransaction().commit();
    session.close();
    }
     
    public void DeleteDepart(Departments d){
    Session session=NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.delete(d);
    session.getTransaction().commit();
    session.close();
    }
            
}
