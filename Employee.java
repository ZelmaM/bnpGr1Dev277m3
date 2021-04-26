/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {
    private static int uId;
    private static ArrayList<Employee> emplArrList = new ArrayList<Employee>();
    private String name;
    private double baseSalary;
    private int iD;
    private Employee menager;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        emplArrList.add(uId,this);
        uId++;
        this.iD = uId;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static int getuId () {
        return uId;
    }

    public static ArrayList<Employee> getEmplArrList() {
        return emplArrList;
    }

    public int getId () {
        return iD;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public boolean equals0(Object o) {

        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.getBaseSalary(), getBaseSalary()) != 0) return false;
        return getName() != null ? getName().equals(employee.getName()) : employee.getName() == null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return iD == employee.iD;
    }


    @Override
    public String toString() {
        String s = "";
        if (getManager() != null) {
//        s=s+"\n Manager-"+getManager().toString();
        s=s+"\n Manager-"+getManager().toString();
        }
        return "Employee  # " + iD + " {" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                '}' + s;
    }

    public String employeeStatus() {
        return "Status Employee";
    }
    public Employee getManager () {
        return menager;
    }

    public void setMenager(Employee menager) {
        this.menager = menager;
    }
}
