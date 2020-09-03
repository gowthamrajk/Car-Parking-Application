public class Vehcile 
{
	private String OwnerName="";
	private String VehcileNumber="";
	private String color="";
	private int slot;
	Vehcile(String OwnerName,String VehcileNumber,String color){
		this.OwnerName=OwnerName;
		this.VehcileNumber=VehcileNumber;
		this.color=color;
	}
	public void setSlot(int slot) {
		this.slot=slot;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public String getVehcileNumber() {
		return VehcileNumber;
	}
	public String getColor() {
		return color;
	}
	public String getSlot() {
		return ""+slot;
	}
}
