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

package com.liferay.symposium.citytours.promociones.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import com.liferay.symposium.citytours.promociones.model.Promocion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Promocion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Promocion
 * @generated
 */
@ProviderType
public class PromocionCacheModel implements CacheModel<Promocion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PromocionCacheModel)) {
			return false;
		}

		PromocionCacheModel promocionCacheModel = (PromocionCacheModel)obj;

		if (promocionId == promocionCacheModel.promocionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, promocionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", promocionId=");
		sb.append(promocionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", precio=");
		sb.append(precio);
		sb.append(", ciudadDestino=");
		sb.append(ciudadDestino);
		sb.append(", nombreDestinatario=");
		sb.append(nombreDestinatario);
		sb.append(", apellidosDestinatario=");
		sb.append(apellidosDestinatario);
		sb.append(", nifDestinatario=");
		sb.append(nifDestinatario);
		sb.append(", telefonoDestinatario=");
		sb.append(telefonoDestinatario);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Promocion toEntityModel() {
		PromocionImpl promocionImpl = new PromocionImpl();

		if (uuid == null) {
			promocionImpl.setUuid("");
		}
		else {
			promocionImpl.setUuid(uuid);
		}

		promocionImpl.setPromocionId(promocionId);
		promocionImpl.setGroupId(groupId);
		promocionImpl.setCompanyId(companyId);
		promocionImpl.setUserId(userId);

		if (userName == null) {
			promocionImpl.setUserName("");
		}
		else {
			promocionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			promocionImpl.setCreateDate(null);
		}
		else {
			promocionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			promocionImpl.setModifiedDate(null);
		}
		else {
			promocionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (descripcion == null) {
			promocionImpl.setDescripcion("");
		}
		else {
			promocionImpl.setDescripcion(descripcion);
		}

		promocionImpl.setPrecio(precio);

		if (ciudadDestino == null) {
			promocionImpl.setCiudadDestino("");
		}
		else {
			promocionImpl.setCiudadDestino(ciudadDestino);
		}

		if (nombreDestinatario == null) {
			promocionImpl.setNombreDestinatario("");
		}
		else {
			promocionImpl.setNombreDestinatario(nombreDestinatario);
		}

		if (apellidosDestinatario == null) {
			promocionImpl.setApellidosDestinatario("");
		}
		else {
			promocionImpl.setApellidosDestinatario(apellidosDestinatario);
		}

		if (nifDestinatario == null) {
			promocionImpl.setNifDestinatario("");
		}
		else {
			promocionImpl.setNifDestinatario(nifDestinatario);
		}

		if (telefonoDestinatario == null) {
			promocionImpl.setTelefonoDestinatario("");
		}
		else {
			promocionImpl.setTelefonoDestinatario(telefonoDestinatario);
		}

		promocionImpl.resetOriginalValues();

		return promocionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		promocionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		descripcion = objectInput.readUTF();

		precio = objectInput.readDouble();
		ciudadDestino = objectInput.readUTF();
		nombreDestinatario = objectInput.readUTF();
		apellidosDestinatario = objectInput.readUTF();
		nifDestinatario = objectInput.readUTF();
		telefonoDestinatario = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(promocionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeDouble(precio);

		if (ciudadDestino == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ciudadDestino);
		}

		if (nombreDestinatario == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreDestinatario);
		}

		if (apellidosDestinatario == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apellidosDestinatario);
		}

		if (nifDestinatario == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nifDestinatario);
		}

		if (telefonoDestinatario == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telefonoDestinatario);
		}
	}

	public String uuid;
	public long promocionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String descripcion;
	public double precio;
	public String ciudadDestino;
	public String nombreDestinatario;
	public String apellidosDestinatario;
	public String nifDestinatario;
	public String telefonoDestinatario;
}