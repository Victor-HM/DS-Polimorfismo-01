
public class mainFuncionario {

	public static void main(String[] args) {
		Funcionario doni = new Funcionario();
		doni.setCpf("80349329");
		doni.setNome("Donadoni");
		doni.setSalario(3100);
		System.out.println("Bonificação do funcionario: " + doni.calculaComissao());
		
		Funcionario Pedro = new Gerente();
		
		Pedro.setCpf("8549519");
		Pedro.setNome("Pedro");
		Pedro.setSalario(3100);
		
		System.out.println("Bonificação do Gerente: " + Pedro.calculaComissao());
		
		Coordenadora thayani = new Coordenadora();
		
		thayani.setCpf("8468145");
		thayani.setNome("Thayani");
		thayani.setSalario(9100);
		System.out.println("Bonificação da coordenadora: " + thayani.calculaComissao());
		
		ControleBonificacao control = new ControleBonificacao();
		
		control.CalculaBonificacao(doni);
		control.CalculaBonificacao(Pedro);
		control.CalculaBonificacao(thayani);
		
		System.out.println("Gastos com comigo: " + control.getSoma());
	}

}
