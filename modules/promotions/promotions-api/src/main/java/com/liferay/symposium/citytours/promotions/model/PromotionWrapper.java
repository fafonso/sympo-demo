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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Promotion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Promotion
 * @generated
 */
@ProviderType
public class PromotionWrapper implements Promotion, ModelWrapper<Promotion> {
	public PromotionWrapper(Promotion promotion) {
		_promotion = promotion;
	}

	@Override
	public Class<?> getModelClass() {
		return Promotion.class;
	}

	@Override
	public String getModelClassName() {
		return Promotion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("promotionId", getPromotionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("description", getDescription());
		attributes.put("price", getPrice());
		attributes.put("destinationCity", getDestinationCity());
		attributes.put("offereeFirstName", getOffereeFirstName());
		attributes.put("offereeLastName", getOffereeLastName());
		attributes.put("offereeIdNumber", getOffereeIdNumber());
		attributes.put("offereeTelephone", getOffereeTelephone());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long promotionId = (Long)attributes.get("promotionId");

		if (promotionId != null) {
			setPromotionId(promotionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String destinationCity = (String)attributes.get("destinationCity");

		if (destinationCity != null) {
			setDestinationCity(destinationCity);
		}

		String offereeFirstName = (String)attributes.get("offereeFirstName");

		if (offereeFirstName != null) {
			setOffereeFirstName(offereeFirstName);
		}

		String offereeLastName = (String)attributes.get("offereeLastName");

		if (offereeLastName != null) {
			setOffereeLastName(offereeLastName);
		}

		String offereeIdNumber = (String)attributes.get("offereeIdNumber");

		if (offereeIdNumber != null) {
			setOffereeIdNumber(offereeIdNumber);
		}

		String offereeTelephone = (String)attributes.get("offereeTelephone");

		if (offereeTelephone != null) {
			setOffereeTelephone(offereeTelephone);
		}
	}

	@Override
	public Object clone() {
		return new PromotionWrapper((Promotion)_promotion.clone());
	}

	@Override
	public int compareTo(Promotion promotion) {
		return _promotion.compareTo(promotion);
	}

	/**
	* Returns the company ID of this promotion.
	*
	* @return the company ID of this promotion
	*/
	@Override
	public long getCompanyId() {
		return _promotion.getCompanyId();
	}

	/**
	* Returns the create date of this promotion.
	*
	* @return the create date of this promotion
	*/
	@Override
	public Date getCreateDate() {
		return _promotion.getCreateDate();
	}

	/**
	* Returns the description of this promotion.
	*
	* @return the description of this promotion
	*/
	@Override
	public String getDescription() {
		return _promotion.getDescription();
	}

	/**
	* Returns the destination city of this promotion.
	*
	* @return the destination city of this promotion
	*/
	@Override
	public String getDestinationCity() {
		return _promotion.getDestinationCity();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _promotion.getExpandoBridge();
	}

	/**
	* Returns the group ID of this promotion.
	*
	* @return the group ID of this promotion
	*/
	@Override
	public long getGroupId() {
		return _promotion.getGroupId();
	}

	/**
	* Returns the modified date of this promotion.
	*
	* @return the modified date of this promotion
	*/
	@Override
	public Date getModifiedDate() {
		return _promotion.getModifiedDate();
	}

	/**
	* Returns the offeree first name of this promotion.
	*
	* @return the offeree first name of this promotion
	*/
	@Override
	public String getOffereeFirstName() {
		return _promotion.getOffereeFirstName();
	}

	/**
	* Returns the offeree ID number of this promotion.
	*
	* @return the offeree ID number of this promotion
	*/
	@Override
	public String getOffereeIdNumber() {
		return _promotion.getOffereeIdNumber();
	}

	/**
	* Returns the offeree last name of this promotion.
	*
	* @return the offeree last name of this promotion
	*/
	@Override
	public String getOffereeLastName() {
		return _promotion.getOffereeLastName();
	}

	/**
	* Returns the offeree telephone of this promotion.
	*
	* @return the offeree telephone of this promotion
	*/
	@Override
	public String getOffereeTelephone() {
		return _promotion.getOffereeTelephone();
	}

	/**
	* Returns the price of this promotion.
	*
	* @return the price of this promotion
	*/
	@Override
	public double getPrice() {
		return _promotion.getPrice();
	}

	/**
	* Returns the primary key of this promotion.
	*
	* @return the primary key of this promotion
	*/
	@Override
	public long getPrimaryKey() {
		return _promotion.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _promotion.getPrimaryKeyObj();
	}

	/**
	* Returns the promotion ID of this promotion.
	*
	* @return the promotion ID of this promotion
	*/
	@Override
	public long getPromotionId() {
		return _promotion.getPromotionId();
	}

	/**
	* Returns the user ID of this promotion.
	*
	* @return the user ID of this promotion
	*/
	@Override
	public long getUserId() {
		return _promotion.getUserId();
	}

	/**
	* Returns the user name of this promotion.
	*
	* @return the user name of this promotion
	*/
	@Override
	public String getUserName() {
		return _promotion.getUserName();
	}

	/**
	* Returns the user uuid of this promotion.
	*
	* @return the user uuid of this promotion
	*/
	@Override
	public String getUserUuid() {
		return _promotion.getUserUuid();
	}

	/**
	* Returns the uuid of this promotion.
	*
	* @return the uuid of this promotion
	*/
	@Override
	public String getUuid() {
		return _promotion.getUuid();
	}

	@Override
	public int hashCode() {
		return _promotion.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _promotion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _promotion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _promotion.isNew();
	}

	@Override
	public void persist() {
		_promotion.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_promotion.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this promotion.
	*
	* @param companyId the company ID of this promotion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_promotion.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this promotion.
	*
	* @param createDate the create date of this promotion
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_promotion.setCreateDate(createDate);
	}

	/**
	* Sets the description of this promotion.
	*
	* @param description the description of this promotion
	*/
	@Override
	public void setDescription(String description) {
		_promotion.setDescription(description);
	}

	/**
	* Sets the destination city of this promotion.
	*
	* @param destinationCity the destination city of this promotion
	*/
	@Override
	public void setDestinationCity(String destinationCity) {
		_promotion.setDestinationCity(destinationCity);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_promotion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_promotion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_promotion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this promotion.
	*
	* @param groupId the group ID of this promotion
	*/
	@Override
	public void setGroupId(long groupId) {
		_promotion.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this promotion.
	*
	* @param modifiedDate the modified date of this promotion
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_promotion.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_promotion.setNew(n);
	}

	/**
	* Sets the offeree first name of this promotion.
	*
	* @param offereeFirstName the offeree first name of this promotion
	*/
	@Override
	public void setOffereeFirstName(String offereeFirstName) {
		_promotion.setOffereeFirstName(offereeFirstName);
	}

	/**
	* Sets the offeree ID number of this promotion.
	*
	* @param offereeIdNumber the offeree ID number of this promotion
	*/
	@Override
	public void setOffereeIdNumber(String offereeIdNumber) {
		_promotion.setOffereeIdNumber(offereeIdNumber);
	}

	/**
	* Sets the offeree last name of this promotion.
	*
	* @param offereeLastName the offeree last name of this promotion
	*/
	@Override
	public void setOffereeLastName(String offereeLastName) {
		_promotion.setOffereeLastName(offereeLastName);
	}

	/**
	* Sets the offeree telephone of this promotion.
	*
	* @param offereeTelephone the offeree telephone of this promotion
	*/
	@Override
	public void setOffereeTelephone(String offereeTelephone) {
		_promotion.setOffereeTelephone(offereeTelephone);
	}

	/**
	* Sets the price of this promotion.
	*
	* @param price the price of this promotion
	*/
	@Override
	public void setPrice(double price) {
		_promotion.setPrice(price);
	}

	/**
	* Sets the primary key of this promotion.
	*
	* @param primaryKey the primary key of this promotion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_promotion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_promotion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the promotion ID of this promotion.
	*
	* @param promotionId the promotion ID of this promotion
	*/
	@Override
	public void setPromotionId(long promotionId) {
		_promotion.setPromotionId(promotionId);
	}

	/**
	* Sets the user ID of this promotion.
	*
	* @param userId the user ID of this promotion
	*/
	@Override
	public void setUserId(long userId) {
		_promotion.setUserId(userId);
	}

	/**
	* Sets the user name of this promotion.
	*
	* @param userName the user name of this promotion
	*/
	@Override
	public void setUserName(String userName) {
		_promotion.setUserName(userName);
	}

	/**
	* Sets the user uuid of this promotion.
	*
	* @param userUuid the user uuid of this promotion
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_promotion.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this promotion.
	*
	* @param uuid the uuid of this promotion
	*/
	@Override
	public void setUuid(String uuid) {
		_promotion.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Promotion> toCacheModel() {
		return _promotion.toCacheModel();
	}

	@Override
	public Promotion toEscapedModel() {
		return new PromotionWrapper(_promotion.toEscapedModel());
	}

	@Override
	public String toString() {
		return _promotion.toString();
	}

	@Override
	public Promotion toUnescapedModel() {
		return new PromotionWrapper(_promotion.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _promotion.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PromotionWrapper)) {
			return false;
		}

		PromotionWrapper promotionWrapper = (PromotionWrapper)obj;

		if (Objects.equals(_promotion, promotionWrapper._promotion)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _promotion.getStagedModelType();
	}

	@Override
	public Promotion getWrappedModel() {
		return _promotion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _promotion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _promotion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_promotion.resetOriginalValues();
	}

	private final Promotion _promotion;
}