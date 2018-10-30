/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.symposium.citytours.promotions.service.impl;

import com.liferay.symposium.citytours.promotions.model.Promotion;
import com.liferay.symposium.citytours.promotions.service.base.PromotionLocalServiceBaseImpl;

/**
 * The implementation of the promotion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.symposium.citytours.promotions.service.PromotionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromotionLocalServiceBaseImpl
 * @see com.liferay.symposium.citytours.promotions.service.PromotionLocalServiceUtil
 */
public class PromotionLocalServiceImpl extends PromotionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.symposium.citytours.promotions.service.PromotionLocalServiceUtil} to access the promotion local service.
	 */
	@Override
	public Promotion addPromotion(Promotion promotion) {
		long promotionId = counterLocalService.increment(Promotion.class.getName());
		promotion.setPromotionId(promotionId);
		return super.addPromotion(promotion);
	}
}