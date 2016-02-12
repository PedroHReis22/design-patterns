package curso.builder;

import curso.builder.veiculos.Carro;
import curso.builder.veiculos.Veiculo;

public class CarroBuilder implements VeiculoBuilder {
	
	@Override
	public void builderEstrutura() {
		//estrutura carro
	}

	@Override
	public void builderMotor() {
		//carror carro
	}

	@Override
	public void builderRodas() {
		//rodas carro
	}

	@Override
	public void bulderPortas() {
		//portas carro
	}

	@Override
	public Veiculo getVeiculo() {
		return new Carro();
	}

}
