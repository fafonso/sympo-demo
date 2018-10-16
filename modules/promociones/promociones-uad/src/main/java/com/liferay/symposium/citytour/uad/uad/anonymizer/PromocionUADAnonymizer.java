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

package com.liferay.symposium.citytour.uad.uad.anonymizer;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.user.associated.data.anonymizer.UADAnonymizer;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(immediate = true, service = UADAnonymizer.class)
public class PromocionUADAnonymizer extends BasePromocionUADAnonymizer {
    @Override
	public void autoAnonymize(Promocion promocion, long userId,
		User anonymousUser) throws PortalException {
		if (promocion.getUserId() == userId) {
			promocion.setUserId(anonymousUser.getUserId());
            promocion.setUserName(anonymousUser.getFullName());
			promocion.setNombreDestinatario(anonymousUser.getFirstName());
			promocion.setApellidosDestinatario(anonymousUser.getLastName());
			promocion.setNifDestinatario("XXXXXXXXX");
			promocion.setTelefonoDestinatario("XXX-XXX-XXX");            
		}

		promocionLocalService.updatePromocion(promocion);
	}    
}