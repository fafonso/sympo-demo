package com.liferay.symposium.citytours.promociones.command.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.symposium.citytours.promociones.constants.PromocionesWebPortletKeys;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
	        "javax.portlet.name=" + PromocionesWebPortletKeys.PromocionesWeb,
	        "mvc.command.name=/citytour/promocion/delete"
	    },
	    service = MVCActionCommand.class
	)
public class DeletePromocionMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		promocionLocalService.deletePromocion(ParamUtil.getLong(actionRequest, "promocionId"));
	}

	@Reference
	private PromocionLocalService promocionLocalService;
}
