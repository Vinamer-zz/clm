package clm.dto;

public enum ApplicationExitStatus {

	PERSONAL_DEMOGRAPHICS(0, "Application exited at Personal Demographics Screen."), 
	INCOME_DETAILS(1, "Application exited at Income Details Screen."),
	APPLICATION_REVIEW(2, "Applciation exited at Application Review Screen"),
	DIP_SCREEN(3, "Application exited at DIP Screen"),
	BALANCE_TRANSFER(4, "Application exited at Balance Transfer Screen"),
	SUPPLEMENTARY_CARD(5, "Application exited at Supplementary Card Screen"),
	DOCUMENT_UPLOAD(6, "Application exited at Document Upload Screen"),
	EMUDHRA_CONSENT(7, "Application exited at Emudhra Consent Screen");

	private int code;
	private String description;

	private ApplicationExitStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return this.code;
	}

	public String getDescription() {
		return this.description;
	}
}
