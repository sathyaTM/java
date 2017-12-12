package Prelims;
public class array {
	public static void main(String[] args) {
		//arrays
		Object arr[][]=new Object[4][5];
//Start of passing parameter to array
		arr[0][0]="Lakshmi";
		arr[0][1]="lakshmi@gmail.com";
		arr[0][2]=5555555;
		arr[0][3]=30;
		arr[0][4]="BN3 5AJ";
		
		arr[1][0]="Sathya";
		arr[1][1]="sathya@gmail.com";
		arr[1][2]=666666;
		arr[1][3]=35;
		arr[1][4]="BN3 6AJ";
		
		arr[2][0]="Smitha";
		arr[2][1]="smitha@gmail.com";
		arr[2][2]=777777;
		arr[2][3]=8;
		arr[2][4]="BN3 7AJ";
		
		arr[3][0]="Arjun";
		arr[3][1]="arjun@gmail.com";
		arr[3][2]=888888;
		arr[3][3]=1;
		arr[3][4]="BN3 8AJ";
//End of passing parameter to array
		//System.out.println(arr.length);
		//System.out.println(arr[0].length);
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[0].length;col++)
			{
				System.out.print(arr[row][col]+" ");		
			}
		System.out.print('\n');
		}
	}
}
