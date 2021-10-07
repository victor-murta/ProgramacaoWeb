import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Contador {
	private static int contador;
	private static Date data;
	
	public static void novoAcesso() {
		contador += 1;
	}
	

	public static int getContador() {
		return contador;
	}
	
	public static String getData() {
		DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" );
		data = new Date();
		return dataFormatada.format(data);
	}
	
	public static void main(String[] args) {
		Contador.novoAcesso();
	}
	
	
}
