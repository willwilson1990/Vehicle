package Vehicle;
import java.awt.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class Maker extends JFrame {
	ClassLoader ldr = this.getClass().getClassLoader();
	String company;
	String plantLocation;
	Date mintDate;
	ImageIcon logo = new ImageIcon (ldr.getResource("chevlogo.jpg"));
	int contactInfo;
	String website;
	
	@SuppressWarnings("deprecation")
	Maker(){
		company = "made this car";
		plantLocation = "town";
		try {	mintDate = new SimpleDateFormat("yyy-MM-dd").parse("2020-12-31");}
		catch (Exception e) {;}
		logo = new ImageIcon("toyotalogo.jpg");
		contactInfo = 5555555 ;
		website = "carseller.com" ;
	}
	
	Maker (String c, String pL, String wS, Date mD, ImageIcon l, int cI){
		company = c;
		plantLocation = pL;
		website = wS;
		mintDate = mD;
		logo = l;
		contactInfo = cI;
	}
	
	ImageIcon getLogo() {
		return logo;
	}
	
	void getMake(){
		MakeFrame thisOne = new MakeFrame();
	}
	private class MakeFrame extends JFrame{
		JPanel pnl = new JPanel();
	//	ClassLoader ldr = this.getClass().getClassLoader();
		ImageIcon toyota = logo;
		JLabel lbll = new JLabel(toyota);
		
		MakeFrame(){
			super("Toyota");
			setSize(600,600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			add(pnl);
			pnl.add(lbll);
			setVisible(true);
		}
	}
}

