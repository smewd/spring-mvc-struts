package com.smood.struts;


import lombok.Getter;
import lombok.Setter;
import org.apache.struts.action.ActionForm;


public class Step1Form extends ActionForm
{
	@Getter
	@Setter
	private String value;


	public Step1Form()
	{
		value = "step1 default";
	}
}
