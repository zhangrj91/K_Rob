package my;

public class Point
{
	int x;
	int y;
	
	public int manhattan( Point p )
	{
		int result = Math.abs(p.x - this.x) + Math.abs(p.y - this.y);
		return result;
	}
	
}
