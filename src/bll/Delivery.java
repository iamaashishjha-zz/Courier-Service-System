
package bll;


public class Delivery {
    private String CID;
    private String CName;
    private String CAddr;
    private String CContact;
    private String Status;
    private String Feedback;
    private String ODate;
    private String DDate;
    private String Cost;
    private String DeliveredBy;

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCAddr() {
        return CAddr;
    }

    public void setCAddr(String CAddr) {
        this.CAddr = CAddr;
    }

    public String getCContact() {
        return CContact;
    }

    public void setCContact(String CContact) {
        this.CContact = CContact;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    public String getODate() {
        return ODate;
    }

    public void setODate(String ODate) {
        this.ODate = ODate;
    }

    public String getDDate() {
        return DDate;
    }

    public void setDDate(String DDate) {
        this.DDate = DDate;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    public String getDeliveredBy() {
        return DeliveredBy;
    }

    public void setDeliveredBy(String DeliveredBy) {
        this.DeliveredBy = DeliveredBy;
    }
}
