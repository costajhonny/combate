package packegeExercises;

public class Student {
		public String name;
		public double notaUm;
		public double notaDois;
		public double notaTres;
		public double media;
		
		public double notaFinal () {
			return notaUm + notaDois + notaTres;
		}
		
		public double faltam () {
			
				if (notaFinal() < 60.0) {
					return 60.0- notaFinal();
				}else {
					return 0.0;
				}
		
		}
}
