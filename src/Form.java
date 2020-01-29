public class Form {
    private String fullName;
    private String age;
    private String workExp;
    private String telphone;
    private String email;
    private String address;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWorkExp() {
        return workExp;
    }

    public void setWorkExp(String workExp) {
        this.workExp = workExp;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Form(String fullName, String age, String workExp, String telphone, String email, String address) {
        this.fullName = fullName;
        this.age = age;
        this.workExp = workExp;
        this.telphone = telphone;
        this.email = email;
        this.address = address;
    }
}
