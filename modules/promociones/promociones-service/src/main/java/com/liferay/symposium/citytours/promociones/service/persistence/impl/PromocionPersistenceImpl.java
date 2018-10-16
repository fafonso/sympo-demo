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

package com.liferay.symposium.citytours.promociones.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.symposium.citytours.promociones.exception.NoSuchPromocionException;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.model.impl.PromocionImpl;
import com.liferay.symposium.citytours.promociones.model.impl.PromocionModelImpl;
import com.liferay.symposium.citytours.promociones.service.persistence.PromocionPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the promocion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PromocionPersistence
 * @see com.liferay.symposium.citytours.promociones.service.persistence.PromocionUtil
 * @generated
 */
@ProviderType
public class PromocionPersistenceImpl extends BasePersistenceImpl<Promocion>
	implements PromocionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PromocionUtil} to access the promocion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PromocionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			PromocionModelImpl.UUID_COLUMN_BITMASK |
			PromocionModelImpl.DESCRIPCION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the promocions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching promocions
	 */
	@Override
	public List<Promocion> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Promocion> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Promocion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Promocion> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Promocion> findByUuid(String uuid, int start, int end,
		OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Promocion> list = null;

		if (retrieveFromCache) {
			list = (List<Promocion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Promocion promocion : list) {
					if (!Objects.equals(uuid, promocion.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROMOCION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PromocionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first promocion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocion
	 * @throws NoSuchPromocionException if a matching promocion could not be found
	 */
	@Override
	public Promocion findByUuid_First(String uuid,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchByUuid_First(uuid, orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the first promocion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchByUuid_First(String uuid,
		OrderByComparator<Promocion> orderByComparator) {
		List<Promocion> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last promocion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocion
	 * @throws NoSuchPromocionException if a matching promocion could not be found
	 */
	@Override
	public Promocion findByUuid_Last(String uuid,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchByUuid_Last(uuid, orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the last promocion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchByUuid_Last(String uuid,
		OrderByComparator<Promocion> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Promocion> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Promocion[] findByUuid_PrevAndNext(long promocionId, String uuid,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = findByPrimaryKey(promocionId);

		Session session = null;

		try {
			session = openSession();

			Promocion[] array = new PromocionImpl[3];

			array[0] = getByUuid_PrevAndNext(session, promocion, uuid,
					orderByComparator, true);

			array[1] = promocion;

			array[2] = getByUuid_PrevAndNext(session, promocion, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Promocion getByUuid_PrevAndNext(Session session,
		Promocion promocion, String uuid,
		OrderByComparator<Promocion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROMOCION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(PromocionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(promocion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Promocion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the promocions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Promocion promocion : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(promocion);
		}
	}

	/**
	 * Returns the number of promocions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching promocions
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROMOCION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "promocion.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "promocion.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(promocion.uuid IS NULL OR promocion.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			PromocionModelImpl.UUID_COLUMN_BITMASK |
			PromocionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the promocion where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPromocionException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching promocion
	 * @throws NoSuchPromocionException if a matching promocion could not be found
	 */
	@Override
	public Promocion findByUUID_G(String uuid, long groupId)
		throws NoSuchPromocionException {
		Promocion promocion = fetchByUUID_G(uuid, groupId);

		if (promocion == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchPromocionException(msg.toString());
		}

		return promocion;
	}

	/**
	 * Returns the promocion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the promocion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Promocion) {
			Promocion promocion = (Promocion)result;

			if (!Objects.equals(uuid, promocion.getUuid()) ||
					(groupId != promocion.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PROMOCION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Promocion> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Promocion promocion = list.get(0);

					result = promocion;

					cacheResult(promocion);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Promocion)result;
		}
	}

	/**
	 * Removes the promocion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the promocion that was removed
	 */
	@Override
	public Promocion removeByUUID_G(String uuid, long groupId)
		throws NoSuchPromocionException {
		Promocion promocion = findByUUID_G(uuid, groupId);

		return remove(promocion);
	}

	/**
	 * Returns the number of promocions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching promocions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROMOCION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "promocion.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "promocion.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(promocion.uuid IS NULL OR promocion.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "promocion.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			PromocionModelImpl.UUID_COLUMN_BITMASK |
			PromocionModelImpl.COMPANYID_COLUMN_BITMASK |
			PromocionModelImpl.DESCRIPCION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the promocions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching promocions
	 */
	@Override
	public List<Promocion> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Promocion> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Promocion> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Promocion> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Promocion> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Promocion> list = null;

		if (retrieveFromCache) {
			list = (List<Promocion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Promocion promocion : list) {
					if (!Objects.equals(uuid, promocion.getUuid()) ||
							(companyId != promocion.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PROMOCION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PromocionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Promocion findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the first promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator) {
		List<Promocion> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Promocion findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the last promocion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Promocion> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Promocion[] findByUuid_C_PrevAndNext(long promocionId, String uuid,
		long companyId, OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = findByPrimaryKey(promocionId);

		Session session = null;

		try {
			session = openSession();

			Promocion[] array = new PromocionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, promocion, uuid,
					companyId, orderByComparator, true);

			array[1] = promocion;

			array[2] = getByUuid_C_PrevAndNext(session, promocion, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Promocion getByUuid_C_PrevAndNext(Session session,
		Promocion promocion, String uuid, long companyId,
		OrderByComparator<Promocion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PROMOCION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(PromocionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(promocion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Promocion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the promocions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Promocion promocion : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(promocion);
		}
	}

	/**
	 * Returns the number of promocions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching promocions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PROMOCION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "promocion.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "promocion.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(promocion.uuid IS NULL OR promocion.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "promocion.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DESCRIPCION =
		new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydescripcion",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION =
		new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydescripcion",
			new String[] { String.class.getName() },
			PromocionModelImpl.DESCRIPCION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DESCRIPCION = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydescripcion",
			new String[] { String.class.getName() });

	/**
	 * Returns all the promocions where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @return the matching promocions
	 */
	@Override
	public List<Promocion> findBydescripcion(String descripcion) {
		return findBydescripcion(descripcion, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Promocion> findBydescripcion(String descripcion, int start,
		int end) {
		return findBydescripcion(descripcion, start, end, null);
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
	@Override
	public List<Promocion> findBydescripcion(String descripcion, int start,
		int end, OrderByComparator<Promocion> orderByComparator) {
		return findBydescripcion(descripcion, start, end, orderByComparator,
			true);
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
	@Override
	public List<Promocion> findBydescripcion(String descripcion, int start,
		int end, OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION;
			finderArgs = new Object[] { descripcion };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DESCRIPCION;
			finderArgs = new Object[] { descripcion, start, end, orderByComparator };
		}

		List<Promocion> list = null;

		if (retrieveFromCache) {
			list = (List<Promocion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Promocion promocion : list) {
					if (!Objects.equals(descripcion, promocion.getDescripcion())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROMOCION_WHERE);

			boolean bindDescripcion = false;

			if (descripcion == null) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1);
			}
			else if (descripcion.equals("")) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3);
			}
			else {
				bindDescripcion = true;

				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PromocionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescripcion) {
					qPos.add(descripcion);
				}

				if (!pagination) {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first promocion in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocion
	 * @throws NoSuchPromocionException if a matching promocion could not be found
	 */
	@Override
	public Promocion findBydescripcion_First(String descripcion,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchBydescripcion_First(descripcion,
				orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descripcion=");
		msg.append(descripcion);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the first promocion in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchBydescripcion_First(String descripcion,
		OrderByComparator<Promocion> orderByComparator) {
		List<Promocion> list = findBydescripcion(descripcion, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last promocion in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocion
	 * @throws NoSuchPromocionException if a matching promocion could not be found
	 */
	@Override
	public Promocion findBydescripcion_Last(String descripcion,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchBydescripcion_Last(descripcion,
				orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("descripcion=");
		msg.append(descripcion);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the last promocion in the ordered set where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchBydescripcion_Last(String descripcion,
		OrderByComparator<Promocion> orderByComparator) {
		int count = countBydescripcion(descripcion);

		if (count == 0) {
			return null;
		}

		List<Promocion> list = findBydescripcion(descripcion, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Promocion[] findBydescripcion_PrevAndNext(long promocionId,
		String descripcion, OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = findByPrimaryKey(promocionId);

		Session session = null;

		try {
			session = openSession();

			Promocion[] array = new PromocionImpl[3];

			array[0] = getBydescripcion_PrevAndNext(session, promocion,
					descripcion, orderByComparator, true);

			array[1] = promocion;

			array[2] = getBydescripcion_PrevAndNext(session, promocion,
					descripcion, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Promocion getBydescripcion_PrevAndNext(Session session,
		Promocion promocion, String descripcion,
		OrderByComparator<Promocion> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PROMOCION_WHERE);

		boolean bindDescripcion = false;

		if (descripcion == null) {
			query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1);
		}
		else if (descripcion.equals("")) {
			query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3);
		}
		else {
			bindDescripcion = true;

			query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(PromocionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDescripcion) {
			qPos.add(descripcion);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(promocion);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Promocion> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the promocions where descripcion = &#63; from the database.
	 *
	 * @param descripcion the descripcion
	 */
	@Override
	public void removeBydescripcion(String descripcion) {
		for (Promocion promocion : findBydescripcion(descripcion,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(promocion);
		}
	}

	/**
	 * Returns the number of promocions where descripcion = &#63;.
	 *
	 * @param descripcion the descripcion
	 * @return the number of matching promocions
	 */
	@Override
	public int countBydescripcion(String descripcion) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DESCRIPCION;

		Object[] finderArgs = new Object[] { descripcion };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROMOCION_WHERE);

			boolean bindDescripcion = false;

			if (descripcion == null) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1);
			}
			else if (descripcion.equals("")) {
				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3);
			}
			else {
				bindDescripcion = true;

				query.append(_FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescripcion) {
					qPos.add(descripcion);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DESCRIPCION_DESCRIPCION_1 = "promocion.descripcion IS NULL";
	private static final String _FINDER_COLUMN_DESCRIPCION_DESCRIPCION_2 = "promocion.descripcion = ?";
	private static final String _FINDER_COLUMN_DESCRIPCION_DESCRIPCION_3 = "(promocion.descripcion IS NULL OR promocion.descripcion = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PROMOCIONID =
		new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBypromocionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROMOCIONID =
		new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, PromocionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBypromocionId",
			new String[] { Long.class.getName() },
			PromocionModelImpl.PROMOCIONID_COLUMN_BITMASK |
			PromocionModelImpl.DESCRIPCION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PROMOCIONID = new FinderPath(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBypromocionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the promocions where promocionId = &#63;.
	 *
	 * @param promocionId the promocion ID
	 * @return the matching promocions
	 */
	@Override
	public List<Promocion> findBypromocionId(long promocionId) {
		return findBypromocionId(promocionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Promocion> findBypromocionId(long promocionId, int start,
		int end) {
		return findBypromocionId(promocionId, start, end, null);
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
	@Override
	public List<Promocion> findBypromocionId(long promocionId, int start,
		int end, OrderByComparator<Promocion> orderByComparator) {
		return findBypromocionId(promocionId, start, end, orderByComparator,
			true);
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
	@Override
	public List<Promocion> findBypromocionId(long promocionId, int start,
		int end, OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROMOCIONID;
			finderArgs = new Object[] { promocionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PROMOCIONID;
			finderArgs = new Object[] { promocionId, start, end, orderByComparator };
		}

		List<Promocion> list = null;

		if (retrieveFromCache) {
			list = (List<Promocion>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Promocion promocion : list) {
					if ((promocionId != promocion.getPromocionId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PROMOCION_WHERE);

			query.append(_FINDER_COLUMN_PROMOCIONID_PROMOCIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PromocionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(promocionId);

				if (!pagination) {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first promocion in the ordered set where promocionId = &#63;.
	 *
	 * @param promocionId the promocion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocion
	 * @throws NoSuchPromocionException if a matching promocion could not be found
	 */
	@Override
	public Promocion findBypromocionId_First(long promocionId,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchBypromocionId_First(promocionId,
				orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("promocionId=");
		msg.append(promocionId);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the first promocion in the ordered set where promocionId = &#63;.
	 *
	 * @param promocionId the promocion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchBypromocionId_First(long promocionId,
		OrderByComparator<Promocion> orderByComparator) {
		List<Promocion> list = findBypromocionId(promocionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last promocion in the ordered set where promocionId = &#63;.
	 *
	 * @param promocionId the promocion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocion
	 * @throws NoSuchPromocionException if a matching promocion could not be found
	 */
	@Override
	public Promocion findBypromocionId_Last(long promocionId,
		OrderByComparator<Promocion> orderByComparator)
		throws NoSuchPromocionException {
		Promocion promocion = fetchBypromocionId_Last(promocionId,
				orderByComparator);

		if (promocion != null) {
			return promocion;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("promocionId=");
		msg.append(promocionId);

		msg.append("}");

		throw new NoSuchPromocionException(msg.toString());
	}

	/**
	 * Returns the last promocion in the ordered set where promocionId = &#63;.
	 *
	 * @param promocionId the promocion ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching promocion, or <code>null</code> if a matching promocion could not be found
	 */
	@Override
	public Promocion fetchBypromocionId_Last(long promocionId,
		OrderByComparator<Promocion> orderByComparator) {
		int count = countBypromocionId(promocionId);

		if (count == 0) {
			return null;
		}

		List<Promocion> list = findBypromocionId(promocionId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the promocions where promocionId = &#63; from the database.
	 *
	 * @param promocionId the promocion ID
	 */
	@Override
	public void removeBypromocionId(long promocionId) {
		for (Promocion promocion : findBypromocionId(promocionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(promocion);
		}
	}

	/**
	 * Returns the number of promocions where promocionId = &#63;.
	 *
	 * @param promocionId the promocion ID
	 * @return the number of matching promocions
	 */
	@Override
	public int countBypromocionId(long promocionId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PROMOCIONID;

		Object[] finderArgs = new Object[] { promocionId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PROMOCION_WHERE);

			query.append(_FINDER_COLUMN_PROMOCIONID_PROMOCIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(promocionId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PROMOCIONID_PROMOCIONID_2 = "promocion.promocionId = ?";

	public PromocionPersistenceImpl() {
		setModelClass(Promocion.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the promocion in the entity cache if it is enabled.
	 *
	 * @param promocion the promocion
	 */
	@Override
	public void cacheResult(Promocion promocion) {
		entityCache.putResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionImpl.class, promocion.getPrimaryKey(), promocion);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { promocion.getUuid(), promocion.getGroupId() },
			promocion);

		promocion.resetOriginalValues();
	}

	/**
	 * Caches the promocions in the entity cache if it is enabled.
	 *
	 * @param promocions the promocions
	 */
	@Override
	public void cacheResult(List<Promocion> promocions) {
		for (Promocion promocion : promocions) {
			if (entityCache.getResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
						PromocionImpl.class, promocion.getPrimaryKey()) == null) {
				cacheResult(promocion);
			}
			else {
				promocion.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all promocions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PromocionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the promocion.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Promocion promocion) {
		entityCache.removeResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionImpl.class, promocion.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((PromocionModelImpl)promocion, true);
	}

	@Override
	public void clearCache(List<Promocion> promocions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Promocion promocion : promocions) {
			entityCache.removeResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
				PromocionImpl.class, promocion.getPrimaryKey());

			clearUniqueFindersCache((PromocionModelImpl)promocion, true);
		}
	}

	protected void cacheUniqueFindersCache(
		PromocionModelImpl promocionModelImpl) {
		Object[] args = new Object[] {
				promocionModelImpl.getUuid(), promocionModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			promocionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		PromocionModelImpl promocionModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					promocionModelImpl.getUuid(),
					promocionModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((promocionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					promocionModelImpl.getOriginalUuid(),
					promocionModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new promocion with the primary key. Does not add the promocion to the database.
	 *
	 * @param promocionId the primary key for the new promocion
	 * @return the new promocion
	 */
	@Override
	public Promocion create(long promocionId) {
		Promocion promocion = new PromocionImpl();

		promocion.setNew(true);
		promocion.setPrimaryKey(promocionId);

		String uuid = PortalUUIDUtil.generate();

		promocion.setUuid(uuid);

		promocion.setCompanyId(companyProvider.getCompanyId());

		return promocion;
	}

	/**
	 * Removes the promocion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param promocionId the primary key of the promocion
	 * @return the promocion that was removed
	 * @throws NoSuchPromocionException if a promocion with the primary key could not be found
	 */
	@Override
	public Promocion remove(long promocionId) throws NoSuchPromocionException {
		return remove((Serializable)promocionId);
	}

	/**
	 * Removes the promocion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the promocion
	 * @return the promocion that was removed
	 * @throws NoSuchPromocionException if a promocion with the primary key could not be found
	 */
	@Override
	public Promocion remove(Serializable primaryKey)
		throws NoSuchPromocionException {
		Session session = null;

		try {
			session = openSession();

			Promocion promocion = (Promocion)session.get(PromocionImpl.class,
					primaryKey);

			if (promocion == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPromocionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(promocion);
		}
		catch (NoSuchPromocionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Promocion removeImpl(Promocion promocion) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(promocion)) {
				promocion = (Promocion)session.get(PromocionImpl.class,
						promocion.getPrimaryKeyObj());
			}

			if (promocion != null) {
				session.delete(promocion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (promocion != null) {
			clearCache(promocion);
		}

		return promocion;
	}

	@Override
	public Promocion updateImpl(Promocion promocion) {
		boolean isNew = promocion.isNew();

		if (!(promocion instanceof PromocionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(promocion.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(promocion);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in promocion proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Promocion implementation " +
				promocion.getClass());
		}

		PromocionModelImpl promocionModelImpl = (PromocionModelImpl)promocion;

		if (Validator.isNull(promocion.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			promocion.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (promocion.getCreateDate() == null)) {
			if (serviceContext == null) {
				promocion.setCreateDate(now);
			}
			else {
				promocion.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!promocionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				promocion.setModifiedDate(now);
			}
			else {
				promocion.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (promocion.isNew()) {
				session.save(promocion);

				promocion.setNew(false);
			}
			else {
				promocion = (Promocion)session.merge(promocion);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!PromocionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { promocionModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					promocionModelImpl.getUuid(),
					promocionModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { promocionModelImpl.getDescripcion() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DESCRIPCION, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION,
				args);

			args = new Object[] { promocionModelImpl.getPromocionId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PROMOCIONID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROMOCIONID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((promocionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						promocionModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { promocionModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((promocionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						promocionModelImpl.getOriginalUuid(),
						promocionModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						promocionModelImpl.getUuid(),
						promocionModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((promocionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						promocionModelImpl.getOriginalDescripcion()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DESCRIPCION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION,
					args);

				args = new Object[] { promocionModelImpl.getDescripcion() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DESCRIPCION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPCION,
					args);
			}

			if ((promocionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROMOCIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						promocionModelImpl.getOriginalPromocionId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROMOCIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROMOCIONID,
					args);

				args = new Object[] { promocionModelImpl.getPromocionId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PROMOCIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PROMOCIONID,
					args);
			}
		}

		entityCache.putResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
			PromocionImpl.class, promocion.getPrimaryKey(), promocion, false);

		clearUniqueFindersCache(promocionModelImpl, false);
		cacheUniqueFindersCache(promocionModelImpl);

		promocion.resetOriginalValues();

		return promocion;
	}

	/**
	 * Returns the promocion with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the promocion
	 * @return the promocion
	 * @throws NoSuchPromocionException if a promocion with the primary key could not be found
	 */
	@Override
	public Promocion findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPromocionException {
		Promocion promocion = fetchByPrimaryKey(primaryKey);

		if (promocion == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPromocionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return promocion;
	}

	/**
	 * Returns the promocion with the primary key or throws a {@link NoSuchPromocionException} if it could not be found.
	 *
	 * @param promocionId the primary key of the promocion
	 * @return the promocion
	 * @throws NoSuchPromocionException if a promocion with the primary key could not be found
	 */
	@Override
	public Promocion findByPrimaryKey(long promocionId)
		throws NoSuchPromocionException {
		return findByPrimaryKey((Serializable)promocionId);
	}

	/**
	 * Returns the promocion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the promocion
	 * @return the promocion, or <code>null</code> if a promocion with the primary key could not be found
	 */
	@Override
	public Promocion fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
				PromocionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Promocion promocion = (Promocion)serializable;

		if (promocion == null) {
			Session session = null;

			try {
				session = openSession();

				promocion = (Promocion)session.get(PromocionImpl.class,
						primaryKey);

				if (promocion != null) {
					cacheResult(promocion);
				}
				else {
					entityCache.putResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
						PromocionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
					PromocionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return promocion;
	}

	/**
	 * Returns the promocion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param promocionId the primary key of the promocion
	 * @return the promocion, or <code>null</code> if a promocion with the primary key could not be found
	 */
	@Override
	public Promocion fetchByPrimaryKey(long promocionId) {
		return fetchByPrimaryKey((Serializable)promocionId);
	}

	@Override
	public Map<Serializable, Promocion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Promocion> map = new HashMap<Serializable, Promocion>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Promocion promocion = fetchByPrimaryKey(primaryKey);

			if (promocion != null) {
				map.put(primaryKey, promocion);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
					PromocionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Promocion)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PROMOCION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Promocion promocion : (List<Promocion>)q.list()) {
				map.put(promocion.getPrimaryKeyObj(), promocion);

				cacheResult(promocion);

				uncachedPrimaryKeys.remove(promocion.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PromocionModelImpl.ENTITY_CACHE_ENABLED,
					PromocionImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the promocions.
	 *
	 * @return the promocions
	 */
	@Override
	public List<Promocion> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Promocion> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Promocion> findAll(int start, int end,
		OrderByComparator<Promocion> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Promocion> findAll(int start, int end,
		OrderByComparator<Promocion> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Promocion> list = null;

		if (retrieveFromCache) {
			list = (List<Promocion>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PROMOCION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROMOCION;

				if (pagination) {
					sql = sql.concat(PromocionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Promocion>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the promocions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Promocion promocion : findAll()) {
			remove(promocion);
		}
	}

	/**
	 * Returns the number of promocions.
	 *
	 * @return the number of promocions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PROMOCION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PromocionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the promocion persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PromocionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PROMOCION = "SELECT promocion FROM Promocion promocion";
	private static final String _SQL_SELECT_PROMOCION_WHERE_PKS_IN = "SELECT promocion FROM Promocion promocion WHERE promocionId IN (";
	private static final String _SQL_SELECT_PROMOCION_WHERE = "SELECT promocion FROM Promocion promocion WHERE ";
	private static final String _SQL_COUNT_PROMOCION = "SELECT COUNT(promocion) FROM Promocion promocion";
	private static final String _SQL_COUNT_PROMOCION_WHERE = "SELECT COUNT(promocion) FROM Promocion promocion WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "promocion.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Promocion exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Promocion exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(PromocionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}