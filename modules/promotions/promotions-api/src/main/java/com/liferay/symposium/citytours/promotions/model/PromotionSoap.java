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

package com.liferay.symposium.citytours.promotions.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.symposium.citytours.promotions.service.http.PromotionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytours.promotions.service.http.PromotionServiceSoap
 * @generated
 */
@ProviderType
public class PromotionSoap implements Serializable {
	public static PromotionSoap toSoapModel(Promotion model) {
		PromotionSoap soapModel = new PromotionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPromotionId(model.getPromotionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDescription(model.getDescription());
		soapModel.setPrice(model.getPrice());
		soapModel.setDestinationCity(model.getDestinationCity());
		soapModel.setOffereeFirstName(model.getOffereeFirstName());
		soapModel.setOffereeLastName(model.getOffereeLastName());
		soapModel.setOffereeIdNumber(model.getOffereeIdNumber());
		soapModel.setOffereeTelephone(model.getOffereeTelephone());

		return soapModel;
	}

	public static PromotionSoap[] toSoapModels(Promotion[] models) {
		PromotionSoap[] soapModels = new PromotionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PromotionSoap[][] toSoapModels(Promotion[][] models) {
		PromotionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PromotionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PromotionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PromotionSoap[] toSoapModels(List<Promotion> models) {
		List<PromotionSoap> soapModels = new ArrayList<PromotionSoap>(models.size());

		for (Promotion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PromotionSoap[soapModels.size()]);
	}

	public PromotionSoap() {
	}

	public long getPrimaryKey() {
		return _promotionId;
	}

	public void setPrimaryKey(long pk) {
		setPromotionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPromotionId() {
		return _promotionId;
	}

	public void setPromotionId(long promotionId) {
		_promotionId = promotionId;
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

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public String getDestinationCity() {
		return _destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		_destinationCity = destinationCity;
	}

	public String getOffereeFirstName() {
		return _offereeFirstName;
	}

	public void setOffereeFirstName(String offereeFirstName) {
		_offereeFirstName = offereeFirstName;
	}

	public String getOffereeLastName() {
		return _offereeLastName;
	}

	public void setOffereeLastName(String offereeLastName) {
		_offereeLastName = offereeLastName;
	}

	public String getOffereeIdNumber() {
		return _offereeIdNumber;
	}

	public void setOffereeIdNumber(String offereeIdNumber) {
		_offereeIdNumber = offereeIdNumber;
	}

	public String getOffereeTelephone() {
		return _offereeTelephone;
	}

	public void setOffereeTelephone(String offereeTelephone) {
		_offereeTelephone = offereeTelephone;
	}

	private String _uuid;
	private long _promotionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _description;
	private double _price;
	private String _destinationCity;
	private String _offereeFirstName;
	private String _offereeLastName;
	private String _offereeIdNumber;
	private String _offereeTelephone;
}