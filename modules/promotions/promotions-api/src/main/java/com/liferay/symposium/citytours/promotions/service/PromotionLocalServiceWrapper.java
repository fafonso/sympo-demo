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

package com.liferay.symposium.citytours.promotions.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PromotionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PromotionLocalService
 * @generated
 */
@ProviderType
public class PromotionLocalServiceWrapper implements PromotionLocalService,
	ServiceWrapper<PromotionLocalService> {
	public PromotionLocalServiceWrapper(
		PromotionLocalService promotionLocalService) {
		_promotionLocalService = promotionLocalService;
	}

	/**
	* Adds the promotion to the database. Also notifies the appropriate model listeners.
	*
	* @param promotion the promotion
	* @return the promotion that was added
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion addPromotion(
		com.liferay.symposium.citytours.promotions.model.Promotion promotion) {
		return _promotionLocalService.addPromotion(promotion);
	}

	/**
	* Creates a new promotion with the primary key. Does not add the promotion to the database.
	*
	* @param promotionId the primary key for the new promotion
	* @return the new promotion
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion createPromotion(
		long promotionId) {
		return _promotionLocalService.createPromotion(promotionId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promotionLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the promotion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion that was removed
	* @throws PortalException if a promotion with the primary key could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion deletePromotion(
		long promotionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promotionLocalService.deletePromotion(promotionId);
	}

	/**
	* Deletes the promotion from the database. Also notifies the appropriate model listeners.
	*
	* @param promotion the promotion
	* @return the promotion that was removed
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion deletePromotion(
		com.liferay.symposium.citytours.promotions.model.Promotion promotion) {
		return _promotionLocalService.deletePromotion(promotion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _promotionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _promotionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _promotionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _promotionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _promotionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _promotionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion fetchPromotion(
		long promotionId) {
		return _promotionLocalService.fetchPromotion(promotionId);
	}

	/**
	* Returns the promotion matching the UUID and group.
	*
	* @param uuid the promotion's UUID
	* @param groupId the primary key of the group
	* @return the matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion fetchPromotionByUuidAndGroupId(
		String uuid, long groupId) {
		return _promotionLocalService.fetchPromotionByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _promotionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _promotionLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _promotionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _promotionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promotionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the promotion with the primary key.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion
	* @throws PortalException if a promotion with the primary key could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion getPromotion(
		long promotionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promotionLocalService.getPromotion(promotionId);
	}

	/**
	* Returns the promotion matching the UUID and group.
	*
	* @param uuid the promotion's UUID
	* @param groupId the primary key of the group
	* @return the matching promotion
	* @throws PortalException if a matching promotion could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion getPromotionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promotionLocalService.getPromotionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the promotions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @return the range of promotions
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytours.promotions.model.Promotion> getPromotions(
		int start, int end) {
		return _promotionLocalService.getPromotions(start, end);
	}

	/**
	* Returns all the promotions matching the UUID and company.
	*
	* @param uuid the UUID of the promotions
	* @param companyId the primary key of the company
	* @return the matching promotions, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytours.promotions.model.Promotion> getPromotionsByUuidAndCompanyId(
		String uuid, long companyId) {
		return _promotionLocalService.getPromotionsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of promotions matching the UUID and company.
	*
	* @param uuid the UUID of the promotions
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching promotions, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytours.promotions.model.Promotion> getPromotionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.symposium.citytours.promotions.model.Promotion> orderByComparator) {
		return _promotionLocalService.getPromotionsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of promotions.
	*
	* @return the number of promotions
	*/
	@Override
	public int getPromotionsCount() {
		return _promotionLocalService.getPromotionsCount();
	}

	/**
	* Updates the promotion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param promotion the promotion
	* @return the promotion that was updated
	*/
	@Override
	public com.liferay.symposium.citytours.promotions.model.Promotion updatePromotion(
		com.liferay.symposium.citytours.promotions.model.Promotion promotion) {
		return _promotionLocalService.updatePromotion(promotion);
	}

	@Override
	public PromotionLocalService getWrappedService() {
		return _promotionLocalService;
	}

	@Override
	public void setWrappedService(PromotionLocalService promotionLocalService) {
		_promotionLocalService = promotionLocalService;
	}

	private PromotionLocalService _promotionLocalService;
}