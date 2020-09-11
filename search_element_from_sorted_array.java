import java.util.*;
class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split("\\s+");
        int a[]=new int[s.length];
        for (int i = 0; i < s.length; i++) {
            a[i]=Integer.parseInt(s[i]);
        }
        int l=s.length;
        System.out.println();
        for(int k=0;k<l;k++) {
            for(int f=0;f<l-k-1;f++) {
                if(a[f]>a[f+1]) {
                    int temp=a[f];
                    a[f]=a[f+1];
                    a[f+1]=temp;
                }
            }
        }
        for(int h=0;h<l;h++) {
            System.out.print(a[h]+" ");
        }
        System.out.println();
        System.out.println("Enter the no. to be searched:");
        int key=sc.nextInt();
        for(int i=0;i<s.length;i++) {
            if(key==a[i]) {
                System.out.println("element found at index "+(i+1));
            } else {
                continue;
            }
        }
        
        sc.close();

    }
}
