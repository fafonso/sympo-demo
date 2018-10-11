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

package com.liferay.symposium.citytour.model;

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
 * This class is a wrapper for {@link Tipo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tipo
 * @generated
 */
@ProviderType
public class TipoWrapper implements Tipo, ModelWrapper<Tipo> {
	public TipoWrapper(Tipo tipo) {
		_tipo = tipo;
	}

	@Override
	public Class<?> getModelClass() {
		return Tipo.class;
	}

	@Override
	public String getModelClassName() {
		return Tipo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("tipoId", getTipoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("label", getLabel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long tipoId = (Long)attributes.get("tipoId");

		if (tipoId != null) {
			setTipoId(tipoId);
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

		String label = (String)attributes.get("label");

		if (label != null) {
			setLabel(label);
		}
	}

	@Override
	public Object clone() {
		return new TipoWrapper((Tipo)_tipo.clone());
	}

	@Override
	public int compareTo(Tipo tipo) {
		return _tipo.compareTo(tipo);
	}

	/**
	* Returns the company ID of this tipo.
	*
	* @return the company ID of this tipo
	*/
	@Override
	public long getCompanyId() {
		return _tipo.getCompanyId();
	}

	/**
	* Returns the create date of this tipo.
	*
	* @return the create date of this tipo
	*/
	@Override
	public Date getCreateDate() {
		return _tipo.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tipo.getExpandoBridge();
	}

	/**
	* Returns the group ID of this tipo.
	*
	* @return the group ID of this tipo
	*/
	@Override
	public long getGroupId() {
		return _tipo.getGroupId();
	}

	/**
	* Returns the label of this tipo.
	*
	* @return the label of this tipo
	*/
	@Override
	public String getLabel() {
		return _tipo.getLabel();
	}

	/**
	* Returns the modified date of this tipo.
	*
	* @return the modified date of this tipo
	*/
	@Override
	public Date getModifiedDate() {
		return _tipo.getModifiedDate();
	}

	/**
	* Returns the primary key of this tipo.
	*
	* @return the primary key of this tipo
	*/
	@Override
	public long getPrimaryKey() {
		return _tipo.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tipo.getPrimaryKeyObj();
	}

	/**
	* Returns the tipo ID of this tipo.
	*
	* @return the tipo ID of this tipo
	*/
	@Override
	public long getTipoId() {
		return _tipo.getTipoId();
	}

	/**
	* Returns the user ID of this tipo.
	*
	* @return the user ID of this tipo
	*/
	@Override
	public long getUserId() {
		return _tipo.getUserId();
	}

	/**
	* Returns the user name of this tipo.
	*
	* @return the user name of this tipo
	*/
	@Override
	public String getUserName() {
		return _tipo.getUserName();
	}

	/**
	* Returns the user uuid of this tipo.
	*
	* @return the user uuid of this tipo
	*/
	@Override
	public String getUserUuid() {
		return _tipo.getUserUuid();
	}

	/**
	* Returns the uuid of this tipo.
	*
	* @return the uuid of this tipo
	*/
	@Override
	public String getUuid() {
		return _tipo.getUuid();
	}

	@Override
	public int hashCode() {
		return _tipo.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _tipo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tipo.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tipo.isNew();
	}

	@Override
	public void persist() {
		_tipo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tipo.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this tipo.
	*
	* @param companyId the company ID of this tipo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tipo.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this tipo.
	*
	* @param createDate the create date of this tipo
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_tipo.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tipo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tipo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tipo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this tipo.
	*
	* @param groupId the group ID of this tipo
	*/
	@Override
	public void setGroupId(long groupId) {
		_tipo.setGroupId(groupId);
	}

	/**
	* Sets the label of this tipo.
	*
	* @param label the label of this tipo
	*/
	@Override
	public void setLabel(String label) {
		_tipo.setLabel(label);
	}

	/**
	* Sets the modified date of this tipo.
	*
	* @param modifiedDate the modified date of this tipo
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_tipo.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_tipo.setNew(n);
	}

	/**
	* Sets the primary key of this tipo.
	*
	* @param primaryKey the primary key of this tipo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tipo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tipo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tipo ID of this tipo.
	*
	* @param tipoId the tipo ID of this tipo
	*/
	@Override
	public void setTipoId(long tipoId) {
		_tipo.setTipoId(tipoId);
	}

	/**
	* Sets the user ID of this tipo.
	*
	* @param userId the user ID of this tipo
	*/
	@Override
	public void setUserId(long userId) {
		_tipo.setUserId(userId);
	}

	/**
	* Sets the user name of this tipo.
	*
	* @param userName the user name of this tipo
	*/
	@Override
	public void setUserName(String userName) {
		_tipo.setUserName(userName);
	}

	/**
	* Sets the user uuid of this tipo.
	*
	* @param userUuid the user uuid of this tipo
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_tipo.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this tipo.
	*
	* @param uuid the uuid of this tipo
	*/
	@Override
	public void setUuid(String uuid) {
		_tipo.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Tipo> toCacheModel() {
		return _tipo.toCacheModel();
	}

	@Override
	public Tipo toEscapedModel() {
		return new TipoWrapper(_tipo.toEscapedModel());
	}

	@Override
	public String toString() {
		return _tipo.toString();
	}

	@Override
	public Tipo toUnescapedModel() {
		return new TipoWrapper(_tipo.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _tipo.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipoWrapper)) {
			return false;
		}

		TipoWrapper tipoWrapper = (TipoWrapper)obj;

		if (Objects.equals(_tipo, tipoWrapper._tipo)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _tipo.getStagedModelType();
	}

	@Override
	public Tipo getWrappedModel() {
		return _tipo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tipo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tipo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tipo.resetOriginalValues();
	}

	private final Tipo _tipo;
}