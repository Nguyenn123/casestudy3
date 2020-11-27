public class Person {
    private String name;
    private String gender;
    private String address;
    private String birthDay;
    private String email;

    public Person(String name, String gender, String address, String birthDay, String email) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthDay = birthDay;
        this.email = email;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", email='" + email + '\'';
    }
}
