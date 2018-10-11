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

package com.liferay.symposium.citytour.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.symposium.citytour.model.Tipo;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the tipo service. This utility wraps {@link com.liferay.symposium.citytour.service.persistence.impl.TipoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TipoPersistence
 * @see com.liferay.symposium.citytour.service.persistence.impl.TipoPersistenceImpl
 * @generated
 */
@ProviderType
public class TipoUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Tipo tipo) {
		getPersistence().clearCache(tipo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Tipo> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tipo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tipo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Tipo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Tipo update(Tipo tipo) {
		return getPersistence().update(tipo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Tipo update(Tipo tipo, ServiceContext serviceContext) {
		return getPersistence().update(tipo, serviceContext);
	}

	/**
	* Returns all the tipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tipos
	*/
	public static List<Tipo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the tipos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @return the range of matching tipos
	*/
	public static List<Tipo> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the tipos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tipos
	*/
	public static List<Tipo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tipos
	*/
	public static List<Tipo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Tipo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public static Tipo findByUuid_First(String uuid,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchByUuid_First(String uuid,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public static Tipo findByUuid_Last(String uuid,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchByUuid_Last(String uuid,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the tipos before and after the current tipo in the ordered set where uuid = &#63;.
	*
	* @param tipoId the primary key of the current tipo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tipo
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public static Tipo[] findByUuid_PrevAndNext(long tipoId, String uuid,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence()
				   .findByUuid_PrevAndNext(tipoId, uuid, orderByComparator);
	}

	/**
	* Removes all the tipos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of tipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tipos
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the tipo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTipoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public static Tipo findByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the tipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the tipo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the tipo that was removed
	*/
	public static Tipo removeByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of tipos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching tipos
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the tipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching tipos
	*/
	public static List<Tipo> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the tipos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @return the range of matching tipos
	*/
	public static List<Tipo> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the tipos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tipos
	*/
	public static List<Tipo> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Tipo> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tipos
	*/
	public static List<Tipo> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Tipo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public static Tipo findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public static Tipo findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the tipos before and after the current tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param tipoId the primary key of the current tipo
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tipo
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public static Tipo[] findByUuid_C_PrevAndNext(long tipoId, String uuid,
		long companyId, OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(tipoId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the tipos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of tipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching tipos
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the tipos where label = &#63;.
	*
	* @param label the label
	* @return the matching tipos
	*/
	public static List<Tipo> findBylabel(String label) {
		return getPersistence().findBylabel(label);
	}

	/**
	* Returns a range of all the tipos where label = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param label the label
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @return the range of matching tipos
	*/
	public static List<Tipo> findBylabel(String label, int start, int end) {
		return getPersistence().findBylabel(label, start, end);
	}

	/**
	* Returns an ordered range of all the tipos where label = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param label the label
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tipos
	*/
	public static List<Tipo> findBylabel(String label, int start, int end,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence().findBylabel(label, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipos where label = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param label the label
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tipos
	*/
	public static List<Tipo> findBylabel(String label, int start, int end,
		OrderByComparator<Tipo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBylabel(label, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public static Tipo findBylabel_First(String label,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().findBylabel_First(label, orderByComparator);
	}

	/**
	* Returns the first tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchBylabel_First(String label,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence().fetchBylabel_First(label, orderByComparator);
	}

	/**
	* Returns the last tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public static Tipo findBylabel_Last(String label,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().findBylabel_Last(label, orderByComparator);
	}

	/**
	* Returns the last tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public static Tipo fetchBylabel_Last(String label,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence().fetchBylabel_Last(label, orderByComparator);
	}

	/**
	* Returns the tipos before and after the current tipo in the ordered set where label = &#63;.
	*
	* @param tipoId the primary key of the current tipo
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tipo
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public static Tipo[] findBylabel_PrevAndNext(long tipoId, String label,
		OrderByComparator<Tipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence()
				   .findBylabel_PrevAndNext(tipoId, label, orderByComparator);
	}

	/**
	* Removes all the tipos where label = &#63; from the database.
	*
	* @param label the label
	*/
	public static void removeBylabel(String label) {
		getPersistence().removeBylabel(label);
	}

	/**
	* Returns the number of tipos where label = &#63;.
	*
	* @param label the label
	* @return the number of matching tipos
	*/
	public static int countBylabel(String label) {
		return getPersistence().countBylabel(label);
	}

	/**
	* Caches the tipo in the entity cache if it is enabled.
	*
	* @param tipo the tipo
	*/
	public static void cacheResult(Tipo tipo) {
		getPersistence().cacheResult(tipo);
	}

	/**
	* Caches the tipos in the entity cache if it is enabled.
	*
	* @param tipos the tipos
	*/
	public static void cacheResult(List<Tipo> tipos) {
		getPersistence().cacheResult(tipos);
	}

	/**
	* Creates a new tipo with the primary key. Does not add the tipo to the database.
	*
	* @param tipoId the primary key for the new tipo
	* @return the new tipo
	*/
	public static Tipo create(long tipoId) {
		return getPersistence().create(tipoId);
	}

	/**
	* Removes the tipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo that was removed
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public static Tipo remove(long tipoId)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().remove(tipoId);
	}

	public static Tipo updateImpl(Tipo tipo) {
		return getPersistence().updateImpl(tipo);
	}

	/**
	* Returns the tipo with the primary key or throws a {@link NoSuchTipoException} if it could not be found.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public static Tipo findByPrimaryKey(long tipoId)
		throws com.liferay.symposium.citytour.exception.NoSuchTipoException {
		return getPersistence().findByPrimaryKey(tipoId);
	}

	/**
	* Returns the tipo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo, or <code>null</code> if a tipo with the primary key could not be found
	*/
	public static Tipo fetchByPrimaryKey(long tipoId) {
		return getPersistence().fetchByPrimaryKey(tipoId);
	}

	public static java.util.Map<java.io.Serializable, Tipo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the tipos.
	*
	* @return the tipos
	*/
	public static List<Tipo> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @return the range of tipos
	*/
	public static List<Tipo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tipos
	*/
	public static List<Tipo> findAll(int start, int end,
		OrderByComparator<Tipo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the tipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tipos
	* @param end the upper bound of the range of tipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tipos
	*/
	public static List<Tipo> findAll(int start, int end,
		OrderByComparator<Tipo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the tipos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tipos.
	*
	* @return the number of tipos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TipoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TipoPersistence, TipoPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TipoPersistence.class);

		ServiceTracker<TipoPersistence, TipoPersistence> serviceTracker = new ServiceTracker<TipoPersistence, TipoPersistence>(bundle.getBundleContext(),
				TipoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}