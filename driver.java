package si_ci;
import si_ci.si;
import si_ci.ci;
import java.util.*;
public class driver {

		public static void main(String[] args) 
		{
			int c;
			System.out.println("Enter the method in which you want to calculate the interest:" + "1:Simple interest 2:Compound interest:   ");
                        
			Scanner s=new Scanner(System.in);
			c=s.nextInt();
			if(c==1) //to choose if we want si or ci
			{
				System.out.format("%s","Enter the principle amount,rate and time(in years) for which simple interest needs to be calculated");
				float principle=s.nextFloat();
				float rate=s.nextFloat();
				float time=s.nextFloat();
				si obj1=new si(principle,rate,time);
				obj1.result();
			}
			if(c==2)
			{
				System.out.format("%s","Enter the principle amount,rate,time(in years) and number of times interest is applied per time period for which compound interest needs to be calculated");
				float principle=s.nextFloat();
				float rate=s.nextFloat();
				float days=s.nextFloat();
				float times=s.nextFloat();
				ci obj2=new ci(principle,rate,days,times);
				obj2.result();
			}
			
		}

	}