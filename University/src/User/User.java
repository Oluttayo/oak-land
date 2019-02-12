package User;

public class User {

    private String fullName;
    private String email;
    private String mobileNumber;
    private UserType userType;
    private UserStatus userStatus;
    private UserGender userGender;
    private String dateOfBirth;
    private int age;
    private String nextOfKin;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", userType=" + userType +
                ", userStatus=" + userStatus +
                ", userGender=" + userGender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }
}


