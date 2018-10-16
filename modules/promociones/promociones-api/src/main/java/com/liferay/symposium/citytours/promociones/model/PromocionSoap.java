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

package com.liferay.symposium.citytours.promociones.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.symposium.citytours.promociones.service.http.PromocionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytours.promociones.service.http.PromocionServiceSoap
 * @generated
 */
@ProviderType
public class PromocionSoap implements Serializable {
	public static PromocionSoap toSoapModel(Promocion model) {
		PromocionSoap soapModel = new PromocionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPromocionId(model.getPromocionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setPrecio(model.getPrecio());
		soapModel.setCiudadDestino(model.getCiudadDestino());
		soapModel.setNombreDestinatario(model.getNombreDestinatario());
		soapModel.setApellidosDestinatario(model.getApellidosDestinatario());
		soapModel.setNifDestinatario(model.getNifDestinatario());
		soapModel.setTelefonoDestinatario(model.getTelefonoDestinatario());

		return soapModel;
	}

	public static PromocionSoap[] toSoapModels(Promocion[] models) {
		PromocionSoap[] soapModels = new PromocionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PromocionSoap[][] toSoapModels(Promocion[][] models) {
		PromocionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PromocionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PromocionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PromocionSoap[] toSoapModels(List<Promocion> models) {
		List<PromocionSoap> soapModels = new ArrayList<PromocionSoap>(models.size());

		for (Promocion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PromocionSoap[soapModels.size()]);
	}

	public PromocionSoap() {
	}

	public long getPrimaryKey() {
		return _promocionId;
	}

	public void setPrimaryKey(long pk) {
		setPromocionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPromocionId() {
		return _promocionId;
	}

	public void setPromocionId(long promocionId) {
		_promocionId = promocionId;
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

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public double getPrecio() {
		return _precio;
	}

	public void setPrecio(double precio) {
		_precio = precio;
	}

	public String getCiudadDestino() {
		return _ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		_ciudadDestino = ciudadDestino;
	}

	public String getNombreDestinatario() {
		return _nombreDestinatario;
	}

	public void setNombreDestinatario(String nombreDestinatario) {
		_nombreDestinatario = nombreDestinatario;
	}

	public String getApellidosDestinatario() {
		return _apellidosDestinatario;
	}

	public void setApellidosDestinatario(String apellidosDestinatario) {
		_apellidosDestinatario = apellidosDestinatario;
	}

	public String getNifDestinatario() {
		return _nifDestinatario;
	}

	public void setNifDestinatario(String nifDestinatario) {
		_nifDestinatario = nifDestinatario;
	}

	public String getTelefonoDestinatario() {
		return _telefonoDestinatario;
	}

	public void setTelefonoDestinatario(String telefonoDestinatario) {
		_telefonoDestinatario = telefonoDestinatario;
	}

	private String _uuid;
	private long _promocionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _descripcion;
	private double _precio;
	private String _ciudadDestino;
	private String _nombreDestinatario;
	private String _apellidosDestinatario;
	private String _nifDestinatario;
	private String _telefonoDestinatario;
}