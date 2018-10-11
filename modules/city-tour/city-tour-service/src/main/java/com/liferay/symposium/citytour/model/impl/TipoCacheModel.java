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

package com.liferay.symposium.citytour.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.liferay.symposium.citytour.model.Tipo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tipo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Tipo
 * @generated
 */
@ProviderType
public class TipoCacheModel implements CacheModel<Tipo>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TipoCacheModel)) {
			return false;
		}

		TipoCacheModel tipoCacheModel = (TipoCacheModel)obj;

		if (tipoId == tipoCacheModel.tipoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tipoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", tipoId=");
		sb.append(tipoId);
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
		sb.append(", label=");
		sb.append(label);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tipo toEntityModel() {
		TipoImpl tipoImpl = new TipoImpl();

		if (uuid == null) {
			tipoImpl.setUuid("");
		}
		else {
			tipoImpl.setUuid(uuid);
		}

		tipoImpl.setTipoId(tipoId);
		tipoImpl.setGroupId(groupId);
		tipoImpl.setCompanyId(companyId);
		tipoImpl.setUserId(userId);

		if (userName == null) {
			tipoImpl.setUserName("");
		}
		else {
			tipoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tipoImpl.setCreateDate(null);
		}
		else {
			tipoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tipoImpl.setModifiedDate(null);
		}
		else {
			tipoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (label == null) {
			tipoImpl.setLabel("");
		}
		else {
			tipoImpl.setLabel(label);
		}

		tipoImpl.resetOriginalValues();

		return tipoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		tipoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		label = objectInput.readUTF();
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

		objectOutput.writeLong(tipoId);

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

		if (label == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(label);
		}
	}

	public String uuid;
	public long tipoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String label;
}