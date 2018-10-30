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

package com.liferay.symposium.citytour.uad.uad.display.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.DeleteAfterTestRun;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import com.liferay.symposium.citytour.uad.uad.test.PromotionUADTestHelper;
import com.liferay.symposium.citytours.promotions.model.Promotion;

import com.liferay.user.associated.data.display.UADDisplay;
import com.liferay.user.associated.data.test.util.BaseUADDisplayTestCase;

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
public class PromotionUADDisplayTest extends BaseUADDisplayTestCase<Promotion> {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new LiferayIntegrationTestRule();

	@Override
	protected Promotion addBaseModel(long userId) throws Exception {
		Promotion promotion = _promotionUADTestHelper.addPromotion(userId);

		_promotions.add(promotion);

		return promotion;
	}

	@Override
	protected UADDisplay getUADDisplay() {
		return _uadDisplay;
	}

	@After
	public void tearDown() throws Exception {
		_promotionUADTestHelper.cleanUpDependencies(_promotions);
	}

	@DeleteAfterTestRun
	private final List<Promotion> _promotions = new ArrayList<Promotion>();
	@Inject
	private PromotionUADTestHelper _promotionUADTestHelper;
	@Inject(filter = "component.name=*.PromotionUADDisplay")
	private UADDisplay _uadDisplay;
}