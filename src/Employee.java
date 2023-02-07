
public class Employee {

    public String employeeName;
    public String divisionName;
    public int vitality;

    public Employee() {
        System.out.println("インスタンス化時にコンストラクタが呼ばれました");
        employeeName = "未設定";
        divisionName = "営業部";
        vitality = 0;
    }

    public Employee(String employeeName, String divisionName, int vitality) {
        System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }


    public void introduce() {
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }

    public void greeting() {
        vitality = vitality - 10;
        System.out.println("おはようございます");
    }

    public void report() {
        vitality = vitality - 10;
        System.out.println("今日は１０件アポイント取りました");
    }

    public void showVitality() {
        vitality = vitality - 30;
        System.out.println("残り体力は" + vitality);
    }

    public void goToWork() {

    }

    public void leaveWork() {

    }
}
