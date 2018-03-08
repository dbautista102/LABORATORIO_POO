
import ProgrammingExercises.Circle;



public class Ejercicio09 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setRadius(65.2);
		c2.setRadius(13.5);
		System.out.println("Círculo 1 data: ");
		System.out.println("El radio del circulo 1 es: "+c1.getRadius());
		System.out.println("El diámetro del círculo 1 es: "+c1.getDiameter());
		System.out.println("El área del círculo 1 es: "+c1.getArea());
		
		
		System.out.println("Círculo 2 data: ");
		System.out.println("El radio del circulo 2 es: "+c2.getRadius());
		System.out.println("El diámetro del círculo 2 es: "+c2.getDiameter());
		System.out.println("El área del círculo 2 es: "+c2.getArea());
		
		
	}
}
