/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author GRACE
 */
@Entity
public class Student extends Person{
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="Registration",joinColumns = {@JoinColumn(name = "StudID")},inverseJoinColumns = @JoinColumn(name = "CourseID"))
    private List<Course> RegCourses= new ArrayList<>();
    @ManyToOne
    private Departments Department;

    public List<Course> getRegCourses() {
        return RegCourses;
    }

    public void setRegCourses(List<Course> RegCourses) {
        this.RegCourses = RegCourses;
    }

    public Departments getDepartment() {
        return Department;
    }

    public void setDepartment(Departments Department) {
        this.Department = Department;
    }
    
    public void addCourse(Course c){
    this.RegCourses.add(c);
    }

   
    
    
    
    
    
    
}
