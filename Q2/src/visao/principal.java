package visao;

import java.util.Scanner;

import dominio.empresa;

public class principal {

	public static void main(String[] args) {
		Scanner line = new Scanner(System.in);
		
		empresa e = new empresa();
		empresa c = new empresa();
		empresa d = new empresa();
		empresa f = new empresa();
		empresa g = new empresa();
		
		System.out.println("Qual o Nome da primeira pessoa:");
		e.setNome(line.next());
		System.out.println("nome:" + e.getNome());
		System.out.println("Ele(a)Trabalhou em 3 empresas");
		e.periodoDeTraba();
		
		System.out.println("Qual é o Nome da segunda pessoa:");
		c.setNome(line.next());
		System.out.println("nome:" + c.getNome());
		System.out.println("Ele(a)Trabalhou em 1 empresa");
		c.peridodeTraba1();
		
		System.out.println("Qual é o nome da terceira pessoa:");
		d.setNome(line.next());
		System.out.println("nome:" + d.getNome());
		System.out.println("ele(a) trabalhou em 4 empresas:");
		d.peridodeTraba2();
		
		System.out.println("Qual é o nome da quarta pessoa:");
		f.setNome(line.next());
		System.out.println("nome:" + f.getNome());
		System.out.println("ele(a) trabalhou em 5 empresas:");
		f.peridodeTraba3();
		
		System.out.println("Qual é o nome da quinta pessoa:");
		g.setNome(line.next());
		System.out.println("nome:" + g.getNome());
		System.out.println("ele(a) trabalhou em 7 empresas:");
		g.peridodeTraba4();
	}

}