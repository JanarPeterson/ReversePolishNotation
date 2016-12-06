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

		calc.setAccumulator("4");

		assertThat(calc.getAccumulator(), is(4));
	}
	
	@Test
	public void calculatesSum(){
		calc.setAccumulator("12+");
	}
}
