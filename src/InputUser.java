import java.util.Scanner;

public class InputUser {
    private Scanner scanner = new Scanner(System.in);
    public String inputUser(String info){
        System.out.print(info + " : ");
        String inputValue = scanner.nextLine();
        return inputValue;
    }
}
