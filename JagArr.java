import java.util.Scanner;
class JagArr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the row size:");
int m=sc.nextInt();
int arr[][]=new int[m][];

System.out.println("enter the column size:");
for(int i=0;i<m;i++)
{
int n=sc.nextInt();
arr[i]=new int[n];
System.out.println();
}

System.out.println("array input:");
for(int i=0;i<m;i++)
{
for(int j=0;j<arr[i].length;j++)
{
arr[i][j]=sc.nextInt();
}
System.out.println();
}

System.out.println("JaggedArray:");
for(int i=0;i<m;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();

}

}
}