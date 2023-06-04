
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some stuff : ");
        String name = sc.nextLine();

        System.out.println("name is : " + name);

        sc.close();
    }
}
