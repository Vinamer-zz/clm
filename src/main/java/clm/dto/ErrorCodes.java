package clm.dto;

public enum ErrorCodes {
	SUCCESS(0001, "success"),
	FAILURE(0002, "failure"),
	
	
	//Request Validation
	INVALID_REQUEST(4000,"Invalid request parameters");
	
	private final int code;
	private final String description;

	private ErrorCodes(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getCode() {
		return code;
	}
}
