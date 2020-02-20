package si_ci;
import java.util.*;
public class si 
{
	float principle,rate,time; 
	Scanner s=new Scanner(System.in);
	public si(float principle,float rate,float time)//constructor to initialize the variables
	{
	this.principle=principle;
	this.rate=rate;
	this.time=time;
	}
	public void result() //to claculate the simple interest
	{
		float simple=(principle*rate*time)/100;
		System.out.format("%s","The simple interest is:"+simple);
	}

}
