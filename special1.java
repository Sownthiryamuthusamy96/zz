import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class special1 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		String ss="~!@#$%^&*()";
		char a[]=ss.toCharArray();
		String str=br.readLine();
		char as[]=str.toCharArray();
		for(int i=0;i<as.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
		    if(as[i]==a[j])
		    {
			  count++;
		    }
			}
		}
		System.out.println(count);
		
	}

}
