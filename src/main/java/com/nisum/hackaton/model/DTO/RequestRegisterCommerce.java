package com.nisum.hackaton.model.DTO;

import com.nisum.hackaton.util.Constants;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@Builder
public class RequestRegisterCommerce {

	@NotBlank(message = Constants.BLANK_NAME)
	private String name;

	@NotBlank(message = Constants.BLANK_CATEGORY)
	private String category;

	@NotBlank(message = Constants.BLANK_PURPOSE)
	private String purpose;

	private String publicExpected;

	@NotBlank(message = Constants.BLANK_CITY)
	private String city;

	@NotBlank(message = Constants.BLANK_COUNTRY)
	private String country;

	@NotBlank(message = Constants.BLANK_ID_USER)
	private String idUser;

	private String design;

	private String template;
}
