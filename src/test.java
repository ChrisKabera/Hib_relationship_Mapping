
import ProjectDB.CoursesDB;
import ProjectDB.StudentDB;
import mapping.Course;
import mapping.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GRACE
 */
public class test {
    
    public static void main(String[] args) {
//        NewHibernateUtil.getSessionFactory().openSession();
//        
//        Student s = new Student();
//        s.setNationalID("1211551626262");
//        s.setName("Chris Kabera");
//        Course c1 = new Course();
//        c1.setCid("CS-87");
//        c1.setName("Algorithm");
//        Course c2 = new Course();
//        c2.setCid("CS-67");
//        c2.setName("Big Date");
//        Course c3 = new Course();
//        c3.setCid("CS-690");
//        c3.setName("Applied Math");
//        s.addCourse(c1);
//        s.addCourse(c2);
//        s.addCourse(c3);
//        CoursesDB da= new CoursesDB();
//        da.saveCourse(c1);
//        da.saveCourse(c2);
//        da.saveCourse(c3);
        
        StudentDB sdb = new StudentDB();
        //sdb.SaveStudent(s);
        
        for(Student st:sdb.DisplayStudents()){
            System.out.println("Student:"+ st.getName() +" Registered in :");
            
            for(Course c:st.getRegCourses()){
                System.out.println("--"+c.getName());
            }
        }
        
    }
}
