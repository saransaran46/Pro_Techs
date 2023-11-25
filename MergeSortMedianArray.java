import java.util.*;
class MergeSortMedianArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of a");
        int m=sc.nextInt();
        int a[]=new int[m];
        System.out.println("size of b");
        int n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int a1=a.length;
        int b1=b.length;
        int c1=a1+b1;
        int c[]=new int[c1];
        for(int i=0;i<a1;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b1;i++)
        {
            c[a1+i]=b[i];
        }
        for(int i=0;i<c1;i++)
        {
            System.out.print(c[i]);
        }
         System.out.println("");
         for(int i=0;i<c1;i++)
         {
             for(int j=i+1;j<c1;j++)
             {
                 int temp=0;
                 if(c[i]>c[j])
                 {
                     temp=c[i];
                     c[i]=c[j];
                     c[j]=temp;
                 }
             }
             System.out.print(c[i]);
         }
         System.out.println("");
        int sum=0;
        for(int i=0;i<c1;i++)
        {
            sum+=c[i];
        }
         System.out.print(sum/c1);
    }
}