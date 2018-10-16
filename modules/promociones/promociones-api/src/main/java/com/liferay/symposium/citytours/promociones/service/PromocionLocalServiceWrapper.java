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

package com.liferay.symposium.citytours.promociones.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PromocionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PromocionLocalService
 * @generated
 */
@ProviderType
public class PromocionLocalServiceWrapper implements PromocionLocalService,
	ServiceWrapper<PromocionLocalService> {
	public PromocionLocalServiceWrapper(
		PromocionLocalService promocionLocalService) {
		_promocionLocalService = promocionLocalService;
	}

	/**
	* Adds the promocion to the database. Also notifies the appropriate model listeners.
	*
	* @param promocion the promocion
	* @return the promocion that was added
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion addPromocion(
		com.liferay.symposium.citytours.promociones.model.Promocion promocion) {
		return _promocionLocalService.addPromocion(promocion);
	}

	/**
	* Creates a new promocion with the primary key. Does not add the promocion to the database.
	*
	* @param promocionId the primary key for the new promocion
	* @return the new promocion
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion createPromocion(
		long promocionId) {
		return _promocionLocalService.createPromocion(promocionId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promocionLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the promocion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion that was removed
	* @throws PortalException if a promocion with the primary key could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion deletePromocion(
		long promocionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promocionLocalService.deletePromocion(promocionId);
	}

	/**
	* Deletes the promocion from the database. Also notifies the appropriate model listeners.
	*
	* @param promocion the promocion
	* @return the promocion that was removed
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion deletePromocion(
		com.liferay.symposium.citytours.promociones.model.Promocion promocion) {
		return _promocionLocalService.deletePromocion(promocion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _promocionLocalService.dynamicQuery();
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
		return _promocionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promociones.model.impl.PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _promocionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promociones.model.impl.PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _promocionLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _promocionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _promocionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion fetchPromocion(
		long promocionId) {
		return _promocionLocalService.fetchPromocion(promocionId);
	}

	/**
	* Returns the promocion matching the UUID and group.
	*
	* @param uuid the promocion's UUID
	* @param groupId the primary key of the group
	* @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion fetchPromocionByUuidAndGroupId(
		String uuid, long groupId) {
		return _promocionLocalService.fetchPromocionByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _promocionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _promocionLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _promocionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _promocionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promocionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the promocion with the primary key.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion
	* @throws PortalException if a promocion with the primary key could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion getPromocion(
		long promocionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promocionLocalService.getPromocion(promocionId);
	}

	/**
	* Returns the promocion matching the UUID and group.
	*
	* @param uuid the promocion's UUID
	* @param groupId the primary key of the group
	* @return the matching promocion
	* @throws PortalException if a matching promocion could not be found
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion getPromocionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _promocionLocalService.getPromocionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the promocions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promociones.model.impl.PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @return the range of promocions
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytours.promociones.model.Promocion> getPromocions(
		int start, int end) {
		return _promocionLocalService.getPromocions(start, end);
	}

	/**
	* Returns all the promocions matching the UUID and company.
	*
	* @param uuid the UUID of the promocions
	* @param companyId the primary key of the company
	* @return the matching promocions, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytours.promociones.model.Promocion> getPromocionsByUuidAndCompanyId(
		String uuid, long companyId) {
		return _promocionLocalService.getPromocionsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of promocions matching the UUID and company.
	*
	* @param uuid the UUID of the promocions
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching promocions, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytours.promociones.model.Promocion> getPromocionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.symposium.citytours.promociones.model.Promocion> orderByComparator) {
		return _promocionLocalService.getPromocionsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of promocions.
	*
	* @return the number of promocions
	*/
	@Override
	public int getPromocionsCount() {
		return _promocionLocalService.getPromocionsCount();
	}

	/**
	* Updates the promocion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param promocion the promocion
	* @return the promocion that was updated
	*/
	@Override
	public com.liferay.symposium.citytours.promociones.model.Promocion updatePromocion(
		com.liferay.symposium.citytours.promociones.model.Promocion promocion) {
		return _promocionLocalService.updatePromocion(promocion);
	}

	@Override
	public PromocionLocalService getWrappedService() {
		return _promocionLocalService;
	}

	@Override
	public void setWrappedService(PromocionLocalService promocionLocalService) {
		_promocionLocalService = promocionLocalService;
	}

	private PromocionLocalService _promocionLocalService;
}