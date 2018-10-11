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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.symposium.citytour.service.http.SubtipoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytour.service.http.SubtipoServiceSoap
 * @generated
 */
@ProviderType
public class SubtipoSoap implements Serializable {
	public static SubtipoSoap toSoapModel(Subtipo model) {
		SubtipoSoap soapModel = new SubtipoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSubtipoId(model.getSubtipoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTipoId(model.getTipoId());
		soapModel.setLabel(model.getLabel());

		return soapModel;
	}

	public static SubtipoSoap[] toSoapModels(Subtipo[] models) {
		SubtipoSoap[] soapModels = new SubtipoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SubtipoSoap[][] toSoapModels(Subtipo[][] models) {
		SubtipoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SubtipoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SubtipoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SubtipoSoap[] toSoapModels(List<Subtipo> models) {
		List<SubtipoSoap> soapModels = new ArrayList<SubtipoSoap>(models.size());

		for (Subtipo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SubtipoSoap[soapModels.size()]);
	}

	public SubtipoSoap() {
	}

	public long getPrimaryKey() {
		return _subtipoId;
	}

	public void setPrimaryKey(long pk) {
		setSubtipoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSubtipoId() {
		return _subtipoId;
	}

	public void setSubtipoId(long subtipoId) {
		_subtipoId = subtipoId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getTipoId() {
		return _tipoId;
	}

	public void setTipoId(long tipoId) {
		_tipoId = tipoId;
	}

	public String getLabel() {
		return _label;
	}

	public void setLabel(String label) {
		_label = label;
	}

	private String _uuid;
	private long _subtipoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _tipoId;
	private String _label;
}