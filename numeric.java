import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numeric {
	public static void main(String[] args) throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str=br.readLine();
		 char c[]=str.toCharArray();
		 String a="0123456789";
		 char aa[]=a.toCharArray();
		 int count=0;
		 for(int i=0;i<c.length;i++)
		 {
			 for(int j=0;j<=c.length;j++)
			 {
				if(c[i]==aa[j])
				{
					count++;
				}
			 }
		 }
		 System.out.println(count);	 	 
	}
}
