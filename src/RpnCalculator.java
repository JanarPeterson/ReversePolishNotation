
public class RpnCalculator {
	
	static RpnCalculator rpn = new RpnCalculator();
	
public static void main(String[] args) {
	System.out.println(rpn.calculate("1 2 +"));
}
	public RpnCalculator() {

	}

	int accumulator = 0;
	Stack pinu = new Stack();

	public int getAccumulator() {
		return accumulator;
	}

	public void setAccumulator(int accumulator) {
		this.accumulator = accumulator;
	}
	
	public int multiply(){
		return pinu.pop() * pinu.pop();
	}

	public void enter(int num) {
		pinu.push(num);
	}

	public int plus() {
		return pinu.pop() + pinu.pop();
	}

	public int calculate(String str){
	
		String[] parts = str.split(" ");

		
		
		for (int i = 0; i  < parts.length; i++) {

			if(isNumeric(parts[i])){
				enter(Integer.parseInt(parts[i]));

			}
			else{
			switch (parts[i]) {
			case "+":	
				enter(plus());
				break;
			case "*":
				enter(multiply());
				break;
			case "-":
				enter(minus());
			default:
				break;
			}
		}
			}
		
		return pinu.pop();
	}

	private int minus() {
		// TODO Auto-generated method stub
		int i = pinu.pop();
		int j = pinu.pop();
		return j-i;
	}
	private boolean isNumeric(Object object) {
		// TODO Auto-generated method stub
		return object.toString().matches("-?\\d+(\\.\\d+)?");
	}
}
