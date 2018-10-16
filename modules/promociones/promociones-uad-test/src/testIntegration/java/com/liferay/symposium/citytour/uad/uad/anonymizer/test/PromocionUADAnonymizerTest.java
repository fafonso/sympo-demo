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

package com.liferay.symposium.citytour.uad.uad.anonymizer.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import com.liferay.symposium.citytour.uad.uad.test.PromocionUADTestHelper;
import com.liferay.symposium.citytours.promociones.model.Promocion;
import com.liferay.symposium.citytours.promociones.service.PromocionLocalService;

import com.liferay.user.associated.data.anonymizer.UADAnonymizer;
import com.liferay.user.associated.data.test.util.BaseUADAnonymizerTestCase;

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
public class PromocionUADAnonymizerTest extends BaseUADAnonymizerTestCase<Promocion> {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new LiferayIntegrationTestRule();

	@After
	public void tearDown() throws Exception {
		_promocionUADTestHelper.cleanUpDependencies(_promocions);
	}

	@Override
	protected Promocion addBaseModel(long userId) throws Exception {
		return addBaseModel(userId, true);
	}

	@Override
	protected Promocion addBaseModel(long userId, boolean deleteAfterTestRun)
		throws Exception {
		Promocion promocion = _promocionUADTestHelper.addPromocion(userId);

		if (deleteAfterTestRun) {
			_promocions.add(promocion);
		}

		return promocion;
	}

	@Override
	protected void deleteBaseModels(List<Promocion> baseModels)
		throws Exception {
		_promocionUADTestHelper.cleanUpDependencies(baseModels);
	}

	@Override
	protected UADAnonymizer getUADAnonymizer() {
		return _uadAnonymizer;
	}

	@Override
	protected boolean isBaseModelAutoAnonymized(long baseModelPK, User user)
		throws Exception {
		Promocion promocion = _promocionLocalService.getPromocion(baseModelPK);

		String userName = promocion.getUserName();

		if ((promocion.getUserId() != user.getUserId()) &&
				!userName.equals(user.getFullName())) {
			return true;
		}

		return false;
	}

	@Override
	protected boolean isBaseModelDeleted(long baseModelPK) {
		if (_promocionLocalService.fetchPromocion(baseModelPK) == null) {
			return true;
		}

		return false;
	}

	@DeleteAfterTestRun
	private final List<Promocion> _promocions = new ArrayList<Promocion>();
	@Inject
	private PromocionLocalService _promocionLocalService;
	@Inject
	private PromocionUADTestHelper _promocionUADTestHelper;
	@Inject(filter = "component.name=*.PromocionUADAnonymizer")
	private UADAnonymizer _uadAnonymizer;
}