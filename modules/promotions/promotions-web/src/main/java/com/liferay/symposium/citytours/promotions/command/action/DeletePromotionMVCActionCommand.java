package com.liferay.symposium.citytours.promotions.command.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.symposium.citytours.promotions.constants.PromotionsWebPortletKeys;
import com.liferay.symposium.citytours.promotions.service.PromotionLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
	        "javax.portlet.name=" + PromotionsWebPortletKeys.PROMOTIONS_PORTLET_KEY,
	        "mvc.command.name=/citytour/promotion/delete"
	    },
	    service = MVCActionCommand.class
	)
public class DeletePromotionMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		promotionLocalService.deletePromotion(ParamUtil.getLong(actionRequest, "promotionId"));
	}

	@Reference
	private PromotionLocalService promotionLocalService;
}
