package com.liferay.symposium.citytours.promociones.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.symposium.citytours.promociones.constants.PromocionesWebPortletKeys;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author ibairuiz
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=promociones-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PromocionesWebPortletKeys.PromocionesWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PromocionesWebPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {	
		renderRequest.setAttribute("Promociones", promocionLocalService.getPromocions(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		super.doView(renderRequest, renderResponse);
	}
	
	@Reference
	private PromocionLocalService promocionLocalService;
}