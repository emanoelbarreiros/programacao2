package estacionamento;

import java.util.Random;
import java.util.Scanner;

import estacionamento.modelo.BancoDeDados;
import estacionamento.modelo.Entrada;
import estacionamento.modelo.Veiculo;

public class GUI {
	
	public static void main(String[] args) {
		BancoDeDados banco = new BancoDeDados();
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		double precoHora = 10;
		
		int opcao = 0;
		exibirBoasVindas();
		
		while(true) {
			exibirOpcoes();
			opcao = scan.nextInt();
			String placa;
			Entrada entrada;
			switch(opcao) {
				case 1 : 
					System.out.println("Entrada de veículo");
					long hora = System.currentTimeMillis();
					
					System.out.print("Informe a placa do veículo: ");
					placa = scan.next();
					
					Veiculo v = new Veiculo();
					v.setPlaca(placa);
					
					Entrada e = new Entrada();
					e.setHoraEntrada(hora);
					e.setVeiculo(v);
					
					try {
						banco.entrada(e);
						System.out.println("Veículo cadastrado com sucesso.");
					} catch(CarroJaCadastradoException exc) {
						System.out.println("Veículo já se encontra no pátio.");
					} catch(EstacionamentoLotadoException exc) {
						System.out.println("Pátio lotado. Veículo não cadastrado.");
					}
					
					break;
				case 2 :
					System.out.println("Saída de veículo");
					
					placa = scan.next();
					try {
						entrada = banco.saida(placa);
						
						int horasPassadas = rand.nextInt(10) + 1;
						
						long horaSaida = System.currentTimeMillis() + horasPassadas * 3600000;
						
						double diferencaHoras = (horaSaida - entrada.getHoraEntrada()) / 3600000;
						
						double valor = Math.ceil(diferencaHoras) * precoHora;
						
						System.out.println("Veículo removido: " + entrada.getVeiculo().getPlaca());
						System.out.println("Valor a ser pago: " + valor);
					} catch(CarroNaoCadastradoException exc) {
						System.out.println("Veículo não se encontra no pátio");
					}
					
					break;
				case 3 :
					System.out.println("Veículos cadastrados");
					Entrada[] entradas = banco.listarEntradas();
					for (Entrada ent : entradas) {
						System.out.println(ent.getVeiculo().getPlaca());
					}
					break;
			}
			
		}
	}
	
	public static void exibirBoasVindas() {
		System.out.println("################################");
		System.out.println("Estacionamento do Mané");
		System.out.println("################################");
	}
	
	public static void exibirOpcoes() {
		System.out.println("Informe uma opção:");
		System.out.println("1 - Entrada em veículo");
		System.out.println("2 - Saída em veículo");
		System.out.println("3 - Veículos no estacionamento");
	}

}
