package action.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import model.member.dao.MemberDAO;
import model.member.dto.MemberDTO;

public class MemberAction extends ActionSupport {
	
	private String message;
	private String userid;
	private int count;
	private List<MemberDTO> items;
	private MemberDTO dto;
	private String searchkey = "name";
	private String search = "";
	
	public void setSearchkey(String searchkey) {
		this.searchkey = searchkey;
	}
	public String getSearchkey() {
		return searchkey;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getSearch() {
		return search;
	}
	public void setDto(MemberDTO dto) {
		this.dto = dto;
	}
	public MemberDTO getDto() {
		return dto;
	}
	public String getMessage() {
		return message;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
	public int getCount() {
		return count;
	}
	public List<MemberDTO> getItems() {
		return items;
	}
	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest();
		if(dto == null) {
			return INPUT; //아이디,패스워드가 입력되지않은 상태 ==>login.jsp
		}
		MemberDAO dao= new MemberDAO();
		MemberDTO m = dao.loginCheck(dto); //체크
		System.out.println(m);
		if( m == null) {//실패
			message= "로그인 정보가 정확하지 않습니다.";
			return INPUT;
		}else {//로그인 성공
			//세션 객체 생성
			HttpSession session =
					ServletActionContext.getRequest().getSession();
			//세션 변수 저장
			session.setAttribute("name", m.getName());
			session.setAttribute("userid", m.getUserid());
		}
		return SUCCESS;//main.jsp
	}
	
	public String logout() throws Exception {
		HttpSession session =
				ServletActionContext.getRequest().getSession();
		session.invalidate();//세션 정보를 초기화.
		return SUCCESS;
	}
	
	public String memberList() throws Exception {
		MemberDAO dao = new MemberDAO();
		items = dao.getMemberList(searchkey, search);
		count = items.size();
		return SUCCESS;
	}
	
	public String memberInsert() throws Exception {
		MemberDAO dao= new MemberDAO();
		dao.memberInsert(dto);
		return SUCCESS;
	}
	
	public String memberView() throws Exception {
		MemberDAO dao = new MemberDAO();
		dto = dao.getMember(userid);
		return SUCCESS;
	}
	
	public String memberUpdate() throws Exception {
		MemberDAO dao = new MemberDAO();
		dao.memberUpdate(dto);
		return SUCCESS;
	}
	
	public String memberDelete() throws Exception {
		System.out.println("delete:" + userid);
		MemberDAO dao = new MemberDAO();
		dao.memberDelete(dto.getUserid());
		return SUCCESS;
	}
	

}
