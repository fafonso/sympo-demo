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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Subtipo. This utility wraps
 * {@link com.liferay.symposium.citytour.service.impl.SubtipoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SubtipoLocalService
 * @see com.liferay.symposium.citytour.service.base.SubtipoLocalServiceBaseImpl
 * @see com.liferay.symposium.citytour.service.impl.SubtipoLocalServiceImpl
 * @generated
 */
@ProviderType
public class SubtipoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.symposium.citytour.service.impl.SubtipoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the subtipo to the database. Also notifies the appropriate model listeners.
	*
	* @param subtipo the subtipo
	* @return the subtipo that was added
	*/
	public static com.liferay.symposium.citytour.model.Subtipo addSubtipo(
		com.liferay.symposium.citytour.model.Subtipo subtipo) {
		return getService().addSubtipo(subtipo);
	}

	/**
	* Creates a new subtipo with the primary key. Does not add the subtipo to the database.
	*
	* @param subtipoId the primary key for the new subtipo
	* @return the new subtipo
	*/
	public static com.liferay.symposium.citytour.model.Subtipo createSubtipo(
		long subtipoId) {
		return getService().createSubtipo(subtipoId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the subtipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo that was removed
	* @throws PortalException if a subtipo with the primary key could not be found
	*/
	public static com.liferay.symposium.citytour.model.Subtipo deleteSubtipo(
		long subtipoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSubtipo(subtipoId);
	}

	/**
	* Deletes the subtipo from the database. Also notifies the appropriate model listeners.
	*
	* @param subtipo the subtipo
	* @return the subtipo that was removed
	*/
	public static com.liferay.symposium.citytour.model.Subtipo deleteSubtipo(
		com.liferay.symposium.citytour.model.Subtipo subtipo) {
		return getService().deleteSubtipo(subtipo);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.symposium.citytour.model.Subtipo fetchSubtipo(
		long subtipoId) {
		return getService().fetchSubtipo(subtipoId);
	}

	/**
	* Returns the subtipo matching the UUID and group.
	*
	* @param uuid the subtipo's UUID
	* @param groupId the primary key of the group
	* @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static com.liferay.symposium.citytour.model.Subtipo fetchSubtipoByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchSubtipoByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the subtipo with the primary key.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo
	* @throws PortalException if a subtipo with the primary key could not be found
	*/
	public static com.liferay.symposium.citytour.model.Subtipo getSubtipo(
		long subtipoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSubtipo(subtipoId);
	}

	/**
	* Returns the subtipo matching the UUID and group.
	*
	* @param uuid the subtipo's UUID
	* @param groupId the primary key of the group
	* @return the matching subtipo
	* @throws PortalException if a matching subtipo could not be found
	*/
	public static com.liferay.symposium.citytour.model.Subtipo getSubtipoByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSubtipoByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtipos(
		int start, int end) {
		return getService().getSubtipos(start, end);
	}

	/**
	* Returns all the subtipos matching the UUID and company.
	*
	* @param uuid the UUID of the subtipos
	* @param companyId the primary key of the company
	* @return the matching subtipos, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtiposByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getSubtiposByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtiposByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.symposium.citytour.model.Subtipo> orderByComparator) {
		return getService()
				   .getSubtiposByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of subtipos.
	*
	* @return the number of subtipos
	*/
	public static int getSubtiposCount() {
		return getService().getSubtiposCount();
	}

	public static java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtiposFromTipo(
		long tipoId) {
		return getService().getSubtiposFromTipo(tipoId);
	}

	/**
	* Updates the subtipo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param subtipo the subtipo
	* @return the subtipo that was updated
	*/
	public static com.liferay.symposium.citytour.model.Subtipo updateSubtipo(
		com.liferay.symposium.citytour.model.Subtipo subtipo) {
		return getService().updateSubtipo(subtipo);
	}

	public static SubtipoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SubtipoLocalService, SubtipoLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SubtipoLocalService.class);

		ServiceTracker<SubtipoLocalService, SubtipoLocalService> serviceTracker = new ServiceTracker<SubtipoLocalService, SubtipoLocalService>(bundle.getBundleContext(),
				SubtipoLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}