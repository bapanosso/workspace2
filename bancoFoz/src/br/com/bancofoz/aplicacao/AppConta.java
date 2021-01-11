package br.com.bancofoz.aplicacao;

import javax.swing.JOptionPane;

import br.com.bancofoz.modelo.Cliente;
import br.com.bancofoz.modelo.Conta;
import br.com.bancofoz.modelo.Corrente;
import br.com.bancofoz.modelo.Poupanca;
import br.com.bancofoz.utils.Magica;

public class AppConta {

	public static void main(String[] args) {

		Conta conta = null;
		
		char resp = JOptionPane.showInputDialog("Digite <1> para Conta Corrente ").charAt(0);
		if (resp==1) {
			conta = new Corrente(
					(short) Magica.i("Número"),
					(byte) Magica.i("Dígito"),
					(short) Magica.i("Agência"),
					0,
					new Cliente(
							Magica.i("Código do cliente"),
							Magica.s("Nome do cliente"),
							Magica.s("CPF"),
							Magica.s("Telefone")
							),
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
			}else {
				conta = new Poupanca(
						(short) Magica.i("Número"),
						(byte) Magica.i("Dígito"),
						(short) Magica.i("Agência"),
						0,
						new Cliente(
								Magica.i("Código do cliente"),
								Magica.s("Nome do cliente"),
								Magica.s("CPF"),
								Magica.s("Telefone")
								),
						Magica.f("Rendimento")
						);
			}
		System.out.println(conta.depositar(Magica.f("Valor depositado")));
		System.out.println(conta.toString());
		System.out.println(conta.sacar(Magica.f("Sacar")));
		System.out.println(conta.verificarSaldo());
		
	}

}
