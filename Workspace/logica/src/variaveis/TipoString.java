package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "barbaraP@Gmail.com.BR";
		
		System.out.println("Original: " + email);
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Quantidade de caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do caracter: " + email.indexOf("@"));
		System.out.println("Do 2� at� o 5� caracter: " + email.substring(1,4));
		System.out.println("A partir do 3� caracter: " + email.substring(2, email.length()));
		System.out.println("Do 2� at� o 5� caracter: " + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@"), email.indexOf(".")));


	}

}
