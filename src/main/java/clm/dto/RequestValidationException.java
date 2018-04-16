package clm.dto;

import org.springframework.validation.Errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class RequestValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private Integer errorCode;
	private String message;
	private Errors errors;

	public Integer getErrorCode() {
		return errorCode;
	}

}