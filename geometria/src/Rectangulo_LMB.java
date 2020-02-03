/**
 * @auhtor Laura Malaga Brotons
 * @version v1.2
 */
public class Rectangulo_LMB extends FiguraGeometrica_LMB {
	private double l1;
	private double l2;
	
	/**
	 * Contructor parametrizado de la clase 
	 * @param tipoFigura 
	 * @param lG lado grande
	 * @param lP lado pequeño
	 */
	public Rectangulo_LMB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	public double area() {
		return l1 * l2;
	}
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
