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

package com.liferay.symposium.citytours.promotions.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Promotion service. Represents a row in the &quot;Citytours_Promotion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Promotion
 * @see com.liferay.symposium.citytours.promotions.model.impl.PromotionImpl
 * @see com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl
 * @generated
 */
@ProviderType
public interface PromotionModel extends BaseModel<Promotion>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a promotion model instance should use the {@link Promotion} interface instead.
	 */

	/**
	 * Returns the primary key of this promotion.
	 *
	 * @return the primary key of this promotion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this promotion.
	 *
	 * @param primaryKey the primary key of this promotion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this promotion.
	 *
	 * @return the uuid of this promotion
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this promotion.
	 *
	 * @param uuid the uuid of this promotion
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the promotion ID of this promotion.
	 *
	 * @return the promotion ID of this promotion
	 */
	public long getPromotionId();

	/**
	 * Sets the promotion ID of this promotion.
	 *
	 * @param promotionId the promotion ID of this promotion
	 */
	public void setPromotionId(long promotionId);

	/**
	 * Returns the group ID of this promotion.
	 *
	 * @return the group ID of this promotion
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this promotion.
	 *
	 * @param groupId the group ID of this promotion
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this promotion.
	 *
	 * @return the company ID of this promotion
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this promotion.
	 *
	 * @param companyId the company ID of this promotion
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this promotion.
	 *
	 * @return the user ID of this promotion
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this promotion.
	 *
	 * @param userId the user ID of this promotion
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this promotion.
	 *
	 * @return the user uuid of this promotion
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this promotion.
	 *
	 * @param userUuid the user uuid of this promotion
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this promotion.
	 *
	 * @return the user name of this promotion
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this promotion.
	 *
	 * @param userName the user name of this promotion
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this promotion.
	 *
	 * @return the create date of this promotion
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this promotion.
	 *
	 * @param createDate the create date of this promotion
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this promotion.
	 *
	 * @return the modified date of this promotion
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this promotion.
	 *
	 * @param modifiedDate the modified date of this promotion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the description of this promotion.
	 *
	 * @return the description of this promotion
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this promotion.
	 *
	 * @param description the description of this promotion
	 */
	public void setDescription(String description);

	/**
	 * Returns the price of this promotion.
	 *
	 * @return the price of this promotion
	 */
	public double getPrice();

	/**
	 * Sets the price of this promotion.
	 *
	 * @param price the price of this promotion
	 */
	public void setPrice(double price);

	/**
	 * Returns the destination city of this promotion.
	 *
	 * @return the destination city of this promotion
	 */
	@AutoEscape
	public String getDestinationCity();

	/**
	 * Sets the destination city of this promotion.
	 *
	 * @param destinationCity the destination city of this promotion
	 */
	public void setDestinationCity(String destinationCity);

	/**
	 * Returns the offeree first name of this promotion.
	 *
	 * @return the offeree first name of this promotion
	 */
	@AutoEscape
	public String getOffereeFirstName();

	/**
	 * Sets the offeree first name of this promotion.
	 *
	 * @param offereeFirstName the offeree first name of this promotion
	 */
	public void setOffereeFirstName(String offereeFirstName);

	/**
	 * Returns the offeree last name of this promotion.
	 *
	 * @return the offeree last name of this promotion
	 */
	@AutoEscape
	public String getOffereeLastName();

	/**
	 * Sets the offeree last name of this promotion.
	 *
	 * @param offereeLastName the offeree last name of this promotion
	 */
	public void setOffereeLastName(String offereeLastName);

	/**
	 * Returns the offeree ID number of this promotion.
	 *
	 * @return the offeree ID number of this promotion
	 */
	@AutoEscape
	public String getOffereeIdNumber();

	/**
	 * Sets the offeree ID number of this promotion.
	 *
	 * @param offereeIdNumber the offeree ID number of this promotion
	 */
	public void setOffereeIdNumber(String offereeIdNumber);

	/**
	 * Returns the offeree telephone of this promotion.
	 *
	 * @return the offeree telephone of this promotion
	 */
	@AutoEscape
	public String getOffereeTelephone();

	/**
	 * Sets the offeree telephone of this promotion.
	 *
	 * @param offereeTelephone the offeree telephone of this promotion
	 */
	public void setOffereeTelephone(String offereeTelephone);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Promotion promotion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Promotion> toCacheModel();

	@Override
	public Promotion toEscapedModel();

	@Override
	public Promotion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}