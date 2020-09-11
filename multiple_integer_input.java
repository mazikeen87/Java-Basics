import java.util.*;
class soltion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split("\\s+");
        int a[]=new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i]=Integer.parseInt(s[i]);
        }
        for(int k=0;k<s.length;k++) {
            System.out.println(a[k]);
        }
        sc.close();

    }
}
