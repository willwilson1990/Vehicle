package Vehicle;

public class Model {
	private String BodyType;
	private String ModelName;
	private String[] PackageType;
	
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
