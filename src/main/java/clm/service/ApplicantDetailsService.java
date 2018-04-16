package clm.service;

import clm.dto.ApplicantDetails;
import clm.dto.CLMResponse;

public interface ApplicantDetailsService {
	
	public CLMResponse saveApplicantDetails(ApplicantDetails userDetail, String arn);
}
