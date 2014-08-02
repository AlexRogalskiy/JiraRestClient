/*
 * Copyright 2013 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.micromata.jira.rest.core.domain;


/**
 * @author Christian Schulze
 * @author Vitali Filippow
 */
public class BasicProjectBean extends BaseBean {

    private String key;

    private AvatarURLBean avatarURLs = null;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AvatarURLBean getAvatarURLs() {
        return avatarURLs;
    }

    public void setAvatarURLs(AvatarURLBean avatarURLs) {
        this.avatarURLs = avatarURLs;
    }
}