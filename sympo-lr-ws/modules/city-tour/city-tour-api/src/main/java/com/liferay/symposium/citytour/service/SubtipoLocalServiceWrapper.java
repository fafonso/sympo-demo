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

package com.liferay.symposium.citytour.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubtipoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubtipoLocalService
 * @generated
 */
@ProviderType
public class SubtipoLocalServiceWrapper implements SubtipoLocalService,
	ServiceWrapper<SubtipoLocalService> {
	public SubtipoLocalServiceWrapper(SubtipoLocalService subtipoLocalService) {
		_subtipoLocalService = subtipoLocalService;
	}

	/**
	* Adds the subtipo to the database. Also notifies the appropriate model listeners.
	*
	* @param subtipo the subtipo
	* @return the subtipo that was added
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo addSubtipo(
		com.liferay.symposium.citytour.model.Subtipo subtipo) {
		return _subtipoLocalService.addSubtipo(subtipo);
	}

	/**
	* Creates a new subtipo with the primary key. Does not add the subtipo to the database.
	*
	* @param subtipoId the primary key for the new subtipo
	* @return the new subtipo
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo createSubtipo(
		long subtipoId) {
		return _subtipoLocalService.createSubtipo(subtipoId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _subtipoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the subtipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo that was removed
	* @throws PortalException if a subtipo with the primary key could not be found
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo deleteSubtipo(
		long subtipoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _subtipoLocalService.deleteSubtipo(subtipoId);
	}

	/**
	* Deletes the subtipo from the database. Also notifies the appropriate model listeners.
	*
	* @param subtipo the subtipo
	* @return the subtipo that was removed
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo deleteSubtipo(
		com.liferay.symposium.citytour.model.Subtipo subtipo) {
		return _subtipoLocalService.deleteSubtipo(subtipo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subtipoLocalService.dynamicQuery();
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
		return _subtipoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _subtipoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _subtipoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _subtipoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _subtipoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.symposium.citytour.model.Subtipo fetchSubtipo(
		long subtipoId) {
		return _subtipoLocalService.fetchSubtipo(subtipoId);
	}

	/**
	* Returns the subtipo matching the UUID and group.
	*
	* @param uuid the subtipo's UUID
	* @param groupId the primary key of the group
	* @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo fetchSubtipoByUuidAndGroupId(
		String uuid, long groupId) {
		return _subtipoLocalService.fetchSubtipoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _subtipoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _subtipoLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _subtipoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _subtipoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _subtipoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the subtipo with the primary key.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo
	* @throws PortalException if a subtipo with the primary key could not be found
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo getSubtipo(
		long subtipoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _subtipoLocalService.getSubtipo(subtipoId);
	}

	/**
	* Returns the subtipo matching the UUID and group.
	*
	* @param uuid the subtipo's UUID
	* @param groupId the primary key of the group
	* @return the matching subtipo
	* @throws PortalException if a matching subtipo could not be found
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo getSubtipoByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _subtipoLocalService.getSubtipoByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the subtipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @return the range of subtipos
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtipos(
		int start, int end) {
		return _subtipoLocalService.getSubtipos(start, end);
	}

	/**
	* Returns all the subtipos matching the UUID and company.
	*
	* @param uuid the UUID of the subtipos
	* @param companyId the primary key of the company
	* @return the matching subtipos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtiposByUuidAndCompanyId(
		String uuid, long companyId) {
		return _subtipoLocalService.getSubtiposByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of subtipos matching the UUID and company.
	*
	* @param uuid the UUID of the subtipos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching subtipos, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtiposByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.symposium.citytour.model.Subtipo> orderByComparator) {
		return _subtipoLocalService.getSubtiposByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of subtipos.
	*
	* @return the number of subtipos
	*/
	@Override
	public int getSubtiposCount() {
		return _subtipoLocalService.getSubtiposCount();
	}

	/**
	* Updates the subtipo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subtipo the subtipo
	* @return the subtipo that was updated
	*/
	@Override
	public com.liferay.symposium.citytour.model.Subtipo updateSubtipo(
		com.liferay.symposium.citytour.model.Subtipo subtipo) {
		return _subtipoLocalService.updateSubtipo(subtipo);
	}

	@Override
	public SubtipoLocalService getWrappedService() {
		return _subtipoLocalService;
	}

	@Override
	public void setWrappedService(SubtipoLocalService subtipoLocalService) {
		_subtipoLocalService = subtipoLocalService;
	}

	private SubtipoLocalService _subtipoLocalService;
}