package Prelims;

public class utilityFunction {

	public static void main(String[] args)
	{
		int randnum=generateRandomNum(40);
		System.out.println(randnum);
	}

	public static int generateRandomNum(int r)
	{
	double g = Math.random()*(r+1);
	int i=(int)g;
	return i;
	}
}
