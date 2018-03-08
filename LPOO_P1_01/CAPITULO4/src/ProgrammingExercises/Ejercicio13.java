package cap04;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CertificateOfDeposit deposito1 = new CertificateOfDeposit(123, "1", 0.0, 1, 1, 1900);
		CertificateOfDeposit deposito2 = new CertificateOfDeposit(124, "2", 0.0, 1, 1, 1900);
		System.out.println("Ingresa el numero de deposito: ");
		deposito1.setCertificateNumber(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingresa el apellido paterno del dueño de la cuenta: ");
		deposito1.setaccHolderLastName(scanner.nextLine());
		System.out.println("Ingresa el balance del deposito: ");
		deposito1.setBalance(scanner.nextDouble());
		System.out.println("Ahora toca ingresar la fecha, ingresa el dia mes y año\nseparados por un"
				+ " espacio y en ese orden para deposito");
		deposito1.setIssueDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
		
		
		System.out.println("DATA PARA CUENTA2: ");
		System.out.println("Ingresa el numero de deposito: ");
		deposito2.setCertificateNumber(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingresa el apellido paterno del dueño de la cuenta: ");
		deposito2.setaccHolderLastName(scanner.nextLine());
		System.out.println("Ingresa el balance del deposito: ");
		deposito2.setBalance(scanner.nextDouble());
		System.out.println("Ahora toca ingresar la fecha, ingresa el dia mes y a�o\nseparados por un"
				+ " espacio y en ese orden para ese deposito");
		deposito2.setIssueDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		System.out.println("\n\tDesplegando informacion");
		System.out.println("DATOS PARA CUENTA1: ");
		System.out.println("Numero de deposito: "+deposito1.getCertificateNumber());
		System.out.println("Apellido paterno de dueño de cuenta: "+deposito1.getAccHolderLastName());
		System.out.println("Balance del deposito: "+deposito1.getBalance());
		System.out.printf("Fecha de asunto: %d/%d/%d%n",
		deposito1.getIssueDate().get(GregorianCalendar.DATE),
		deposito1.getIssueDate().get(GregorianCalendar.MONTH),
		deposito1.getIssueDate().get(GregorianCalendar.YEAR));
		System.out.printf("Fecha de vencimiento: %d/%d/%d%n",
				deposito1.getMaturityDate().get(GregorianCalendar.DATE),
				deposito1.getMaturityDate().get(GregorianCalendar.MONTH),
				deposito1.getMaturityDate().get(GregorianCalendar.YEAR));
	
		System.out.println();
		System.out.println("DATOS PARA CUENTA2: ");
		System.out.println("Numero de deposito: "+deposito2.getCertificateNumber());
		System.out.println("Apellido paterno de due�o de cuenta: "+deposito2.getAccHolderLastName());
		System.out.println("Balance del dep�sito: "+deposito2.getBalance());
		System.out.printf("Fecha de asunto: %d/%d/%d%n",
		deposito2.getIssueDate().get(GregorianCalendar.DATE),
		deposito2.getIssueDate().get(GregorianCalendar.MONTH),
		deposito2.getIssueDate().get(GregorianCalendar.YEAR));
		System.out.printf("Fecha de vencimiento: %d/%d/%d%n",
				deposito2.getMaturityDate().get(GregorianCalendar.DATE),
				deposito2.getMaturityDate().get(GregorianCalendar.MONTH),
				deposito2.getMaturityDate().get(GregorianCalendar.YEAR));
		scanner.close();
		
	}
}
