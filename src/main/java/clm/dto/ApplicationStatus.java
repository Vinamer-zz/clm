package clm.dto;
public enum ApplicationStatus {
	
	APPLICATION_JOURNEY_STARTED("APPLICATION_JOURNEY_STARTED"),
	APPLICATION_COMPLETION_PENDING("APPLICATION_COMPLETION_PENDING");
	
	private String description;
	
	private ApplicationStatus(String description){
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
}