import java.util.*;
public class RightRotationOfArrayElements
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("size");
int m=sc.nextInt();
System.out.println("elements");
int arr[]=new int[m];
for(int i=0;i<m;i++)
{
   arr[i]=sc.nextInt();
}
System.out.println(arr.length);
System.out.println("no of right rotation");
int rot=sc.nextInt();
for(int i=0;i<rot;i++)
{
   int j;
       int lasele=arr[arr.length-1];
   for(j=arr.length-1;j>0;j--)
   {
       arr[j]=arr[j-1];
   }
   arr[0]=lasele;
}
System.out.println("");
System.out.println("after the right rotation");
for(int i=0;i<arr.length;i++)
{
            System.out.print(arr[i]);
}
}
}
