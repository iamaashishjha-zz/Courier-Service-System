
package bll;


public class Feedback {
    private String CID;
    private String CName;
    private String FCategory;
    private String Feedback;
    private String Improvement;

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

    public String getFCategory() {
        return FCategory;
    }

    public void setFCategory(String FCategory) {
        this.FCategory = FCategory;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    public String getImprovement() {
        return Improvement;
    }

    public void setImprovement(String Improvement) {
        this.Improvement = Improvement;
    }
}
