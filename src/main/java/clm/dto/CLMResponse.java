package clm.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CLMResponse {
	private Boolean success;
	private Integer errorCode;
	private String message;	
	
	public CLMResponse(Boolean success, Integer errorCode, String message) {
		super();
		this.success = success;
		this.errorCode = errorCode;
		this.message = message;
	}
	
}
