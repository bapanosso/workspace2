import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente  c = new Cliente();
		
		c.setId(1);
		c.setNome("TESTE");
		c.setEmail("ba@gmail.com.br");
				
		Endereco end = new Endereco();
		
		c.setEnd(end);
		
		end.setLogradouro("Avenida General Osório");
		end.setBairro("Centro");
		end.setCidade("Jaboticabal");
		end.setUf("SP");
		end.setCep("14.870-100");
		end.setNumero("1033");
		end.setComplemento("");
	}

}
