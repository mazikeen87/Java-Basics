import java.util.*;
import java.io.*;
class space_sep_strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strarr=s.split("\\s+");
        System.out.println(Arrays.toString(strarr));
    }
}