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
 * This class is a wrapper for {@link Promocion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Promocion
 * @generated
 */
@ProviderType
public class PromocionWrapper implements Promocion, ModelWrapper<Promocion> {
	public PromocionWrapper(Promocion promocion) {
		_promocion = promocion;
	}

	@Override
	public Class<?> getModelClass() {
		return Promocion.class;
	}

	@Override
	public String getModelClassName() {
		return Promocion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("promocionId", getPromocionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("descripcion", getDescripcion());
		attributes.put("precio", getPrecio());
		attributes.put("ciudadDestino", getCiudadDestino());
		attributes.put("nombreDestinatario", getNombreDestinatario());
		attributes.put("apellidosDestinatario", getApellidosDestinatario());
		attributes.put("nifDestinatario", getNifDestinatario());
		attributes.put("telefonoDestinatario", getTelefonoDestinatario());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long promocionId = (Long)attributes.get("promocionId");

		if (promocionId != null) {
			setPromocionId(promocionId);
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

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Double precio = (Double)attributes.get("precio");

		if (precio != null) {
			setPrecio(precio);
		}

		String ciudadDestino = (String)attributes.get("ciudadDestino");

		if (ciudadDestino != null) {
			setCiudadDestino(ciudadDestino);
		}

		String nombreDestinatario = (String)attributes.get("nombreDestinatario");

		if (nombreDestinatario != null) {
			setNombreDestinatario(nombreDestinatario);
		}

		String apellidosDestinatario = (String)attributes.get(
				"apellidosDestinatario");

		if (apellidosDestinatario != null) {
			setApellidosDestinatario(apellidosDestinatario);
		}

		String nifDestinatario = (String)attributes.get("nifDestinatario");

		if (nifDestinatario != null) {
			setNifDestinatario(nifDestinatario);
		}

		String telefonoDestinatario = (String)attributes.get(
				"telefonoDestinatario");

		if (telefonoDestinatario != null) {
			setTelefonoDestinatario(telefonoDestinatario);
		}
	}

	@Override
	public Object clone() {
		return new PromocionWrapper((Promocion)_promocion.clone());
	}

	@Override
	public int compareTo(Promocion promocion) {
		return _promocion.compareTo(promocion);
	}

	/**
	* Returns the apellidos destinatario of this promocion.
	*
	* @return the apellidos destinatario of this promocion
	*/
	@Override
	public String getApellidosDestinatario() {
		return _promocion.getApellidosDestinatario();
	}

	/**
	* Returns the ciudad destino of this promocion.
	*
	* @return the ciudad destino of this promocion
	*/
	@Override
	public String getCiudadDestino() {
		return _promocion.getCiudadDestino();
	}

	/**
	* Returns the company ID of this promocion.
	*
	* @return the company ID of this promocion
	*/
	@Override
	public long getCompanyId() {
		return _promocion.getCompanyId();
	}

	/**
	* Returns the create date of this promocion.
	*
	* @return the create date of this promocion
	*/
	@Override
	public Date getCreateDate() {
		return _promocion.getCreateDate();
	}

	/**
	* Returns the descripcion of this promocion.
	*
	* @return the descripcion of this promocion
	*/
	@Override
	public String getDescripcion() {
		return _promocion.getDescripcion();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _promocion.getExpandoBridge();
	}

	/**
	* Returns the group ID of this promocion.
	*
	* @return the group ID of this promocion
	*/
	@Override
	public long getGroupId() {
		return _promocion.getGroupId();
	}

	/**
	* Returns the modified date of this promocion.
	*
	* @return the modified date of this promocion
	*/
	@Override
	public Date getModifiedDate() {
		return _promocion.getModifiedDate();
	}

	/**
	* Returns the nif destinatario of this promocion.
	*
	* @return the nif destinatario of this promocion
	*/
	@Override
	public String getNifDestinatario() {
		return _promocion.getNifDestinatario();
	}

	/**
	* Returns the nombre destinatario of this promocion.
	*
	* @return the nombre destinatario of this promocion
	*/
	@Override
	public String getNombreDestinatario() {
		return _promocion.getNombreDestinatario();
	}

	/**
	* Returns the precio of this promocion.
	*
	* @return the precio of this promocion
	*/
	@Override
	public double getPrecio() {
		return _promocion.getPrecio();
	}

	/**
	* Returns the primary key of this promocion.
	*
	* @return the primary key of this promocion
	*/
	@Override
	public long getPrimaryKey() {
		return _promocion.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _promocion.getPrimaryKeyObj();
	}

	/**
	* Returns the promocion ID of this promocion.
	*
	* @return the promocion ID of this promocion
	*/
	@Override
	public long getPromocionId() {
		return _promocion.getPromocionId();
	}

	/**
	* Returns the telefono destinatario of this promocion.
	*
	* @return the telefono destinatario of this promocion
	*/
	@Override
	public String getTelefonoDestinatario() {
		return _promocion.getTelefonoDestinatario();
	}

	/**
	* Returns the user ID of this promocion.
	*
	* @return the user ID of this promocion
	*/
	@Override
	public long getUserId() {
		return _promocion.getUserId();
	}

	/**
	* Returns the user name of this promocion.
	*
	* @return the user name of this promocion
	*/
	@Override
	public String getUserName() {
		return _promocion.getUserName();
	}

	/**
	* Returns the user uuid of this promocion.
	*
	* @return the user uuid of this promocion
	*/
	@Override
	public String getUserUuid() {
		return _promocion.getUserUuid();
	}

	/**
	* Returns the uuid of this promocion.
	*
	* @return the uuid of this promocion
	*/
	@Override
	public String getUuid() {
		return _promocion.getUuid();
	}

	@Override
	public int hashCode() {
		return _promocion.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _promocion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _promocion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _promocion.isNew();
	}

	@Override
	public void persist() {
		_promocion.persist();
	}

	/**
	* Sets the apellidos destinatario of this promocion.
	*
	* @param apellidosDestinatario the apellidos destinatario of this promocion
	*/
	@Override
	public void setApellidosDestinatario(String apellidosDestinatario) {
		_promocion.setApellidosDestinatario(apellidosDestinatario);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_promocion.setCachedModel(cachedModel);
	}

	/**
	* Sets the ciudad destino of this promocion.
	*
	* @param ciudadDestino the ciudad destino of this promocion
	*/
	@Override
	public void setCiudadDestino(String ciudadDestino) {
		_promocion.setCiudadDestino(ciudadDestino);
	}

	/**
	* Sets the company ID of this promocion.
	*
	* @param companyId the company ID of this promocion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_promocion.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this promocion.
	*
	* @param createDate the create date of this promocion
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_promocion.setCreateDate(createDate);
	}

	/**
	* Sets the descripcion of this promocion.
	*
	* @param descripcion the descripcion of this promocion
	*/
	@Override
	public void setDescripcion(String descripcion) {
		_promocion.setDescripcion(descripcion);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_promocion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_promocion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_promocion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this promocion.
	*
	* @param groupId the group ID of this promocion
	*/
	@Override
	public void setGroupId(long groupId) {
		_promocion.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this promocion.
	*
	* @param modifiedDate the modified date of this promocion
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_promocion.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_promocion.setNew(n);
	}

	/**
	* Sets the nif destinatario of this promocion.
	*
	* @param nifDestinatario the nif destinatario of this promocion
	*/
	@Override
	public void setNifDestinatario(String nifDestinatario) {
		_promocion.setNifDestinatario(nifDestinatario);
	}

	/**
	* Sets the nombre destinatario of this promocion.
	*
	* @param nombreDestinatario the nombre destinatario of this promocion
	*/
	@Override
	public void setNombreDestinatario(String nombreDestinatario) {
		_promocion.setNombreDestinatario(nombreDestinatario);
	}

	/**
	* Sets the precio of this promocion.
	*
	* @param precio the precio of this promocion
	*/
	@Override
	public void setPrecio(double precio) {
		_promocion.setPrecio(precio);
	}

	/**
	* Sets the primary key of this promocion.
	*
	* @param primaryKey the primary key of this promocion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_promocion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_promocion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the promocion ID of this promocion.
	*
	* @param promocionId the promocion ID of this promocion
	*/
	@Override
	public void setPromocionId(long promocionId) {
		_promocion.setPromocionId(promocionId);
	}

	/**
	* Sets the telefono destinatario of this promocion.
	*
	* @param telefonoDestinatario the telefono destinatario of this promocion
	*/
	@Override
	public void setTelefonoDestinatario(String telefonoDestinatario) {
		_promocion.setTelefonoDestinatario(telefonoDestinatario);
	}

	/**
	* Sets the user ID of this promocion.
	*
	* @param userId the user ID of this promocion
	*/
	@Override
	public void setUserId(long userId) {
		_promocion.setUserId(userId);
	}

	/**
	* Sets the user name of this promocion.
	*
	* @param userName the user name of this promocion
	*/
	@Override
	public void setUserName(String userName) {
		_promocion.setUserName(userName);
	}

	/**
	* Sets the user uuid of this promocion.
	*
	* @param userUuid the user uuid of this promocion
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_promocion.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this promocion.
	*
	* @param uuid the uuid of this promocion
	*/
	@Override
	public void setUuid(String uuid) {
		_promocion.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Promocion> toCacheModel() {
		return _promocion.toCacheModel();
	}

	@Override
	public Promocion toEscapedModel() {
		return new PromocionWrapper(_promocion.toEscapedModel());
	}

	@Override
	public String toString() {
		return _promocion.toString();
	}

	@Override
	public Promocion toUnescapedModel() {
		return new PromocionWrapper(_promocion.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _promocion.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PromocionWrapper)) {
			return false;
		}

		PromocionWrapper promocionWrapper = (PromocionWrapper)obj;

		if (Objects.equals(_promocion, promocionWrapper._promocion)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _promocion.getStagedModelType();
	}

	@Override
	public Promocion getWrappedModel() {
		return _promocion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _promocion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _promocion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_promocion.resetOriginalValues();
	}

	private final Promocion _promocion;
}