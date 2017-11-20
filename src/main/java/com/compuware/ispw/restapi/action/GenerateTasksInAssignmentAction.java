package com.compuware.ispw.restapi.action;

import com.compuware.ispw.restapi.Constants;
import com.compuware.ispw.restapi.IspwRequestBean;
import com.compuware.ispw.restapi.WebhookToken;
import com.compuware.ispw.restapi.util.RestApiUtils;

public class GenerateTasksInAssignmentAction extends SetInfoPostAction {

	private static final String[] defaultProps =
			new String[] { assignmentId, level };

	private static final String contextPath =
			"/ispw/{srid}/assignments/{assignmentId}/tasks/generate?level={level}";

	public static String getDefaultProps() {
		return RestApiUtils.join(Constants.LINE_SEPARATOR, defaultProps, true);
	}

	@Override
	public IspwRequestBean getIspwRequestBean(String srid, String ispwRequestBody,
			WebhookToken webhookToken) {
		return getIspwRequestBean(srid, ispwRequestBody, webhookToken, contextPath);
	}
}
