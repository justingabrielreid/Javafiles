import java.awt.Color;
import java.awt.Graphics;


public class TwoRowsofSquares
{
	public static void draw(Graphics g)
	{
		//Drawing Instructions
		final int width = 20;
		g.setColor(Color.BLUE);
		// Top Row. Now that the top left corner of the drawing has coordinates (0,0)
		int x = 0;
		int y = 0;
		for (int i = 0; i < 10; i++)
		{
			g.fillRect(x, y, width, width);
			x = x + 2 * width;
		}
	}
	
}