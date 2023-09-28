import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        System.out.println("Please type your age");
        input = scanner.nextLine();
        int age = Integer.parseInt(input);
        System.out.println(age);
        System.out.println("You are able to retire in " + (67-age) + " years!");

    }
}
