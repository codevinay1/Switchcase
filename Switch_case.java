import java.util.*;
class Switch_case
{
	int a;
	void grater()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number, between 1 to 5 = ");
		a=sc.nextInt();
		Switch(a)
		{
			case 1 :{
				System.out.println("Deepak ji Mewada");
			}
			case 2:{
				System.out.println("Shivam ");
			}
			case 3:{
				System.out.println("Payal");
			}
			case 3:{
				System.out.println("Anushka");
			}
			case 4:{
				System.out.println("Sonu Kumawat");
			}
			case 5:{
				System.out.println("Aditya");
			} 
			default:{
				System.out.println("jab likha huaa hai  1 to 5 to khu dimag laga raha hai");
			}
		}	
class Switch_case_2
{
	public static void main(String a[])
	{
		Switch_case x1=new Switch_case();
		x1.grater();	
	} 
}