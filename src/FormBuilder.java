public class FormBuilder {
    private String fullName;
    private String age;
    private String workExp;
    private String telphone;
    private String email;
    private String address;

    public FormBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public FormBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public FormBuilder setWorkExp(String workExp) {
        this.workExp = workExp;
        return this;
    }

    public FormBuilder setTelphone(String telphone) {
        this.telphone = telphone;
        return this;
    }

    public FormBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public FormBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Form createForm() {
        return new Form(fullName, age, workExp, telphone, email, address);
    }
}