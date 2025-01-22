package beans.model;


public class Suburb {
    private int suburbId;
    private String suburbName;
    private int zipCode;

    // EMPTY CTOR FOR JAVABEAN
    public Suburb() { }

    // ALL ARGS CTOR
    public Suburb(int suburbId, String suburbName, int zipCode) {
        this.suburbId = suburbId;
        this.suburbName = suburbName;
        this.zipCode = zipCode;
    }

    public int getSuburbId() {
        return suburbId;
    }

    public void setSuburbId(int suburbId) {
        this.suburbId = suburbId;
    }

    public String getSuburbName() {
        return suburbName;
    }

    public void setSuburbName(String suburbName) {
        this.suburbName = suburbName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
