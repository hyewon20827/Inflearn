import java.util.Scanner;

public class SearchChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        String input1_toUppercase = input1.toUpperCase();
        String input2_toUppercase = input2.toUpperCase();
        int count = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1_toUppercase.charAt(i) == input2_toUppercase.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
        return;
    }
}