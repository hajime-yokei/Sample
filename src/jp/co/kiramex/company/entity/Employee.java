package jp.co.kiramex.company.entity;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String divisionName;
    private int vitality;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String divisionName, int vitality) {
        System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void introduce() {
        vitality = vitality -10;
        System.out.println("私の名前は" + employeeName + "です");
        System.out.println("所属部署は" + divisionName + "です");
    }

    public void greeting() {
        vitality = vitality - 10;
        System.out.println("おはようございます");
    }

    public void greeting(String divisionName) {
        vitality = vitality - 10;
        System.out.println(divisionName + "の皆さん、おはようございます");
    }

    public void showVitality() {
        vitality = vitality -10;
        System.out.println("残り体力は" + vitality);
    }

}

