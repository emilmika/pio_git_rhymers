package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	final int callCheckValue = -1;
	final int isFullValue = 11;

	private int[] numbers = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

		public boolean callCheck() {
			return total == callCheckValue;
		}
		
			public boolean isFull() {
				return total == isFullValue;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return -1;
					return getNumbers()[total];
				}
			
					public int countOut() {
						if (callCheck())
							return -1;
						return getNumbers()[total--];
					}

	public int[] getNumbers() {
		return numbers;
	}
}
