import java.util.Stack;

public class RpnCalculator {
	
	
	String accumulator = "";
	Stack pinu = new Stack();

	public int getAccumulator() {
		if(accumulator.isEmpty()){
		return 0;
		}
		return Integer.parseInt(accumulator);
	}

	public void setAccumulator(String accumulator) {
		this.accumulator = accumulator;
	}
	
	public void enter(int num){
		pinu.push(num);
	}
}
