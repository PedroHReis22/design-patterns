package curso.builder;

import curso.builder.veiculos.Veiculo;

public interface VeiculoBuilder {
	
	public void builderEstrutura();
	
	public void builderMotor();
	
	public void builderRodas();
	
	public void bulderPortas();
	
	public Veiculo getVeiculo();	

}

