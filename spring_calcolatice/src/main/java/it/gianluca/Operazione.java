package it.gianluca;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;


@ToString
public class Operazione {

	private int risultato;
	private int val1;
	private int val2;
	private String operazione;
	
	public Operazione() {
		setValori();
		if(operazione.equals("addizione")) {
			risultato= val1+val2;
		}else if(operazione.equals("sottrazione")) {
			risultato= val1-val2;
		}else if(operazione.equals("moltiplicazione")) {
			risultato=val1*val2;
		}else if(operazione.equals("divisione")) {
			risultato=val1/val2;
		}
		//System.out.println(risultato);
	}
	
	public void setValori() {
		Scanner in = new Scanner(System.in);
		System.out.println("Dammi valore 1");
		this.val1=Integer.parseInt(in.nextLine());
		System.out.println("dammi valore 2");
		this.val2=Integer.parseInt(in.nextLine());
		System.out.println("Dammi l'operazione");
		this.operazione=in.nextLine();
	}
}
