package it.gianluca;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Calcolatrice {

	Operazione operazione;
	
	public Calcolatrice(Operazione op) {
		this.operazione=op;
	}
}
