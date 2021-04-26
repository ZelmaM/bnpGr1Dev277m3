package bnpGr1Dev277m3;/*
Creating by Zelma Milev
*/

import bnpGr1Dev277m3.*;

public class companyTest1 {
    public static void main(String[] args) {
        TechicalLead Cto = new TechicalLead("Michely Milev");
        SoftwareEngeneer se1 = new SoftwareEngeneer("Uval");
        SoftwareEngeneer se2 = new SoftwareEngeneer("Ela");
        SoftwareEngeneer se3 = new SoftwareEngeneer("Doron");
        SoftwareEngeneer se4 = new SoftwareEngeneer("Lena");
        SoftwareEngeneer se5 = new SoftwareEngeneer("Mois");
        System.out.println(Cto.getTimStatus());
        Cto.addReport(se1);
        Cto.addReport(se2);
        Cto.addReport(se3);
        Cto.addReport(se4);
        Cto.addReport(se5);
        Cto.getTimStatus();
        System.out.println(Cto.getTimStatus());
        System.out.println("---- tipul be se1----- " +
                " code access " + se1.getCodeAccess());
        se1.setCodeAccess(true);
        System.out.println(se1.employeeStatus()+
                " code access " + se1.getCodeAccess());

        System.out.println("Approve check in ==> "+Cto.approveCheckIn(se1)+
                " Check in ==>  " +se1.checkInCode() +
                " Get checkins ==> "+se1.getSuccessfulCheckIns());
        System.out.println(se1.employeeStatus()+
                " code access " + se1.getCodeAccess());
        System.out.println( se1.getName()+ "Requested  100$ bonus from "+
                 se1.getManager().getName()   +" ==>"
                +((TechicalLead)(se1.getManager())).requestBonus(se1,100));
        System.out.println("---- tipul be se5----- " +
                " code access " + se5.getCodeAccess());
        se5.setCodeAccess(true);
        System.out.println(se5.employeeStatus()+
                " code access " + se5.getCodeAccess());

        System.out.println("Approve check in ==> "+Cto.approveCheckIn(se5)+
                " Check in ==>  " +se5.checkInCode() +
                " Get checkins ==> "+se5.getSuccessfulCheckIns());
        System.out.println(se5.employeeStatus()+
        " code access " + se5.getCodeAccess());

        TechicalLead Vip = new TechicalLead("Emili Milev");
        SoftwareEngeneer ve1 = new SoftwareEngeneer("Maria");
        SoftwareEngeneer ve2 = new SoftwareEngeneer("Ema");
        SoftwareEngeneer ve3 = new SoftwareEngeneer("Ira");
        SoftwareEngeneer ve4 = new SoftwareEngeneer("Lubomir");
        System.out.println(Vip.getTimStatus());
        Vip.addReport(ve1);
        Vip.addReport(ve2);
        Vip.addReport(ve3);
        Vip.addReport(ve4);
        System.out.println(Vip.getTimStatus());

        BusinessLead BL = new BusinessLead("Yulia Milev");
        Accountant ac1 = new Accountant("Ani");
        Accountant ac2 = new Accountant("Asi");
        System.out.println(BL.getTimStatus());
        BL.addReport(ac1,Cto);
        BL.addReport(ac2,Vip);System.out.println(BL.getTimStatus());
        System.out.println("----------------se1-bonus-----------");
        System.out.println( se1.getName()+ "Requested  100$ bonus from "+
                se1.getManager().getName()   +" ==>"
                +((TechicalLead)(se1.getManager())).requestBonus(se1,100));
        System.out.println("\n Our company have "+Employee.getuId()+" employees \n--------list of them---");
        for (Employee e : Employee.getEmplArrList()) {
            System.out.println(e.toString()+"\n Status "+ e.employeeStatus()+"\n");
        }

    }
}
