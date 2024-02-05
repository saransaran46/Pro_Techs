import java.util.Scanner;
class Pyramid
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int  totalseries = 0;
		for(int i=1;i<=size;i++)
		{
		    totalseries += i; 
		}
		
		int res[] = new int[totalseries];
		res[0] = 1;
		res[1] = 1;
		
		for(int i=2;i<= totalseries-1;i++)
		    res[i] = res[i-1]+res[i-2]; 
		
	    
	    int fibpy =0;
	    for(int i=1;i<=size;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(res[fibpy]+" ");
	            ++fibpy;
	        }
	        System.out.println("");
	    }
	}
}
