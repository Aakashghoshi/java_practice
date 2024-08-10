package java8.stream;

import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : " + department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
    }

    public static List<Employee> getEmpList() {
        List<Employee> listofEmp = new ArrayList<>();
        listofEmp.add(new Employee(1, "sanjay", 30, "male", "IT", 2015, 29000));
        listofEmp.add(new Employee(1, "abhisek", 38, "male", "CSE", 2016, 19000));
        listofEmp.add(new Employee(1, "ayush", 35, "male", "ME", 2016, 22000));
        listofEmp.add(new Employee(1, "ankush", 29, "male", "CIVIL", 2017, 28000));
        listofEmp.add(new Employee(1, "ayushi", 24, "female", "CSE", 2018, 40000));
        listofEmp.add(new Employee(1, "sandhya", 22, "female", "auto", 2012, 50000));
        return listofEmp;
    }
}