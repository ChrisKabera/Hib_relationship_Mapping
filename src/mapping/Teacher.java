/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author GRACE
 */
@Entity
public class Teacher extends Person{
    private String degree;
    private String Salary;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }
    
    
    
    
    
    
}
