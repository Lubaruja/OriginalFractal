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
	size(250, 250);
	rectMode(CENTER);
}
public void draw()
{
	//Fractal(250, 250, 100);
	for (int i=0; i<=255; i++)
	{
		stroke(i);
		line(i, 0, i, 255);
	}

	for (int k=0; k<=2*PI; k+=PI/36)
	{
		rotate(k);
		line(125, 100, 125, 150);
	}
}

// void Fractal(int x, int y, int side)
// {
// 	if (side>=10)
// 	{
// 		Fractal(x+side/2, y+side/2, side/3);
// 		Fractal(x+side/2, y-side/2, side/3);
// 		Fractal(x-side/2, y+side/2, side/3);
// 		Fractal(x-side/2, y-side/2, side/3);
// 	}
// 	else 
// 	{
// 		rect(x, y, side, side);
// 	}
// }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
