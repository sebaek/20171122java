package quiz;

public class MyCollection {
	private int[] array;
	public MyCollection(int[] array) {
		this.array = array;
	}
	
	public int sum() {
		int result = 0;
		
		for (int i : array) {
			result += i;
		}
		
		return result;
	}
	
	public int max() {
		int result = Integer.MIN_VALUE;
		for (int i : array) {
			result = result < i ? i : result;
		}
		return result;
	}
	public int min() {
		int result = Integer.MAX_VALUE;
		for (int i : array) {
			result = result > i ? i : result;
		}
		return result;
	}
}
