import java.util.*;
public class IntersectionOfTwoArrays
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int a[]=new int[m];
int n=sc.nextInt();
int b[]=new int[n];
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
        System.out.println("result");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i] == b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
}
}