package nameRules;

/**
 * �����淶 
 * @author Administrator
 *	
 */
public class NameRule {

	public static void main(String[] args) {
		Person p=new Person();
		p.sayHello();		
	}
}

// ��������ĸ��д
class Person{
	
	// ������ȫ��д
	public int WORKHOURS=8;
	
	// ��������ĸСд
	private String name;
	
	// ����������ĸСд
	public void sayHello(){
		
		// ��������ĸСд
		String text="this is a text";
		
		// �����ݼ� : ����syso,��alt+/ ������ʾ��  ��enter
		System.out.println("say hello");
		
		System.out.println(text);
	}
	
}