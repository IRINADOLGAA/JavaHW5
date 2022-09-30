package Lesson5.HomeWork5;

public class Person {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Person(String _name, String _post, String _email, String _phoneNumber, int _salary, int _age) {
        this.name = _name;
        this.post = _post;
        this.email = _email;
        this.phoneNumber = _phoneNumber;
        this.salary = _salary;
        this.age = _age;
    }

    public void info(){
        System.out.println("name: " + getName() + ";\n" + "post: " + getPost() + ";\n" + "email: " + getEmail() + ";\n"
          + "phoneNumber: " + getPhoneNumber() + ";\n" + "salary: " + getSalary() + ";\n" + "age: " + getAge() + ";\n");

    }

    public String getName() {
        return name;
    }
    public String getPost() {
        return post;
    }
    public String getEmail() {
        return email;
    }
    public String  getPhoneNumber() {
        return phoneNumber;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }


}
