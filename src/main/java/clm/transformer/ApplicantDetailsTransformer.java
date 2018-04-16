package clm.transformer;


import org.springframework.stereotype.Component;

import clm.dto.ApplicantDetails;
import clm.dto.ApplicationExitStatus;
import clm.dto.ApplicationStatus;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ApplicantDetailsTransformer {

	private static final String TAX_PURPOSE_COUNTRY = "India";
	private static final int DURATION_OF_STAY = 3;
	private static final String OTHERS = "Others";

	public void transform(@NonNull final ApplicantDetails applicantDetails,
			@NonNull final ARNCCBridgeEntity arnBridge) {
		log.debug("Transforming ApplicantDetails to ApplicantAdditionalInfoEntity");

		// Changing the response code as user crossed the applicant details page
		arnBridge.setResponseCode(ApplicationStatus.APPLICATION_COMPLETION_PENDING.getDescription());
		arnBridge.setViewNumber(ApplicationExitStatus.PERSONAL_DEMOGRAPHICS.getCode());

		ApplicantAdditionalInfoEntity applicantAdditionalDetails = arnBridge.getApplicant()
				.getApplicantAdditionalInfo();

		// If object already exists in database, then update the existing
		// else create a new object
		if (applicantAdditionalDetails == null) {
			applicantAdditionalDetails = new ApplicantAdditionalInfoEntity();
		}
		
		//save details

	}

}