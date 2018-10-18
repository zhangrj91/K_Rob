package my;

public class Quadrangle
{
	int q = 0;
	Quadrangle()
	{
		System.out.println(q);
	}
	void draw1()
	{
		q = 1;
	}
	void draw2()
	{
		q = 2;
	}
	public static void main(String[] args)
	{
		new Parallelogramgle();
	}
}

class Parallelogramgle extends Quadrangle
{
	int p = 0;
	public Parallelogramgle()
	{
		System.out.println("p" + p);
	}
}