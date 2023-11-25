import java.util.*;
public class LinearSearch
{
        public static int Search(int s,int arr[],int n)
	{
		for(int i=0;i<s;i++)
		{
		    if(n==arr[i])
		    {
		        return i;
		    }
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int arr[]=new int[s];
		int n=sc.nextInt();
		for(int i=0;i<s;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int index=Search(s,arr,n);
		if(index==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element founded---"+index);
		}
	}
}
