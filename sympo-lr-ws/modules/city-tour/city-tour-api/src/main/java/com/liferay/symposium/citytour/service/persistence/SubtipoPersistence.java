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

import com.liferay.symposium.citytour.exception.NoSuchSubtipoException;
import com.liferay.symposium.citytour.model.Subtipo;

/**
 * The persistence interface for the subtipo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytour.service.persistence.impl.SubtipoPersistenceImpl
 * @see SubtipoUtil
 * @generated
 */
@ProviderType
public interface SubtipoPersistence extends BasePersistence<Subtipo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SubtipoUtil} to access the subtipo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the subtipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching subtipos
	*/
	public java.util.List<Subtipo> findByUuid(String uuid);

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
	public java.util.List<Subtipo> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Subtipo> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

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
	public java.util.List<Subtipo> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public Subtipo findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public Subtipo findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

	/**
	* Returns the subtipos before and after the current subtipo in the ordered set where uuid = &#63;.
	*
	* @param subtipoId the primary key of the current subtipo
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public Subtipo[] findByUuid_PrevAndNext(long subtipoId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Removes all the subtipos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of subtipos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching subtipos
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the subtipo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSubtipoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public Subtipo findByUUID_G(String uuid, long groupId)
		throws NoSuchSubtipoException;

	/**
	* Returns the subtipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the subtipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the subtipo where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the subtipo that was removed
	*/
	public Subtipo removeByUUID_G(String uuid, long groupId)
		throws NoSuchSubtipoException;

	/**
	* Returns the number of subtipos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching subtipos
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the subtipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching subtipos
	*/
	public java.util.List<Subtipo> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Subtipo> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<Subtipo> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

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
	public java.util.List<Subtipo> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public Subtipo findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Returns the first subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public Subtipo findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Returns the last subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

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
	public Subtipo[] findByUuid_C_PrevAndNext(long subtipoId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Removes all the subtipos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of subtipos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching subtipos
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the subtipos where label = &#63;.
	*
	* @param label the label
	* @return the matching subtipos
	*/
	public java.util.List<Subtipo> findBylabel(String label);

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
	public java.util.List<Subtipo> findBylabel(String label, int start, int end);

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
	public java.util.List<Subtipo> findBylabel(String label, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

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
	public java.util.List<Subtipo> findBylabel(String label, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public Subtipo findBylabel_First(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Returns the first subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchBylabel_First(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

	/**
	* Returns the last subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo
	* @throws NoSuchSubtipoException if a matching subtipo could not be found
	*/
	public Subtipo findBylabel_Last(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Returns the last subtipo in the ordered set where label = &#63;.
	*
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	*/
	public Subtipo fetchBylabel_Last(String label,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

	/**
	* Returns the subtipos before and after the current subtipo in the ordered set where label = &#63;.
	*
	* @param subtipoId the primary key of the current subtipo
	* @param label the label
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public Subtipo[] findBylabel_PrevAndNext(long subtipoId, String label,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException;

	/**
	* Removes all the subtipos where label = &#63; from the database.
	*
	* @param label the label
	*/
	public void removeBylabel(String label);

	/**
	* Returns the number of subtipos where label = &#63;.
	*
	* @param label the label
	* @return the number of matching subtipos
	*/
	public int countBylabel(String label);

	/**
	* Caches the subtipo in the entity cache if it is enabled.
	*
	* @param subtipo the subtipo
	*/
	public void cacheResult(Subtipo subtipo);

	/**
	* Caches the subtipos in the entity cache if it is enabled.
	*
	* @param subtipos the subtipos
	*/
	public void cacheResult(java.util.List<Subtipo> subtipos);

	/**
	* Creates a new subtipo with the primary key. Does not add the subtipo to the database.
	*
	* @param subtipoId the primary key for the new subtipo
	* @return the new subtipo
	*/
	public Subtipo create(long subtipoId);

	/**
	* Removes the subtipo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo that was removed
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public Subtipo remove(long subtipoId) throws NoSuchSubtipoException;

	public Subtipo updateImpl(Subtipo subtipo);

	/**
	* Returns the subtipo with the primary key or throws a {@link NoSuchSubtipoException} if it could not be found.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo
	* @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	*/
	public Subtipo findByPrimaryKey(long subtipoId)
		throws NoSuchSubtipoException;

	/**
	* Returns the subtipo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param subtipoId the primary key of the subtipo
	* @return the subtipo, or <code>null</code> if a subtipo with the primary key could not be found
	*/
	public Subtipo fetchByPrimaryKey(long subtipoId);

	@Override
	public java.util.Map<java.io.Serializable, Subtipo> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the subtipos.
	*
	* @return the subtipos
	*/
	public java.util.List<Subtipo> findAll();

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
	public java.util.List<Subtipo> findAll(int start, int end);

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
	public java.util.List<Subtipo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator);

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
	public java.util.List<Subtipo> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Subtipo> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the subtipos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of subtipos.
	*
	* @return the number of subtipos
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}