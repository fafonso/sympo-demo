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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.symposium.citytour.model.Subtipo;
import com.liferay.symposium.citytour.service.base.SubtipoServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the subtipo remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.symposium.citytour.service.SubtipoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubtipoServiceBaseImpl
 * @see com.liferay.symposium.citytour.service.SubtipoServiceUtil
 */
public class SubtipoServiceImpl extends SubtipoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.symposium.citytour.service.SubtipoServiceUtil} to access the subtipo remote service.
	 */
	
	Log logger = LogFactoryUtil.getLog(SubtipoServiceImpl.class.getName());
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.symposium.citytour.service.TipoServiceUtil} to access the tipo remote service.
	 */
	
	public List<Subtipo> getSubtipos() {
		return subtipoLocalService.getSubtipos(0, subtipoLocalService.getSubtiposCount());
	}
	
	public List<Subtipo> getSubTipoFromTipo(long tipoId) {
		return subtipoLocalService.getSubtiposFromTipo(tipoId);
	}
	
	public Subtipo getSubTipo(long subTipoId) {
		try {
			return subtipoLocalService.getSubtipo(subTipoId);
		} catch (PortalException e) {
			logger.error(e);
			return null;
		}
	}
}