/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee implements Manager {
    private ArrayList<Accountant> timList = new ArrayList<Accountant>();
    private int headCount;

    public BusinessLead(String name) {
        super(name);
        super.setBaseSalary(getMinBaseSalary() * 2);
        this.headCount = 10;
    }

    @Override
    public boolean hasHeadCount() {
        if (timList == null) {
            return false;
        } else {
            return (headCount > timList.size());
        }
    }

    @Override
    public String getTimStatus() {
        String s = this.employeeStatus();
        if (timList.size() == 0l) {
            s = s + " and no direct reports yet ";
        } else {
            s = s + " and is managing: \n";


            for (int i = 0; i < timList.size(); i++) {
                s = s + timList.get(i).employeeStatus() + "\n";
            }
        }
        return s;
    }

    public boolean addReport(Accountant e,TechicalLead t) {
        if (hasHeadCount()) {
            if (!timList.contains(e)) {
                timList.add(e);
                setBonusBadget(getBonusBadget() + e.getBaseSalary() * 1.1);
                e.setMenager(this);
                e.supportTeam(t);
                t.setBusinessLead(this);
            }
            return true;
        } else return false;
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (getBonusBadget() > bonus) {
            setBonusBadget(getBonusBadget() - bonus);
            return true;
        } else {
            return false;
        }
    }

    public boolean approveBonus(Employee e, double bonus) {
        boolean b = false;
        if (timList != null) {
            for (int i = 0; i < timList.size(); i++) {
                if (timList.get(i).getTeemSupported().getTimList().contains(e)) {
                    b = timList.get(i).approveBonus(bonus);
                    break;
                }
            }
        }
        return b;
    }
}
