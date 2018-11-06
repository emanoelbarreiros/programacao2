package estacionamento.modelo;

public class Entrada {
	
	private long horaEntrada;
	private long horaSaida;
	private Veiculo veiculo;
	
	public long getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(long horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public long getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(long horaSaida) {
		this.horaSaida = horaSaida;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
