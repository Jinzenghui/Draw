
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.geom.*;

public class DrawColor {
	
	public static void main(String[] args){
		
		int imageWidth = 300;
		int imageHeight = 300;
		
		BufferedImage image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.getGraphics();
		Graphics2D g = (Graphics2D)graphics;
		try{
			BasicStroke stroke = new BasicStroke(10);
			g.setStroke(stroke);
			Line2D line = new Line2D.Float(0, 0, 20, 30);
			g.draw(line);
			line = new Line2D.Float(50, 50, 100, 50);
			g.draw(line);
			line = new Line2D.Float(50, 50, 50, 100);
			g.draw(line);
			stroke = new BasicStroke(5);
			g.setStroke(stroke);
			
			GradientPaint gt = new GradientPaint(0, 0, Color.green, 50, 30, Color.blue, true);
			g.setPaint((Paint) gt);
			Rectangle2D rect = new Rectangle2D.Float(80, 80, 40, 40);
			g.draw(rect);
			rect = new Rectangle2D.Float(100, 100, 40, 40);
			g.fill(rect);
			
			Ellipse2D ellipse = new Ellipse2D.Float(120, 120, 30, 40);
			g.draw(ellipse);
			
			gt = new GradientPaint(0, 0, Color.red, 30, 30, Color.yellow, true);
			g.setPaint((Paint) gt);
			ellipse = new Ellipse2D.Float(140, 140, 20, 20);
			g.fill(ellipse);
			
			RoundRectangle2D roundRect = new RoundRectangle2D.Float(160, 160, 40, 40, 20, 20);
			g.draw(roundRect);
			roundRect = new RoundRectangle2D.Float(180, 180, 40, 40, 20, 20);
			g.fill(roundRect);
			
			GeneralPath path = new GeneralPath();
			path.moveTo(150, 0);
			path.lineTo(160, 50);
			path.curveTo(190, 200, 240, 140, 200, 100);
			g.fill(path);
			
			ImageIO.write(image, "PNG", new File("F:\\Draw\\abcd.png"));
					
		}catch(Exception ex){
			ex.printStackTrace();
		}
		graphics.dispose();
	}
}
