package pentagono;

public class Punto {
	private Double x; 
	private Double y; 
	public Punto (Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	public Punto() { 
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public void setX(Double x) {
		this.x = x;
	}
	public void setY(Double y) {
            this.y = y;
	}
	public Double getX() {
		return x;
	}
	public Double getY() {
		return y;
	}
	public String toString() {
		String cadena = String.format("(%.5f,%.5f)", x, y);
		return cadena;
	}
	public Plano getCuadrante() { 
		if((x > 0) && (y >=0)) {
			return Plano.I;
		}else if((x <=0 ) && (y>0)) {
			return Plano.II;
		}else if((x<0) && (y<=0)) {
			return Plano.III;
		}else if((x>=0)&&(y<0)) {
			return Plano.IV;
		}else {
			return Plano.ORIGEN;
		}
	}


	
}
