package yan.ibbie.pojo;

public class MyUser {
    private String myId;
    private String myName;
    private String myAge;
    private String myEmail;

    public MyUser() {
    }

    public MyUser(String myId, String myName, String myAge, String myEmail) {
        this.myId = myId;
        this.myName = myName;
        this.myAge = myAge;
        this.myEmail = myEmail;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }

    public String getMyEmail() {
        return myEmail;
    }

    public void setMyEmail(String myEmail) {
        this.myEmail = myEmail;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "myId='" + myId + '\'' +
                ", myName='" + myName + '\'' +
                ", myAge='" + myAge + '\'' +
                ", myEmail='" + myEmail + '\'' +
                '}';
    }
}
