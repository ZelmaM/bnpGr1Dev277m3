/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

public class TechicalEmploee extends Employee {
    private int checkIns;
    private static double minBaseSalary = 75_000.0;

    public TechicalEmploee(String name) {
        super(name, minBaseSalary);
    }

    public int getCheckIns() {
        return checkIns;
    }

    public static double getMinBaseSalary() {
        return minBaseSalary;
    }

    public void setCheckIns(int checkIns) {
        this.checkIns = checkIns;
    }

    public String employeeStatus() {
        return super.getId() + " " + super.getName() + " has " + this.checkIns +
                " successful check ins";
    }
    public String toString() {
        String s ;
        if (super.getManager() != null) {
            s="\n Have Manager-"+super.getManager().getName();
//            s="\n Have Manager-"+super.getManager().toString();
        } else {s = "\n Don't Have Manager ";}
        return "Technical Employee  # " + super.getId() + " {" +
                "name '" + super.getName() + '\'' +
                ", baseSalary " +super.getBaseSalary() +
                '}' + s;
    }
}
