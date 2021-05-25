package model.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import config.MybatisManager;
import model.member.dto.MemberDTO;

public class MemberDAO {
	public MemberDTO loginCheck(MemberDTO dto) {
		SqlSession session=
				MybatisManager.getInstance().openSession();
		MemberDTO m = session.selectOne("member.loginCheck", dto);
		session.close();
		return m;
	}
	
	public List<MemberDTO> getMemberList(String searchkey, String search){
	SqlSession session=
			MybatisManager.getInstance().openSession();
	List<MemberDTO> list=null;
	if(searchkey.equals("name_userid")) {
		list = session.selectList("member.memberListAll", search);
	}else {
		Map<String, Object> map = new HashMap<>();
		map.put("searchkey", searchkey);
		map.put("search", search);
		list= session.selectList("member.memberList", map);
	}	
	return list;
}
	
	public void memberInsert(MemberDTO dto) {
		SqlSession session=
				MybatisManager.getInstance().openSession();
		session.insert("member.memberInsert", dto);
		session.commit();
		session.close();
	}
	
	public int getMemberCount(String searchkey,String search) {
		SqlSession session=
				MybatisManager.getInstance().openSession();
		int count=0;
		if(searchkey.equals("name_userid")) {
			count=session.selectOne("member.memberCountAll", search);
	}else {
		Map<String, Object> map = new HashMap<>();
		map.put("searchkey", searchkey);
		map.put("search", search);
		count = session.selectOne("member.memberCount", map);
	}
		return count;
	}
		
		public MemberDTO getMember(String userid) {
			SqlSession session=
					MybatisManager.getInstance().openSession();
			return session.selectOne("member.memberDetail", userid);
		}
		
		public void memberUpdate(MemberDTO dto) {
			SqlSession session =
					MybatisManager.getInstance().openSession();
			session.update("member.memberUpdate",dto);
			session.commit();
			session.close();
		}
		
		public void memberDelete(String userid) {
			SqlSession session=
					MybatisManager.getInstance().openSession();
			session.delete("member.memberDelete", userid);
			session.commit();
			session.close();
		}
		
		public void memberJoin(MemberDTO dto) {
			SqlSession session=
					MybatisManager.getInstance().openSession();
			session.insert("memberJoin", dto);
			session.commit();
			session.close();
		}
		
		public boolean useridCheck(String userid) {
			SqlSession session=
					MybatisManager.getInstance().openSession();
			int count=session.selectOne("useridCheck",userid);
			if(count == 0) {
				return true;
			}else {
				return false;
			}
		}

	}
