package clm.service;

import clm.dto.ApplicantDetails;
import clm.dto.CLMResponse;
import clm.dto.ErrorCodes;

public class ApplicantDetailsServiceImpl implements ApplicantDetailsService {

	@Override
	public CLMResponse saveApplicantDetails(ApplicantDetails userDetail, String arn) {
		log.debug("Saving ApplicantDetails to database");
		ARNCCBridgeEntity arnBridge = arnCcRepo.findByArn(arn);
		transformer.transform(applicantDetails, arnBridge);

		
		arnCcRepo.saveAndFlush(arnBridge);
		return new CLMResponse(true, ErrorCodes.SUCCESS.getCode(), ErrorCodes.SUCCESS.getDescription());
	}

}
