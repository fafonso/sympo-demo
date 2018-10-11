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

package com.liferay.symposium.citytour.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.asset.kernel.service.persistence.AssetEntryPersistence;
import com.liferay.asset.kernel.service.persistence.AssetTagPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.symposium.citytour.model.Subtipo;
import com.liferay.symposium.citytour.service.SubtipoLocalService;
import com.liferay.symposium.citytour.service.persistence.SubtipoPersistence;
import com.liferay.symposium.citytour.service.persistence.TipoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the subtipo local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.symposium.citytour.service.impl.SubtipoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.symposium.citytour.service.impl.SubtipoLocalServiceImpl
 * @see com.liferay.symposium.citytour.service.SubtipoLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class SubtipoLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements SubtipoLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.symposium.citytour.service.SubtipoLocalServiceUtil} to access the subtipo local service.
	 */

	/**
	 * Adds the subtipo to the database. Also notifies the appropriate model listeners.
	 *
	 * @param subtipo the subtipo
	 * @return the subtipo that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Subtipo addSubtipo(Subtipo subtipo) {
		subtipo.setNew(true);

		return subtipoPersistence.update(subtipo);
	}

	/**
	 * Creates a new subtipo with the primary key. Does not add the subtipo to the database.
	 *
	 * @param subtipoId the primary key for the new subtipo
	 * @return the new subtipo
	 */
	@Override
	@Transactional(enabled = false)
	public Subtipo createSubtipo(long subtipoId) {
		return subtipoPersistence.create(subtipoId);
	}

	/**
	 * Deletes the subtipo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subtipoId the primary key of the subtipo
	 * @return the subtipo that was removed
	 * @throws PortalException if a subtipo with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Subtipo deleteSubtipo(long subtipoId) throws PortalException {
		return subtipoPersistence.remove(subtipoId);
	}

	/**
	 * Deletes the subtipo from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subtipo the subtipo
	 * @return the subtipo that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Subtipo deleteSubtipo(Subtipo subtipo) {
		return subtipoPersistence.remove(subtipo);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Subtipo.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return subtipoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return subtipoPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return subtipoPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return subtipoPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return subtipoPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Subtipo fetchSubtipo(long subtipoId) {
		return subtipoPersistence.fetchByPrimaryKey(subtipoId);
	}

	/**
	 * Returns the subtipo matching the UUID and group.
	 *
	 * @param uuid the subtipo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchSubtipoByUuidAndGroupId(String uuid, long groupId) {
		return subtipoPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the subtipo with the primary key.
	 *
	 * @param subtipoId the primary key of the subtipo
	 * @return the subtipo
	 * @throws PortalException if a subtipo with the primary key could not be found
	 */
	@Override
	public Subtipo getSubtipo(long subtipoId) throws PortalException {
		return subtipoPersistence.findByPrimaryKey(subtipoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(subtipoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Subtipo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("subtipoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(subtipoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Subtipo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("subtipoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(subtipoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Subtipo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("subtipoId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(dynamicQuery,
						"modifiedDate");
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Subtipo>() {
				@Override
				public void performAction(Subtipo subtipo)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						subtipo);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(Subtipo.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return subtipoLocalService.deleteSubtipo((Subtipo)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return subtipoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the subtipos matching the UUID and company.
	 *
	 * @param uuid the UUID of the subtipos
	 * @param companyId the primary key of the company
	 * @return the matching subtipos, or an empty list if no matches were found
	 */
	@Override
	public List<Subtipo> getSubtiposByUuidAndCompanyId(String uuid,
		long companyId) {
		return subtipoPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of subtipos matching the UUID and company.
	 *
	 * @param uuid the UUID of the subtipos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of subtipos
	 * @param end the upper bound of the range of subtipos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching subtipos, or an empty list if no matches were found
	 */
	@Override
	public List<Subtipo> getSubtiposByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return subtipoPersistence.findByUuid_C(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	 * Returns the subtipo matching the UUID and group.
	 *
	 * @param uuid the subtipo's UUID
	 * @param groupId the primary key of the group
	 * @return the matching subtipo
	 * @throws PortalException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo getSubtipoByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {
		return subtipoPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the subtipos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.symposium.citytour.model.impl.SubtipoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of subtipos
	 * @param end the upper bound of the range of subtipos (not inclusive)
	 * @return the range of subtipos
	 */
	@Override
	public List<Subtipo> getSubtipos(int start, int end) {
		return subtipoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of subtipos.
	 *
	 * @return the number of subtipos
	 */
	@Override
	public int getSubtiposCount() {
		return subtipoPersistence.countAll();
	}

	/**
	 * Updates the subtipo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param subtipo the subtipo
	 * @return the subtipo that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Subtipo updateSubtipo(Subtipo subtipo) {
		return subtipoPersistence.update(subtipo);
	}

	/**
	 * Returns the subtipo local service.
	 *
	 * @return the subtipo local service
	 */
	public SubtipoLocalService getSubtipoLocalService() {
		return subtipoLocalService;
	}

	/**
	 * Sets the subtipo local service.
	 *
	 * @param subtipoLocalService the subtipo local service
	 */
	public void setSubtipoLocalService(SubtipoLocalService subtipoLocalService) {
		this.subtipoLocalService = subtipoLocalService;
	}

	/**
	 * Returns the subtipo persistence.
	 *
	 * @return the subtipo persistence
	 */
	public SubtipoPersistence getSubtipoPersistence() {
		return subtipoPersistence;
	}

	/**
	 * Sets the subtipo persistence.
	 *
	 * @param subtipoPersistence the subtipo persistence
	 */
	public void setSubtipoPersistence(SubtipoPersistence subtipoPersistence) {
		this.subtipoPersistence = subtipoPersistence;
	}

	/**
	 * Returns the tipo local service.
	 *
	 * @return the tipo local service
	 */
	public com.liferay.symposium.citytour.service.TipoLocalService getTipoLocalService() {
		return tipoLocalService;
	}

	/**
	 * Sets the tipo local service.
	 *
	 * @param tipoLocalService the tipo local service
	 */
	public void setTipoLocalService(
		com.liferay.symposium.citytour.service.TipoLocalService tipoLocalService) {
		this.tipoLocalService = tipoLocalService;
	}

	/**
	 * Returns the tipo persistence.
	 *
	 * @return the tipo persistence
	 */
	public TipoPersistence getTipoPersistence() {
		return tipoPersistence;
	}

	/**
	 * Sets the tipo persistence.
	 *
	 * @param tipoPersistence the tipo persistence
	 */
	public void setTipoPersistence(TipoPersistence tipoPersistence) {
		this.tipoPersistence = tipoPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.asset.kernel.service.AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Returns the asset tag local service.
	 *
	 * @return the asset tag local service
	 */
	public com.liferay.asset.kernel.service.AssetTagLocalService getAssetTagLocalService() {
		return assetTagLocalService;
	}

	/**
	 * Sets the asset tag local service.
	 *
	 * @param assetTagLocalService the asset tag local service
	 */
	public void setAssetTagLocalService(
		com.liferay.asset.kernel.service.AssetTagLocalService assetTagLocalService) {
		this.assetTagLocalService = assetTagLocalService;
	}

	/**
	 * Returns the asset tag persistence.
	 *
	 * @return the asset tag persistence
	 */
	public AssetTagPersistence getAssetTagPersistence() {
		return assetTagPersistence;
	}

	/**
	 * Sets the asset tag persistence.
	 *
	 * @param assetTagPersistence the asset tag persistence
	 */
	public void setAssetTagPersistence(AssetTagPersistence assetTagPersistence) {
		this.assetTagPersistence = assetTagPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.liferay.symposium.citytour.model.Subtipo",
			subtipoLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.liferay.symposium.citytour.model.Subtipo");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SubtipoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Subtipo.class;
	}

	protected String getModelClassName() {
		return Subtipo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = subtipoPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = SubtipoLocalService.class)
	protected SubtipoLocalService subtipoLocalService;
	@BeanReference(type = SubtipoPersistence.class)
	protected SubtipoPersistence subtipoPersistence;
	@BeanReference(type = com.liferay.symposium.citytour.service.TipoLocalService.class)
	protected com.liferay.symposium.citytour.service.TipoLocalService tipoLocalService;
	@BeanReference(type = TipoPersistence.class)
	protected TipoPersistence tipoPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetEntryLocalService.class)
	protected com.liferay.asset.kernel.service.AssetEntryLocalService assetEntryLocalService;
	@ServiceReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	@ServiceReference(type = com.liferay.asset.kernel.service.AssetTagLocalService.class)
	protected com.liferay.asset.kernel.service.AssetTagLocalService assetTagLocalService;
	@ServiceReference(type = AssetTagPersistence.class)
	protected AssetTagPersistence assetTagPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}