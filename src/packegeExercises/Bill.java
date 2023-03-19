package packegeExercises;

public class Bill {

	public static final int BEER = 5;
	public static final int SOFT_DRINK = 3;
	public static final int BARBECUE = 7;
	

	public static double feeding(int beer, int softDrink, int barbecue) {
		return beer * BEER + softDrink * SOFT_DRINK + barbecue * BARBECUE;
	}

	public static double cover(double feeding) {
		if (feeding > 30) {
			return 0;
		} else {
			return 4;
		}

	}

	public static double ticket(char sexo) {
		if (sexo == 'M' || sexo == 'm') {
			return 10;
		} else
			return 8;
	}

	public static double total(double feeding, double ticket,double cover) {

		if (feeding < 30.0) {
			return feeding + ticket + cover;
		} else {
			return feeding + ticket;
		}
	}

}
