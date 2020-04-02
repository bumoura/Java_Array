package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "     Alura     ";
		String outroVazio = vazio.trim();
		
		System.out.println(outroVazio);
		System.out.println(vazio.contains("Alu"));

		String nome = "Alura";//object literal 
		//String outro = new String("Alura");
		
		System.out.println(nome.length());
		
		for(int i =0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
		
		//char c = nome.charAt(0);
		//System.out.println(c);
		
		//char c = 'A';
		//char d = 'a';
		
		//String outra = nome.replace(c,d);
		
		//String outra = nome.replace("A", "a");
		
		//System.out.println(nome);
	}

}
