package practice;
import java.util.*;


public class QueueImplementationWithStack<T> {

	public Stack<T> inStack;
	public Stack<T> outStack;
	
	public QueueImplementationWithStack() {
		inStack=new Stack<>();
		outStack=new Stack<>();
	}
	
	public void enque(T value)
	{
		inStack.push(value);
	}
	
	public T deque()
	{
		if(outStack.empty())
		{
			while(!inStack.empty())
			{
				outStack.push(inStack.pop());
			}
		}
		
		if(outStack.empty())
		{
			System.out.println("Queue is empty");
		}
		
		return outStack.pop();
	}
	
	public T peek()
	{
		if(outStack.empty())
		{
			while(!inStack.empty())
			{
				outStack.push(inStack.pop());
			}
		}
		
		if(outStack.empty())
		{
			System.out.println("Queue is empty");
		}
		
		return outStack.peek();
	}
	
	public boolean isEmpty()
	{
		if(inStack.empty() && outStack.empty())
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementationWithStack<Integer> queue=new QueueImplementationWithStack<>();
		queue.enque(3);
		queue.enque(19);
		System.out.println(queue.peek());
		queue.deque();
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
	}

}
