import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);

        sc.close();
    }
}
