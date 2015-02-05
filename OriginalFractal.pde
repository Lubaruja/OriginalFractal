void setup()
{
	size(800, 800);
	background(0);
	noLoop();
}


void draw()
{
	translate(400, 400);
	Fractal(420, 120);
}

void Fractal(int x, int dubLength)
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