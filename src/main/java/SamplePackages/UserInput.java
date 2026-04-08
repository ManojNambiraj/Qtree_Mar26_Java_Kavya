package SamplePackages;
import java.util.*;


public class UserInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            String input = sc.nextLine();
            list.add(input);
        }

        System.out.println("Stored elements: ");
        System.out.println(list);

    }
}
