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
 * This class is used by SOAP remote services, specifically {@link com.liferay.symposium.citytour.service.http.TipoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytour.service.http.TipoServiceSoap
 * @generated
 */
@ProviderType
public class TipoSoap implements Serializable {
	public static TipoSoap toSoapModel(Tipo model) {
		TipoSoap soapModel = new TipoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTipoId(model.getTipoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLabel(model.getLabel());

		return soapModel;
	}

	public static TipoSoap[] toSoapModels(Tipo[] models) {
		TipoSoap[] soapModels = new TipoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TipoSoap[][] toSoapModels(Tipo[][] models) {
		TipoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TipoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TipoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TipoSoap[] toSoapModels(List<Tipo> models) {
		List<TipoSoap> soapModels = new ArrayList<TipoSoap>(models.size());

		for (Tipo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TipoSoap[soapModels.size()]);
	}

	public TipoSoap() {
	}

	public long getPrimaryKey() {
		return _tipoId;
	}

	public void setPrimaryKey(long pk) {
		setTipoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTipoId() {
		return _tipoId;
	}

	public void setTipoId(long tipoId) {
		_tipoId = tipoId;
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

	public String getLabel() {
		return _label;
	}

	public void setLabel(String label) {
		_label = label;
	}

	private String _uuid;
	private long _tipoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _label;
}