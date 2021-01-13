import java.util.Scanner;

public class Enter{

    public String name (Scanner scan) {
        String name = scan.nextLine();
        if (name.length() > 10)
            System.out.println("Короче 10 символов");

        return name;

    }
    public int moveWhere (Scanner scan) {
        int i = scan.nextInt();
        if (i >= 1 && i <= 4)
            return i;
        System.out.println("Вы ввели что-то не то...");
        return 0;
    }
}
