package action.test;

public class HelloAction {
	private String message;
	//출력페이지에서 변수의 값을 읽을 수 있도록 getter를 만들어야함
	public String getMessage() {
		return message;
	}
	//액션 클래스의 default method
	public String execute() throws Exception{
		message="hello struts";
		return "success"; //result 태그에 지정된 페이지로 포워드
	}

}
