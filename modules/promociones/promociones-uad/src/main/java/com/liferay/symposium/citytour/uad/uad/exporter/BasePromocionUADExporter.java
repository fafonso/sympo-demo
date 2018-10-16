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

package com.liferay.symposium.citytour.uad.uad.exporter;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;

import com.liferay.symposium.citytour.uad.uad.constants.CitytourUADConstants;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;

import com.liferay.user.associated.data.exporter.DynamicQueryUADExporter;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the promocion UAD exporter.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link PromocionUADExporter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BasePromocionUADExporter extends DynamicQueryUADExporter<Promocion> {
	@Override
	public Class<Promocion> getTypeClass() {
		return Promocion.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return promocionLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return CitytourUADConstants.USER_ID_FIELD_NAMES_PROMOCION;
	}

	@Override
	protected String toXmlString(Promocion promocion) {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.symposium.citytours.promociones.model.Promocion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>promocionId</column-name><column-value><![CDATA[");
		sb.append(promocion.getPromocionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(promocion.getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(promocion.getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(promocion.getDescripcion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>precio</column-name><column-value><![CDATA[");
		sb.append(promocion.getPrecio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ciudadDestino</column-name><column-value><![CDATA[");
		sb.append(promocion.getCiudadDestino());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	@Reference
	protected PromocionLocalService promocionLocalService;
}