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

package com.liferay.symposium.citytours.promociones.service.impl;

import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.service.base.PromocionLocalServiceBaseImpl;

/**
 * The implementation of the promocion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.symposium.citytours.promociones.service.PromocionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocionLocalServiceBaseImpl
 * @see com.liferay.symposium.citytours.promociones.service.PromocionLocalServiceUtil
 */
public class PromocionLocalServiceImpl extends PromocionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.symposium.citytours.promociones.service.PromocionLocalServiceUtil} to access the promocion local service.
	 */

	 @Override
	 public Promocion addPromocion(Promocion promocion) {
		 long promocionId = counterLocalService.increment(Promocion.class.getName());
		 promocion.setPromocionId(promocionId);
		 return super.addPromocion(promocion);
	 }
}