package dataType;

import java.util.Arrays;

public class DataType {
	public static void main(String[] args){
		// 8种基本数据类型 byte short int long float double boolean char
		byte b =127;//byte:-128~127 1字节
		System.out.println("byte:"+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		short s=32767;//short:-32768~32767 2字节
		System.out.println("short:"+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		int i=2147483647;//int:-2147483648~2147483647 4字节
		System.out.println("int:"+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
		char c='我';//char: ~? 1字节码
		System.out.println("char:"+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		float f=0;//float:1.4E-45~3.4028235E38 8字节
		System.out.println("float:"+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		double d=0.0;//double:4.9E-324~1.7976931348623157E308 16字节
		System.out.println("double:"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
		long l=0L;//long:-9223372036854775808~9223372036854775807 8字节
		System.out.println("long:"+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		boolean flag=false;//boolean:false~true
		System.out.println("boolean:"+Boolean.FALSE+"~"+Boolean.TRUE);
		
		//引用类型 ： 数组，字符串，自定义对象都是引用类型
		String ss="hello world";
		System.out.println(String.format("this is a String:%s", ss));
		
		//数组是引用类型
		int[] intarr={1,2,3};
		System.out.println("intarr:"+Arrays.toString(intarr));
		int[] intb=intarr;
		intb[2]=0;
		System.out.println("intarr:"+Arrays.toString(intarr));
		
		Person p=new Person("xiao");
		System.out.println(p.toString());
		Person p2=new Person("haha");
		p2=p;
		p2.name="daa";
		System.out.println(p.toString());
		
		Teacher t=new Teacher("wa");
		System.out.println(t);
		t.sayHi();
	}
	
	
}
class Person{
	String name;
	
	public Person(String string) {
		super();
		this.name = string;
	}
	
	public void say(){
		System.out.println(Person.class);
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + "]";
	}
	
}

class Teacher extends Person{

	public Teacher(String string) {
		super(string);
	}
	
	public void sayHi(){
		System.out.print(Teacher.class+" is extends from ");
		super.say();
	}

}
