import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2 : ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a :");
        double a = sc.nextDouble(); //xét giá trị của a
        if (a == 0) {
            System.out.println("Không thể giải phương trình nếu a=0");
            return;
        }
        System.out.println("Nhập giá trị b :");
        double b = sc.nextDouble();
        System.out.println("nhập giá trị c :");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("discriminant =" + quadraticEquation.getDiscriminant());
    }
}