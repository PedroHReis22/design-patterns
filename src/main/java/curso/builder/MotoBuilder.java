package curso.builder;

import curso.builder.veiculos.Moto;
import curso.builder.veiculos.Veiculo;

public class MotoBuilder implements VeiculoBuilder {

	@Override
	public void builderEstrutura() {
		//estrutura moto
	}

	@Override
	public void builderMotor() {
		//motor moto
	}

	@Override
	public void builderRodas() {
		//rodas moto
	}

	@Override
	public void bulderPortas() {
		//portas moto
	}

	@Override
	public Veiculo getVeiculo() {
		return new Moto();
	}

}
