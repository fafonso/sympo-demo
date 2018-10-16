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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException;
import com.liferay.symposium.citytours.promociones.model.Promocion;

/**
 * The persistence interface for the promocion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytours.promociones.service.persistence.impl.PromocionPersistenceImpl
 * @see PromocionUtil
 * @generated
 */
@ProviderType
public interface PromocionPersistence extends BasePersistence<Promocion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PromocionUtil} to access the promocion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the promocions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching promocions
	*/
	public java.util.List<Promocion> findByUuid(String uuid);

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
	public java.util.List<Promocion> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Promocion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

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
	public java.util.List<Promocion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the first promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

	/**
	* Returns the last promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the last promocion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

	/**
	* Returns the promocions before and after the current promocion in the ordered set where uuid = &#63;.
	*
	* @param promocionId the primary key of the current promocion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promocion
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public Promocion[] findByUuid_PrevAndNext(long promocionId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Removes all the promocions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of promocions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching promocions
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the promocion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPromocionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findByUUID_G(String uuid, long groupId)
		throws NoSuchPromocionException;

	/**
	* Returns the promocion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the promocion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the promocion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the promocion that was removed
	*/
	public Promocion removeByUUID_G(String uuid, long groupId)
		throws NoSuchPromocionException;

	/**
	* Returns the number of promocions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching promocions
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the promocions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching promocions
	*/
	public java.util.List<Promocion> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Promocion> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<Promocion> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

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
	public java.util.List<Promocion> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the first promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

	/**
	* Returns the last promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the last promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

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
	public Promocion[] findByUuid_C_PrevAndNext(long promocionId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Removes all the promocions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of promocions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching promocions
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the promocions where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @return the matching promocions
	*/
	public java.util.List<Promocion> findBydescripcion(String descripcion);

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
	public java.util.List<Promocion> findBydescripcion(String descripcion,
		int start, int end);

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
	public java.util.List<Promocion> findBydescripcion(String descripcion,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

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
	public java.util.List<Promocion> findBydescripcion(String descripcion,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findBydescripcion_First(String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the first promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchBydescripcion_First(String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

	/**
	* Returns the last promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findBydescripcion_Last(String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the last promocion in the ordered set where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchBydescripcion_Last(String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

	/**
	* Returns the promocions before and after the current promocion in the ordered set where descripcion = &#63;.
	*
	* @param promocionId the primary key of the current promocion
	* @param descripcion the descripcion
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promocion
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public Promocion[] findBydescripcion_PrevAndNext(long promocionId,
		String descripcion,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Removes all the promocions where descripcion = &#63; from the database.
	*
	* @param descripcion the descripcion
	*/
	public void removeBydescripcion(String descripcion);

	/**
	* Returns the number of promocions where descripcion = &#63;.
	*
	* @param descripcion the descripcion
	* @return the number of matching promocions
	*/
	public int countBydescripcion(String descripcion);

	/**
	* Returns all the promocions where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @return the matching promocions
	*/
	public java.util.List<Promocion> findBypromocionId(long promocionId);

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
	public java.util.List<Promocion> findBypromocionId(long promocionId,
		int start, int end);

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
	public java.util.List<Promocion> findBypromocionId(long promocionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

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
	public java.util.List<Promocion> findBypromocionId(long promocionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findBypromocionId_First(long promocionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the first promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchBypromocionId_First(long promocionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

	/**
	* Returns the last promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion
	* @throws NoSuchPromocionException if a matching promocion could not be found
	*/
	public Promocion findBypromocionId_Last(long promocionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException;

	/**
	* Returns the last promocion in the ordered set where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	*/
	public Promocion fetchBypromocionId_Last(long promocionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

	/**
	* Removes all the promocions where promocionId = &#63; from the database.
	*
	* @param promocionId the promocion ID
	*/
	public void removeBypromocionId(long promocionId);

	/**
	* Returns the number of promocions where promocionId = &#63;.
	*
	* @param promocionId the promocion ID
	* @return the number of matching promocions
	*/
	public int countBypromocionId(long promocionId);

	/**
	* Caches the promocion in the entity cache if it is enabled.
	*
	* @param promocion the promocion
	*/
	public void cacheResult(Promocion promocion);

	/**
	* Caches the promocions in the entity cache if it is enabled.
	*
	* @param promocions the promocions
	*/
	public void cacheResult(java.util.List<Promocion> promocions);

	/**
	* Creates a new promocion with the primary key. Does not add the promocion to the database.
	*
	* @param promocionId the primary key for the new promocion
	* @return the new promocion
	*/
	public Promocion create(long promocionId);

	/**
	* Removes the promocion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion that was removed
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public Promocion remove(long promocionId) throws NoSuchPromocionException;

	public Promocion updateImpl(Promocion promocion);

	/**
	* Returns the promocion with the primary key or throws a {@link NoSuchPromocionException} if it could not be found.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion
	* @throws NoSuchPromocionException if a promocion with the primary key could not be found
	*/
	public Promocion findByPrimaryKey(long promocionId)
		throws NoSuchPromocionException;

	/**
	* Returns the promocion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param promocionId the primary key of the promocion
	* @return the promocion, or <code>null</code> if a promocion with the primary key could not be found
	*/
	public Promocion fetchByPrimaryKey(long promocionId);

	@Override
	public java.util.Map<java.io.Serializable, Promocion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the promocions.
	*
	* @return the promocions
	*/
	public java.util.List<Promocion> findAll();

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
	public java.util.List<Promocion> findAll(int start, int end);

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
	public java.util.List<Promocion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator);

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
	public java.util.List<Promocion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the promocions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of promocions.
	*
	* @return the number of promocions
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}