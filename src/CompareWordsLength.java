import java.util.Scanner;

public class CompareWordsLength {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String[] str_arr = input1.split(" ");
        int temp_size = str_arr[0].length();
        String temp_str = str_arr[0];
        for (String arr : str_arr) {
            if(temp_size < arr.length()){
                temp_str = arr;
                temp_size = arr.length();
            }else if(temp_size == arr.length()){
                temp_str = temp_str;
                temp_size = temp_str.length();
            }
        }
        System.out.println(temp_str);
        return ;
    }
}