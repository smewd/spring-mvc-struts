package com.smood.struts;


import lombok.Getter;
import lombok.Setter;
import org.apache.struts.action.ActionForm;


public class TestForm extends ActionForm
{
	@Getter
	@Setter
	private String value;


	public TestForm()
	{
		value = "XX";
	}
}
