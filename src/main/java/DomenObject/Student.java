package DomenObject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Student {
    private String name;
    private String sername;
    private String sex;
    private String phone;

    public Student(String name, String sername, String sex, String phone) {
        this.name = name;
        this.sername = sername;
        this.sex = sex;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
