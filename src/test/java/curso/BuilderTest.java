package curso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.builder.CarroBuilder;
import curso.builder.GeradorVeiculos;
import curso.builder.MotoBuilder;
import curso.builder.VeiculoBuilder;
import curso.builder.veiculos.Carro;
import curso.builder.veiculos.Moto;
import curso.builder.veiculos.Veiculo;

public class BuilderTest {
	
	@Test
	public void testingMotoBuilder() {
		
		VeiculoBuilder veiculoBuilder = new MotoBuilder();
		
		Veiculo veiculo = new GeradorVeiculos(veiculoBuilder).gerarVeiculo();
		
		assertEquals(Moto.class, veiculo.getClass());
		
	}
	
	@Test
	public void testingCarroBuilder() {
		
		VeiculoBuilder veiculoBuilder = new CarroBuilder();
		
		Veiculo veiculo = new GeradorVeiculos(veiculoBuilder).gerarVeiculo();
		
		assertEquals(Carro.class, veiculo.getClass());
		
	}

}
