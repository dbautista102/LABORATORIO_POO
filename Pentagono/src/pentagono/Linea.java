package pentagono;

public class Linea {
	private Punto inicioLinea;
	private Punto finLinea;
	public Linea(Punto x1, Punto x2) {
		this.setInicio(x1);
		this.finLinea = x2;
	}
	public Linea(Double x1, Double y1,
			Double x2, Double y2) {
		this.setInicio(new Punto(x1, y1));
		this.finLinea = new Punto(x2, y2);
	}
	public Double longitudLinea() {
		double v = finLinea.getX();
                double b =getInicio().getX();
                double v1 = finLinea.getY();
                double b1 = getInicio().getY();
		return Math.sqrt(Math.pow(v-b, 2)+Math.pow(v1-b1, 2));
		
	}
	private Punto getInicio() {
		return inicioLinea;
	}
	private void setInicio(Punto inicio) {
		this.inicioLinea = inicio;
	}
}
