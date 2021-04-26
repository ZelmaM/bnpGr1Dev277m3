/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

public class BusinessEmployee extends Employee {
    private double bonusBadget;
    private static double minBaseSalary = 50_000.0;
    public BusinessEmployee(String name) {
        super(name,minBaseSalary);
    }

    public double getBonusBadget() {
        return bonusBadget;
    }

    public void setBonusBadget(double bonusBadget) {
        this.bonusBadget = Math.round(bonusBadget);
    }

    public static double getMinBaseSalary () {
        return minBaseSalary;
    }

    public String employeeStatus() {
        return super.getId() + " " + super.getName() + " with a budget of "
                + this.bonusBadget;
    }
    public String toString() {
        String s ;
        if (super.getManager() != null) {
            s="\n Have Manager-"+super.getManager().getName();
        } else s = "\n Don't Have Manager ";
        return "Business Employee  # " + super.getId() + " {" +
                "name '" + super.getName() + '\'' +
                ", baseSalary " +super.getBaseSalary() +
                '}' + s;
    }
}
