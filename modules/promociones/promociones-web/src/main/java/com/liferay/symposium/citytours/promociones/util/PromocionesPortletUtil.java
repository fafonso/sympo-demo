package com.liferay.symposium.citytours.promociones.util;

import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;

import javax.portlet.ActionRequest;

public class PromocionesPortletUtil {
	
	/**
	 * Aux method to create a promocion from request params.
	 * @param actionRequest
	 * @return
	 */
	public static Promocion createPromocionFromRequest(ActionRequest actionRequest, PromocionLocalService promocionLocalService) {

		Promocion promocion = promocionLocalService.createPromocion(0);

		return updatePromocionFromRequest(actionRequest, promocion);
	}

	/**
	 * Aux method to update a promocion from request params.
	 * @param actionRequest
	 * @param promocion
	 * @return
	 */
	public static Promocion updatePromocionFromRequest(ActionRequest actionRequest, Promocion promocion) {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);		
		promocion.setDescripcion(ParamUtil.getString(actionRequest, "descripcion"));
		promocion.setPrecio(ParamUtil.getDouble(actionRequest, "precio"));
		promocion.setCiudadDestino(ParamUtil.getString(actionRequest, "ciudadDestino"));
		promocion.setNombreDestinatario(ParamUtil.getString(actionRequest, "nombreDestinatario"));
		promocion.setApellidosDestinatario(ParamUtil.getString(actionRequest, "apellidosDestinatario"));
		promocion.setNifDestinatario(ParamUtil.getString(actionRequest, "nifDestinatario"));
		promocion.setTelefonoDestinatario(ParamUtil.getString(actionRequest, "telefonoDestinatario"));		
		promocion.setCompanyId(themeDisplay.getCompanyId());
		promocion.setGroupId(themeDisplay.getScopeGroupId());
		promocion.setUserId(themeDisplay.getUserId());
		promocion.setCreateDate(DateUtil.newDate());
		promocion.setModifiedDate(DateUtil.newDate());
		promocion.setUserName(themeDisplay.getUser().getFullName());

		return promocion;		
	}
}

