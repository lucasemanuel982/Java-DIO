package Primeiro.Dio;

import javax.swing.JOptionPane;

import Segundo.Dio.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		Gato gato = new Gato ();
		Livros livros =  new Livros();
		
		System.out.println(gato);
		System.out.println(livros);  //irá aparecer o nome do pacote, pois não foi implementado o to String
		
		
		
	}
		
		/*String primeiro =JOptionPane.showInputDialog("Informe o primeiro número: ");
		int a = Integer.parseInt(primeiro);
		
		String segundo = JOptionPane.showInputDialog("Informe o segundo número: ");
		
		int b = Integer.parseInt(segundo);
				
				
		System.out.println("Hello Word!" + (a+b));
		JOptionPane.showMessageDialog(null, "Hello Word! " + (a+b));
	}*/

}

class livros {
	private String nome;
	private String tipo; 
}
