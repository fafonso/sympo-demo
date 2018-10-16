package com.liferay.symposium.citytours.promociones.command.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.symposium.citytours.promociones.constants.PromocionesWebPortletKeys;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;
import com.liferay.symposium.citytours.promociones.util.PromocionesPortletUtil;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
	        "javax.portlet.name=" + PromocionesWebPortletKeys.PromocionesWeb,
	        "mvc.command.name=/citytour/promocion/edit"
	    },
	    service = MVCActionCommand.class
	)
public class EditPromocionMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long promocionId = ParamUtil.getLong(actionRequest, "promocionId");
		Promocion promocion = promocionLocalService.getPromocion(promocionId); 
		promocion = PromocionesPortletUtil.updatePromocionFromRequest(actionRequest, promocion);
		promocionLocalService.updatePromocion(promocion);
		sendRedirect(actionRequest, actionResponse);
	}

	@Reference
	private PromocionLocalService promocionLocalService;
}
