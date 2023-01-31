
public class Review01 {

    public static void main(String[] args) {
        int cost = 1500;
        int tax = tax(cost);
        int costs = cost + tax;
        System.out.println(cost + "円の商品の税込価格は" + costs + "円（消費税は" + tax + "円）です。");
    }

    public static int tax(int num1){
        double Taxcharge = num1 * 10 / 100;
        return (int) Taxcharge;
    }
}
