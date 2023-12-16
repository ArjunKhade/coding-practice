import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
        Map<String,Integer> contacts = new HashMap<>();
         int n = 2;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name,Number:");
            String name = sc.nextLine();
            int phone = sc.nextInt();
            sc.nextLine();
            contacts.put(name, phone);
        }

        while(sc.hasNext()){
            System.out.println("Enter name To Search In PhoneBook :");
             String s = sc.nextLine();
             if(contacts.containsKey(s)){
                System.out.println(s+" "+contacts.get(s));
             }else{
                System.out.println("Not found!!");
             }
        }

        sc.close();
    }
}
