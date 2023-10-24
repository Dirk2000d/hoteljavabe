package nl.yc2309.javahotel.dto;

public class LoginResponseDto extends ResponseDto {

	private String token;
	
	private String role;
	
	public LoginResponseDto(boolean succes) {
		super(succes);
	}
	
	public LoginResponseDto(String token, String role) {
		super(true, null);

		this.token = token;
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	
}
