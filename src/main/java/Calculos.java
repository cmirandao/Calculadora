
public class Calculos {
	public double Operacion(String x, double a, double b) throws Exception{
		
			if(x.equals("+"))
				return a+b;
			if(x.equals("-"))
				return a-b;
			if(x.equals("*"))
				return a*b;
			if(x.equals("/"))
				if(b!=0)
					return a/b;
				else
					throw new Exception("No puede dividir por 0");
		return 0;
	}
}