/*
Creating by Zelma Milev
*/
package bnpGr1Dev277m3;

public class SoftwareEngeneer extends TechicalEmploee {
    private boolean codeAccess;
//    private boolean codePrivileges;
    public SoftwareEngeneer(String name) {
        super(name);
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;
    }

    public int getSuccessfulCheckIns() {
        return super.getCheckIns();
    }

    public boolean checkInCode () {
        if(((TechicalLead) (this.getManager())!=null)&&
                ((TechicalLead) (this.getManager())).approveCheckIn(this))
        {
             setCheckIns(getCheckIns()+1);
        } else {
            setCodeAccess(false);
        }
        return this.codeAccess;
    }

}
