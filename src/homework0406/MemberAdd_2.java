package homework0406;

public class MemberAdd_2 extends Member_2{
	private String job;
	
	public MemberAdd_2(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}
	String getJob() {
		return job;
	}
	void setJob(String job) {
		this.job = job;
	}

	@Override
	public void infor() {
		System.out.println("**  회원 정보 **");
		System.out.println("성명 : "+getName()+", 나이 : "+getAge());
		System.out.println("직업 : "+job);
	}
}
