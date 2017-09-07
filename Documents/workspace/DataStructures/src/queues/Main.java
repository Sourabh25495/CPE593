package queues;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intq q =new Intq();
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(6);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	
	}

}
