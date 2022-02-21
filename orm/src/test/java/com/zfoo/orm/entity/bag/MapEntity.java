/*
 * Copyright (C) 2020 The zfoo Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.zfoo.orm.entity.bag;

import com.zfoo.orm.model.anno.EntityCache;
import com.zfoo.orm.model.anno.Id;
import com.zfoo.orm.model.anno.Persister;
import com.zfoo.orm.model.entity.IEntity;

import java.util.HashMap;
import java.util.Map;

@EntityCache(cacheStrategy = "thousand", persister = @Persister("time30s"))
public class MapEntity implements IEntity<Long> {
    @Id
    private long id;

    private Map<String, BagItem> roleBag = new HashMap<>();

    public MapEntity() {

    }

    @Override
    public Long id() {
        return id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, BagItem> getRoleBag() {
        return roleBag;
    }

    public void setRoleBag(Map<String, BagItem> roleBag) {
        this.roleBag = roleBag;
    }

    @Override
    public String toString() {
        return "MapEntity{" +
                "id=" + id +
                ", roleBag=" + roleBag +
                '}';
    }
}