package pl.kurs.spring.service;

public class PrinterService {
	private String textToPrint;

	public void initBean() {
		System.out.println("Towrze beana z textem: " + textToPrint);
	}

	public String getTextToPrint() {
		return textToPrint;
	}

	public void setTextToPrint(String textToPrint) {
		this.textToPrint = textToPrint;
	}

	public void printText() {
		System.out.println(textToPrint);
	}

}
