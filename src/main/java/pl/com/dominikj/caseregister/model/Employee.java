/*
 * // Generated 2018-02-25 15:14:27 by Hibernate Tools 4.3.1
 */

package pl.com.dominikj.caseregister.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author dominik.jedrzejowski
 */
@Entity
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotEmpty
    private String name;
    @NotEmpty
    private String lastName;
    @Email
    @NotEmpty
    private String email;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;
    
    @OneToMany(mappedBy = "whoregistered")
    private List<RegCase> regCases = new ArrayList<RegCase>(0);
    
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public List<RegCase> getRegCases() {
        return regCases;
    }

    public void setRegCases(List<RegCase> regCases) {
        this.regCases = regCases;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + '}';
    }
    
    
    
}
