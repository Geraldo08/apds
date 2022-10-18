package dominio;

import java.time.LocalDateTime;
import java.time.Period;

public class empresa {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void periodoDeTraba() {

		LocalDateTime inicialDate = LocalDateTime.of(2020, 5, 4, 0, 0);
		LocalDateTime finalDate = LocalDateTime.of(2023, 10, 5, 0, 0);

		Period periodo = Period.between(inicialDate.toLocalDate(), finalDate.toLocalDate());
		int years = Math.abs(periodo.getYears());
		int months = Math.abs(periodo.getMonths());
		int days = Math.abs(periodo.getDays());
		System.out.println("Primeiro emprego ao terceiro:");
		System.out.println("Data de entrada:" + inicialDate);
		System.out.println("Data de saida:" + finalDate);
		System.out.println("Periodo Trabalhado:" + years + "ano" + months + "meses" + days + "dias");
		
		
		
	}
	
	public void peridodeTraba1() {
		
		LocalDateTime inicialDate2 = LocalDateTime.of(2019, 7, 3, 0, 0);
		LocalDateTime finalDate2 = LocalDateTime.of(2021, 11, 15, 0, 0);

		Period periodo2 = Period.between(inicialDate2.toLocalDate(), finalDate2.toLocalDate());
		int years2 = Math.abs(periodo2.getYears());
		int months2 = Math.abs(periodo2.getMonths());
		int days2 = Math.abs(periodo2.getDays());

		System.out.println("Primeiro emprego:");
		System.out.println("Data de entrada:" + inicialDate2);
		System.out.println("Data de saida:" + finalDate2);
		System.out.println("Periodo Trabalhado: " + years2 + "ano" + months2 + "meses" + days2 + "dias");
		
		
		
	}
	
	public void peridodeTraba2() {
		
		LocalDateTime inicialDate3 = LocalDateTime.of(2000, 5, 5, 0, 0);
		LocalDateTime finalDate3 = LocalDateTime.of(2015, 6, 20, 0, 0);

		Period periodo3 = Period.between(inicialDate3.toLocalDate(), finalDate3.toLocalDate());
		int years3 = Math.abs(periodo3.getYears());
		int months3 = Math.abs(periodo3.getMonths());
		int days3 = Math.abs(periodo3.getDays());

		System.out.println("Primeiro emprego ao quarto:");
		System.out.println("Data de entrada:" + inicialDate3);
		System.out.println("Data de saida:" + finalDate3);
		System.out.println("Periodo  Trabalhado: " + years3 + "ano" + months3 + "meses" + days3 + "dias");

		
		
		
	}
	
	public void peridodeTraba3() {
		
		LocalDateTime inicialDate4 = LocalDateTime.of(2002, 3, 4, 0, 0);
		LocalDateTime finalDate4 = LocalDateTime.of(2025, 2, 23, 0, 0);

		Period periodo4 = Period.between(inicialDate4.toLocalDate(), finalDate4.toLocalDate());
		int years4 = Math.abs(periodo4.getYears());
		int months4 = Math.abs(periodo4.getMonths());
		int days4 = Math.abs(periodo4.getDays());

		System.out.println("Primeiro Emprego ao quinto:");
		System.out.println("Data de entrada:" + inicialDate4);
		System.out.println("Data de saida:" + finalDate4);
		System.out.println("Periodo Trabalhado: " +years4 + "ano" + months4 + "meses" + days4 + "dias" );

		
	}
	public void peridodeTraba4() {
		
		LocalDateTime inicialDate5 = LocalDateTime.of(1995, 6, 2, 0, 0);
		LocalDateTime finalDate5 = LocalDateTime.of(2010, 5, 10, 0, 0);

		Period periodo5 = Period.between(inicialDate5.toLocalDate(), finalDate5.toLocalDate());
		int years5 = Math.abs(periodo5.getYears());
		int months5 = Math.abs(periodo5.getMonths());
		int days5 = Math.abs(periodo5.getDays());

		System.out.println("Primeiro Emprego ao setimo:");
		System.out.println("Data de entrada:" + inicialDate5);
		System.out.println("Data de saida:" + finalDate5);
		System.out.println("Periodo Trabalhado: " + years5 + "ano" + months5 + "meses" + days5 + "dias");

		

	}

}