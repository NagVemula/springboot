package com.nsolution.rest.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class LicensureInputs {
	
	@Pattern(regexp="[YNyn]", message="Please provide values with this format [YNyn] ")
	private String fullInsured;
	
	@Pattern(regexp="[YNyn]", message="Please provide values with this format [YNyn] ")
	private String medicare;
	
	@Pattern(regexp="[YNyn]", message="Please provide values with this format [YNyn] ")
	private String medicaid;
	
	@Pattern(regexp="[YNyn]", message="Please provide values with this format [YNyn] ")
	private String isHmo;
	
	@Pattern(regexp="[YNyn]", message="Please provide values with this format [YNyn] ")
	private String isProviderPhysian;
	
	@NotNull(message = "review should not be null")
	@NotBlank(message = "review should not be empty")
	private String review;

	public String getFullInsured() {
		return fullInsured;
	}

	public void setFullInsured(String fullInsured) {
		this.fullInsured = fullInsured;
	}

	public String getMedicare() {
		return medicare;
	}

	public void setMedicare(String medicare) {
		this.medicare = medicare;
	}

	public String getMedicaid() {
		return medicaid;
	}

	public void setMedicaid(String medicaid) {
		this.medicaid = medicaid;
	}

	public String getIsHmo() {
		return isHmo;
	}

	public void setIsHmo(String isHmo) {
		this.isHmo = isHmo;
	}

	public String getIsProviderPhysian() {
		return isProviderPhysian;
	}

	public void setIsProviderPhysian(String isProviderPhysian) {
		this.isProviderPhysian = isProviderPhysian;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	
	
	
	
	
	
	
}
