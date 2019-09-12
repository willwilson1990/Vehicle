package Vehicle;

public class Automobile extends VehicleWILL {
	
	private boolean Trunk;
	private boolean Ac;
	private boolean Tint;
	private String Owner;
	private String Title;
	private String MakeAndModel;
	
	public boolean isTrunk() {
		return Trunk;
	}
	public void setTrunk(boolean newTrunk) {
		Trunk = newTrunk;
	}
	public boolean isAc() {
		return Ac;
	}
	public void setAc(boolean newAc) {
		Ac = newAc;
	}
	public boolean isTint() {
		return Tint;
	}
	public void setTint(boolean newTint) {
		Tint = newTint;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String newOwner) {
		Owner = newOwner;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String newTitle) {
		Title = newTitle;
	}
	
	int getNumWheels () {
		return ;
	}
	
	int getNUmDoors() {
		return ;
	}
	
	String getMakeAndModel(String ModelName, String company) {
		return MakeAndModel;
	}
	
	String setMakeAndModel(String newMakeAndModel) {
		MakeAndModel = newMakeAndModel ;
	}
}
