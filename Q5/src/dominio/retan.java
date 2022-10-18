package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class retan {

	private int X1;
	private int Y1;
	private int X2;
	private int Y2;
	private int Cx1;
	private int Cy1;
	private int Cx2;
	private int Cy2;


	
	
public void ler() {
		
		String path = "C:\\Users\\geral\\OneDrive\\Documentos\\APDS\\test1.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while ((line = br.readLine()) != null) {

				String[] ler = line.split(" ");

				X1 = Integer.parseInt(ler[0]);
				Y1 = Integer.parseInt(ler[1]);
				X2 = Integer.parseInt(ler[2]);
				Y2 = Integer.parseInt(ler[3]);

				line = br.readLine();
				String[] ler2 = line.split(" ");
				Cx1 = Integer.parseInt(ler2[0]);
				Cy1 = Integer.parseInt(ler2[1]);
				Cx2 = Integer.parseInt(ler2[2]);
				Cy2 = Integer.parseInt(ler2[3]);

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	

}
	
	
 public void TestarColisao() {
		if (X2 < Cx1 || Cx2 < X1 || Y2 < Cy1 || Cy2 < Y1 || X1 > Cx2 || Cx1 > X2 || Y1 > Cy2 || Cy1 > Y2) {
			System.out.println("0");

		} else {
			System.out.println("1");
		}

		

	}
	

}