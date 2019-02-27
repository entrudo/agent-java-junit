/*
 * Copyright 2018 EPAM Systems
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

import com.epam.reportportal.annotations.Tags;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.model.TestClass;

import java.util.Set;

/**
 * @author Ilya_Koshaleu
 */
@Category({ TagsTest.Tag1.class, TagsTest.Tag2.class })
@Tags({ "Tag4", "Tag5" })
public class TagsTest {

	@Test
	public void realTagsParsing() {
		Set<String> tags = ParallelRunningHandler.getAnnotationTags(new TestClass(this.getClass()));
		Assert.assertThat(tags, CoreMatchers.hasItems("Tag1", "Tag5", "Tag4", "Tag2"));
	}

	static class Tag1 {
	}

	static class Tag2 {
	}

}
