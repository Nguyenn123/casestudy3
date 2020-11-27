import java.io.Serializable;

public class Thongtindanhba extends Person implements Serializable {
    private String phoneNumber;
    private String group;

    public Thongtindanhba(String name, String gender, String address, String birthDay, String email, String phoneNumber, String group) {
        super(name, gender, address, birthDay, email);
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public Thongtindanhba() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Thongtindanhba{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", group='" + group + '\'' +
                super.toString()+
                '}';
    }
}
