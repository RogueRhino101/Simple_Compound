package si_ci;
import java.util.*;
import java.lang.*;
public class ci 
{
	float principle,rate,days,times; 
	Scanner s=new Scanner(System.in);
	public ci(float principle,float rate,float days,float times)
	{
		this.principle=principle;
		this.rate=rate;
		this.days=days;
		this.times=times;
	}
	public void result()
	{
		float compound=(float)(principle*Math.pow(1+(rate/times),(times*days)));
                compound=compound-principle;
		System.out.format("%s","The compound interest is:"+compound);
	}

}