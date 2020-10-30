/*
 * Copyright 2020 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.junit;

import com.epam.reportportal.junit.features.parameters.StandardParametersSimpleTest;
import com.epam.reportportal.junit.utils.TestUtils;
import com.epam.reportportal.service.ReportPortalClient;
import com.epam.reportportal.util.test.CommonUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ParametersTest {

	private final String launchId = CommonUtils.namedId("launch_");
	private final String suiteId = CommonUtils.namedId("suite_");
	private final String classId = CommonUtils.namedId("class_");
	private final String methodId = CommonUtils.namedId("method_");

	private final ReportPortalClient client = mock(ReportPortalClient.class);

	@BeforeEach
	public void setupMock() {
//		TestUtils.mockLaunch(client, launchId, suiteId, classId, methodId);
//		TestUtils.mockLogging(client);
//		ParallelRunningHandler.setReportPortal(ReportPortal.create(client, TestUtils.standardParameters()));
	}

	@Test
	public void verify_one_simple_parameter_standard_implementation() {
		TestUtils.runClasses(StandardParametersSimpleTest.class);

//		verify(client, times(1)).startTestItem(any());
//		ArgumentCaptor<StartTestItemRQ> captor = ArgumentCaptor.forClass(StartTestItemRQ.class);
//		verify(client, times(1)).startTestItem(same(suiteId), captor.capture());
//		verify(client, times(1)).startTestItem(same(classId), captor.capture());
//
//		List<StartTestItemRQ> items = captor.getAllValues();
//		assertThat(items, hasSize(2));
//
//		StartTestItemRQ classRq = items.get(0);
//		StartTestItemRQ testRq = items.get(1);
//
//		assertThat(classRq.getCodeRef(), allOf(notNullValue(), equalTo(SingleTest.class.getCanonicalName())));
//		assertThat(testRq.getCodeRef(),
//				allOf(
//						notNullValue(),
//						equalTo(SingleTest.class.getCanonicalName() + "." + SingleTest.class.getDeclaredMethods()[0].getName())
//				)
//		);
	}

}
