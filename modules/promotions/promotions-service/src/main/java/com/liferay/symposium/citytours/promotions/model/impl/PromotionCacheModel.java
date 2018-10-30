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

package com.liferay.symposium.citytours.promotions.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;

import com.liferay.symposium.citytours.promotions.model.Promotion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Promotion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Promotion
 * @generated
 */
@ProviderType
public class PromotionCacheModel implements CacheModel<Promotion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PromotionCacheModel)) {
			return false;
		}

		PromotionCacheModel promotionCacheModel = (PromotionCacheModel)obj;

		if (promotionId == promotionCacheModel.promotionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, promotionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", promotionId=");
		sb.append(promotionId);
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
		sb.append(", description=");
		sb.append(description);
		sb.append(", price=");
		sb.append(price);
		sb.append(", destinationCity=");
		sb.append(destinationCity);
		sb.append(", offereeFirstName=");
		sb.append(offereeFirstName);
		sb.append(", offereeLastName=");
		sb.append(offereeLastName);
		sb.append(", offereeIdNumber=");
		sb.append(offereeIdNumber);
		sb.append(", offereeTelephone=");
		sb.append(offereeTelephone);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Promotion toEntityModel() {
		PromotionImpl promotionImpl = new PromotionImpl();

		if (uuid == null) {
			promotionImpl.setUuid("");
		}
		else {
			promotionImpl.setUuid(uuid);
		}

		promotionImpl.setPromotionId(promotionId);
		promotionImpl.setGroupId(groupId);
		promotionImpl.setCompanyId(companyId);
		promotionImpl.setUserId(userId);

		if (userName == null) {
			promotionImpl.setUserName("");
		}
		else {
			promotionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			promotionImpl.setCreateDate(null);
		}
		else {
			promotionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			promotionImpl.setModifiedDate(null);
		}
		else {
			promotionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (description == null) {
			promotionImpl.setDescription("");
		}
		else {
			promotionImpl.setDescription(description);
		}

		promotionImpl.setPrice(price);

		if (destinationCity == null) {
			promotionImpl.setDestinationCity("");
		}
		else {
			promotionImpl.setDestinationCity(destinationCity);
		}

		if (offereeFirstName == null) {
			promotionImpl.setOffereeFirstName("");
		}
		else {
			promotionImpl.setOffereeFirstName(offereeFirstName);
		}

		if (offereeLastName == null) {
			promotionImpl.setOffereeLastName("");
		}
		else {
			promotionImpl.setOffereeLastName(offereeLastName);
		}

		if (offereeIdNumber == null) {
			promotionImpl.setOffereeIdNumber("");
		}
		else {
			promotionImpl.setOffereeIdNumber(offereeIdNumber);
		}

		if (offereeTelephone == null) {
			promotionImpl.setOffereeTelephone("");
		}
		else {
			promotionImpl.setOffereeTelephone(offereeTelephone);
		}

		promotionImpl.resetOriginalValues();

		return promotionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		promotionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		description = objectInput.readUTF();

		price = objectInput.readDouble();
		destinationCity = objectInput.readUTF();
		offereeFirstName = objectInput.readUTF();
		offereeLastName = objectInput.readUTF();
		offereeIdNumber = objectInput.readUTF();
		offereeTelephone = objectInput.readUTF();
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

		objectOutput.writeLong(promotionId);

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

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeDouble(price);

		if (destinationCity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(destinationCity);
		}

		if (offereeFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(offereeFirstName);
		}

		if (offereeLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(offereeLastName);
		}

		if (offereeIdNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(offereeIdNumber);
		}

		if (offereeTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(offereeTelephone);
		}
	}

	public String uuid;
	public long promotionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String description;
	public double price;
	public String destinationCity;
	public String offereeFirstName;
	public String offereeLastName;
	public String offereeIdNumber;
	public String offereeTelephone;
}