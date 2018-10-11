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
 * This class is a wrapper for {@link Subtipo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Subtipo
 * @generated
 */
@ProviderType
public class SubtipoWrapper implements Subtipo, ModelWrapper<Subtipo> {
	public SubtipoWrapper(Subtipo subtipo) {
		_subtipo = subtipo;
	}

	@Override
	public Class<?> getModelClass() {
		return Subtipo.class;
	}

	@Override
	public String getModelClassName() {
		return Subtipo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("subtipoId", getSubtipoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tipoId", getTipoId());
		attributes.put("label", getLabel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long subtipoId = (Long)attributes.get("subtipoId");

		if (subtipoId != null) {
			setSubtipoId(subtipoId);
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

		Long tipoId = (Long)attributes.get("tipoId");

		if (tipoId != null) {
			setTipoId(tipoId);
		}

		String label = (String)attributes.get("label");

		if (label != null) {
			setLabel(label);
		}
	}

	@Override
	public Object clone() {
		return new SubtipoWrapper((Subtipo)_subtipo.clone());
	}

	@Override
	public int compareTo(Subtipo subtipo) {
		return _subtipo.compareTo(subtipo);
	}

	/**
	* Returns the company ID of this subtipo.
	*
	* @return the company ID of this subtipo
	*/
	@Override
	public long getCompanyId() {
		return _subtipo.getCompanyId();
	}

	/**
	* Returns the create date of this subtipo.
	*
	* @return the create date of this subtipo
	*/
	@Override
	public Date getCreateDate() {
		return _subtipo.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _subtipo.getExpandoBridge();
	}

	/**
	* Returns the group ID of this subtipo.
	*
	* @return the group ID of this subtipo
	*/
	@Override
	public long getGroupId() {
		return _subtipo.getGroupId();
	}

	/**
	* Returns the label of this subtipo.
	*
	* @return the label of this subtipo
	*/
	@Override
	public String getLabel() {
		return _subtipo.getLabel();
	}

	/**
	* Returns the modified date of this subtipo.
	*
	* @return the modified date of this subtipo
	*/
	@Override
	public Date getModifiedDate() {
		return _subtipo.getModifiedDate();
	}

	/**
	* Returns the primary key of this subtipo.
	*
	* @return the primary key of this subtipo
	*/
	@Override
	public long getPrimaryKey() {
		return _subtipo.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _subtipo.getPrimaryKeyObj();
	}

	/**
	* Returns the subtipo ID of this subtipo.
	*
	* @return the subtipo ID of this subtipo
	*/
	@Override
	public long getSubtipoId() {
		return _subtipo.getSubtipoId();
	}

	/**
	* Returns the tipo ID of this subtipo.
	*
	* @return the tipo ID of this subtipo
	*/
	@Override
	public long getTipoId() {
		return _subtipo.getTipoId();
	}

	/**
	* Returns the user ID of this subtipo.
	*
	* @return the user ID of this subtipo
	*/
	@Override
	public long getUserId() {
		return _subtipo.getUserId();
	}

	/**
	* Returns the user name of this subtipo.
	*
	* @return the user name of this subtipo
	*/
	@Override
	public String getUserName() {
		return _subtipo.getUserName();
	}

	/**
	* Returns the user uuid of this subtipo.
	*
	* @return the user uuid of this subtipo
	*/
	@Override
	public String getUserUuid() {
		return _subtipo.getUserUuid();
	}

	/**
	* Returns the uuid of this subtipo.
	*
	* @return the uuid of this subtipo
	*/
	@Override
	public String getUuid() {
		return _subtipo.getUuid();
	}

	@Override
	public int hashCode() {
		return _subtipo.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _subtipo.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _subtipo.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _subtipo.isNew();
	}

	@Override
	public void persist() {
		_subtipo.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_subtipo.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this subtipo.
	*
	* @param companyId the company ID of this subtipo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_subtipo.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this subtipo.
	*
	* @param createDate the create date of this subtipo
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_subtipo.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_subtipo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_subtipo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_subtipo.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this subtipo.
	*
	* @param groupId the group ID of this subtipo
	*/
	@Override
	public void setGroupId(long groupId) {
		_subtipo.setGroupId(groupId);
	}

	/**
	* Sets the label of this subtipo.
	*
	* @param label the label of this subtipo
	*/
	@Override
	public void setLabel(String label) {
		_subtipo.setLabel(label);
	}

	/**
	* Sets the modified date of this subtipo.
	*
	* @param modifiedDate the modified date of this subtipo
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_subtipo.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_subtipo.setNew(n);
	}

	/**
	* Sets the primary key of this subtipo.
	*
	* @param primaryKey the primary key of this subtipo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_subtipo.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_subtipo.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the subtipo ID of this subtipo.
	*
	* @param subtipoId the subtipo ID of this subtipo
	*/
	@Override
	public void setSubtipoId(long subtipoId) {
		_subtipo.setSubtipoId(subtipoId);
	}

	/**
	* Sets the tipo ID of this subtipo.
	*
	* @param tipoId the tipo ID of this subtipo
	*/
	@Override
	public void setTipoId(long tipoId) {
		_subtipo.setTipoId(tipoId);
	}

	/**
	* Sets the user ID of this subtipo.
	*
	* @param userId the user ID of this subtipo
	*/
	@Override
	public void setUserId(long userId) {
		_subtipo.setUserId(userId);
	}

	/**
	* Sets the user name of this subtipo.
	*
	* @param userName the user name of this subtipo
	*/
	@Override
	public void setUserName(String userName) {
		_subtipo.setUserName(userName);
	}

	/**
	* Sets the user uuid of this subtipo.
	*
	* @param userUuid the user uuid of this subtipo
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_subtipo.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this subtipo.
	*
	* @param uuid the uuid of this subtipo
	*/
	@Override
	public void setUuid(String uuid) {
		_subtipo.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Subtipo> toCacheModel() {
		return _subtipo.toCacheModel();
	}

	@Override
	public Subtipo toEscapedModel() {
		return new SubtipoWrapper(_subtipo.toEscapedModel());
	}

	@Override
	public String toString() {
		return _subtipo.toString();
	}

	@Override
	public Subtipo toUnescapedModel() {
		return new SubtipoWrapper(_subtipo.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _subtipo.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SubtipoWrapper)) {
			return false;
		}

		SubtipoWrapper subtipoWrapper = (SubtipoWrapper)obj;

		if (Objects.equals(_subtipo, subtipoWrapper._subtipo)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _subtipo.getStagedModelType();
	}

	@Override
	public Subtipo getWrappedModel() {
		return _subtipo;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _subtipo.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _subtipo.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_subtipo.resetOriginalValues();
	}

	private final Subtipo _subtipo;
}