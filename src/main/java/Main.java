import java.util.Scanner;
import models.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coordination coordination  = new Coordination();
        System.out.print("Add a coordination office: ");
        String coordEngineering = scanner.nextLine();
        coordination.setName(coordEngineering);

        System.out.println("SELECT A FACULTY");
        System.out.print("1. UAM College");
        System.out.println("2. Faculty of Medical Sciences");
        System.out.println("3. Faculty of Economical and Administrative Sciences");
        System.out.println("4. Faculty of Legal Sciences, Humanities and International Relations: ");
        System.out.println("5. Faculty of Odontology");
        System.out.println("6. Faculty of Engineering and Architecture");
        System.out.print("7. Faculty of Marketing, Design and Communication Sciences\n");
        System.out.print(" ---> "); int option = scanner.nextInt();

        switch (option) {
            case 1:

        }
    }
}
