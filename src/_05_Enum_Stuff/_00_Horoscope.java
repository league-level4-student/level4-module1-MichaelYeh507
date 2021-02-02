package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		Zodiac []array = Zodiac.values();
		int choice = JOptionPane.showOptionDialog(null, "Pick your zodiac sign", "Zodiacs", 0, -1, null, array, 0);
		getHoroscope(array[choice]);
	}
	
	static void getHoroscope(Zodiac zodiac) {
		switch (zodiac) {
		case ARIES:{
			System.out.println("Aries loves to be number one.");
			break;
		}
		case TAURUS:{
			System.out.println("Taurus is steadfast and loyal.");
			break;
		}
		case GEMINI:{
			System.out.println("You are versatile, expressive, curious, and kind");
		}
		case CANCER: {
			System.out.println("You are intuitive, sentimental, compassionate, and protective");
			break;
		}
		case LEO: {
			System.out.println("You are dramatic, fiery, outgoing, and self-assured");
			break;
		}
		case VIRGO: {
			System.out.println("You are practical, loyal, gental, and analytical");
			break;
		}
		case LIBRA: {
			System.out.println("You are social, fair-minded, diplomatic, and gracious");
			break;
		}
		case SCORPIO: {
			System.out.println("You are passionate, stubborn, resourceful, and brave");
			break;
		}
		case SAGITTARIUS: {
			System.out.println("You are extroverted, optimistic, funny, and generous");
			break;
		}
		case CAPRICORN: {
			System.out.println("You are serious, independent, disciplined, and tenacious");
			break;
		}
		case AQUARIUS: {
			System.out.println("You are deep, imaginative, original, and uncompromising");
			break;
		}
		case PISCES: {
			System.out.println("You are affectionate, empathetic, wise, and artistic");
			break;
		}
		default:
			System.out.println("error");
			break;
		}
	}
	
}
