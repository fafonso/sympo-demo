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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.symposium.citytours.promotions.model.Promotion;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the promotion service. This utility wraps {@link com.liferay.symposium.citytours.promotions.service.persistence.impl.PromotionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromotionPersistence
 * @see com.liferay.symposium.citytours.promotions.service.persistence.impl.PromotionPersistenceImpl
 * @generated
 */
@ProviderType
public class PromotionUtil {
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
	public static void clearCache(Promotion promotion) {
		getPersistence().clearCache(promotion);
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
	public static List<Promotion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Promotion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Promotion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Promotion update(Promotion promotion) {
		return getPersistence().update(promotion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Promotion update(Promotion promotion,
		ServiceContext serviceContext) {
		return getPersistence().update(promotion, serviceContext);
	}

	/**
	* Returns all the promotions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching promotions
	*/
	public static List<Promotion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Promotion> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Promotion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Promotion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findByUuid_First(String uuid,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchByUuid_First(String uuid,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findByUuid_Last(String uuid,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchByUuid_Last(String uuid,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the promotions before and after the current promotion in the ordered set where uuid = &#63;.
	*
	* @param promotionId the primary key of the current promotion
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promotion
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public static Promotion[] findByUuid_PrevAndNext(long promotionId,
		String uuid, OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(promotionId, uuid, orderByComparator);
	}

	/**
	* Removes all the promotions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of promotions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching promotions
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the promotion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPromotionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the promotion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the promotion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the promotion where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the promotion that was removed
	*/
	public static Promotion removeByUUID_G(String uuid, long groupId)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of promotions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching promotions
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the promotions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching promotions
	*/
	public static List<Promotion> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Promotion> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Promotion> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Promotion> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static Promotion[] findByUuid_C_PrevAndNext(long promotionId,
		String uuid, long companyId,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(promotionId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the promotions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of promotions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching promotions
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the promotions where description = &#63;.
	*
	* @param description the description
	* @return the matching promotions
	*/
	public static List<Promotion> findBydescription(String description) {
		return getPersistence().findBydescription(description);
	}

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
	public static List<Promotion> findBydescription(String description,
		int start, int end) {
		return getPersistence().findBydescription(description, start, end);
	}

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
	public static List<Promotion> findBydescription(String description,
		int start, int end, OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .findBydescription(description, start, end, orderByComparator);
	}

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
	public static List<Promotion> findBydescription(String description,
		int start, int end, OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBydescription(description, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findBydescription_First(String description,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findBydescription_First(description, orderByComparator);
	}

	/**
	* Returns the first promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchBydescription_First(String description,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .fetchBydescription_First(description, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findBydescription_Last(String description,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findBydescription_Last(description, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchBydescription_Last(String description,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .fetchBydescription_Last(description, orderByComparator);
	}

	/**
	* Returns the promotions before and after the current promotion in the ordered set where description = &#63;.
	*
	* @param promotionId the primary key of the current promotion
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next promotion
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public static Promotion[] findBydescription_PrevAndNext(long promotionId,
		String description, OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findBydescription_PrevAndNext(promotionId, description,
			orderByComparator);
	}

	/**
	* Removes all the promotions where description = &#63; from the database.
	*
	* @param description the description
	*/
	public static void removeBydescription(String description) {
		getPersistence().removeBydescription(description);
	}

	/**
	* Returns the number of promotions where description = &#63;.
	*
	* @param description the description
	* @return the number of matching promotions
	*/
	public static int countBydescription(String description) {
		return getPersistence().countBydescription(description);
	}

	/**
	* Returns all the promotions where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @return the matching promotions
	*/
	public static List<Promotion> findBypromotionId(long promotionId) {
		return getPersistence().findBypromotionId(promotionId);
	}

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
	public static List<Promotion> findBypromotionId(long promotionId,
		int start, int end) {
		return getPersistence().findBypromotionId(promotionId, start, end);
	}

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
	public static List<Promotion> findBypromotionId(long promotionId,
		int start, int end, OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .findBypromotionId(promotionId, start, end, orderByComparator);
	}

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
	public static List<Promotion> findBypromotionId(long promotionId,
		int start, int end, OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBypromotionId(promotionId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findBypromotionId_First(long promotionId,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findBypromotionId_First(promotionId, orderByComparator);
	}

	/**
	* Returns the first promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchBypromotionId_First(long promotionId,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .fetchBypromotionId_First(promotionId, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion
	* @throws NoSuchPromotionException if a matching promotion could not be found
	*/
	public static Promotion findBypromotionId_Last(long promotionId,
		OrderByComparator<Promotion> orderByComparator)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence()
				   .findBypromotionId_Last(promotionId, orderByComparator);
	}

	/**
	* Returns the last promotion in the ordered set where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	public static Promotion fetchBypromotionId_Last(long promotionId,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence()
				   .fetchBypromotionId_Last(promotionId, orderByComparator);
	}

	/**
	* Removes all the promotions where promotionId = &#63; from the database.
	*
	* @param promotionId the promotion ID
	*/
	public static void removeBypromotionId(long promotionId) {
		getPersistence().removeBypromotionId(promotionId);
	}

	/**
	* Returns the number of promotions where promotionId = &#63;.
	*
	* @param promotionId the promotion ID
	* @return the number of matching promotions
	*/
	public static int countBypromotionId(long promotionId) {
		return getPersistence().countBypromotionId(promotionId);
	}

	/**
	* Caches the promotion in the entity cache if it is enabled.
	*
	* @param promotion the promotion
	*/
	public static void cacheResult(Promotion promotion) {
		getPersistence().cacheResult(promotion);
	}

	/**
	* Caches the promotions in the entity cache if it is enabled.
	*
	* @param promotions the promotions
	*/
	public static void cacheResult(List<Promotion> promotions) {
		getPersistence().cacheResult(promotions);
	}

	/**
	* Creates a new promotion with the primary key. Does not add the promotion to the database.
	*
	* @param promotionId the primary key for the new promotion
	* @return the new promotion
	*/
	public static Promotion create(long promotionId) {
		return getPersistence().create(promotionId);
	}

	/**
	* Removes the promotion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion that was removed
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public static Promotion remove(long promotionId)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence().remove(promotionId);
	}

	public static Promotion updateImpl(Promotion promotion) {
		return getPersistence().updateImpl(promotion);
	}

	/**
	* Returns the promotion with the primary key or throws a {@link NoSuchPromotionException} if it could not be found.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion
	* @throws NoSuchPromotionException if a promotion with the primary key could not be found
	*/
	public static Promotion findByPrimaryKey(long promotionId)
		throws com.liferay.symposium.citytours.promotions.exception.NoSuchPromotionException {
		return getPersistence().findByPrimaryKey(promotionId);
	}

	/**
	* Returns the promotion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion, or <code>null</code> if a promotion with the primary key could not be found
	*/
	public static Promotion fetchByPrimaryKey(long promotionId) {
		return getPersistence().fetchByPrimaryKey(promotionId);
	}

	public static java.util.Map<java.io.Serializable, Promotion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the promotions.
	*
	* @return the promotions
	*/
	public static List<Promotion> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Promotion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Promotion> findAll(int start, int end,
		OrderByComparator<Promotion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Promotion> findAll(int start, int end,
		OrderByComparator<Promotion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the promotions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of promotions.
	*
	* @return the number of promotions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PromotionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PromotionPersistence, PromotionPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(PromotionPersistence.class);

		ServiceTracker<PromotionPersistence, PromotionPersistence> serviceTracker =
			new ServiceTracker<PromotionPersistence, PromotionPersistence>(bundle.getBundleContext(),
				PromotionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}