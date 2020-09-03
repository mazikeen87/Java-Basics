import java.util.*;

class space_sep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        System.out.println("Enter no.s");
        String s=sc.nextLine();
        String[] strarr=s.split("\\s+");

        int[] intarr=new int[strarr.length];
        for (int i = 0; i < strarr.length; i++) {
            String nubstr=strarr[i];
            intarr[i]=Integer.parseInt(nubstr);
            System.out.println(intarr[i]);
        }
    }
}