import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
	size(800, 800);
	background(0);
	noLoop();
}


public void draw()
{
	translate(400, 400);
	Fractal(420, 120);
}

public void Fractal(int x, int dubLength)
{

	float k=0;
	while (k<Math.PI*2)
	{
		if (dubLength>=50)
		{
			pushMatrix();
			rotate(k);
			stroke(255);
			line(x, dubLength, x, -dubLength);
			popMatrix();
			Fractal(x/2, dubLength-70);
		}
		else 
		{
			rotate(k);
			stroke(255);
			line(x, dubLength, x, -dubLength);
		}
	k+=Math.PI/18;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
