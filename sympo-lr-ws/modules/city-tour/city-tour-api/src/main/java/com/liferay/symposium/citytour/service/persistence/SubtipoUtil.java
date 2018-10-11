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

import com.liferay.symposium.citytour.model.Subtipo;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the subtipo service. This utility wraps {@link com.liferay.symposium.citytour.service.persistence.impl.SubtipoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubtipoPersistence
 * @see com.liferay.symposium.citytour.service.persistence.impl.SubtipoPersistenceImpl
 * @generated
 */
@ProviderType
public class SubtipoUtil {
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
	public static void clearCache(Subtipo subtipo) {
		getPersistence().clearCache(subtipo);
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
	public static List<Subtipo> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Subtipo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Subtipo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Subtipo update(Subtipo subtipo) {
		return getPersistence().update(subtipo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Subtipo update(Subtipo subtipo, ServiceContext serviceContext) {
		return getPersistence().update(subtipo, serviceContext);
	}

	/**
	* Returns all the subtipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching subtipos
	*/
	public static List<Subtipo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the subtipos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @return the range of matching subtipos
	*/
	public static List<Subtipo> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the subtipos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the subtipos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findByUuid_First(String uuid,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchByUuid_First(String uuid,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findByUuid_Last(String uuid,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchByUuid_Last(String uuid,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the subtipos before and after the current subtipo in the ordered set where uuid = &#63;.
	*
	* @param subtipoId the primary key of the current subtipo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public static Subtipo[] findByUuid_PrevAndNext(long subtipoId, String uuid,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence()
				   .findByUuid_PrevAndNext(subtipoId, uuid, orderByComparator);
	}

	/**
	* Removes all the subtipos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of subtipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching subtipos
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the subtipo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSubtipoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the subtipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the subtipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the subtipo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the subtipo that was removed
	*/
	public static Subtipo removeByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of subtipos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching subtipos
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the subtipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching subtipos
	*/
	public static List<Subtipo> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the subtipos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @return the range of matching subtipos
	*/
	public static List<Subtipo> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the subtipos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the subtipos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Subtipo> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the subtipos before and after the current subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param subtipoId the primary key of the current subtipo
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public static Subtipo[] findByUuid_C_PrevAndNext(long subtipoId,
		String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(subtipoId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the subtipos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of subtipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching subtipos
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the subtipos where label = &#63;.
	*
	* @param label the label
	* @return the matching subtipos
	*/
	public static List<Subtipo> findBylabel(String label) {
		return getPersistence().findBylabel(label);
	}

	/**
	* Returns a range of all the subtipos where label = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param label the label
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @return the range of matching subtipos
	*/
	public static List<Subtipo> findBylabel(String label, int start, int end) {
		return getPersistence().findBylabel(label, start, end);
	}

	/**
	* Returns an ordered range of all the subtipos where label = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param label the label
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findBylabel(String label, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().findBylabel(label, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the subtipos where label = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param label the label
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findBylabel(String label, int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBylabel(label, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findBylabel_First(String label,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findBylabel_First(label, orderByComparator);
	}

	/**
	* Returns the first subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchBylabel_First(String label,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().fetchBylabel_First(label, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findBylabel_Last(String label,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findBylabel_Last(label, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchBylabel_Last(String label,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().fetchBylabel_Last(label, orderByComparator);
	}

	/**
	* Returns the subtipos before and after the current subtipo in the ordered set where label = &#63;.
	*
	* @param subtipoId the primary key of the current subtipo
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public static Subtipo[] findBylabel_PrevAndNext(long subtipoId,
		String label, OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence()
				   .findBylabel_PrevAndNext(subtipoId, label, orderByComparator);
	}

	/**
	* Removes all the subtipos where label = &#63; from the database.
	*
	* @param label the label
	*/
	public static void removeBylabel(String label) {
		getPersistence().removeBylabel(label);
	}

	/**
	* Returns the number of subtipos where label = &#63;.
	*
	* @param label the label
	* @return the number of matching subtipos
	*/
	public static int countBylabel(String label) {
		return getPersistence().countBylabel(label);
	}

	/**
	* Returns all the subtipos where tipoId = &#63;.
	*
	* @param tipoId the tipo ID
	* @return the matching subtipos
	*/
	public static List<Subtipo> findBytipoId(long tipoId) {
		return getPersistence().findBytipoId(tipoId);
	}

	/**
	* Returns a range of all the subtipos where tipoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tipoId the tipo ID
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @return the range of matching subtipos
	*/
	public static List<Subtipo> findBytipoId(long tipoId, int start, int end) {
		return getPersistence().findBytipoId(tipoId, start, end);
	}

	/**
	* Returns an ordered range of all the subtipos where tipoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tipoId the tipo ID
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findBytipoId(long tipoId, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence()
				   .findBytipoId(tipoId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the subtipos where tipoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tipoId the tipo ID
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching subtipos
	*/
	public static List<Subtipo> findBytipoId(long tipoId, int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBytipoId(tipoId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first subtipo in the ordered set where tipoId = &#63;.
	*
	* @param tipoId the tipo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findBytipoId_First(long tipoId,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findBytipoId_First(tipoId, orderByComparator);
	}

	/**
	* Returns the first subtipo in the ordered set where tipoId = &#63;.
	*
	* @param tipoId the tipo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchBytipoId_First(long tipoId,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().fetchBytipoId_First(tipoId, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where tipoId = &#63;.
	*
	* @param tipoId the tipo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public static Subtipo findBytipoId_Last(long tipoId,
		OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findBytipoId_Last(tipoId, orderByComparator);
	}

	/**
	* Returns the last subtipo in the ordered set where tipoId = &#63;.
	*
	* @param tipoId the tipo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public static Subtipo fetchBytipoId_Last(long tipoId,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().fetchBytipoId_Last(tipoId, orderByComparator);
	}

	/**
	* Returns the subtipos before and after the current subtipo in the ordered set where tipoId = &#63;.
	*
	* @param subtipoId the primary key of the current subtipo
	* @param tipoId the tipo ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public static Subtipo[] findBytipoId_PrevAndNext(long subtipoId,
		long tipoId, OrderByComparator<Subtipo> orderByComparator)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence()
				   .findBytipoId_PrevAndNext(subtipoId, tipoId,
			orderByComparator);
	}

	/**
	* Removes all the subtipos where tipoId = &#63; from the database.
	*
	* @param tipoId the tipo ID
	*/
	public static void removeBytipoId(long tipoId) {
		getPersistence().removeBytipoId(tipoId);
	}

	/**
	* Returns the number of subtipos where tipoId = &#63;.
	*
	* @param tipoId the tipo ID
	* @return the number of matching subtipos
	*/
	public static int countBytipoId(long tipoId) {
		return getPersistence().countBytipoId(tipoId);
	}

	/**
	* Caches the subtipo in the entity cache if it is enabled.
	*
	* @param subtipo the subtipo
	*/
	public static void cacheResult(Subtipo subtipo) {
		getPersistence().cacheResult(subtipo);
	}

	/**
	* Caches the subtipos in the entity cache if it is enabled.
	*
	* @param subtipos the subtipos
	*/
	public static void cacheResult(List<Subtipo> subtipos) {
		getPersistence().cacheResult(subtipos);
	}

	/**
	* Creates a new subtipo with the primary key. Does not add the subtipo to the database.
	*
	* @param subtipoId the primary key for the new subtipo
	* @return the new subtipo
	*/
	public static Subtipo create(long subtipoId) {
		return getPersistence().create(subtipoId);
	}

	/**
	* Removes the subtipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo that was removed
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public static Subtipo remove(long subtipoId)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().remove(subtipoId);
	}

	public static Subtipo updateImpl(Subtipo subtipo) {
		return getPersistence().updateImpl(subtipo);
	}

	/**
	* Returns the subtipo with the primary key or throws a {@link NoSuchSubtipoException} if it could not be found.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public static Subtipo findByPrimaryKey(long subtipoId)
		throws com.liferay.symposium.citytour.exception.NoSuchSubtipoException {
		return getPersistence().findByPrimaryKey(subtipoId);
	}

	/**
	* Returns the subtipo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo, or <code>null</code> if a subtipo with the primary key could not be found
	*/
	public static Subtipo fetchByPrimaryKey(long subtipoId) {
		return getPersistence().fetchByPrimaryKey(subtipoId);
	}

	public static java.util.Map<java.io.Serializable, Subtipo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the subtipos.
	*
	* @return the subtipos
	*/
	public static List<Subtipo> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the subtipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @return the range of subtipos
	*/
	public static List<Subtipo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the subtipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of subtipos
	*/
	public static List<Subtipo> findAll(int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the subtipos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of subtipos
	* @param end the upper bound of the range of subtipos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of subtipos
	*/
	public static List<Subtipo> findAll(int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the subtipos from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of subtipos.
	*
	* @return the number of subtipos
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static SubtipoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SubtipoPersistence, SubtipoPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SubtipoPersistence.class);

		ServiceTracker<SubtipoPersistence, SubtipoPersistence> serviceTracker = new ServiceTracker<SubtipoPersistence, SubtipoPersistence>(bundle.getBundleContext(),
				SubtipoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}