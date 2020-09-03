public class Parking {
	private int Size,free=0;
	Vehcile vehcile[];
	Parking(int Size){
		this.Size=Size;
		vehcile=new Vehcile[Size];
	}
	void status(Vehcile v) {
		System.out.println("Parked slot   Onwer name   VehcileNumber   color");
		System.out.println(v.getSlot()+"--"+v.getOwnerName()+"--"+v.getVehcileNumber()+"--"+v.getColor());
		System.out.println();
	}
	void status() {
		int ctr=0;
		System.out.println("ParkingSlot   Onwer name   VehcileNumber   color");
		for(Vehcile v:vehcile) {
			if(v!=null)
				System.out.println(""+ctr+"--"+v.getOwnerName()+"--"+v.getVehcileNumber()+"--"+v.getColor());
			else
				System.out.println(""+ctr+"--"+"Slot is free");
			ctr++;
		}
	}
	protected void park(Vehcile v) {
		while(free<Size&&vehcile[free]!=null)
			free++;
		if(free<Size) {
		vehcile[free]=v;
		v.setSlot(free);
		System.out.println("Vehicle parked succesfully!!!");
		System.out.println();
		System.out.println("Vehicle details:");
		status(v);
		}
		else
			System.out.println("Sorry the parking is full");
		
	}
	protected void unpark(String vehcileNumber) {
		for(int i=0;i<Size;i++) {
			if(vehcile[i]!=null&&(vehcile[i].getVehcileNumber()).equals(vehcileNumber)) {
				System.out.println("Vehcile unparked succesfully");
				System.out.println("Vehcile details:");
				status(vehcile[i]);
				vehcile[i]=null;
				free=i;
				return;
			}
		}
		System.out.println("Vehile is not found !!!");
	}
}
