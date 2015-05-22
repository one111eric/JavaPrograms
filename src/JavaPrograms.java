import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class JavaPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] a={1,2,3,2,1};
           System.out.println("middle index is "+findindex(a));
           System.out.println(reversestring("noob"));
	}
	public static int findindex(int[] input)
	{
		int index=0;
		int sum=0;
		for(int x:input)
		{
			sum+=x;
		}
		
		for(int i=0;i<input.length;i++)
		{
			if(firstsum(input,i)==(sum-input[i+1])/2)
			{
				index=i+1;
				break;
			}
			
		}
		return index;
		
	}
	public static int firstsum(int[] input,int index)
	{
		int sum=0;
		for(int i=0;i<=index;i++)
		{
			sum+=input[i];
		}
		return sum;
	}
	public static String reversestring(String x)
	{
		String reverse="";
		if(x.length()==1)
		{
			
		return x;
		}
		else {
			reverse=reverse+x.charAt(x.length()-1)+reversestring(x.substring(0,x.length()-1));
			
			return reverse;
		}
		
	}
	

}
