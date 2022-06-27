/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author GRACE
 */
@Entity
public class Faculty {
    @Id
    private String id;
    private String name;
    // mapping faculty to Dean
    @OneToOne(mappedBy="faculty")
    private Dean dean;
    
    
    // Mapping to Department
    @OneToMany(mappedBy = "faculty",fetch = FetchType.EAGER)
//    private Departments department;
    private List<Departments> departments=new ArrayList<>();
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    

}
