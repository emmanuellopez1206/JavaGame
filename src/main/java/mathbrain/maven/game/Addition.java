package mathbrain.maven.game;
/*
*Esta clase se usa para las operaciones matemáticas de Suma.
*/
public class Addition {
	protected String problem;
	protected int solution;
/*
*Este método genera la operación matemática suma que se debe resolver.
*/
	public Addition() {
		super(.5);
		int number1 = (int)(Math.random() * 8) + 3;
		int number2 = (int)(Math.random() * 11) + 1;
		solution = number1 + number2;
		problem = "" + number1 + "+" + number2;
	}
/*
*Este método obtiene la suma que se debe resolver.
*@return Una cadena con la operación de suma.
*/
	public String getProblem() {
		return problem;
	}
/*
*Este método obtiene el resultado de la operación matemática.
*@return Un entero con el resultado de la suma.
*/
	public int getSolution() {
		return solution;
	}
}
