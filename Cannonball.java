import java.lang.Math;
class Cannonball
{
	private double xpos; 
	private double ypos;
	private double xvel;
	private double yvel;
	private final double time_interval = 0.01;
	final double EPSILON = 1E-14; 
	private double time;
	
	public Cannonball(double x)
	{
		this.xpos = x;
		this.ypos = 0;
		this.time = 0;

	}
	public void move(double sec)
	{
		xpos = xpos +  xvel*sec;
		ypos = ypos + yvel*sec;
		yvel = yvel - 9.81*sec;
		time = time + time_interval;
		
	}					
	public double getx()
	{
		return xpos;
	}	
	public double gety()
	{
		return ypos;
	}	
	public double gettime()
	{
			return time;
	}	
	public void shoot(double angle, double velocity)
	{
			xvel = velocity*Math.cos(Math.toRadians(angle));
			yvel = velocity*Math.sin(Math.toRadians(angle));
			do
			{
				this.move(time_interval);
				System.out.printf("xpos: %5.2f", this.getx());
				System.out.printf(" ypos: %5.2f", this.gety());
				System.out.printf(" time:  %5.2f", this.gettime());
				System.out.println();
			}
			while(ypos - EPSILON > 0);
	}
}

