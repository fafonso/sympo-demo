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

package com.liferay.symposium.citytours.promotions.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException;
import com.liferay.symposium.citytours.promotions.model.Promotion;

/**
 * The persistence interface for the promotion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytours.promotions.service.persistence.impl.PromotionPersistenceImpl
 * @see PromotionUtil
 * @generated
 */
@ProviderType
public interface PromotionPersistence extends BasePersistence<Promotion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PromotionUtil} to access the promotion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the promotions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching promotions
	*/
	public java.util.List<Promotion> findByUuid(String uuid);

	/**
	* Returns a range of all the promotions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @return the range of matching promotions
	*/
	public java.util.List<Promotion> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the promotions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns an ordered range of all the promotions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the first promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the last promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the last promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the promotions before and after the current promotion in the ordered set where uuid = &#63;.
	*
	* @param promotionId the primary key of the current promotion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promotion
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public Promotion[] findByUuid_PrevAndNext(long promotionId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Removes all the promotions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of promotions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching promotions
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the promotion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPromotionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findByUUID_G(String uuid, long groupId)
		throws NoSuchPromotionException;

	/**
	* Returns the promotion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the promotion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the promotion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the promotion that was removed
	*/
	public Promotion removeByUUID_G(String uuid, long groupId)
		throws NoSuchPromotionException;

	/**
	* Returns the number of promotions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching promotions
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the promotions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching promotions
	*/
	public java.util.List<Promotion> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the promotions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @return the range of matching promotions
	*/
	public java.util.List<Promotion> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the promotions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns an ordered range of all the promotions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the first promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the last promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the last promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the promotions before and after the current promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param promotionId the primary key of the current promotion
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promotion
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public Promotion[] findByUuid_C_PrevAndNext(long promotionId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Removes all the promotions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of promotions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching promotions
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the promotions where description = &#63;.
	*
	* @param description the description
	* @return the matching promotions
	*/
	public java.util.List<Promotion> findBydescription(String description);

	/**
	* Returns a range of all the promotions where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @return the range of matching promotions
	*/
	public java.util.List<Promotion> findBydescription(String description,
		int start, int end);

	/**
	* Returns an ordered range of all the promotions where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findBydescription(String description,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns an ordered range of all the promotions where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findBydescription(String description,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findBydescription_First(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the first promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchBydescription_First(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the last promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findBydescription_Last(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the last promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchBydescription_Last(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the promotions before and after the current promotion in the ordered set where description = &#63;.
	*
	* @param promotionId the primary key of the current promotion
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promotion
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public Promotion[] findBydescription_PrevAndNext(long promotionId,
		String description,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Removes all the promotions where description = &#63; from the database.
	*
	* @param description the description
	*/
	public void removeBydescription(String description);

	/**
	* Returns the number of promotions where description = &#63;.
	*
	* @param description the description
	* @return the number of matching promotions
	*/
	public int countBydescription(String description);

	/**
	* Returns all the promotions where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @return the matching promotions
	*/
	public java.util.List<Promotion> findBypromotionId(long promotionId);

	/**
	* Returns a range of all the promotions where promotionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param promotionId the promotion ID
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @return the range of matching promotions
	*/
	public java.util.List<Promotion> findBypromotionId(long promotionId,
		int start, int end);

	/**
	* Returns an ordered range of all the promotions where promotionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param promotionId the promotion ID
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findBypromotionId(long promotionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns an ordered range of all the promotions where promotionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param promotionId the promotion ID
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching promotions
	*/
	public java.util.List<Promotion> findBypromotionId(long promotionId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findBypromotionId_First(long promotionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the first promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchBypromotionId_First(long promotionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the last promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public Promotion findBypromotionId_Last(long promotionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator)
		throws NoSuchPromotionException;

	/**
	* Returns the last promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public Promotion fetchBypromotionId_Last(long promotionId,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Removes all the promotions where promotionId = &#63; from the database.
	*
	* @param promotionId the promotion ID
	*/
	public void removeBypromotionId(long promotionId);

	/**
	* Returns the number of promotions where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @return the number of matching promotions
	*/
	public int countBypromotionId(long promotionId);

	/**
	* Caches the promotion in the entity cache if it is enabled.
	*
	* @param promotion the promotion
	*/
	public void cacheResult(Promotion promotion);

	/**
	* Caches the promotions in the entity cache if it is enabled.
	*
	* @param promotions the promotions
	*/
	public void cacheResult(java.util.List<Promotion> promotions);

	/**
	* Creates a new promotion with the primary key. Does not add the promotion to the database.
	*
	* @param promotionId the primary key for the new promotion
	* @return the new promotion
	*/
	public Promotion create(long promotionId);

	/**
	* Removes the promotion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion that was removed
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public Promotion remove(long promotionId) throws NoSuchPromotionException;

	public Promotion updateImpl(Promotion promotion);

	/**
	* Returns the promotion with the primary key or throws a {@link NoSuchPromotionException} if it could not be found.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public Promotion findByPrimaryKey(long promotionId)
		throws NoSuchPromotionException;

	/**
	* Returns the promotion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion, or <code>null</code> if a promotion with the primary key could not be found
	*/
	public Promotion fetchByPrimaryKey(long promotionId);

	@Override
	public java.util.Map<java.io.Serializable, Promotion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the promotions.
	*
	* @return the promotions
	*/
	public java.util.List<Promotion> findAll();

	/**
	* Returns a range of all the promotions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @return the range of promotions
	*/
	public java.util.List<Promotion> findAll(int start, int end);

	/**
	* Returns an ordered range of all the promotions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of promotions
	*/
	public java.util.List<Promotion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns an ordered range of all the promotions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of promotions
	*/
	public java.util.List<Promotion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the promotions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of promotions.
	*
	* @return the number of promotions
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}