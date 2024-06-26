/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.microsphere.i18n;

import io.microsphere.i18n.util.I18nUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

/**
 * Abstract Spring Test
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy<a/>
 * @since 1.0.0
 */
public abstract class AbstractSpringTest {

    @BeforeClass
    public static void beforeClass() {
        // Set the simplified Chinese as the default Locale
        Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
    }

    @Before
    public void before() {
        LocaleContextHolder.resetLocaleContext();
    }

    @AfterClass
    public static void afterClass() {
        I18nUtils.destroyServiceMessageSource();
        LocaleContextHolder.resetLocaleContext();
    }
}
