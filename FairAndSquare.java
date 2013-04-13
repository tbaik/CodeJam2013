import java.util.Scanner;


public class FairAndSquare {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int T = sc.nextInt();
        	for(int i = 1; i <= T; i++)
        	{
        		int fs = 0;
        		long a = sc.nextLong();
        		long b = sc.nextLong();
        		while(a <= b)
        		{
        			if(isPalindrome(a) == true && isSquarePalindrome(a) == true)
        				fs++;
        			a++;
        		}
        		System.out.println("Case #" + i + ": " + fs);
        	}
		}
	}
	
	public static boolean isPalindrome(long num)
	{
		//System.out.println(num);
		String num2 = new StringBuilder(Long.toString(num)).reverse().toString();
		//System.out.println(num2);
		long num3 = Long.parseLong(num2);
		return num == num3;
	}
	
	public static boolean isSquarePalindrome(long num)
	{
		double temp = Math.sqrt((double)num);
		if(temp == Math.floor(temp) && isPalindrome((long)temp) == true)
			return true;
		else return false;
	}
}
