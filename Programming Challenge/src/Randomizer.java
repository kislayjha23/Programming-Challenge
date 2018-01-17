
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Randomizer {

	private BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
	private BlockingQueue<Result> result = new ArrayBlockingQueue<>(10);

	public void randomizer() throws InterruptedException {
		Random random = new Random();
		while (true) {
			Thread.sleep(400);
			int randomNum = random.nextInt(100);
			queue.put(randomNum);
			System.out.println("Added Random Number: "+randomNum);
			Result res = result.take();
			System.out.println("Reply is: "+res);
		}
	}

	public void prime() throws InterruptedException {

		while (true) {
			Thread.sleep(500);
			Integer value = queue.take(); // if queue is empty waits
			Result res = new Result(value, isPrime(value));
			result.put(res);
			//System.out.println("Taken value: " + value + "; Queue size is: " + queue.size());
		}

	}

	public static boolean isPrime(int n) {
	    if(n > 2 && (n & 1) == 0)
	       return false;
	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) 
	            return false;
	    return true;
	}
	
	public static void main(String[] args) throws InterruptedException {

		final Randomizer rand = new Randomizer();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					rand.randomizer();
				} catch (InterruptedException ignored) {
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					rand.prime();
				} catch (InterruptedException ignored) {
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		// Pause for 30 seconds and force quitting the app (because we're looping infinitely)
		Thread.sleep(30*1000);
		System.exit(0);

	}

}

class Result {

	private Integer originalNumber;
	private boolean result;

	
	public Result(Integer originalNumber, boolean result) {
		this.originalNumber = originalNumber;
		this.result = result;
	}

	public Integer getOriginalNumber() {
		return originalNumber;
	}

	public void setOriginalNumber(Integer originalNumber) {
		this.originalNumber = originalNumber;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Result [originalNumber=" + originalNumber + ", isPrimeNumber=" + result + "]";
	}

}
