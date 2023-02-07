package jp.co.kiramex.company.entity;

public abstract class Division {

    private String employeeName;


    public String getEmployeeName() {
        return employeeName;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public abstract void greeting();


}
