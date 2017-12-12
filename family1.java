public class family1
{
	public static void main(String[] args)
	{
	StaticnNonStatic a=new StaticnNonStatic();
	StaticnNonStatic mm=new StaticnNonStatic("Ranganayaguy","ranganayaguy@gmail.com",58,"Pondicherry");
	mm.printAge(mm.name,mm.age);
	mm.printBirthplace(mm.name,mm.birthplace);
	}

}
