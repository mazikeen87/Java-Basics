//right rotation of the array

import java.util.*;
import java.io.*;
class array_rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split("\\s+");
        int a[]=new int[s.length];
        int l=s.length;
        System.out.println("enter the no. for right rotation:");
        int n=sc.nextInt();
        for(int i=0;i<l;i++) {
            a[i]=Integer.parseInt(s[i]);
        }
        System.out.println("Array after right rotation");
        for(int i=0;i<n;i++) {
            int j,last;
            last=a[l-1];
            for(j=l-1;j>0;j--) {
                a[j]=a[j-1];
            }
            a[0]=last;
        } 
        for(int i=0;i<l;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //left operation will performed on the updated aray
        System.out.println("Array after left rotation");
        for(int i=0;i<n;i++) {
            int k,first;
            first=a[0];
            for(int e=0;e<l-1;e++) {
                a[e]=a[e+1];
            }
            a[l-1]=first;
        }
        for(int m=0;m<l;m++) {
            System.out.print(a[m]+" ");
        }
        
    }
}