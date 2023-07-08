package Student;

public class Student {
    private String name = "Jonh";
    private String clas = "C02";
    public Student() {
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public void setClas(String clas) {
        this.clas = clas;
        System.out.println(this.clas);
    }
}
