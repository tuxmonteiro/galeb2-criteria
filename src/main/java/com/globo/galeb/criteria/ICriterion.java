/*
 * Copyright (c) 2014 Globo.com - ATeam
 * All rights reserved.
 *
 * This source is subject to the Apache License, Version 2.0.
 * Please see the LICENSE file for more information.
 *
 * Authors: See AUTHORS file
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.globo.galeb.criteria;

import java.util.Map;

/**
 * Interface ICriterion.
 *
 * @author See AUTHORS file.
 * @version 1.0.0, Nov 7, 2014.
 * @param <T> the generic type
 */
public interface ICriterion<T> {

    /**
     * Enum CriterionAction.
     *
     * @author See AUTHORS file.
     * @version 1.0.0, Nov 7, 2014.
     */
    public static enum CriterionAction {

        /** reset is required. */
        RESET_REQUIRED
    }

    /**
     * Given.
     *
     * @param map the map
     * @return this
     */
    public ICriterion<T> given(Map<String, T> map);

    /**
     * When.
     *
     * @param param the param
     * @return this
     */
    public ICriterion<T> when(Object param);

    /**
     * Then get result.
     *
     * @return the result
     */
    public T thenGetResult();

    /**
     * Send action.
     *
     * @param criterionAction the criterion action
     * @return this
     */
    public ICriterion<T> action(CriterionAction criterionAction);

}
