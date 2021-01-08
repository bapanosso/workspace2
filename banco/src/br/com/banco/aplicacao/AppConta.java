package br.com.banco.aplicacao;

import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Gerente;
import br.com.banco.modelo.Endereco;
import br.com.banco.modelo.Agencia;
import br.com.banco.utils.Magica;

public class AppConta {

	public static void main(String[] args) {

		Conta conta = new Conta(
				Magica.i("Digite o número da conta"),
				Magica.f("Digite o saldo"),
				new Cliente(
						Magica.i("Código do Cliente"),
						Magica.s("Nome do Cliente"),
						Magica.s("Email"),
						new Endereco(
								Magica.s("Logradouro Cliente"),
								Magica.s("Bairro Cliente"),
								Magica.s("Cidade Cliente"),
								Magica.s("UF Cliente"),
								Magica.s("CEP Cliente"),
								Magica.s("Numero Cliente"),
								Magica.s("Complemento Cliente")
								)
						),
				new Agencia(
						Magica.s("Nome da Agencia"),
						Magica.i("Número Agencia"),
						new Endereco(
								Magica.s("Logradouro Agencia"),
								Magica.s("Bairro Agencia"),
								Magica.s("Cidade Agencia"),
								Magica.s("UF Agencia"),
								Magica.s("CEP Agencia"),
								Magica.s("Numero Agencia"),
								Magica.s("Complemento Agencia")
								),
						Magica.s("Telefone"),
						Magica.i("Código da Agencia")
						),
				new Gerente(
						Magica.s("Nome do Gerente"),
						Magica.s("Telefone"),
						Magica.s("Email"),
						Magica.i("Funcional")
						)
				);
		
		System.out.println(conta.toString());
		
		/*System.out.println(c.getSaldo());
		System.out.println(c.getCli().getNome());
		System.out.println(c.getCli().getEnd().getCidade());
		System.out.println(c.getGer().getNome());
		System.out.println(c.getAg());
		 */
	}

}
