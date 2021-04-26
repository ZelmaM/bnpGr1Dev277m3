package bnpGr1Dev277m3;

import java.util.ArrayList;

public interface Manager {
    int headCount = 0;
    ArrayList<Employee> timList = new ArrayList<Employee>();

    public boolean hasHeadCount();

    public String getTimStatus();

//    public boolean addReport(Employee em);
}
