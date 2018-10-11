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

import com.liferay.symposium.citytour.model.Subtipo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Subtipo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Subtipo
 * @generated
 */
@ProviderType
public class SubtipoCacheModel implements CacheModel<Subtipo>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SubtipoCacheModel)) {
			return false;
		}

		SubtipoCacheModel subtipoCacheModel = (SubtipoCacheModel)obj;

		if (subtipoId == subtipoCacheModel.subtipoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, subtipoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", subtipoId=");
		sb.append(subtipoId);
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
		sb.append(", tipoId=");
		sb.append(tipoId);
		sb.append(", label=");
		sb.append(label);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Subtipo toEntityModel() {
		SubtipoImpl subtipoImpl = new SubtipoImpl();

		if (uuid == null) {
			subtipoImpl.setUuid("");
		}
		else {
			subtipoImpl.setUuid(uuid);
		}

		subtipoImpl.setSubtipoId(subtipoId);
		subtipoImpl.setGroupId(groupId);
		subtipoImpl.setCompanyId(companyId);
		subtipoImpl.setUserId(userId);

		if (userName == null) {
			subtipoImpl.setUserName("");
		}
		else {
			subtipoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			subtipoImpl.setCreateDate(null);
		}
		else {
			subtipoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			subtipoImpl.setModifiedDate(null);
		}
		else {
			subtipoImpl.setModifiedDate(new Date(modifiedDate));
		}

		subtipoImpl.setTipoId(tipoId);

		if (label == null) {
			subtipoImpl.setLabel("");
		}
		else {
			subtipoImpl.setLabel(label);
		}

		subtipoImpl.resetOriginalValues();

		return subtipoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		subtipoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		tipoId = objectInput.readLong();
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

		objectOutput.writeLong(subtipoId);

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

		objectOutput.writeLong(tipoId);

		if (label == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(label);
		}
	}

	public String uuid;
	public long subtipoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long tipoId;
	public String label;
}