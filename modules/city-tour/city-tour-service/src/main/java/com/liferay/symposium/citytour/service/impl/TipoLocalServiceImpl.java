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

package com.liferay.symposium.citytour.service.impl;

import com.liferay.symposium.citytour.model.Tipo;
import com.liferay.symposium.citytour.service.base.TipoLocalServiceBaseImpl;

/**
 * The implementation of the tipo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.symposium.citytour.service.TipoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipoLocalServiceBaseImpl
 * @see com.liferay.symposium.citytour.service.TipoLocalServiceUtil
 */
public class TipoLocalServiceImpl extends TipoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.symposium.citytour.service.TipoLocalServiceUtil} to access the tipo local service.
	 */
	@Override
	public Tipo addTipo(Tipo tipo) {
		tipo.setTipoId(counterLocalService.increment(Tipo.class.getName()));
		return super.addTipo(tipo);
	}
}