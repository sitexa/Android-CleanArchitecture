/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sitexa.android.domain.repository;

import java.util.List;
import rx.Observable;

/**
 * Interface that represents a Repository for getting {@link com.sitexa.android.domain.User} related data.
 */
public interface UserRepository {
  /**
   * Get an {@link rx.Observable} which will emit a List of {@link com.sitexa.android.domain.User}.
   */
  Observable<List<com.sitexa.android.domain.User>> users();

  /**
   * Get an {@link rx.Observable} which will emit a {@link com.sitexa.android.domain.User}.
   *
   * @param userId The user id used to retrieve user data.
   */
  Observable<com.sitexa.android.domain.User> user(final int userId);
}
