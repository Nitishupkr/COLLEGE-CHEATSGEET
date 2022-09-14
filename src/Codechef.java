
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
				int test =in.nextInt();
				for(int i=0;i<test;i++){
					int bal =in.nextInt();
					int dept =in.nextInt();
					int ded =in.nextInt();
					int months=in.nextInt();
					dept=dept*months;
					ded=ded*months;
					System.out.println(bal+dept-ded);

				}

	}
}