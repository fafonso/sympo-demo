package com.liferay.symposium.citytours.promotions.command.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.symposium.citytours.promotions.constants.PromotionsWebPortletKeys;
import com.liferay.symposium.citytours.promotions.model.Promotion;
import com.liferay.symposium.citytours.promotions.service.PromotionLocalService;
import com.liferay.symposium.citytours.promotions.util.PromotionsPortletUtil;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
	        "javax.portlet.name=" + PromotionsWebPortletKeys.PROMOTIONS_PORTLET_KEY,
	        "mvc.command.name=/citytour/promotion/add"
	    },
	    service = MVCActionCommand.class
	)
public class AddPromotionMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		Promotion promotion = PromotionsPortletUtil.createPromotionFromRequest(actionRequest, promotionLocalService);
		promotionLocalService.addPromotion(promotion);
		sendRedirect(actionRequest, actionResponse);
	}

	@Reference
	private PromotionLocalService promotionLocalService;
}
