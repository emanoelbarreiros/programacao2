package estacionamento.modelo;

import estacionamento.CarroJaCadastradoException;
import estacionamento.CarroNaoCadastradoException;
import estacionamento.EstacionamentoLotadoException;

public class BancoDeDados {
	
	private Entrada[] entradas;
	private int carrosCadastrados;
	
	public BancoDeDados() {
		entradas = new Entrada[3];
		carrosCadastrados = 0;
	}
	
	public void entrada(Entrada e) throws CarroJaCadastradoException, EstacionamentoLotadoException {
		
		if (carrosCadastrados < entradas.length) {
			Entrada entrada = buscar(e.getVeiculo().getPlaca());
			
			if (entrada == null) {
				for (int i = 0; i < entradas.length; i++) {
					if (entradas[i] == null) {
						entradas[i] = e;
						carrosCadastrados++;
						break;
					}
				}
			} else {
				throw new CarroJaCadastradoException();
			}
		} else {
			throw new EstacionamentoLotadoException();
		}
		
	}
	
	public Entrada saida(String placa) throws CarroNaoCadastradoException {
		Entrada entradaEncontrada = null;
		for (int i = 0; i < entradas.length; i++) {
			if (entradas[i] != null
					&& entradas[i].getVeiculo().getPlaca().equals(placa)) {
				entradaEncontrada = entradas[i];
				entradas[i] = null;
				carrosCadastrados--;
				break;
			}
		}
		
		if (entradaEncontrada == null) {
			throw new CarroNaoCadastradoException();
		}
		
		return entradaEncontrada;
	}
	
	public Entrada[] listarEntradas() {
		Entrada[] retorno = new Entrada[carrosCadastrados];
		int contador = 0;
		
		for (int i = 0; i < entradas.length; i++) {
			if (entradas[i] != null) {
				retorno[contador] = entradas[i];
				contador++;
			}
		}
		
		return retorno;
	}
	
	public Entrada buscar(String placa) {
		for (int i = 0; i < entradas.length; i++) {
			if (entradas[i] != null && entradas[i].getVeiculo().getPlaca().endsWith(placa)) {
				return entradas[i];
			}
		}
		
		return null;
	}

}
