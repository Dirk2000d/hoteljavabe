package nl.yc2309.javahotel.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseDto {

	protected boolean succes;
	
	protected List<String> validatieMeldingen = new ArrayList<>();
	
	public ResponseDto() {
		this.succes = true;
	}

	public ResponseDto(boolean succes) {
		this.succes = succes;
	}

	public ResponseDto(boolean succes, List<String> validatieMeldingen) {
		super();
		this.succes = succes;
		this.validatieMeldingen = validatieMeldingen;
	}

	public boolean isSucces() {
		return succes;
	}

	public void setSucces(boolean succes) {
		this.succes = succes;
	}

	public List<String> getValidatieMeldingen() {
		return validatieMeldingen;
	}

	public void setValidatieMeldingen(List<String> validatieMeldingen) {
		this.validatieMeldingen = validatieMeldingen;
	}
	
}
