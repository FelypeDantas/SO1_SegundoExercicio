package controller;

public class OpController {

	public OpController() {
		super();
	}
	
	public void concatenaString() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 1000; i++) {
			cadeia = cadeia + 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String ==> " + tempoTotal + "s.");
	}
	
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 1000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer ==> " + tempoTotal + "s.");
	}
	
	public void divideFrase(String frase) {
		String[] vetFrase = frase.split(";");
		
		for(String palavra: vetFrase) {
			System.out.println(palavra);
		}
	}
}
