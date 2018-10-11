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

package com.liferay.symposium.citytour.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.symposium.citytour.exception.NoSuchSubtipoException;
import com.liferay.symposium.citytour.model.Subtipo;
import com.liferay.symposium.citytour.model.impl.SubtipoImpl;
import com.liferay.symposium.citytour.model.impl.SubtipoModelImpl;
import com.liferay.symposium.citytour.service.persistence.SubtipoPersistence;

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
 * The persistence implementation for the subtipo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubtipoPersistence
 * @see com.liferay.symposium.citytour.service.persistence.SubtipoUtil
 * @generated
 */
@ProviderType
public class SubtipoPersistenceImpl extends BasePersistenceImpl<Subtipo>
	implements SubtipoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SubtipoUtil} to access the subtipo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SubtipoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			SubtipoModelImpl.UUID_COLUMN_BITMASK |
			SubtipoModelImpl.LABEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the subtipos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching subtipos
	 */
	@Override
	public List<Subtipo> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Subtipo> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Subtipo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Subtipo> findByUuid(String uuid, int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
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

		List<Subtipo> list = null;

		if (retrieveFromCache) {
			list = (List<Subtipo>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Subtipo subtipo : list) {
					if (!Objects.equals(uuid, subtipo.getUuid())) {
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

			query.append(_SQL_SELECT_SUBTIPO_WHERE);

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
				query.append(SubtipoModelImpl.ORDER_BY_JPQL);
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
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first subtipo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findByUuid_First(String uuid,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchByUuid_First(uuid, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the first subtipo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchByUuid_First(String uuid,
		OrderByComparator<Subtipo> orderByComparator) {
		List<Subtipo> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subtipo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findByUuid_Last(String uuid,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchByUuid_Last(uuid, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the last subtipo in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchByUuid_Last(String uuid,
		OrderByComparator<Subtipo> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Subtipo> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Subtipo[] findByUuid_PrevAndNext(long subtipoId, String uuid,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = findByPrimaryKey(subtipoId);

		Session session = null;

		try {
			session = openSession();

			Subtipo[] array = new SubtipoImpl[3];

			array[0] = getByUuid_PrevAndNext(session, subtipo, uuid,
					orderByComparator, true);

			array[1] = subtipo;

			array[2] = getByUuid_PrevAndNext(session, subtipo, uuid,
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

	protected Subtipo getByUuid_PrevAndNext(Session session, Subtipo subtipo,
		String uuid, OrderByComparator<Subtipo> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBTIPO_WHERE);

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
			query.append(SubtipoModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(subtipo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Subtipo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subtipos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Subtipo subtipo : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(subtipo);
		}
	}

	/**
	 * Returns the number of subtipos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching subtipos
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUBTIPO_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "subtipo.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "subtipo.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(subtipo.uuid IS NULL OR subtipo.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			SubtipoModelImpl.UUID_COLUMN_BITMASK |
			SubtipoModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the subtipo where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchSubtipoException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findByUUID_G(String uuid, long groupId)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchByUUID_G(uuid, groupId);

		if (subtipo == null) {
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

			throw new NoSuchSubtipoException(msg.toString());
		}

		return subtipo;
	}

	/**
	 * Returns the subtipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the subtipo where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Subtipo) {
			Subtipo subtipo = (Subtipo)result;

			if (!Objects.equals(uuid, subtipo.getUuid()) ||
					(groupId != subtipo.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_SUBTIPO_WHERE);

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

				List<Subtipo> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Subtipo subtipo = list.get(0);

					result = subtipo;

					cacheResult(subtipo);
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
			return (Subtipo)result;
		}
	}

	/**
	 * Removes the subtipo where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the subtipo that was removed
	 */
	@Override
	public Subtipo removeByUUID_G(String uuid, long groupId)
		throws NoSuchSubtipoException {
		Subtipo subtipo = findByUUID_G(uuid, groupId);

		return remove(subtipo);
	}

	/**
	 * Returns the number of subtipos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching subtipos
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SUBTIPO_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "subtipo.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "subtipo.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(subtipo.uuid IS NULL OR subtipo.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "subtipo.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			SubtipoModelImpl.UUID_COLUMN_BITMASK |
			SubtipoModelImpl.COMPANYID_COLUMN_BITMASK |
			SubtipoModelImpl.LABEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the subtipos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching subtipos
	 */
	@Override
	public List<Subtipo> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Subtipo> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Subtipo> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Subtipo> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Subtipo> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Subtipo> orderByComparator,
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

		List<Subtipo> list = null;

		if (retrieveFromCache) {
			list = (List<Subtipo>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Subtipo subtipo : list) {
					if (!Objects.equals(uuid, subtipo.getUuid()) ||
							(companyId != subtipo.getCompanyId())) {
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

			query.append(_SQL_SELECT_SUBTIPO_WHERE);

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
				query.append(SubtipoModelImpl.ORDER_BY_JPQL);
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
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the first subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator) {
		List<Subtipo> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Subtipo findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the last subtipo in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Subtipo> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Subtipo[] findByUuid_C_PrevAndNext(long subtipoId, String uuid,
		long companyId, OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = findByPrimaryKey(subtipoId);

		Session session = null;

		try {
			session = openSession();

			Subtipo[] array = new SubtipoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, subtipo, uuid,
					companyId, orderByComparator, true);

			array[1] = subtipo;

			array[2] = getByUuid_C_PrevAndNext(session, subtipo, uuid,
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

	protected Subtipo getByUuid_C_PrevAndNext(Session session, Subtipo subtipo,
		String uuid, long companyId,
		OrderByComparator<Subtipo> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_SUBTIPO_WHERE);

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
			query.append(SubtipoModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(subtipo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Subtipo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subtipos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Subtipo subtipo : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(subtipo);
		}
	}

	/**
	 * Returns the number of subtipos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching subtipos
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SUBTIPO_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "subtipo.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "subtipo.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(subtipo.uuid IS NULL OR subtipo.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "subtipo.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LABEL = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylabel",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LABEL = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBylabel",
			new String[] { String.class.getName() },
			SubtipoModelImpl.LABEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LABEL = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBylabel",
			new String[] { String.class.getName() });

	/**
	 * Returns all the subtipos where label = &#63;.
	 *
	 * @param label the label
	 * @return the matching subtipos
	 */
	@Override
	public List<Subtipo> findBylabel(String label) {
		return findBylabel(label, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Subtipo> findBylabel(String label, int start, int end) {
		return findBylabel(label, start, end, null);
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
	@Override
	public List<Subtipo> findBylabel(String label, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return findBylabel(label, start, end, orderByComparator, true);
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
	@Override
	public List<Subtipo> findBylabel(String label, int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LABEL;
			finderArgs = new Object[] { label };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LABEL;
			finderArgs = new Object[] { label, start, end, orderByComparator };
		}

		List<Subtipo> list = null;

		if (retrieveFromCache) {
			list = (List<Subtipo>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Subtipo subtipo : list) {
					if (!Objects.equals(label, subtipo.getLabel())) {
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

			query.append(_SQL_SELECT_SUBTIPO_WHERE);

			boolean bindLabel = false;

			if (label == null) {
				query.append(_FINDER_COLUMN_LABEL_LABEL_1);
			}
			else if (label.equals("")) {
				query.append(_FINDER_COLUMN_LABEL_LABEL_3);
			}
			else {
				bindLabel = true;

				query.append(_FINDER_COLUMN_LABEL_LABEL_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SubtipoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLabel) {
					qPos.add(label);
				}

				if (!pagination) {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first subtipo in the ordered set where label = &#63;.
	 *
	 * @param label the label
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findBylabel_First(String label,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchBylabel_First(label, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("label=");
		msg.append(label);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the first subtipo in the ordered set where label = &#63;.
	 *
	 * @param label the label
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchBylabel_First(String label,
		OrderByComparator<Subtipo> orderByComparator) {
		List<Subtipo> list = findBylabel(label, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subtipo in the ordered set where label = &#63;.
	 *
	 * @param label the label
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findBylabel_Last(String label,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchBylabel_Last(label, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("label=");
		msg.append(label);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the last subtipo in the ordered set where label = &#63;.
	 *
	 * @param label the label
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchBylabel_Last(String label,
		OrderByComparator<Subtipo> orderByComparator) {
		int count = countBylabel(label);

		if (count == 0) {
			return null;
		}

		List<Subtipo> list = findBylabel(label, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Subtipo[] findBylabel_PrevAndNext(long subtipoId, String label,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = findByPrimaryKey(subtipoId);

		Session session = null;

		try {
			session = openSession();

			Subtipo[] array = new SubtipoImpl[3];

			array[0] = getBylabel_PrevAndNext(session, subtipo, label,
					orderByComparator, true);

			array[1] = subtipo;

			array[2] = getBylabel_PrevAndNext(session, subtipo, label,
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

	protected Subtipo getBylabel_PrevAndNext(Session session, Subtipo subtipo,
		String label, OrderByComparator<Subtipo> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBTIPO_WHERE);

		boolean bindLabel = false;

		if (label == null) {
			query.append(_FINDER_COLUMN_LABEL_LABEL_1);
		}
		else if (label.equals("")) {
			query.append(_FINDER_COLUMN_LABEL_LABEL_3);
		}
		else {
			bindLabel = true;

			query.append(_FINDER_COLUMN_LABEL_LABEL_2);
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
			query.append(SubtipoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindLabel) {
			qPos.add(label);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(subtipo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Subtipo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subtipos where label = &#63; from the database.
	 *
	 * @param label the label
	 */
	@Override
	public void removeBylabel(String label) {
		for (Subtipo subtipo : findBylabel(label, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(subtipo);
		}
	}

	/**
	 * Returns the number of subtipos where label = &#63;.
	 *
	 * @param label the label
	 * @return the number of matching subtipos
	 */
	@Override
	public int countBylabel(String label) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LABEL;

		Object[] finderArgs = new Object[] { label };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUBTIPO_WHERE);

			boolean bindLabel = false;

			if (label == null) {
				query.append(_FINDER_COLUMN_LABEL_LABEL_1);
			}
			else if (label.equals("")) {
				query.append(_FINDER_COLUMN_LABEL_LABEL_3);
			}
			else {
				bindLabel = true;

				query.append(_FINDER_COLUMN_LABEL_LABEL_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindLabel) {
					qPos.add(label);
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

	private static final String _FINDER_COLUMN_LABEL_LABEL_1 = "subtipo.label IS NULL";
	private static final String _FINDER_COLUMN_LABEL_LABEL_2 = "subtipo.label = ?";
	private static final String _FINDER_COLUMN_LABEL_LABEL_3 = "(subtipo.label IS NULL OR subtipo.label = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TIPOID = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytipoId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPOID =
		new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, SubtipoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytipoId",
			new String[] { Long.class.getName() },
			SubtipoModelImpl.TIPOID_COLUMN_BITMASK |
			SubtipoModelImpl.LABEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TIPOID = new FinderPath(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytipoId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the subtipos where tipoId = &#63;.
	 *
	 * @param tipoId the tipo ID
	 * @return the matching subtipos
	 */
	@Override
	public List<Subtipo> findBytipoId(long tipoId) {
		return findBytipoId(tipoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Subtipo> findBytipoId(long tipoId, int start, int end) {
		return findBytipoId(tipoId, start, end, null);
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
	@Override
	public List<Subtipo> findBytipoId(long tipoId, int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return findBytipoId(tipoId, start, end, orderByComparator, true);
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
	@Override
	public List<Subtipo> findBytipoId(long tipoId, int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPOID;
			finderArgs = new Object[] { tipoId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TIPOID;
			finderArgs = new Object[] { tipoId, start, end, orderByComparator };
		}

		List<Subtipo> list = null;

		if (retrieveFromCache) {
			list = (List<Subtipo>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Subtipo subtipo : list) {
					if ((tipoId != subtipo.getTipoId())) {
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

			query.append(_SQL_SELECT_SUBTIPO_WHERE);

			query.append(_FINDER_COLUMN_TIPOID_TIPOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(SubtipoModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tipoId);

				if (!pagination) {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first subtipo in the ordered set where tipoId = &#63;.
	 *
	 * @param tipoId the tipo ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findBytipoId_First(long tipoId,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchBytipoId_First(tipoId, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tipoId=");
		msg.append(tipoId);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the first subtipo in the ordered set where tipoId = &#63;.
	 *
	 * @param tipoId the tipo ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchBytipoId_First(long tipoId,
		OrderByComparator<Subtipo> orderByComparator) {
		List<Subtipo> list = findBytipoId(tipoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last subtipo in the ordered set where tipoId = &#63;.
	 *
	 * @param tipoId the tipo ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtipo
	 * @throws NoSuchSubtipoException if a matching subtipo could not be found
	 */
	@Override
	public Subtipo findBytipoId_Last(long tipoId,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchBytipoId_Last(tipoId, orderByComparator);

		if (subtipo != null) {
			return subtipo;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tipoId=");
		msg.append(tipoId);

		msg.append("}");

		throw new NoSuchSubtipoException(msg.toString());
	}

	/**
	 * Returns the last subtipo in the ordered set where tipoId = &#63;.
	 *
	 * @param tipoId the tipo ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching subtipo, or <code>null</code> if a matching subtipo could not be found
	 */
	@Override
	public Subtipo fetchBytipoId_Last(long tipoId,
		OrderByComparator<Subtipo> orderByComparator) {
		int count = countBytipoId(tipoId);

		if (count == 0) {
			return null;
		}

		List<Subtipo> list = findBytipoId(tipoId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Subtipo[] findBytipoId_PrevAndNext(long subtipoId, long tipoId,
		OrderByComparator<Subtipo> orderByComparator)
		throws NoSuchSubtipoException {
		Subtipo subtipo = findByPrimaryKey(subtipoId);

		Session session = null;

		try {
			session = openSession();

			Subtipo[] array = new SubtipoImpl[3];

			array[0] = getBytipoId_PrevAndNext(session, subtipo, tipoId,
					orderByComparator, true);

			array[1] = subtipo;

			array[2] = getBytipoId_PrevAndNext(session, subtipo, tipoId,
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

	protected Subtipo getBytipoId_PrevAndNext(Session session, Subtipo subtipo,
		long tipoId, OrderByComparator<Subtipo> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SUBTIPO_WHERE);

		query.append(_FINDER_COLUMN_TIPOID_TIPOID_2);

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
			query.append(SubtipoModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tipoId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(subtipo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Subtipo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the subtipos where tipoId = &#63; from the database.
	 *
	 * @param tipoId the tipo ID
	 */
	@Override
	public void removeBytipoId(long tipoId) {
		for (Subtipo subtipo : findBytipoId(tipoId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(subtipo);
		}
	}

	/**
	 * Returns the number of subtipos where tipoId = &#63;.
	 *
	 * @param tipoId the tipo ID
	 * @return the number of matching subtipos
	 */
	@Override
	public int countBytipoId(long tipoId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TIPOID;

		Object[] finderArgs = new Object[] { tipoId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SUBTIPO_WHERE);

			query.append(_FINDER_COLUMN_TIPOID_TIPOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tipoId);

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

	private static final String _FINDER_COLUMN_TIPOID_TIPOID_2 = "subtipo.tipoId = ?";

	public SubtipoPersistenceImpl() {
		setModelClass(Subtipo.class);

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
	 * Caches the subtipo in the entity cache if it is enabled.
	 *
	 * @param subtipo the subtipo
	 */
	@Override
	public void cacheResult(Subtipo subtipo) {
		entityCache.putResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoImpl.class, subtipo.getPrimaryKey(), subtipo);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { subtipo.getUuid(), subtipo.getGroupId() }, subtipo);

		subtipo.resetOriginalValues();
	}

	/**
	 * Caches the subtipos in the entity cache if it is enabled.
	 *
	 * @param subtipos the subtipos
	 */
	@Override
	public void cacheResult(List<Subtipo> subtipos) {
		for (Subtipo subtipo : subtipos) {
			if (entityCache.getResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
						SubtipoImpl.class, subtipo.getPrimaryKey()) == null) {
				cacheResult(subtipo);
			}
			else {
				subtipo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all subtipos.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SubtipoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the subtipo.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Subtipo subtipo) {
		entityCache.removeResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoImpl.class, subtipo.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((SubtipoModelImpl)subtipo, true);
	}

	@Override
	public void clearCache(List<Subtipo> subtipos) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Subtipo subtipo : subtipos) {
			entityCache.removeResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
				SubtipoImpl.class, subtipo.getPrimaryKey());

			clearUniqueFindersCache((SubtipoModelImpl)subtipo, true);
		}
	}

	protected void cacheUniqueFindersCache(SubtipoModelImpl subtipoModelImpl) {
		Object[] args = new Object[] {
				subtipoModelImpl.getUuid(), subtipoModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			subtipoModelImpl, false);
	}

	protected void clearUniqueFindersCache(SubtipoModelImpl subtipoModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					subtipoModelImpl.getUuid(), subtipoModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((subtipoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					subtipoModelImpl.getOriginalUuid(),
					subtipoModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new subtipo with the primary key. Does not add the subtipo to the database.
	 *
	 * @param subtipoId the primary key for the new subtipo
	 * @return the new subtipo
	 */
	@Override
	public Subtipo create(long subtipoId) {
		Subtipo subtipo = new SubtipoImpl();

		subtipo.setNew(true);
		subtipo.setPrimaryKey(subtipoId);

		String uuid = PortalUUIDUtil.generate();

		subtipo.setUuid(uuid);

		subtipo.setCompanyId(companyProvider.getCompanyId());

		return subtipo;
	}

	/**
	 * Removes the subtipo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subtipoId the primary key of the subtipo
	 * @return the subtipo that was removed
	 * @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	 */
	@Override
	public Subtipo remove(long subtipoId) throws NoSuchSubtipoException {
		return remove((Serializable)subtipoId);
	}

	/**
	 * Removes the subtipo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the subtipo
	 * @return the subtipo that was removed
	 * @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	 */
	@Override
	public Subtipo remove(Serializable primaryKey)
		throws NoSuchSubtipoException {
		Session session = null;

		try {
			session = openSession();

			Subtipo subtipo = (Subtipo)session.get(SubtipoImpl.class, primaryKey);

			if (subtipo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSubtipoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(subtipo);
		}
		catch (NoSuchSubtipoException nsee) {
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
	protected Subtipo removeImpl(Subtipo subtipo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(subtipo)) {
				subtipo = (Subtipo)session.get(SubtipoImpl.class,
						subtipo.getPrimaryKeyObj());
			}

			if (subtipo != null) {
				session.delete(subtipo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (subtipo != null) {
			clearCache(subtipo);
		}

		return subtipo;
	}

	@Override
	public Subtipo updateImpl(Subtipo subtipo) {
		boolean isNew = subtipo.isNew();

		if (!(subtipo instanceof SubtipoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(subtipo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(subtipo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in subtipo proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Subtipo implementation " +
				subtipo.getClass());
		}

		SubtipoModelImpl subtipoModelImpl = (SubtipoModelImpl)subtipo;

		if (Validator.isNull(subtipo.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			subtipo.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (subtipo.getCreateDate() == null)) {
			if (serviceContext == null) {
				subtipo.setCreateDate(now);
			}
			else {
				subtipo.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!subtipoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				subtipo.setModifiedDate(now);
			}
			else {
				subtipo.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (subtipo.isNew()) {
				session.save(subtipo);

				subtipo.setNew(false);
			}
			else {
				subtipo = (Subtipo)session.merge(subtipo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!SubtipoModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { subtipoModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					subtipoModelImpl.getUuid(), subtipoModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { subtipoModelImpl.getLabel() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_LABEL, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LABEL,
				args);

			args = new Object[] { subtipoModelImpl.getTipoId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TIPOID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPOID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((subtipoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { subtipoModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { subtipoModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((subtipoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						subtipoModelImpl.getOriginalUuid(),
						subtipoModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						subtipoModelImpl.getUuid(),
						subtipoModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((subtipoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LABEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { subtipoModelImpl.getOriginalLabel() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LABEL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LABEL,
					args);

				args = new Object[] { subtipoModelImpl.getLabel() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LABEL, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LABEL,
					args);
			}

			if ((subtipoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						subtipoModelImpl.getOriginalTipoId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TIPOID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPOID,
					args);

				args = new Object[] { subtipoModelImpl.getTipoId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TIPOID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TIPOID,
					args);
			}
		}

		entityCache.putResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
			SubtipoImpl.class, subtipo.getPrimaryKey(), subtipo, false);

		clearUniqueFindersCache(subtipoModelImpl, false);
		cacheUniqueFindersCache(subtipoModelImpl);

		subtipo.resetOriginalValues();

		return subtipo;
	}

	/**
	 * Returns the subtipo with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the subtipo
	 * @return the subtipo
	 * @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	 */
	@Override
	public Subtipo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSubtipoException {
		Subtipo subtipo = fetchByPrimaryKey(primaryKey);

		if (subtipo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSubtipoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return subtipo;
	}

	/**
	 * Returns the subtipo with the primary key or throws a {@link NoSuchSubtipoException} if it could not be found.
	 *
	 * @param subtipoId the primary key of the subtipo
	 * @return the subtipo
	 * @throws NoSuchSubtipoException if a subtipo with the primary key could not be found
	 */
	@Override
	public Subtipo findByPrimaryKey(long subtipoId)
		throws NoSuchSubtipoException {
		return findByPrimaryKey((Serializable)subtipoId);
	}

	/**
	 * Returns the subtipo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the subtipo
	 * @return the subtipo, or <code>null</code> if a subtipo with the primary key could not be found
	 */
	@Override
	public Subtipo fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
				SubtipoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Subtipo subtipo = (Subtipo)serializable;

		if (subtipo == null) {
			Session session = null;

			try {
				session = openSession();

				subtipo = (Subtipo)session.get(SubtipoImpl.class, primaryKey);

				if (subtipo != null) {
					cacheResult(subtipo);
				}
				else {
					entityCache.putResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
						SubtipoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
					SubtipoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return subtipo;
	}

	/**
	 * Returns the subtipo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subtipoId the primary key of the subtipo
	 * @return the subtipo, or <code>null</code> if a subtipo with the primary key could not be found
	 */
	@Override
	public Subtipo fetchByPrimaryKey(long subtipoId) {
		return fetchByPrimaryKey((Serializable)subtipoId);
	}

	@Override
	public Map<Serializable, Subtipo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Subtipo> map = new HashMap<Serializable, Subtipo>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Subtipo subtipo = fetchByPrimaryKey(primaryKey);

			if (subtipo != null) {
				map.put(primaryKey, subtipo);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
					SubtipoImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Subtipo)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SUBTIPO_WHERE_PKS_IN);

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

			for (Subtipo subtipo : (List<Subtipo>)q.list()) {
				map.put(subtipo.getPrimaryKeyObj(), subtipo);

				cacheResult(subtipo);

				uncachedPrimaryKeys.remove(subtipo.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SubtipoModelImpl.ENTITY_CACHE_ENABLED,
					SubtipoImpl.class, primaryKey, nullModel);
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
	 * Returns all the subtipos.
	 *
	 * @return the subtipos
	 */
	@Override
	public List<Subtipo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Subtipo> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Subtipo> findAll(int start, int end,
		OrderByComparator<Subtipo> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Subtipo> findAll(int start, int end,
		OrderByComparator<Subtipo> orderByComparator, boolean retrieveFromCache) {
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

		List<Subtipo> list = null;

		if (retrieveFromCache) {
			list = (List<Subtipo>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SUBTIPO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SUBTIPO;

				if (pagination) {
					sql = sql.concat(SubtipoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Subtipo>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the subtipos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Subtipo subtipo : findAll()) {
			remove(subtipo);
		}
	}

	/**
	 * Returns the number of subtipos.
	 *
	 * @return the number of subtipos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SUBTIPO);

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
		return SubtipoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the subtipo persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SubtipoImpl.class.getName());
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
	private static final String _SQL_SELECT_SUBTIPO = "SELECT subtipo FROM Subtipo subtipo";
	private static final String _SQL_SELECT_SUBTIPO_WHERE_PKS_IN = "SELECT subtipo FROM Subtipo subtipo WHERE subtipoId IN (";
	private static final String _SQL_SELECT_SUBTIPO_WHERE = "SELECT subtipo FROM Subtipo subtipo WHERE ";
	private static final String _SQL_COUNT_SUBTIPO = "SELECT COUNT(subtipo) FROM Subtipo subtipo";
	private static final String _SQL_COUNT_SUBTIPO_WHERE = "SELECT COUNT(subtipo) FROM Subtipo subtipo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "subtipo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Subtipo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Subtipo exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(SubtipoPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}