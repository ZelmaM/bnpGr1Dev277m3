/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

public class CompanyStructure {
    public static void main(String[] args) {
        Employee emp1;
        emp1 = new Employee("ZZZ", 1.2);
        System.out.println(emp1);
        Employee emp2 = new Employee("ggg",4.5);
        System.out.println(emp2);
        Employee emp3 = new Employee("rrr",2.3);
        System.out.println(emp3);
        Employee em4 = new Employee("hhh",6.23);
        System.out.println(em4);
        if (em4.equals0(emp3)) {
            System.out.println(em4 + " is equal by name and salary  to " + emp3);
        }
        if (em4.equals(emp3)) {
            System.out.println(em4 + " is equal to " + emp3);
        } else {
            System.out.println(em4 + " is not equal to " + emp3);

        }

        System.out.println("number of company's works is " + Employee.getuId() + " IN " + em4.employeeStatus());
        System.out.println(emp1.getId() + " ==>" + emp1.getName() +
                " " + emp2.getId() + " ==>" + emp2.getName() +
                " " + emp3.getId() + " ==>" + emp3.getName() +
                " " + em4.getId() + " ==>" + em4.getName());

        System.out.println(em4 + "my manager is" + em4.getManager());
//        TechicalEmploee te1 = new TechicalEmploee();
        System.out.println("-------------------technicalEmpliee---------");
        TechicalEmploee te2 = new TechicalEmploee("ttteee");
        TechicalEmploee te3 = new TechicalEmploee("te3");
//        te2.setCheckIns(20);
//        te3.setCheckIns(30);
        System.out.println(te2 + "  " + te2.employeeStatus());
        System.out.println(te3 + "  " + te3.employeeStatus());
        System.out.println("-----------------businessEmploee-------------");
        BusinessEmployee be1 = new BusinessEmployee("be");
        System.out.println(be1 + " "+ be1.employeeStatus());
        System.out.println("-----------------Emploees-------------");

        for (Employee e : Employee.getEmplArrList()) {
            System.out.println(e.toString());
        }


    }
}
