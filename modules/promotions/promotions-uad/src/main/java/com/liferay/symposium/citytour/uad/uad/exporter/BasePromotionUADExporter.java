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
import com.liferay.symposium.citytours.promotions.model.Promotion;
import com.liferay.symposium.citytours.promotions.service.PromotionLocalService;

import com.liferay.user.associated.data.exporter.DynamicQueryUADExporter;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the promotion UAD exporter.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link PromotionUADExporter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BasePromotionUADExporter extends DynamicQueryUADExporter<Promotion> {
	@Override
	public Class<Promotion> getTypeClass() {
		return Promotion.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return promotionLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return CitytourUADConstants.USER_ID_FIELD_NAMES_PROMOTION;
	}

	@Override
	protected String toXmlString(Promotion promotion) {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.symposium.citytours.promotions.model.Promotion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>promotionId</column-name><column-value><![CDATA[");
		sb.append(promotion.getPromotionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(promotion.getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(promotion.getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(promotion.getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(promotion.getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>destinationCity</column-name><column-value><![CDATA[");
		sb.append(promotion.getDestinationCity());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	@Reference
	protected PromotionLocalService promotionLocalService;
}