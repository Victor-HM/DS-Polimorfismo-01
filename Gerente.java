
public class Gerente extends Funcionario{
	
	private double senha;
	
	public boolean autentica(double senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
		public double calculaComissao() {
			return super.getSalario() * 0.15;
	}

	public double getSenha() {
		return senha;
	}

	public void setSenha(double senha) {
		this.senha = senha;
	}
}
