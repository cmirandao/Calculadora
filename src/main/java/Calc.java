import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op="";
		double a,b;
		Scanner n = new Scanner(System.in);
		System.out.println("Ingrese operador (+, -, * o /)");
		op=n.next();
		System.out.println("Ingrese primer operando:");
		a=n.nextDouble();
		System.out.println("Ingrese segundo operando:");
		b=n.nextDouble();
		Calculos c=new Calculos();
		double result=0;
		try {
			result = c.Operacion(op, a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("El resultado es: " + result);
	}
}