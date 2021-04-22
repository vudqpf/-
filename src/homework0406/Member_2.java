package homework0406;

public class Member_2 {
	private String name;
	private int age;

	public Member_2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void infor() {
		System.out.println("**  회원 정보 **");
		System.out.println("성명 : "+name+", 나이 : "+age);
	}
}
