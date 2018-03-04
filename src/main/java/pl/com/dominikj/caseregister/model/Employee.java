/*
 * // Generated 2018-02-25 15:14:27 by Hibernate Tools 4.3.1
 */

package pl.com.dominikj.caseregister.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private Integer id;
    
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
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", email=" + email + '}';
    }
    
    
    
}
