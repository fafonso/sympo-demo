/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.symposium.citytours.promociones.command.render;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.symposium.citytours.promociones.constants.PromocionesWebPortletKeys;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
        "javax.portlet.name=" + PromocionesWebPortletKeys.PromocionesWeb,
        "mvc.command.name=/citytour/promocion/edit"
    },
    service = MVCRenderCommand.class
)
public class EditPromocionMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		Promocion promocion = null;

		long promocionId = ParamUtil.getLong(renderRequest, "promocionId", 0);
		logger.error("Promocionid: " + promocionId);
		String title = "Crear Promocion";
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		renderRequest.setAttribute("userFirstName", themeDisplay.getUser().getFirstName());
		renderRequest.setAttribute("userLastName", themeDisplay.getUser().getLastName());
		if (promocionId > 0) {
			try {
				promocion = promocionLocalService.getPromocion(promocionId);
				logger.error("Recuperada promocion: " + promocion);
				title = "Editar Promocion";
			}
			catch (PortalException portalException) {
				logger.error(portalException);
			}
		}

		renderRequest.setAttribute("promocion", promocion);
		renderRequest.setAttribute("title", title);

		return "/promociones/edit_promocion.jsp";
	}
	
	@Reference
	private PromocionLocalService promocionLocalService;

	private static final Log logger = LogFactoryUtil.getLog(EditPromocionMVCRenderCommand.class);
}