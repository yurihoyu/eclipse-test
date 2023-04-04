package practice;

public class Counter {



	private long count = 0;

	public synchronized void add(long i) {
		System.out.println("足し算します threadName = " + Thread.currentThread().getName());
		count += i;
	}



	public synchronized void mul(long i) {
		long c = count;
		System.out.println("かけ算をします threadName = " + Thread.currentThread().getName());
		count *= i;
	}

}
