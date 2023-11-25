import java.util.*;
public class MissingNoInASequence
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array sizeee--:");
int s=sc.nextInt();
int arr[] = new int[s];
System.out.println("Enter the array elemets--:");
for(int i=0;i<s;i++)
{
   arr[i]=sc.nextInt();
}
for(int i=0;i<s;i++)
{
   for(int j=i+1;j<s;j++)
   {
       if(arr[j]!=(arr[i]+1))
       {
           System.out.print("result in :"+(arr[i]+1));
       }
       i++;
   }
}
}
}