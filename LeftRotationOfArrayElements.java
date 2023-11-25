import java.util.*;
public class LeftRotationOfArrayElements
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
System.out.println("no of left rotation");
int rot=sc.nextInt();
for(int i=0;i<rot;i++)
{
   int j;
       int fisele=arr[0];
   for(j=0;j<arr.length-1;j++)
   {
       arr[j]=arr[j+1];
   }
   arr[j]=fisele;
}
System.out.println("");
System.out.println("after the left rotation");
for(int i=0;i<arr.length;i++)
{
            System.out.print(arr[i]);
}
}
}
