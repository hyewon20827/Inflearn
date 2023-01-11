import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        char temp = 'a';
        for(int i = 0; i < input1.length(); i++){
            temp = input1.charAt(i);
            if(temp > 96 && temp < 123){
                temp = (char) (temp - 32);
                stringBuilder.append(temp);
            }else if(64 < temp && temp < 91){
                temp = (char) (temp + 32);
                stringBuilder.append(temp);
            }
        }
        System.out.println(stringBuilder.toString());
        return ;
    }
}