package Vehicle;

public class Model extends Maker{
	private String BodyType;
	private String ModelName;
	private String[] PackageType;
	
	Model(){
		BodyType ="Truck" ;
		ModelName = "BIG";
		PackageType = new String[]{"Wheels","4","MPG","15","Color","Blue","Seats","2", "fuelCap","20", "tonage", "1.234"};
		
	}
	
	Model(String Bt, String Mn, String[] trimPackage){
		BodyType = Bt;
		ModelName = Mn;
		PackageType = trimPackage;
	}
	
	String getBt() {
		return BodyType;
	}
	String setBt(String newBodyType) {
		return BodyType = newBodyType;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String newModelName) {
		ModelName = newModelName;
	}
	public String[] getPackageType() {
		return PackageType;
	}
	public void setPackageType(String[] newPackageType) {
		PackageType = newPackageType;
	}
}
