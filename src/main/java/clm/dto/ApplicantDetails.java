package clm.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties
@Data
public class ApplicantDetails implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String existingBNPCustomer;
	private String arn;
	private String accountNumber;
	private String branchLocation;
	private String planningToBeAbroad;
	private String planningToMoveAbroad;
	private String durationOfStay;
	private String expatAccountReason;
	private String isAmountToBeTransferred;
	private String isInitialWithrawal;
	private String amountToBeTransferred;
	private String amountToBeReatained;

}
