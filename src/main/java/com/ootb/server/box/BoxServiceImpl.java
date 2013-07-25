/**
 * Copyright 2012 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ootb.server.box;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ootb.mybatis.generator.dao.BoxEntityMapper;
import com.ootb.mybatis.generator.model.BoxEntity;
import com.ootb.mybatis.generator.model.BoxEntityExample;

import java.util.List;

@Service("boxService")
@Transactional
public class BoxServiceImpl implements BoxService {
    @Autowired
    private BoxEntityMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<BoxEntity> loadAll(String searchToken) {
    	BoxEntityExample ex = new BoxEntityExample();
    	return mapper.selectByExample(ex);
    }
}
