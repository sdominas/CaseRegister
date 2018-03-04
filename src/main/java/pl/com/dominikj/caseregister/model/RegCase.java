/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.dominikj.caseregister.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author dominik.jedrzejowski
 */
@Entity
public class RegCase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty
    private String name;
    private String position;
    private String variant;
    private Integer serial;
    private String order1;
    private String order2;
    private String info;
    
    @ManyToOne
    @JoinColumn(name = "whoregistered")
    private Employee whoregistered;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date registeredDate;
    
    private boolean isSolution;

    private Integer whosolved;

    private String solutionInfo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date solutionDate;
    
    private boolean isDocumentation;
    private String infoDocumentation;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date registeredDocumentationDate;

    private String foto1;
    private String foto2;
    private String foto3;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date modificationDate;
    private Variant variantdeviceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getWhoregistered() {
        return whoregistered;
    }

    public void setWhoregistered(Employee whoregistered) {
        this.whoregistered = whoregistered;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getOrder1() {
        return order1;
    }

    public void setOrder1(String order1) {
        this.order1 = order1;
    }

    public String getOrder2() {
        return order2;
    }

    public void setOrder2(String order2) {
        this.order2 = order2;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public boolean isIsSolution() {
        return isSolution;
    }

    public void setIsSolution(boolean isSolution) {
        this.isSolution = isSolution;
    }

    public Integer getWhosolved() {
        return whosolved;
    }

    public void setWhosolved(Integer whosolved) {
        this.whosolved = whosolved;
    }


    public String getSolutionInfo() {
        return solutionInfo;
    }

    public void setSolutionInfo(String solutionInfo) {
        this.solutionInfo = solutionInfo;
    }

    public Date getSolutionDate() {
        return solutionDate;
    }

    public void setSolutionDate(Date solutionDate) {
        this.solutionDate = solutionDate;
    }

    public boolean isIsDocumentation() {
        return isDocumentation;
    }

    public void setIsDocumentation(boolean isDocumentation) {
        this.isDocumentation = isDocumentation;
    }

    public String getInfoDocumentation() {
        return infoDocumentation;
    }

    public void setInfoDocumentation(String infoDocumentation) {
        this.infoDocumentation = infoDocumentation;
    }

    public Date getRegisteredDocumentationDate() {
        return registeredDocumentationDate;
    }

    public void setRegisteredDocumentationDate(Date registeredDocumentationDate) {
        this.registeredDocumentationDate = registeredDocumentationDate;
    }

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getFoto3() {
        return foto3;
    }

    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Variant getVariantdeviceId() {
        return variantdeviceId;
    }

    public void setVariantdeviceId(Variant variantdeviceId) {
        this.variantdeviceId = variantdeviceId;
    }

    @Override
    public String toString() {
        return "RegisteredCase{" + "id=" + id + ", name=" + name + ", position=" 
                + position + ", variant=" + variant + ", serial=" + serial 
                + ", order1=" + order1 + ", order2=" + order2 + ", info=" 
                + info + ", whoregistered=" + whoregistered + ", registeredDate=" 
                + registeredDate + ", isSolution=" + isSolution + ", whosolved=" 
                + whosolved + ", solutionInfo=" + solutionInfo + ", solutionDate=" 
                + solutionDate + ", isDocumentation=" + isDocumentation 
                + ", infoDocumentation=" + infoDocumentation 
                + ", registeredDocumentationDate=" + registeredDocumentationDate 
                + ", foto1=" + foto1 + ", foto2=" + foto2 + ", foto3=" + foto3 
                + ", modificationDate=" + modificationDate + ", variantdeviceId=" 
                + variantdeviceId + '}';
    }


}
