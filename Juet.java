
import java.util.Scanner;

public class Juet {
    private String name;
    private int age;

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Juet user = new Juet();
        user.setName();
        user.setAge();
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }
}
