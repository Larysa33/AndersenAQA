package school.lesson3;

public class Employee {
    public String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Введите значение больше 0");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введите значение больше 0");
        }
    }

    public Employee(String name, String position,
                    String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info (){
        System.out.println("Сотрудник:" + "ФИО= " + name +
                ", должность=" + position + ", email='" + email +
                ", телефон='" + phone + ", зарплата=" + salary +
                ", возраст=" + age);
    }

    /*@Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО='" + name + '\'' +
                ", должность='" + position + '\'' +
                ", email='" + email + '\'' +
                ", телефон='" + phone + '\'' +
                ", зарплата=" + salary +
                ", возраст=" + age +
                '}';
    }
     */
}

