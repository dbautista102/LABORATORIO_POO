package cap04;

import java.util.GregorianCalendar;

public class CertificateOfDeposit {
	private Integer certificateNumber;
	private String accHolderLastName;
	private Double balance;
	private GregorianCalendar issueDate;
	private GregorianCalendar maturityDate;
	public CertificateOfDeposit(Integer certificate, String lastName, Double balance,
			Integer dia, Integer mes, Integer anio) {
		certificateNumber = certificate;
		accHolderLastName = lastName;
		this.balance = balance;
		issueDate = new GregorianCalendar(anio, mes, dia);
		maturityDate = new GregorianCalendar();
		maturityDate.set(GregorianCalendar.YEAR, issueDate.get(GregorianCalendar.YEAR)+1);
		maturityDate.set(GregorianCalendar.MONTH, issueDate.get(GregorianCalendar.MONTH));
		maturityDate.set(GregorianCalendar.DATE, issueDate.get(GregorianCalendar.DATE));
	}
	public Integer getCertificateNumber() {
		return certificateNumber;
	}
	public String getAccHolderLastName() {
		return accHolderLastName;
	}
	public Double getBalance() {
		return balance;
	}
	public GregorianCalendar getIssueDate() {
		return issueDate;
	}
	public GregorianCalendar getMaturityDate() {
		return maturityDate;
	}
	public void setCertificateNumber(Integer certificate) {
		certificateNumber = certificate;
	}
	public void setaccHolderLastName(String lastName) {
		accHolderLastName = lastName;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void setIssueDate(Integer dia, Integer mes, Integer anio) {
		issueDate.set(GregorianCalendar.YEAR, anio);
		issueDate.set(GregorianCalendar.MONTH, mes);
		issueDate.set(GregorianCalendar.DATE, dia);
		maturityDate.set(GregorianCalendar.YEAR, issueDate.get(GregorianCalendar.YEAR)+1);
		maturityDate.set(GregorianCalendar.MONTH, issueDate.get(GregorianCalendar.MONTH));
		maturityDate.set(GregorianCalendar.DATE, issueDate.get(GregorianCalendar.DATE));
	}
	/*public void setMaturityDate(Integer dia, Integer mes, Integer anio) {
		maturityDate.set(GregorianCalendar.YEAR, anio);
		maturityDate.set(GregorianCalendar.MONTH, mes);
		maturityDate.set(GregorianCalendar.DATE, dia);
	}*/
}
