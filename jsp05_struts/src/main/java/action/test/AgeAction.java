package action.test;

import com.opensymphony.xwork2.ActionSupport;

public class AgeAction extends ActionSupport{
	private String name;
	private int year;
	public void setName(String name) {
		this.name=name;
	}
	public void setYear(int year) {
		this.year=year;
	}
	private String result;
	public String getResult() {
		return result;
	}
	@Override
	public String execute() throws Exception{
		int age=2021-year;
		result=name+"님의 나이는 " +age+"세입니다.";
		return "success";
	}

}
