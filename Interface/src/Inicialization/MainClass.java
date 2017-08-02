package Inicialization;

import javax.swing.JFrame;

import Screens.Home;

public class MainClass  extends JFrame{

	private static final long serialVersionUID = 1L;
	static Home home1;
	
	public static void main(String[] args){
		home1 =  new Home(0);
	}
	
	public static void mudarTela(int option){
		switch(option){
		case 0:
			home1 = new Home(0);
			break;
		case 1:
			home1 = new Home(1);
			break;
		case 2:
			home1 = new Home(2);
			break;
		case 3:
			home1 = new Home(3);
			break;
		case 4:
			home1 = new Home(4);
			break;
		case 5:
			home1 = new Home(5);
			break;
		case 6:
			home1 = new Home(6);
			break;
		case 7:
			home1 = new Home(7);
			break;
		case 8:
			home1 = new Home(8);
			break;
		case 9:
			home1 = new Home(9);
			break;
			
		}
	}

}
