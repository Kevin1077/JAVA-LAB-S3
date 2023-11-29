package jaVa;

class MultiplicationTable{
	synchronized void printMultiplicationTable(int number) {
		
			for(int i=1;i<=10;i++) {
				System.out.println(i+"x"+number+"="+i*number);
			
		}
	}
}
class MyThread1 extends Thread{
	MultiplicationTable t;
	MyThread1(MultiplicationTable t){
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(5);
	}
	
}
class MyThread2 extends Thread{
	MultiplicationTable t;
	MyThread2(MultiplicationTable t){
		this.t=t;
	}
	public void run() {
	
		System.out.println(Thread.currentThread().getPriority());
		t.printMultiplicationTable(7);
	}
}
public class Threaddemo {
	public static void main(String[] args) {
		MultiplicationTable m=new MultiplicationTable();
		MyThread1 t=new MyThread1(m);
		
		MyThread2 t2=new MyThread2(m);
		t2.setPriority(2);
		t.setPriority(6);
		t.start();
		t2.start();
		 
	}

}
