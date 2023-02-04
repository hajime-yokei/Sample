
public class Triangle {

    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("正三角形");
        } else if (a == b ||  b == c || a == c) {
            System.out.println("二等辺三角形");
        } else {
            System.out.println("不等辺三角形");
        }

    }

}
