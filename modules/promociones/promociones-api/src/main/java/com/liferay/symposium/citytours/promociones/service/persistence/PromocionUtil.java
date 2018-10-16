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

package com.liferay.symposium.citytours.promociones.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.symposium.citytours.promociones.model.Promocion;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the promocion service. This utility wraps {@link com.liferay.symposium.citytours.promociones.service.persistence.impl.PromocionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocionPersistence
 * @see com.liferay.symposium.citytours.promociones.service.persistence.impl.PromocionPersistenceImpl
 * @generated
 */
@ProviderType
public class PromocionUtil {
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
	public static void clearCache(Promocion promocion) {
		getPersistence().clearCache(promocion);
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
	public static List<Promocion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Promocion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Promocion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Promocion update(Promocion promocion) {
		return getPersistence().update(promocion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Promocion update(Promocion promocion,
		ServiceContext serviceContext) {
		return getPersistence().update(promocion, serviceContext);
	}

	/**
	* Returns all the promocions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching promocions
	*/
	public static List<Promocion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the promocions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @return the range of matching promocions
	*/
	public static List<Promocion> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the promocions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the promocions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findByUuid_First(String uuid,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchByUuid_First(String uuid,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findByUuid_Last(String uuid,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchByUuid_Last(String uuid,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the promocions before and after the current promocion in the ordered set where uuid = &#63;.
	*
	* @param promocionId the primary key of the current promocion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promocion
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public static Promocion[] findByUuid_PrevAndNext(long promocionId,
		String uuid, OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(promocionId, uuid, orderByComparator);
	}

	/**
	* Removes all the promocions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of promocions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching promocions
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the promocion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPromocionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the promocion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the promocion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the promocion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the promocion that was removed
	*/
	public static Promocion removeByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of promocions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching promocions
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the promocions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching promocions
	*/
	public static List<Promocion> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the promocions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @return the range of matching promocions
	*/
	public static List<Promocion> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the promocions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the promocions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the promocions before and after the current promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param promocionId the primary key of the current promocion
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promocion
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public static Promocion[] findByUuid_C_PrevAndNext(long promocionId,
		String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(promocionId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the promocions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of promocions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching promocions
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the promocions where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @return the matching promocions
	*/
	public static List<Promocion> findBydescripcion(String descripcion) {
		return getPersistence().findBydescripcion(descripcion);
	}

	/**
	* Returns a range of all the promocions where descripcion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @return the range of matching promocions
	*/
	public static List<Promocion> findBydescripcion(String descripcion,
		int start, int end) {
		return getPersistence().findBydescripcion(descripcion, start, end);
	}

	/**
	* Returns an ordered range of all the promocions where descripcion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findBydescripcion(String descripcion,
		int start, int end, OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .findBydescripcion(descripcion, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the promocions where descripcion = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param descripcion the descripcion
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findBydescripcion(String descripcion,
		int start, int end, OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydescripcion(descripcion, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findBydescripcion_First(String descripcion,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findBydescripcion_First(descripcion, orderByComparator);
	}

	/**
	* Returns the first promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchBydescripcion_First(String descripcion,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .fetchBydescripcion_First(descripcion, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findBydescripcion_Last(String descripcion,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findBydescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchBydescripcion_Last(String descripcion,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .fetchBydescripcion_Last(descripcion, orderByComparator);
	}

	/**
	* Returns the promocions before and after the current promocion in the ordered set where descripcion = &#63;.
	*
	* @param promocionId the primary key of the current promocion
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promocion
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public static Promocion[] findBydescripcion_PrevAndNext(long promocionId,
		String descripcion, OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findBydescripcion_PrevAndNext(promocionId, descripcion,
			orderByComparator);
	}

	/**
	* Removes all the promocions where descripcion = &#63; from the database.
	*
	* @param descripcion the descripcion
	*/
	public static void removeBydescripcion(String descripcion) {
		getPersistence().removeBydescripcion(descripcion);
	}

	/**
	* Returns the number of promocions where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @return the number of matching promocions
	*/
	public static int countBydescripcion(String descripcion) {
		return getPersistence().countBydescripcion(descripcion);
	}

	/**
	* Returns all the promocions where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @return the matching promocions
	*/
	public static List<Promocion> findBypromocionId(long promocionId) {
		return getPersistence().findBypromocionId(promocionId);
	}

	/**
	* Returns a range of all the promocions where promocionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param promocionId the promocion ID
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @return the range of matching promocions
	*/
	public static List<Promocion> findBypromocionId(long promocionId,
		int start, int end) {
		return getPersistence().findBypromocionId(promocionId, start, end);
	}

	/**
	* Returns an ordered range of all the promocions where promocionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param promocionId the promocion ID
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findBypromocionId(long promocionId,
		int start, int end, OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .findBypromocionId(promocionId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the promocions where promocionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param promocionId the promocion ID
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promocions
	*/
	public static List<Promocion> findBypromocionId(long promocionId,
		int start, int end, OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBypromocionId(promocionId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findBypromocionId_First(long promocionId,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findBypromocionId_First(promocionId, orderByComparator);
	}

	/**
	* Returns the first promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchBypromocionId_First(long promocionId,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .fetchBypromocionId_First(promocionId, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public static Promocion findBypromocionId_Last(long promocionId,
		OrderByComparator<Promocion> orderByComparator)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence()
				   .findBypromocionId_Last(promocionId, orderByComparator);
	}

	/**
	* Returns the last promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public static Promocion fetchBypromocionId_Last(long promocionId,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence()
				   .fetchBypromocionId_Last(promocionId, orderByComparator);
	}

	/**
	* Removes all the promocions where promocionId = &#63; from the database.
	*
	* @param promocionId the promocion ID
	*/
	public static void removeBypromocionId(long promocionId) {
		getPersistence().removeBypromocionId(promocionId);
	}

	/**
	* Returns the number of promocions where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @return the number of matching promocions
	*/
	public static int countBypromocionId(long promocionId) {
		return getPersistence().countBypromocionId(promocionId);
	}

	/**
	* Caches the promocion in the entity cache if it is enabled.
	*
	* @param promocion the promocion
	*/
	public static void cacheResult(Promocion promocion) {
		getPersistence().cacheResult(promocion);
	}

	/**
	* Caches the promocions in the entity cache if it is enabled.
	*
	* @param promocions the promocions
	*/
	public static void cacheResult(List<Promocion> promocions) {
		getPersistence().cacheResult(promocions);
	}

	/**
	* Creates a new promocion with the primary key. Does not add the promocion to the database.
	*
	* @param promocionId the primary key for the new promocion
	* @return the new promocion
	*/
	public static Promocion create(long promocionId) {
		return getPersistence().create(promocionId);
	}

	/**
	* Removes the promocion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion that was removed
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public static Promocion remove(long promocionId)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence().remove(promocionId);
	}

	public static Promocion updateImpl(Promocion promocion) {
		return getPersistence().updateImpl(promocion);
	}

	/**
	* Returns the promocion with the primary key or throws a {@link NoSuchPromocionException} if it could not be found.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public static Promocion findByPrimaryKey(long promocionId)
		throws com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException {
		return getPersistence().findByPrimaryKey(promocionId);
	}

	/**
	* Returns the promocion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion, or <code>null</code> if a promocion with the primary key could not be found
	*/
	public static Promocion fetchByPrimaryKey(long promocionId) {
		return getPersistence().fetchByPrimaryKey(promocionId);
	}

	public static java.util.Map<java.io.Serializable, Promocion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the promocions.
	*
	* @return the promocions
	*/
	public static List<Promocion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the promocions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @return the range of promocions
	*/
	public static List<Promocion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the promocions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of promocions
	*/
	public static List<Promocion> findAll(int start, int end,
		OrderByComparator<Promocion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the promocions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromocionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promocions
	* @param end the upper bound of the range of promocions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of promocions
	*/
	public static List<Promocion> findAll(int start, int end,
		OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the promocions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of promocions.
	*
	* @return the number of promocions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PromocionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PromocionPersistence, PromocionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PromocionPersistence.class);

		ServiceTracker<PromocionPersistence, PromocionPersistence> serviceTracker =
			new ServiceTracker<PromocionPersistence, PromocionPersistence>(bundle.getBundleContext(),
				PromocionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}