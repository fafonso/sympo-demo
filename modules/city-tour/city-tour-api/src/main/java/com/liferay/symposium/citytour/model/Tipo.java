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

package com.liferay.symposium.citytour.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Tipo service. Represents a row in the &quot;citytour_Tipo&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TipoModel
 * @see com.liferay.symposium.citytour.model.impl.TipoImpl
 * @see com.liferay.symposium.citytour.model.impl.TipoModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.symposium.citytour.model.impl.TipoImpl")
@ProviderType
public interface Tipo extends TipoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.symposium.citytour.model.impl.TipoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Tipo, Long> TIPO_ID_ACCESSOR = new Accessor<Tipo, Long>() {
			@Override
			public Long get(Tipo tipo) {
				return tipo.getTipoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Tipo> getTypeClass() {
				return Tipo.class;
			}
		};
}