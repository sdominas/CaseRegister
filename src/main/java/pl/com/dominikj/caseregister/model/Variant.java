package pl.com.dominikj.caseregister.model;
// Generated 2018-02-25 15:14:27 by Hibernate Tools 4.3.1

/**
 *
 * @author dominik.jedrzejowski
 */
public class Variant  implements java.io.Serializable {


     private long id;
     private String name;
     private Device deviceId;

    public Variant() {
    }

	
    public Variant(long id) {
        this.id = id;
    }
    public Variant(long id, String name, Device deviceId) {
       this.id = id;
       this.name = name;
       this.deviceId = deviceId;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Device getDeviceId() {
        return this.deviceId;
    }
    
    public void setDeviceId(Device deviceId) {
        this.deviceId = deviceId;
    }




}


