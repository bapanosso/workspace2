package br.com.excecao.teste;

import java.sql.DriverManager;

public class TesteExcecao {

	public static void main(String[] args) {
		
		
		try{
			//DriverManager.getConnection("urldobanco", "user", "senha");

			int num = Integer.parseInt("7");
			System.out.println("Vari�vel " + num);	
			
			String p="";
			
			if(p.length()==0) {
				throw new RuntimeException("Derrubei a aplica��o");
			}
			System.out.println("Quantidade de letras: " + p.length());
			
		}catch (NumberFormatException e) {
			System.out.println("Objeto nulo encontrado");	
			e.printStackTrace();
			
		}catch (NullPointerException e) {
			System.out.println("Objeto nulo encontrado");	
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println("Deu ruim");	
			e.printStackTrace();
		}finally { // executado independentemente da exce��o 
			System.out.println("At� logo!");
			// costuma realizar encerramento da conexao com o db
		}
		
	}

}
