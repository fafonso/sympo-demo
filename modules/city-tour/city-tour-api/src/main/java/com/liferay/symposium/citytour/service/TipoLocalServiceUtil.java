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
 * Provides the local service utility for Tipo. This utility wraps
 * {@link com.liferay.symposium.citytour.service.impl.TipoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TipoLocalService
 * @see com.liferay.symposium.citytour.service.base.TipoLocalServiceBaseImpl
 * @see com.liferay.symposium.citytour.service.impl.TipoLocalServiceImpl
 * @generated
 */
@ProviderType
public class TipoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.symposium.citytour.service.impl.TipoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the tipo to the database. Also notifies the appropriate model listeners.
	*
	* @param tipo the tipo
	* @return the tipo that was added
	*/
	public static com.liferay.symposium.citytour.model.Tipo addTipo(
		com.liferay.symposium.citytour.model.Tipo tipo) {
		return getService().addTipo(tipo);
	}

	/**
	* Creates a new tipo with the primary key. Does not add the tipo to the database.
	*
	* @param tipoId the primary key for the new tipo
	* @return the new tipo
	*/
	public static com.liferay.symposium.citytour.model.Tipo createTipo(
		long tipoId) {
		return getService().createTipo(tipoId);
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
	* Deletes the tipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo that was removed
	* @throws PortalException if a tipo with the primary key could not be found
	*/
	public static com.liferay.symposium.citytour.model.Tipo deleteTipo(
		long tipoId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTipo(tipoId);
	}

	/**
	* Deletes the tipo from the database. Also notifies the appropriate model listeners.
	*
	* @param tipo the tipo
	* @return the tipo that was removed
	*/
	public static com.liferay.symposium.citytour.model.Tipo deleteTipo(
		com.liferay.symposium.citytour.model.Tipo tipo) {
		return getService().deleteTipo(tipo);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.symposium.citytour.model.Tipo fetchTipo(
		long tipoId) {
		return getService().fetchTipo(tipoId);
	}

	/**
	* Returns the tipo matching the UUID and group.
	*
	* @param uuid the tipo's UUID
	* @param groupId the primary key of the group
	* @return the matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static com.liferay.symposium.citytour.model.Tipo fetchTipoByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchTipoByUuidAndGroupId(uuid, groupId);
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
	* Returns the tipo with the primary key.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo
	* @throws PortalException if a tipo with the primary key could not be found
	*/
	public static com.liferay.symposium.citytour.model.Tipo getTipo(long tipoId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTipo(tipoId);
	}

	/**
	* Returns the tipo matching the UUID and group.
	*
	* @param uuid the tipo's UUID
	* @param groupId the primary key of the group
	* @return the matching tipo
	* @throws PortalException if a matching tipo could not be found
	*/
	public static com.liferay.symposium.citytour.model.Tipo getTipoByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTipoByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the tipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @return the range of tipos
	*/
	public static java.util.List<com.liferay.symposium.citytour.model.Tipo> getTipos(
		int start, int end) {
		return getService().getTipos(start, end);
	}

	/**
	* Returns all the tipos matching the UUID and company.
	*
	* @param uuid the UUID of the tipos
	* @param companyId the primary key of the company
	* @return the matching tipos, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.symposium.citytour.model.Tipo> getTiposByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getTiposByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of tipos matching the UUID and company.
	*
	* @param uuid the UUID of the tipos
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching tipos, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.symposium.citytour.model.Tipo> getTiposByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.symposium.citytour.model.Tipo> orderByComparator) {
		return getService()
				   .getTiposByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of tipos.
	*
	* @return the number of tipos
	*/
	public static int getTiposCount() {
		return getService().getTiposCount();
	}

	/**
	* Updates the tipo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tipo the tipo
	* @return the tipo that was updated
	*/
	public static com.liferay.symposium.citytour.model.Tipo updateTipo(
		com.liferay.symposium.citytour.model.Tipo tipo) {
		return getService().updateTipo(tipo);
	}

	public static TipoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TipoLocalService, TipoLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TipoLocalService.class);

		ServiceTracker<TipoLocalService, TipoLocalService> serviceTracker = new ServiceTracker<TipoLocalService, TipoLocalService>(bundle.getBundleContext(),
				TipoLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}