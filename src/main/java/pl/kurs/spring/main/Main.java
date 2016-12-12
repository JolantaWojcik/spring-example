package pl.kurs.spring.main;

import java.rmi.server.Operation;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.PrintService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.kurs.spring.anotacje.BlockIfNegative;
import pl.kurs.spring.service.Operator;
import pl.kurs.spring.service.OperatorSolver;
import pl.kurs.spring.service.PrinterService;

public class Main {
	
//	public void metoda(){
//		to sa pierwsze zajecia z "nowej puli"
//	}
	//private String imie="ala";
	public static void main(String[] args) {
		//System.out.println(imie);
//		Main m = new Main();
//		m.metoda();

//		System.out.println("==== po zbudowaniu kontekstu ===");
//		PrinterService hello1 = context.getBean("helloPrinter", PrinterService.class);
//		PrinterService hello2 = context.getBean("helloPrinter", PrinterService.class);
//		PrinterService goodbye = context.getBean("goodbyePrinter", PrinterService.class);
//
//		hello1.printText();
//		// ....
//		goodbye.printText();
//
//		System.out.println("hello1==hello2: " + (hello1 == hello2));
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("D-MM-YYYY, HH:MM:SS");
		Date currentDate = new Date();
		System.out.println("Data: " + dateFormatter.format(currentDate));
		//		?
		//		 * Argumenty: ...............
		//		 * Nazwa Beana: .............
		System.out.println(context.getBeanNamesForAnnotation(BlockIfNegative.class).toString());
		System.out.println(context.getBeanNamesForType(Operation.class).toString());
		//		 * Nazwa metody: ............
		//?
		System.out.println(context.getDisplayName());

		OperatorSolver solver = context.getBean(OperatorSolver.class);
		System.out.println(solver.calculate("8 / -2"));
		
		Operator addition = context.getBean("addition", Operator.class);
		System.out.println(addition.getClass());

		Operator division = context.getBean("division", Operator.class);
		System.out.println(division.calculate(1, -1));
		
		//proxy? vs decorator?
		
		// request <-> proxy <-> servera
		
		//Dodaj dwa operator: ^ (potega), / (dzielenie)
		//do 23.11 opłacone bedzie :)
		//Stworz interfejs CitiesRaport ktory posiada metode List<String> cities(), String country()
		//Stworz klase np: PolandCitiest implements CitiesRaport i zwraca ona liste miast dla danego kraju
		//stworz kilka innych krajow FranceCities, GermanyCities itp itd... ktore implementuja interfejs 
		//citiesRaport
		//Stworz beana CitiesPrinter ktory inicjalizuje mapę gdzie kluczem jest nazwa kraju a wartością 
		//lista państw dla danego kraju
		//i dostarcza metody printCities(String coutry) ktora dla danego kraju wypisze wszystkie 
		//miasta jakie posiada.
		
		
		/*
		 * Napisz aspekt ktory bedzie sie wykkonywal przed uzyciem dowolnej metody z pakietu pl.kurs.spring.service
		 * metoda moze miec argumenty ale moze tez ich nie miec.
		 * 
		 * ???????????????????????????????????????????????????????????????????????????????????
		 * Plik ma byc dostepny w formie DOPISYWANIA i format logowania danych wyglada nastepujaco:
		 * Data: DD-MM-RRRR, GG:mm:ss
		 * Argumenty: ...............
		 * Nazwa Beana: .............
		 * Nazwa metody: ............
		 * 
		 * napisz aspekt ktory zablokuje działnie metod calculate z interfejsu Operator z pakietu 
		 * pl.kurs.spring.service
		 * jesli jedna z liczb jest ujemna, informacje o zablokowanej metodzie wypisz na ekranie
		 * 
		 * Google: rodzaje advice w spring-aop @Around (pozwala zablokowac uzycie metody)
		 * @Before @After @AfterThrowing...
		 * 
		 * Google: pointcuts example spring: 
		 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html
		 * 
		 */
	}
}
