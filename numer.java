import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numer {
	public static void main(String[] args) throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String str=br.readLine();
		 char c[]=str.toCharArray();
		 String a=br.readLine();
		 char aa[]=a.toCharArray();
		 char r[]=new char[str.length()];
		 for(int i=0;i<c.length-1;i++)
		 {
			 for(int j=0;j<=aa.length-1;j++)
			 {
				if(c[i]==aa[j])
				{
					r[j]=(char) (r[j]+c[j]);
					j++;
					i++;
				}
			 }
		 }
		 System.out.println(r);	 	 
	}
}
