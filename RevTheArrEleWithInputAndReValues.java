import java.util.Scanner;
public class RevTheArrEleWithInputAndReValues
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,4,5,6,7,8};
		int k =sc.nextInt();


		for(int i=arr.length-1;i>=arr.length-k;i--)
		{
		    System.out.print(arr[i]);
		    
		}
		for(int i=0;i<arr.length-k;i++)
		{
		    System.out.print(arr[i]);
		    
		}
	}
}
