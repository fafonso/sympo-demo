package com.liferay.symposium.citytours.promotions.command.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
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
	        "mvc.command.name=/citytour/promotion/edit"
	    },
	    service = MVCActionCommand.class
	)
public class EditPromotionMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long promotionId = ParamUtil.getLong(actionRequest, "promotionId");
		Promotion promotion = promotionLocalService.getPromotion(promotionId); 
		promotion = PromotionsPortletUtil.updatePromotionFromRequest(actionRequest, promotion);
		promotionLocalService.updatePromotion(promotion);
		sendRedirect(actionRequest, actionResponse);
	}

	@Reference
	private PromotionLocalService promotionLocalService;
}
