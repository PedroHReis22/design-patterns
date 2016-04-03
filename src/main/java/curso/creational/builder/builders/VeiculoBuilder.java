package curso.creational.builder.builders;

import curso.creational.builder.veiculos.Veiculo;

public interface VeiculoBuilder {
	
	public void builderEstrutura();
	
	public void builderMotor();
	
	public void builderRodas();
	
	public void bulderPortas();
	
	public Veiculo getVeiculo();	

}

