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

package com.liferay.symposium.citytour.uad.uad.exporter.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import com.liferay.symposium.citytour.uad.uad.test.PromocionUADTestHelper;
import com.liferay.symposium.citytours.promociones.model.Promocion;

import com.liferay.user.associated.data.exporter.UADExporter;
import com.liferay.user.associated.data.test.util.BaseUADExporterTestCase;

import org.junit.After;
import org.junit.ClassRule;
import org.junit.Rule;

import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@RunWith(Arquillian.class)
public class PromocionUADExporterTest extends BaseUADExporterTestCase<Promocion> {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new LiferayIntegrationTestRule();

	@After
	public void tearDown() throws Exception {
		_promocionUADTestHelper.cleanUpDependencies(_promocions);
	}

	@Override
	protected Promocion addBaseModel(long userId) throws Exception {
		Promocion promocion = _promocionUADTestHelper.addPromocion(userId);

		_promocions.add(promocion);

		return promocion;
	}

	@Override
	protected String getPrimaryKeyName() {
		return "promocionId";
	}

	@Override
	protected UADExporter getUADExporter() {
		return _uadExporter;
	}

	@DeleteAfterTestRun
	private final List<Promocion> _promocions = new ArrayList<Promocion>();
	@Inject
	private PromocionUADTestHelper _promocionUADTestHelper;
	@Inject(filter = "component.name=*.PromocionUADExporter")
	private UADExporter _uadExporter;
}