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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Promocion. This utility wraps
 * {@link com.liferay.symposium.citytours.promociones.service.impl.PromocionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PromocionLocalService
 * @see com.liferay.symposium.citytours.promociones.service.base.PromocionLocalServiceBaseImpl
 * @see com.liferay.symposium.citytours.promociones.service.impl.PromocionLocalServiceImpl
 * @generated
 */
@ProviderType
public class PromocionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.symposium.citytours.promociones.service.impl.PromocionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the promocion to the database. Also notifies the appropriate model listeners.
	*
	* @param promocion the promocion
	* @return the promocion that was added
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion addPromocion(
		com.liferay.symposium.citytours.promociones.model.Promocion promocion) {
		return getService().addPromocion(promocion);
	}

	/**
	* Creates a new promocion with the primary key. Does not add the promocion to the database.
	*
	* @param promocionId the primary key for the new promocion
	* @return the new promocion
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion createPromocion(
		long promocionId) {
		return getService().createPromocion(promocionId);
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
	* Deletes the promocion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion that was removed
	* @throws PortalException if a promocion with the primary key could not be found
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion deletePromocion(
		long promocionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePromocion(promocionId);
	}

	/**
	* Deletes the promocion from the database. Also notifies the appropriate model listeners.
	*
	* @param promocion the promocion
	* @return the promocion that was removed
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion deletePromocion(
		com.liferay.symposium.citytours.promociones.model.Promocion promocion) {
		return getService().deletePromocion(promocion);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promociones.model.impl.PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promociones.model.impl.PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.liferay.symposium.citytours.promociones.model.Promocion fetchPromocion(
		long promocionId) {
		return getService().fetchPromocion(promocionId);
	}

	/**
	* Returns the promocion matching the UUID and group.
	*
	* @param uuid the promocion's UUID
	* @param groupId the primary key of the group
	* @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion fetchPromocionByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchPromocionByUuidAndGroupId(uuid, groupId);
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
	* Returns the promocion with the primary key.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion
	* @throws PortalException if a promocion with the primary key could not be found
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion getPromocion(
		long promocionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPromocion(promocionId);
	}

	/**
	* Returns the promocion matching the UUID and group.
	*
	* @param uuid the promocion's UUID
	* @param groupId the primary key of the group
	* @return the matching promocion
	* @throws PortalException if a matching promocion could not be found
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion getPromocionByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPromocionByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.liferay.symposium.citytours.promociones.model.Promocion> getPromocions(
		int start, int end) {
		return getService().getPromocions(start, end);
	}

	/**
	* Returns all the promocions matching the UUID and company.
	*
	* @param uuid the UUID of the promocions
	* @param companyId the primary key of the company
	* @return the matching promocions, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.symposium.citytours.promociones.model.Promocion> getPromocionsByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getPromocionsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.liferay.symposium.citytours.promociones.model.Promocion> getPromocionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.symposium.citytours.promociones.model.Promocion> orderByComparator) {
		return getService()
				   .getPromocionsByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of promocions.
	*
	* @return the number of promocions
	*/
	public static int getPromocionsCount() {
		return getService().getPromocionsCount();
	}

	/**
	* Updates the promocion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param promocion the promocion
	* @return the promocion that was updated
	*/
	public static com.liferay.symposium.citytours.promociones.model.Promocion updatePromocion(
		com.liferay.symposium.citytours.promociones.model.Promocion promocion) {
		return getService().updatePromocion(promocion);
	}

	public static PromocionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PromocionLocalService, PromocionLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PromocionLocalService.class);

		ServiceTracker<PromocionLocalService, PromocionLocalService> serviceTracker =
			new ServiceTracker<PromocionLocalService, PromocionLocalService>(bundle.getBundleContext(),
				PromocionLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}