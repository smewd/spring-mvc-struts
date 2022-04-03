package com.smood.struts;


import com.smood.service.DummyService;
import lombok.Setter;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Step1Action extends ExtendedLookupDispatchAction
{
	@Setter
	private DummyService dummyService;


	public Step1Action()
	{
		Logger logger = LoggerFactory.getLogger(Step1Action.class);
		logger.info("Step1Action created.");
	}


	@Override
	protected Map<String, String> getKeyMethodMap()
	{
		return new HashMap<>();
	}


	public ActionForward empty(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
	{
		Step1Form f = (Step1Form)form;
		f.setValue(dummyService.printMessage("This is step 1"));

		return mapping.findForward("step1");
	}
}
