package action.test;

import com.opensymphony.xwork2.ActionSupport;

import model.test.dto.PointDTO;

public class PointAction extends ActionSupport {
	private PointDTO dto;
	public PointDTO getDto() {
		return dto;
	}
	public void setDto(PointDTO dto) {
		this.dto= dto;
	}
	@Override
	public String execute() throws Exception{
		dto.setTot(dto.getKor() + dto.getEng() + dto.getMat() );
		dto.setAvg( dto.getTot() / 3.0);
		return "success";
	}
}
