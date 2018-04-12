package pentagono;

public class Figura {
	private Punto[] ver = new Punto[5];
	private Punto centro;
	public Figura(Punto centro, Double radio, Double ai) {
		this.centro = new Punto();
		this.centro.setX(centro.getX());
		this.centro.setY(centro.getY());
		vc(this.centro, radio, ai); 
	}
	public Figura(Double radio, Double ai) { 
		
		vc(radio, ai);
	}
	public void vc(Double lin, Double ai) {
		for(int i=0; i<5; i++) {
			ver[i] = new Punto();
			if(getCua(ai) == Plano.I) {
				ver[i].setX(catAd(ai, lin));
				ver[i].setY(catOp(ai, lin));	
			}else if(getCua(ai) == Plano.II) {
				ver[i].setX(-catAd(180-ai, lin));
				ver[i].setY(catOp(180-ai, lin));
			}else if(getCua(ai) == Plano.III) {
				ver[i].setX(-catAd(ai-180, lin));
				ver[i].setY(-catOp(ai-180, lin));
			}else if(getCua(ai) == Plano.IV) {
				ver[i].setX(catAd(360-ai, lin));
				ver[i].setY(-catOp(360-ai, lin));
			}
			ai+=72;
		}
	}
	public void vc(Punto centro,Double longitudDeLinea, Double ai) {
		vc(longitudDeLinea, ai);
		for(int i=0; i<5; i++) {
			ver[i].setX(ver[i].getX()+centro.getX());
			ver[i].setY(ver[i].getY()+centro.getY());
		}
	}
	public void display() {
		for(int i=0;i<5;i++) {
			System.out.printf("Coordenada : ( "+ (int) +ver[i].getX()+", "+ (int)+ver[i].getY()+")\n");
		}
	}
	public static Double catOp(Double angulo, Double linea) { 
		Double co = linea*Math.sin(Math.toRadians(angulo));
		return co;
	}
	public static Double catAd(Double angulo, Double linea) {
		Double ca = linea*Math.cos(Math.toRadians(angulo));
		return ca;
	}
	public static Plano getCua(Double ang) { 
		if((ang>=0 && ang<90) || ang == 360) { 
			return Plano.I;
		}else if(ang>=90 && ang<180) {			 
			return Plano.II;
		}else if(ang>=180 && ang<270) {			
			return Plano.III;
		}else if(ang>=270 && ang<360) {			
			return Plano.IV;
		}else {
			if(ang<0) {								
				while(ang<0)							
					ang+=360;
				return getCua(ang);     
			}else {										
				while(ang>360)						
					ang-=360;
				return getCua(ang);
			}
		}
	}
	
}
