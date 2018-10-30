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

package com.liferay.symposium.citytours.promotions.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.symposium.citytours.promotions.model.Promotion;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Promotion. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see PromotionLocalServiceUtil
 * @see com.liferay.symposium.citytours.promotions.service.base.PromotionLocalServiceBaseImpl
 * @see com.liferay.symposium.citytours.promotions.service.impl.PromotionLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface PromotionLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PromotionLocalServiceUtil} to access the promotion local service. Add custom service methods to {@link com.liferay.symposium.citytours.promotions.service.impl.PromotionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the promotion to the database. Also notifies the appropriate model listeners.
	*
	* @param promotion the promotion
	* @return the promotion that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Promotion addPromotion(Promotion promotion);

	/**
	* Creates a new promotion with the primary key. Does not add the promotion to the database.
	*
	* @param promotionId the primary key for the new promotion
	* @return the new promotion
	*/
	@Transactional(enabled = false)
	public Promotion createPromotion(long promotionId);

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	* Deletes the promotion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion that was removed
	* @throws PortalException if a promotion with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Promotion deletePromotion(long promotionId)
		throws PortalException;

	/**
	* Deletes the promotion from the database. Also notifies the appropriate model listeners.
	*
	* @param promotion the promotion
	* @return the promotion that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Promotion deletePromotion(Promotion promotion);

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Promotion fetchPromotion(long promotionId);

	/**
	* Returns the promotion matching the UUID and group.
	*
	* @param uuid the promotion's UUID
	* @param groupId the primary key of the group
	* @return the matching promotion, or <code>null</code> if a matching promotion could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Promotion fetchPromotionByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the promotion with the primary key.
	*
	* @param promotionId the primary key of the promotion
	* @return the promotion
	* @throws PortalException if a promotion with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Promotion getPromotion(long promotionId) throws PortalException;

	/**
	* Returns the promotion matching the UUID and group.
	*
	* @param uuid the promotion's UUID
	* @param groupId the primary key of the group
	* @return the matching promotion
	* @throws PortalException if a matching promotion could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Promotion getPromotionByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the promotions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytours.promotions.model.impl.PromotionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @return the range of promotions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promotion> getPromotions(int start, int end);

	/**
	* Returns all the promotions matching the UUID and company.
	*
	* @param uuid the UUID of the promotions
	* @param companyId the primary key of the company
	* @return the matching promotions, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promotion> getPromotionsByUuidAndCompanyId(String uuid,
		long companyId);

	/**
	* Returns a range of promotions matching the UUID and company.
	*
	* @param uuid the UUID of the promotions
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of promotions
	* @param end the upper bound of the range of promotions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching promotions, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Promotion> getPromotionsByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<Promotion> orderByComparator);

	/**
	* Returns the number of promotions.
	*
	* @return the number of promotions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPromotionsCount();

	/**
	* Updates the promotion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param promotion the promotion
	* @return the promotion that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Promotion updatePromotion(Promotion promotion);
}