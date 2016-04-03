package curso.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import curso.creational.builder.builders.CarroBuilder;
import curso.creational.builder.builders.GeradorVeiculos;
import curso.creational.builder.builders.MotoBuilder;
import curso.creational.builder.builders.VeiculoBuilder;
import curso.creational.builder.veiculos.Carro;
import curso.creational.builder.veiculos.Moto;
import curso.creational.builder.veiculos.Veiculo;

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
