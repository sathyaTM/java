public class StaticnNonStatic
{
//non static variable initiation
	String name;	String email;	int age;	String birthplace;

//static variable initiation
	static String city = "Brighton";	static String country="United Kingdom";
	
//non static functions definition
	public void printAge(String nm,int a)
	{	System.out.print(nm+" is " + a +" old ");	}
	
	public void printBirthplace(String nm,String bp)
	{	System.out.println("and born in " + bp);	}

//static functions definition
	public static void currentResidence()
	{	System.out.println("The family is currently residing in "+city+", "+country);	}

//Constructor start
public 	StaticnNonStatic(String nm,String em,int ag,String brthplc)
{
	this.name=nm;	this.email=em;	this.age=ag;	this.birthplace=brthplc;
}
public 	StaticnNonStatic()
{
	System.out.println("No Arguments");
}

//Constructor end

//------------------------Main function-------------	
public static void main(String[] args)
{
	StaticnNonStatic sa=new StaticnNonStatic("Sathya","sathya@gmail.com",35,"Pondicherry");
	StaticnNonStatic la=new StaticnNonStatic("Lakshmi","lakshmi@gmail.com",30,"Delhi");
	StaticnNonStatic sm=new StaticnNonStatic("Smitha","smitha@gmail.com",8,"Chennai");
	StaticnNonStatic ar=new StaticnNonStatic("Arjun","arjun@gmail.com",1,"Brighton");
	sa.printAge(sa.name,sa.age);
	sa.printBirthplace(sa.name,sa.birthplace);
	la.printAge(la.name,la.age);
	la.printBirthplace(la.name,la.birthplace);
	sm.printAge(sm.name,sm.age);
	sm.printBirthplace(sm.name,sm.birthplace);
	ar.printAge(ar.name,ar.age);
	ar.printBirthplace(ar.name,ar.birthplace);
	StaticnNonStatic.currentResidence();
	
	/*sa.name="Sathya";
	sa.email="sathya@gmail.com";
	sa.age=35;
	sa.birthplace="Pondicherry";
			
	la.name="Lakshmi";
	la.email="lakshmi@gmail.com";
	la.age=30;
	la.birthplace="Delhi";
		
	sm.name="Smitha";
	sm.email="smitha@gmail.com";
	sm.age=8;
	sm.birthplace="Chennai";
			
	ar.name="Arjun";
	ar.email="arjun@gmail.com";
	ar.age=1;
	ar.birthplace="Brighton";*/
}
}
