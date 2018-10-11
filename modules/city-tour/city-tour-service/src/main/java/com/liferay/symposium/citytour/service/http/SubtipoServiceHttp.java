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

package com.liferay.symposium.citytour.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.liferay.symposium.citytour.service.SubtipoServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link SubtipoServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubtipoServiceSoap
 * @see HttpPrincipal
 * @see SubtipoServiceUtil
 * @generated
 */
@ProviderType
public class SubtipoServiceHttp {
	public static java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubtipos(
		HttpPrincipal httpPrincipal) {
		try {
			MethodKey methodKey = new MethodKey(SubtipoServiceUtil.class,
					"getSubtipos", _getSubtiposParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.symposium.citytour.model.Subtipo>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.symposium.citytour.model.Subtipo> getSubTipoFromTipo(
		HttpPrincipal httpPrincipal, long tipoId) {
		try {
			MethodKey methodKey = new MethodKey(SubtipoServiceUtil.class,
					"getSubTipoFromTipo", _getSubTipoFromTipoParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, tipoId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.symposium.citytour.model.Subtipo>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.symposium.citytour.model.Subtipo getSubTipo(
		HttpPrincipal httpPrincipal, long subTipoId) {
		try {
			MethodKey methodKey = new MethodKey(SubtipoServiceUtil.class,
					"getSubTipo", _getSubTipoParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, subTipoId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.symposium.citytour.model.Subtipo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(SubtipoServiceHttp.class);
	private static final Class<?>[] _getSubtiposParameterTypes0 = new Class[] {  };
	private static final Class<?>[] _getSubTipoFromTipoParameterTypes1 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getSubTipoParameterTypes2 = new Class[] {
			long.class
		};
}