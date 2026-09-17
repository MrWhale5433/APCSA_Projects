import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoopsPractice extends JPanel{
	
	// Practice calling methods with parameters
	// by drawing the required shapes/patterns from the document
	public void paint(Graphics pen) {
		
		pen.setColor(Color.black);
		
		//rectangle and quadrant setup
		pen.drawRect(10, 10, 1000, 700);
		pen.drawLine(10, 355, 1010, 355);
		pen.drawLine(505, 10, 505, 710);
		
		
		verticalLines(pen);
		randomLines(pen);
		randomSquares(pen);
		randomCircles(pen);
		
		
		
		
		
		
		
		
	
	}
	
	/*
	 * Top-left quadrant
	 * Draw 200 vertical lines
	 * with different colors per line
	 */
	public void verticalLines(Graphics pen) {
		pen.drawString("vertical lines", 30, 40);
		
		//1) setup variable representing point A and point B
		//of the lines you're going to draw!
		int count = 0;
		int x1 = 25;
		int y1 = 50;
		int x2 = 25;
		int y2 = 250;
		while(count < 90) {
			
			System.out.println("loops - does it loop");
			
			//2) Draw the actual line using variables 
			int red = (int)(Math.random()*(255-0+1))+0; //for colors it is between 0 - 255
			int green = (int)(Math.random()*(255-0+1))+0;
			int blue = (int)(Math.random()*(255-0+1))+0;
			Color randomColor = new Color(red, green, blue);
			
			pen.setColor(randomColor);
				x1 += 5;
				x2 += 5;
				pen.drawLine(x1, y1, x2, y2);
			//3) update the variables dealing with the line
			//such that the next line drawn is to the RIGHT of previous
			count++; //update control variable
			
			/*
			 * using Math.random to generate a random color
			 * (int)(Math.random()*(max-min+1))+min
			 */
			
		
			
			//use the random values for each channel to create the Color object
			
		}

		
	}
		
		
		
	
	/*
	 * Top-right quadrant
	 * Draw a bunch of different lines with
	 * random orientation (random starting and ending point)
	 * Use different colors
	 */
	public void randomLines(Graphics pen) {
		pen.setColor(Color.black);
		pen.drawString("random lines", 520, 40);
		
		int cntr = 0;
		int pointX1;
		int pointY1;
		int pointX2;
		int pointY2;
		
				
		while(cntr < 2000) {
			
			int red = (int)(Math.random()*(255-0+1))+0; //for colors it is between 0 - 255
			int green = (int)(Math.random()*(255-0+1))+0;
			int blue = (int)(Math.random()*(255-0+1))+0;
			Color randomColor = new Color(red, green, blue);
			pen.setColor(randomColor);
			
			pointX1 = (int)(Math.random()*(1010-505+1))+505;
			pointY1 = (int)(Math.random()*(355-10+1))+10;
			pointX2 = (int)(Math.random()*(1010-505+1))+505;
			pointY2 = (int)(Math.random()*(355-10+1))+10;
			
			pen.drawLine(pointX1, pointY1, pointX2, pointY2);
			
			cntr++; //update control var else it'll be infinite loop
			
			
		}
					
			
		
		
		
	}
	
	
	/*
	 * Draw 100 squares randomly placed in 
	 * bottom-left quadrant. 
	 * Each square is a different color and
	 * is filled in.
	 * 
	 * They should not overflow out of the 
	 * bottom-left quadrant.
	 */
	public void randomSquares(Graphics pen) {
		pen.drawString("random squares", 30, 390);
		
		
	}
	
	/*
	 * Draw 50 circles with random size from 
	 * 30-200 in width.
	 * Use different colors. 
	 * They should not overflow out of the 
	 * bottom-right quadrant 
	 */
	public void randomCircles(Graphics pen) {
		pen.drawString("random circles", 520, 390);
		
		
	}
	
	
	public static void main(String[] arg) {
		LoopsPractice m = new LoopsPractice();
	}
	
	public LoopsPractice() {
		JFrame f = new JFrame("Loops & Math.random");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1040,768);
		f.setResizable(false);
		f.add(this);
		f.setVisible(true);
		
	}
}
