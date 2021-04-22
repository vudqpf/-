package homework0406;

public class MemberAdd extends Member{
	private String job;

	
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
