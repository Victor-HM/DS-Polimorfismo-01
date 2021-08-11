
public class ControleBonificacao {
	private double soma;
	
	public void CalculaBonificacao(Funcionario f) {
		this.soma = f.calculaComissao() + this.soma;
	}
	
	public double getSoma() {
		return this.soma;
	}
}
