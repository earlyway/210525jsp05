package action.test;

import com.opensymphony.xwork2.ActionSupport;

public class GuguAction extends ActionSupport {
	private int dan;
	public void setDan(int dan) {
		this.dan=dan;
	}
	private String result="";
	public String getResult() {
		return result;
	}
	@Override
	public String execute() throws Exception{
		for(int i=1; i<=9; i++) {
			result += dan+"x"+i+"="+dan*i+"<br>";
		}
		return "success";
	}
}
