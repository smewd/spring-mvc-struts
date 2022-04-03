package com.smood.struts;


import lombok.Getter;
import lombok.Setter;
import org.apache.struts.action.ActionForm;


public class Step2Form extends ActionForm
{
	@Getter
	@Setter
	private String value;


	public Step2Form()
	{
		value = "step2 default";
	}
}
