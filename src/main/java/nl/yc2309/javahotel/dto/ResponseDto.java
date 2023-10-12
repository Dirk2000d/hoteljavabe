package nl.yc2309.javahotel.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResponseDto {

	private boolean succes;
	
	private List<String> validatieMeldingen = new ArrayList<>();
	
	public ResponseDto() {
		this.succes = true;
	}

	public ResponseDto(boolean succes, String validatieMelding) {
		super();
		this.succes = succes;
		this.validatieMeldingen = Arrays.asList(validatieMelding);
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
