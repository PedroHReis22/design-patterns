package curso.builder.builders;

import curso.builder.veiculos.Veiculo;

public class GeradorVeiculos {
	
	private VeiculoBuilder veiculoBuilder;
	
	public GeradorVeiculos(VeiculoBuilder veiculoBuilder) {
		this.veiculoBuilder = veiculoBuilder;
	}
	
	public Veiculo gerarVeiculo() {
		
		veiculoBuilder.builderEstrutura();
		veiculoBuilder.builderMotor();
		veiculoBuilder.builderRodas();
		veiculoBuilder.bulderPortas();
		
		return veiculoBuilder.getVeiculo();
		
	}
	
}
