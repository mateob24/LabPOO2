import javax.swing.JOptionPane;

public class Flecha {
	
	//DECLARAMOS LOS ATRIBUTOS QUE TENDRÁ LA CLASE 'FLECHA'
	int longitud;
	String color;
	
	//MÉTODO CONSTRUCTOR POR DEFECTO (SIN PARÁMETROS)
	public Flecha() {
		longitud=18;
		color="negro";
	}
	
	//MÉTODO CONSTRUCTOR EXPLÍCITO (CON PARÁMETROS)
	public Flecha(int longitud, String color) {
		//this.longitud hace referencia al atributo declarado globalmente
		this.longitud=longitud;
		this.color=color;
	}
	
	//MÉTODO PARA QUE EL USUARIO INGRESE LA LONGITUD DE LA FLECHA
	public void ingresarLongitud() {
		longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la flecha"));
	}
	
	//MÉTODO QUE PERMITE HACER UN SALTO DE LÍNEA
	public void imprimirEspacio() {
		System.out.println();
	}
	
	//MÉTODO QUE PERMITE ARMAR LA FLECHA CON SU LONGITUD CORRESPONDIENTE
	public void construirFlecha() {
		for (int i = 0; i < longitud; i++) {
			//se hace el cuerpo de la flecha
			imprime("-");
		}
		//se hace la punta de la flecha
		imprime(">");
	}
	
	//MÉTODO QUE PERMITE QUE SE IMPRIMAN LOS SÍMBOLOS QUE COMPONEN LA FLECHA DE OTRO COLOR
	private void imprime(String simbolo) {
		if (color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.err.print(simbolo);
		}
	}
	
}
