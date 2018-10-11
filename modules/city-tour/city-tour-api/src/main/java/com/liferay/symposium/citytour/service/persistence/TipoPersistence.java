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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.symposium.citytour.exception.NoSuchTipoException;
import com.liferay.symposium.citytour.model.Tipo;

/**
 * The persistence interface for the tipo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytour.service.persistence.impl.TipoPersistenceImpl
 * @see TipoUtil
 * @generated
 */
@ProviderType
public interface TipoPersistence extends BasePersistence<Tipo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TipoUtil} to access the tipo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tipos
	*/
	public java.util.List<Tipo> findByUuid(String uuid);

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
	public java.util.List<Tipo> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Tipo> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

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
	public java.util.List<Tipo> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public Tipo findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Returns the first tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

	/**
	* Returns the last tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public Tipo findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Returns the last tipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

	/**
	* Returns the tipos before and after the current tipo in the ordered set where uuid = &#63;.
	*
	* @param tipoId the primary key of the current tipo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tipo
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public Tipo[] findByUuid_PrevAndNext(long tipoId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Removes all the tipos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of tipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tipos
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the tipo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTipoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public Tipo findByUUID_G(String uuid, long groupId)
		throws NoSuchTipoException;

	/**
	* Returns the tipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the tipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the tipo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the tipo that was removed
	*/
	public Tipo removeByUUID_G(String uuid, long groupId)
		throws NoSuchTipoException;

	/**
	* Returns the number of tipos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching tipos
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the tipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching tipos
	*/
	public java.util.List<Tipo> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Tipo> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<Tipo> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

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
	public java.util.List<Tipo> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public Tipo findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Returns the first tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

	/**
	* Returns the last tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public Tipo findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Returns the last tipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

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
	public Tipo[] findByUuid_C_PrevAndNext(long tipoId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Removes all the tipos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of tipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching tipos
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the tipos where label = &#63;.
	*
	* @param label the label
	* @return the matching tipos
	*/
	public java.util.List<Tipo> findBylabel(String label);

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
	public java.util.List<Tipo> findBylabel(String label, int start, int end);

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
	public java.util.List<Tipo> findBylabel(String label, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

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
	public java.util.List<Tipo> findBylabel(String label, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public Tipo findBylabel_First(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Returns the first tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchBylabel_First(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

	/**
	* Returns the last tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo
	* @throws NoSuchTipoException if a matching tipo could not be found
	*/
	public Tipo findBylabel_Last(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Returns the last tipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tipo, or <code>null</code> if a matching tipo could not be found
	*/
	public Tipo fetchBylabel_Last(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

	/**
	* Returns the tipos before and after the current tipo in the ordered set where label = &#63;.
	*
	* @param tipoId the primary key of the current tipo
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tipo
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public Tipo[] findBylabel_PrevAndNext(long tipoId, String label,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator)
		throws NoSuchTipoException;

	/**
	* Removes all the tipos where label = &#63; from the database.
	*
	* @param label the label
	*/
	public void removeBylabel(String label);

	/**
	* Returns the number of tipos where label = &#63;.
	*
	* @param label the label
	* @return the number of matching tipos
	*/
	public int countBylabel(String label);

	/**
	* Caches the tipo in the entity cache if it is enabled.
	*
	* @param tipo the tipo
	*/
	public void cacheResult(Tipo tipo);

	/**
	* Caches the tipos in the entity cache if it is enabled.
	*
	* @param tipos the tipos
	*/
	public void cacheResult(java.util.List<Tipo> tipos);

	/**
	* Creates a new tipo with the primary key. Does not add the tipo to the database.
	*
	* @param tipoId the primary key for the new tipo
	* @return the new tipo
	*/
	public Tipo create(long tipoId);

	/**
	* Removes the tipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo that was removed
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public Tipo remove(long tipoId) throws NoSuchTipoException;

	public Tipo updateImpl(Tipo tipo);

	/**
	* Returns the tipo with the primary key or throws a {@link NoSuchTipoException} if it could not be found.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo
	* @throws NoSuchTipoException if a tipo with the primary key could not be found
	*/
	public Tipo findByPrimaryKey(long tipoId) throws NoSuchTipoException;

	/**
	* Returns the tipo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tipoId the primary key of the tipo
	* @return the tipo, or <code>null</code> if a tipo with the primary key could not be found
	*/
	public Tipo fetchByPrimaryKey(long tipoId);

	@Override
	public java.util.Map<java.io.Serializable, Tipo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tipos.
	*
	* @return the tipos
	*/
	public java.util.List<Tipo> findAll();

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
	public java.util.List<Tipo> findAll(int start, int end);

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
	public java.util.List<Tipo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator);

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
	public java.util.List<Tipo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Tipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tipos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tipos.
	*
	* @return the number of tipos
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}