/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

public class Accountant extends BusinessEmployee {
    private TechicalLead TeemSupported;
    public Accountant(String name) {
        super(name);
    }

    public TechicalLead getTeemSupported() {
        return TeemSupported;
    }


    public void supportTeam(TechicalLead teemSupported) {
        this.TeemSupported = teemSupported;
        double bb = this.getBonusBadget();
        for (int i = 0; i < teemSupported.getTimList().size(); i++) {
            bb += teemSupported.getTimList().get(i).getBaseSalary();
        }
        this.setBonusBadget(bb*1.1);
    }

    public boolean approveBonus(double bonus) {
    if (this.TeemSupported == null)  return false;
        return (this.getBonusBadget() > bonus);
    }
    public String employeeStatus() {
        return super.getId() + " " + super.getName() + " with a budget of "
                + this.getBonusBadget()+"is supporting "+ TeemSupported.getName();
    }

}
