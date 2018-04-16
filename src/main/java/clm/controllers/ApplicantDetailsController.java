package clm.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clm.dto.ApplicantDetails;
import clm.dto.CLMResponse;
import clm.dto.ErrorCodes;
import clm.dto.RequestValidationException;
import clm.service.ApplicantDetailsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NonNull;

@Api(value = "applicant-detail-api", description = "Operations pertaining to AppliantDetails", tags = {
		"ApplicantDetail-Api" })
@RestController
@RequestMapping("/applicantdetails")
public class ApplicantDetailsController {

	private ApplicantDetailsService applicantDetailsService;

	@Autowired
	public ApplicantDetailsController(@NonNull final ApplicantDetailsService applicantDetailsService) {
		super();
		this.applicantDetailsService = applicantDetailsService;
	}

	/**
	 * @param session
	 * @param userDetails,
	 *            arn returns response with a message if user details are
	 *            successfully saved in db.
	 */

	@ApiOperation(value = "Save the Applicant personal details in Database")
	@RequestMapping(value = "/applicantdetails/save/{arn}", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<CLMResponse> persistApplicantDetails(@PathVariable("arn") String arn,
			@RequestBody @Valid ApplicantDetails applicantDetails, BindingResult bindingResult) {

		// String key = (String) session.getAttribute(Validator.UNIQUE_ID);
		if (bindingResult.hasErrors()) {
			throw new RequestValidationException(ErrorCodes.INVALID_REQUEST.getCode(),
					ErrorCodes.INVALID_REQUEST.getDescription(), bindingResult);
		}
		return new ResponseEntity<>(applicantDetailsService.saveApplicantDetails(applicantDetails, arn), HttpStatus.OK);

	}
}
