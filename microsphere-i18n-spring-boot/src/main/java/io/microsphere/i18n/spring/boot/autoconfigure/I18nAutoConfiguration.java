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
package io.microsphere.i18n.spring.boot.autoconfigure;

import io.microsphere.i18n.spring.annotation.EnableI18n;
import io.microsphere.i18n.spring.beans.factory.ServiceMessageSourceFactoryBean;
import io.microsphere.i18n.spring.boot.condition.ConditionalOnI18nEnabled;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

/**
 * I18n Auto-Configuration
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @since 1.0.0
 */
@ConditionalOnI18nEnabled
@EnableI18n
public class I18nAutoConfiguration {

    @Bean
    @ConditionalOnProperty(name = "spring.application.name")
    public ServiceMessageSourceFactoryBean applicationServiceMessageSource(
            @Value("${spring.application.name}") String applicationName) {
        return new ServiceMessageSourceFactoryBean(applicationName);
    }
}
