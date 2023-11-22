import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Count_Odd_and_evenNo {
	public static void main(String[] args) {
		StringTokenizer string=new StringTokenizer("1 2 6 8 9 3");
		int num,odd=0,even=0;
		while(string.hasMoreTokens()) {
			num=Integer.parseInt(string.nextToken());
			if(num%2==0) {
				odd++;
			}
			else {
				even++;
			}
		}
		System.out.println("odd numbers: "+odd+" and Even numbers:"+even);
	}

}
