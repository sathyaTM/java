package hospitalProj;

public class FortisHospital extends Clinic 
{

	@Override
	public void doScan()
	{
	System.out.println("Fortis Scanning");
	}

	@Override
	public void doOperation()
	{
	System.out.println("Fortis Operation");
	}
	
	/*@Override
	public void doVaccination()
	{
	System.out.println("Fortis Vaccination");
	}*/
}
