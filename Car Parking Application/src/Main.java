import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Main m=new Main();
		System.out.println("Enter the size of Park");
		int Size=sc.nextInt();
		Parking parking=new Parking(Size);
		outer:while(true) {
			System.out.println("Admin or User");
			System.out.println("Enter A or U");
			char ch=sc.next().charAt(0);
			switch(ch) {
			case 'A'|'a':
				boolean flag=m.admin(sc,parking);
				if(!flag)
					continue outer;
				else
					break;
			case 'U'|'u':
				System.out.println("Do you want to park Vehile?");
				System.out.println("PLEASE ENTER Y or N");
				char task=sc.next().charAt(0);
				switch(task) {
				case 'Y'|'y':
					Vehcile vehcile=m.getDetails(sc);
					parking.park(vehcile);
					break;
				case 'N'|'n':
					System.out.println("Enter the vehcile number of vehcile to unpark");
					String vehcileNumber=sc.next();
					parking.unpark(vehcileNumber);
					break;
				default:
					System.out.println("Please!! Enter the valid input");
					continue outer;
				}
				System.out.println("Do you want to continue?");
				System.out.println("PLEASE ENTER Y or N");
				char decision=sc.next().charAt(0);
				switch(decision) {
				case 'Y'|'y':
					continue outer;
				case 'N'|'n':
					System.out.print("Thank you!! See u next time!!.");
					break outer;
				}
			}
		}
		sc.close();
	}
	protected Vehcile getDetails(Scanner sc) {
		System.out.println("Enter the your Name");
		String ownerName=sc.next();
		System.out.println("Enter the vehile Number");
		String vehcileNumber=sc.next();
		System.out.println("Enter the color of your vehcile");
		String color=sc.next();
		return new Vehcile(ownerName,vehcileNumber,color);
	}
	protected boolean admin(Scanner sc,Parking parking) 
	{
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		if(username.equals("gowtham")&& password.equals("1234")) {
			parking.status();
			return true;
		}
		else
			System.out.println("Entered username or password is wrong!!!");
		return false;
		
	}

}
