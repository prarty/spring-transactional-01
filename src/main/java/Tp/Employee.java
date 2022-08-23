package Tp;


public class Employee {
    // Member variables of the class.
    private int id;
    private String name;
    private String designation;
    private String company;
    private int age;
    private String gender;
    private double salary;


    public Employee(int id, String name, String designation, String company, int age, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.company = company;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(final String designation) {
        this.designation = designation;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(final String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", company='" + company + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
