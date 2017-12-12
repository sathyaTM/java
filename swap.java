public class swap {
	int x,y;
	
public static void swapVal(swap g)
{
	int temp=g.x;
	g.x=g.y;
	g.y=temp;
}
		
	public static void main(String[] args)
	{
		swap s = new swap();
		s.x=10; s.y=20;
		System.out.println(s.x+"---"+s.y);
		swapVal(s);
		System.out.println(s.x+"---"+s.y);
	}

}
