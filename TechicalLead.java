
/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class TechicalLead extends TechicalEmploee implements Manager {
    private int headCount;
    private ArrayList<SoftwareEngeneer> timList = new ArrayList<SoftwareEngeneer>();
    private BusinessLead businessLead;

    public TechicalLead(String name) {
        super(name);

        super.setBaseSalary(getMinBaseSalary() * 1.3);
        this.headCount = 4;
    }

    @Override
    public boolean hasHeadCount() {
        if (timList == null) return false;
        return (headCount > timList.size());
    }

    public ArrayList<SoftwareEngeneer> getTimList() {
        return timList;
    }

    public boolean addReport(SoftwareEngeneer sEn) {
        if (hasHeadCount()) {
            if (!timList.contains(sEn)) {
                timList.add(sEn);
                sEn.setMenager(this);
            }
            return true;
        } else return false;
    }

    public boolean approveCheckIn(SoftwareEngeneer sEn) {
        return timList.contains(sEn) && sEn.getCodeAccess();
    }

    public boolean requestBonus(Employee e, double bonus) {
        if (timList.contains(e)) {
            if (businessLead==null) return false;
            else if (!(businessLead.approveBonus(e, bonus))) {
                return false;
            } else {
                return businessLead.requestBonus(e, bonus);
            }
        } else return false;
    }

    public void setBusinessLead(BusinessLead businessLead) {
        this.businessLead = businessLead;
    }

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
}
