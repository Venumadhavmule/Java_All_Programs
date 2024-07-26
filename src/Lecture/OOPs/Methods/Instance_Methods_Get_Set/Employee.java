package Lecture.OOPs.Methods.Instance_Methods_Get_Set;

public class Employee {
    String empName;
    int empId;
    double salary;
    void setEmpName(String empName){
        this.empName = empName;
    }
    void setEmpId(int empId){
        this.empId = empId;
    }
    void setSalary(double salary){
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }


    int getEmpId() {
        return empId;
    }

    double getSalary() {
        return salary;
    }

}
class Employee1{
    public static void main(String[] args) {
        Employee e1= new Employee();
       // Employee e2= e1.clone();
        e1.setEmpName("Brahmi");
        e1.setEmpId(01);
        e1.setSalary(12_00_000);
        String e1nawe=e1.empName;
        int e1Id=e1.empId;
        Double e1Salary=e1.salary;
        System.out.println("Employee1 name: "+e1nawe);
        System.out.println("Emp1 Id: "+e1Id);
        System.out.println("Emp1 Salary: "+e1Salary);
    }
}
