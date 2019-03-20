package queue;

public class User {
	//用户属性
	private int id;
	private String name;
	private String password;
	
	// 空构造器 alt+/
	public User() {
	}

	// 参数构造器 alt+shift+s  --> o
	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	//setter 和 getter 构造器 ：alt + shift+s --> r 
	//							-->tab,enter-->shift +tab ,enter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
