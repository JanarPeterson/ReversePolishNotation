import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RpnCalculatorTests {

	RpnCalculator calc = new RpnCalculator();

	@Test
	public void accumulatorIsEmpty() {

		assertThat(calc.getAccumulator(), is(0));
	}

	@Test
	public void abilityToSetAccumulator() {

		calc.setAccumulator(4);

		assertThat(calc.getAccumulator(), is(4));
	}
	
	@Test
	public void calculatesSum(){
		assertThat(calc.calculate("1 2 +"), is(3));
	}
	
	@Test
	public void calculatesMultiply(){
		assertThat(calc.calculate("1 2 + 4 *"), is(12));
	}
	
	@Test
	public void calculatesMultiplyAndSum(){
		assertThat(calc.calculate("4 3 + 2 1 + *"), is(21));
	}
	
	@Test
	public void calculatesMinus(){
		assertThat(calc.calculate("1 2 + 4 -"), is(-1));
	}
}
