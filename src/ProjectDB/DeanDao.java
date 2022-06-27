/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectDB;

import java.util.ArrayList;
import java.util.List;
import mapping.Dean;
import mapping.Faculty;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GRACE
 */
public class DeanDao {
    
      public void saveDean(Dean dd){
    
    Session session= NewHibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(dd);
    session.getTransaction().commit();
    session.close();
    
    
    }
    public List<Dean>Display(){
        
        List<Dean> ls=new ArrayList<>();
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Query q=session.createQuery("from Dean");
        ls=q.list();
        
        session.close();
          return ls;
        
    }
    
}
