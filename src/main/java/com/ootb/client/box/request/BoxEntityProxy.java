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

package com.ootb.client.box.request;

import java.util.Date;

import com.ootb.mybatis.generator.model.BoxEntity;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(value = BoxEntity.class)
public interface BoxEntityProxy extends ValueProxy {

    public Integer getId();
    public void setId(Integer id);
    public String getBarCode();
    public void setBarCode(String barCode);
    public Integer getBoxOrderId();
    public void setBoxOrderId(Integer boxOrderId);
    public Date getCheckTime();
    public void setCheckTime(Date checkTime);
    public String getClientTel();
    public void setClientTel(String clientTel);
    public Integer getDeliveryId();
    public void setDeliveryId(Integer deliveryId);
    public Integer getDeviceId();
    public void setDeviceId(Integer deviceId);
    public Integer getExpressStatus();
    public void setExpressStatus(Integer expressStatus);
    public Integer getIsCheck();
    public void setIsCheck(Integer isCheck);
    public Date getNotifyDate();
    public void setNotifyDate(Date notifyDate);
    public Date getReceiveTime();
    public void setReceiveTime(Date receiveTime);
    public String getRemark();
    public void setRemark(String remark);
    public String getSendCompany();
    public void setSendCompany(String sendCompany);
    public String getSendMan();
    public void setSendMan(String sendMan);
    public String getSendTel();
    public void setSendTel(String sendTel);
    public Date getSendTime();
    public void setSendTime(Date sendTime);
    public String getSerialNumber();
    public void setSerialNumber(String serialNumber);
    public String getTackPin();
    public void setTackPin(String tackPin);
    public Date getTackTime();
    public void setTackTime(Date tackTime);
}
