package com.smood.struts;


import com.smood.service.DummyService;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.TreeMap;


@Component("/test")
public class TestAction extends ExtendedLookupDispatchAction
{
	@Autowired
	private DummyService dummyService;


	public TestAction()
	{
		Logger logger = LoggerFactory.getLogger(TestAction.class);
		logger.info("TestAction created.");
	}


	@Override
	protected Map<String, String> getKeyMethodMap()
	{
		Map<String, String> map = new TreeMap<>();
		map.put("button_step2", "step2");
		return map;
	}


	public ActionForward empty(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
	{
		TestForm f = (TestForm)form;
		f.setValue(dummyService.printMessage("This is step 1"));

		return mapping.findForward("step1");
	}


	public ActionForward step2(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
	{
		TestForm f = (TestForm)form;
		f.setValue(dummyService.printMessage("This is step 2"));

		return mapping.findForward("step2");
	}
}
