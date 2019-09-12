package Vehicle;

public class automobile extends VehicleWILL {
	
	private boolean Trunk;
	private boolean Ac;
	private boolean Tint;
	private String Owner;
	private String Title;
	private Maker AutoMake;
	private Model AutoModel;
	
	automobile(){
		super();
		Trunk = true;
		Ac = true;
		Tint = true;
		Owner = "me";
		Title = "in glovebox";
		AutoMake = new Maker();
		AutoModel = new Model();
		updateVehicle();
		}
	
	automobile(int p, int f, int m, Maker vM, Model vMod ){
		super(p,f,m);
		Trunk = true;
		Ac = true;
		Tint = true;
		Owner = "me";
		Title = "in glovebox";
		AutoMake = vM;
		AutoModel = vMod;
		updateVehicle();
	}
	
	automobile(int p, int f, int m, int d, int drs, int t, String c, int w, int y, int tm, Maker vM, Model vMod){
		super(p, f, m, d, drs, t, c, w, y, tm);
		Trunk = true;
		Ac = true;
		Tint = true;
		Owner = "me";
		Title = "in glovebox";
		AutoMake = vM;
		AutoModel = vMod;
		updateVehicle();
	}
	
	private void updateVehicle() {
		String [] trmPak = AutoModel.getPackageType();
		//"Wheels","4","MPG","15","Color","Blue","Seats","2", "fuelCap","20", "tonage", "1.234"
		int  MPG, pass, fuelCap;
		double tonage;
		String colour = trmPak[5];
		
		 try {
			 mpg = Integer.parseInt(trmPak[3]);
			 passengers = Integer.parseInt(trmPak[7]);
			 fuelcap = Integer.parseInt(trmPak[9]);
		 }
		 catch(Exception e) {
			mpg = 20;
			passengers = 4;
			fuelCap = 20;
			
			System.out.println("BAD TRIM PACKAGE");
		 }
		 
		 
		 try {
			 tonage = Double.parseDouble(trmPak[11]);
		 }
		 catch(Exception e) {
			 tonage = .75;
			System.out.println("BAD TRIM PACKAGE");
		 }
	}

	
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
		String[] trimPackage = AutoModel.getPackageType();
		 int wheelCount = 0;
		 try {
			 wheelCount = Integer.parseInt(trimPackage[1]);
		 }
		 catch(Exception e) {
			 System.out.println("BAD TRIM PACKAGE ");
		 }
		
		 return wheelCount;
	}
	
	int getNumDoors() {
		return super.doors ;
	}
	
	@Override
	void getMakeAndModel() {    
		AutoMake.getMake();
		AutoModel.getModelName();
	}
}
