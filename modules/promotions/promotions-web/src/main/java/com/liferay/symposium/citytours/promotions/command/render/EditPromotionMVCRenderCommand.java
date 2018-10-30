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
package com.liferay.symposium.citytours.promotions.command.render;

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
import com.liferay.symposium.citytours.promotions.constants.PromotionsWebPortletKeys;
import com.liferay.symposium.citytours.promotions.model.Promotion;
import com.liferay.symposium.citytours.promotions.service.PromotionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
        "javax.portlet.name=" + PromotionsWebPortletKeys.PROMOTIONS_PORTLET_KEY,
        "mvc.command.name=/citytour/promotion/edit"
    },
    service = MVCRenderCommand.class
)
public class EditPromotionMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		Promotion promotion = null;

		long promotionId = ParamUtil.getLong(renderRequest, "promotionId", 0);

		String title = "Create Promotion";
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		renderRequest.setAttribute("userFirstName", themeDisplay.getUser().getFirstName());
		renderRequest.setAttribute("userLastName", themeDisplay.getUser().getLastName());
		if (promotionId > 0) {
			try {
				promotion = promotionLocalService.getPromotion(promotionId);
				title = "Edit Promotion";
			}
			catch (PortalException portalException) {
				logger.error(portalException);
			}
		}

		renderRequest.setAttribute("promotion", promotion);
		renderRequest.setAttribute("title", title);

		return "/promotions/edit_promotion.jsp";
	}
	
	@Reference
	private PromotionLocalService promotionLocalService;

	private static final Log logger = LogFactoryUtil.getLog(EditPromotionMVCRenderCommand.class);
}