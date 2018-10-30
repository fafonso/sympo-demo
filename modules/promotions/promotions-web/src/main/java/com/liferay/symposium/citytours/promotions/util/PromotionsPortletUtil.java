package com.liferay.symposium.citytours.promotions.util;

import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.symposium.citytours.promotions.model.Promotion;
import com.liferay.symposium.citytours.promotions.service.PromotionLocalService;

import javax.portlet.ActionRequest;

public class PromotionsPortletUtil {
	
	/**
	 * Aux method to create a promotion from request params.
	 * @param actionRequest
	 * @return
	 */
	public static Promotion createPromotionFromRequest(ActionRequest actionRequest, PromotionLocalService promotionLocalService) {

		Promotion promotion = promotionLocalService.createPromotion(0);

		return updatePromotionFromRequest(actionRequest, promotion);
	}

	/**
	 * Aux method to update a promotion from request params.
	 * @param actionRequest
	 * @param promotion
	 * @return
	 */
	public static Promotion updatePromotionFromRequest(ActionRequest actionRequest, Promotion promotion) {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);		
		promotion.setDescription(ParamUtil.getString(actionRequest, "description"));
		promotion.setPrice(ParamUtil.getDouble(actionRequest, "price"));
		promotion.setDestinationCity(ParamUtil.getString(actionRequest, "destinationCity"));
		promotion.setOffereeFirstName(ParamUtil.getString(actionRequest, "offereeFirstName"));
		promotion.setOffereeLastName(ParamUtil.getString(actionRequest, "offereeLastName"));
		promotion.setOffereeIdNumber(ParamUtil.getString(actionRequest, "offereeIdNumber"));
		promotion.setOffereeTelephone(ParamUtil.getString(actionRequest, "offereeTelephone"));		
		promotion.setCompanyId(themeDisplay.getCompanyId());
		promotion.setGroupId(themeDisplay.getScopeGroupId());
		promotion.setUserId(themeDisplay.getUserId());
		promotion.setCreateDate(DateUtil.newDate());
		promotion.setModifiedDate(DateUtil.newDate());
		promotion.setUserName(themeDisplay.getUser().getFullName());

		return promotion;		
	}
}

