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


public class Step2Action extends ExtendedLookupDispatchAction
{
	@Setter
	private DummyService dummyService;


	public Step2Action()
	{
		Logger logger = LoggerFactory.getLogger(Step2Action.class);
		logger.info("Step2Action created.");
	}


	@Override
	protected Map<String, String> getKeyMethodMap()
	{
		return new HashMap<>();
	}


	public ActionForward empty(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
	{
		Step2Form f = (Step2Form)form;
		f.setValue(dummyService.printMessage("This is step 2"));

		return mapping.findForward("step2");
	}
}
