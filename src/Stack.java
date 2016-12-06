

import java.util.ArrayList;

public class Stack {
	// private Integer[] elements = new Integer[100];
	private ArrayList<Integer> elements = new ArrayList<Integer>();
	private int stacksize = 0;
	//TESTING PUSH


	public Stack() {

	}

	public int getSize() {
		return stacksize;
	}

	public void push(Integer i) {
		elements.add(i);
		stacksize++;
	}

	public Integer pop() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		int lastElemente = getLastElement();
		elements.remove(elements.size()-1);
		stacksize--;
		return lastElemente;
	}

	public Integer peek() {
		if (stacksize < 1) {
			throw new IllegalStateException();
		}
		return elements.get(elements.size()-1);
	}
	
	public Integer getLastElement(){
		return  elements.get(elements.size()-1);
	}

	@Override
	public String toString() {
		return "Stack [" + (elements != null ? "elements=" + elements + ", " : "") + "stacksize=" + stacksize + "]";
	}

}
