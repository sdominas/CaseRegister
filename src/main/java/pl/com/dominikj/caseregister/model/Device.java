package pl.com.dominikj.caseregister.model;
// Generated 2018-02-25 15:14:27 by Hibernate Tools 4.3.1



/**
 *
 * @author dominik.jedrzejowski
 */
public class Device  implements java.io.Serializable {


     private long id;
     private String type;

    public Device() {
    }

	
    public Device(long id) {
        this.id = id;
    }
    public Device(long id, String type) {
       this.id = id;
       this.type = type;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }




}


