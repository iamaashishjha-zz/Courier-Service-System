
package bll;


public class Order {
    private String OID;
    private String CName;
    private String CContact;
    private String CAddr;
    private String Weight;
    private String Cost;

    public String getOID() {
        return OID;
    }

    public void setOID(String OID) {
        this.OID = OID;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCContact() {
        return CContact;
    }

    public void setCContact(String CContact) {
        this.CContact = CContact;
    }

    public String getCAddr() {
        return CAddr;
    }

    public void setCAddr(String CAddr) {
        this.CAddr = CAddr;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }
}
