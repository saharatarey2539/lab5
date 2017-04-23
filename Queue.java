package saharat.lab5;

public class Queue {
	private ArrayList lst;
	public Queue() {
		lst = new ArrayList();
	}

	/*Method LinkedList Queue*/
	public void enqueue(Object e) {
		lst.add(e);
	}
	
	public Object peek() {
        return lst.get(0);
    }

    public Object dequeue() {
        Object obj = peek();
        lst.remove(0);
        return obj;
    }

	public static void main(String[] arg) {
		Queue s = new Queue();
		s.enqueue("a");
		s.enqueue("b");
		s.enqueue("c");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.dequeue());
		System.out.println(s);
		
	}
	
	@Override
	public String toString() {
		return lst.toString();
	}

}

