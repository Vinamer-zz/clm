package clm.service;

import org.springframework.stereotype.Service;

import clm.dto.ApplicantDetails;
import clm.dto.CLMResponse;

@Service
public interface ApplicantDetailsService {
	
	public CLMResponse saveApplicantDetails(ApplicantDetails userDetail, String arn);
}
