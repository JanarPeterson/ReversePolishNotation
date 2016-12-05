import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.*;
public class RpnCalculatorTests {

	RpnCalculator calc = new RpnCalculator();

	@Test 
	public void accumulatorIsEmpty(){
		
		assertThat(calc.getAccumulator(), is(0));
	}
}
