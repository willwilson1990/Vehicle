package Vehicle;
import java.awt.*;
import java.util.*;

public class maker {
	String company;
	String plantLocation;
	Date mintDate;
	Image logo;
	int contactInfo;
	String website;
	
	@SuppressWarnings("deprecation")
	maker(){
		company = "made this car";
		plantLocation = "town";
		mintDate = new Date (2020,12,12);
		//logo =  ;
		contactInfo = 5555555 ;
		website = "carseller.com" ;
	}
	
	Image getLogo() {
		return logo;
	}
	
	String getMake(){
		return company;
	}
}
