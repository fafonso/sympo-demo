package com.liferay.symposium.citytours.promociones.command.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.symposium.citytours.promociones.constants.PromocionesWebPortletKeys;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;
import com.liferay.symposium.citytours.promociones.util.PromocionesPortletUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
	        "javax.portlet.name=" + PromocionesWebPortletKeys.PromocionesWeb,
	        "mvc.command.name=/citytour/promocion/add"
	    },
	    service = MVCActionCommand.class
	)
public class AddPromocionMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		Promocion promocion = PromocionesPortletUtil.createPromocionFromRequest(actionRequest, promocionLocalService);
		promocionLocalService.addPromocion(promocion);
		sendRedirect(actionRequest, actionResponse);
	}

	@Reference
	private PromocionLocalService promocionLocalService;
}
