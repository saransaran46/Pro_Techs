import java.util.Scanner;
public class Special_Charcters_Reverse_Remain_The_Same
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[]= str.toCharArray();
		String spec = "";
		for(int i=0;i<str.length();i++)
		{
		    if((ch[i]>=65 && ch[i]<=90) || (ch[i]>=91 && ch[i]<=96) || (ch[i]>=123 && ch[i]<=126) || 
		    (ch[i]>=33 && ch[i]<=47) || (ch[i]>=58 && ch[i]<=64))
		    {
		        spec += ch[i];
		    }
		}
		System.out.println(spec);
		String specrev = "";
		for(int i=spec.length()-1;i>=0;i--)
		{
		    specrev += spec.charAt(i);
		}
		System.out.println(specrev);
		char c[] = specrev.toCharArray();
		int index=0;
		for(int i=0;i<str.length();i++)
		{
		    if((ch[i]>=65 && ch[i]<=90) || (ch[i]>=91 && ch[i]<=96) || (ch[i]>=123 && ch[i]<=126) || 
		    (ch[i]>=33 && ch[i]<=47) || (ch[i]>=58 && ch[i]<=64))
		    {
		         ch[i] =c[index] ;
		         index++;
		    }
		}
		System.out.print(ch);
	}
}
