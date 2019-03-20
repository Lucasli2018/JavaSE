package javaPractise;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SayHello h=new SayHello();
	}

}

class SayHello{
	public SayHello(){
		System.out.println("say hello");
	}
}