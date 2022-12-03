package Assigment3;

abstract class Participant {
    String firstName;
    String lastName;
    String tumID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTumID() {
        return tumID;
    }

    public void setTumID(String tumID) {
        this.tumID = tumID;
    }
}
