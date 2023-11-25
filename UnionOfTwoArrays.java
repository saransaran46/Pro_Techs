import java.util.*;
public class UnionOfTwoArrays
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int a[]=new int[m];
        int n=sc.nextInt();
        int b[]=new int[n];
        int c[]=new int[m+n];
        System.out.println("a array:");
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("b array:");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("Third array");
        int pos=0;
        for(int i:a)
        {
            c[pos]=i;
            pos++;
        }
        for(int i:b)
        {
            c[pos]=i;
            pos++;
        }
         for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println("");
        System.out.println("output");
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    c[j]=0;
                }
            }
            if(c[i]>0)
            System.out.print(c[i]+" ");
        }
}
}