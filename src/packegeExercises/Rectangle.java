package packegeExercises;

public class Rectangle {
	
	public double whidth;
	public double heigth;
	
	public double area () {
		return whidth * heigth;
	}
	
	public double perimeter () {
		return 2* (whidth+heigth);
	}
	
	public double diagonal () {
		return Math.sqrt(Math.pow(whidth, 2) + Math.pow(heigth, 2));
	}
}


