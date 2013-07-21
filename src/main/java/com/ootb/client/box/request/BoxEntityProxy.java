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

import com.ootb.server.box.BoxEntity;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyFor(value = BoxEntity.class)
public interface BoxEntityProxy extends ValueProxy {
    Integer getId();
    void setId(Integer id);
	Integer getDevice_id();
	void setDevice_id(Integer device_id);
	Integer getDelivery_id();
	void setDelivery_id(Integer delivery_id);
	String getSend_man();
	void setSend_man(String send_man);
	String getSend_company();
	void setSend_company(String send_company);
	String getSend_tel();
	void setSend_tel(String send_tel);
	Date getSend_time();
	void setSend_time(Date send_time);
	Integer getBox_order_id();
	void setBox_order_id(Integer box_order_id);
	String getClient_tel();
	void setClient_tel(String client_tel);
	String getBar_code();
	void setBar_code(String bar_code);
	String getTack_pin();
	void setTack_pin(String tack_pin);
	Date getTack_time();
	void setTack_time(Date tack_time);
	Integer getExpress_status();
	void setExpress_status(Integer express_status);
	Date getNotify_date();
	void setNotify_date(Date notify_date);
	Date getReceive_time();
	void setReceive_time(Date receive_time);
	Integer getIs_check();
	void setIs_check(Integer is_check);
	Date getCheck_time();
	void setCheck_time(Date check_time);
	String getSerial_number();
	void setSerial_number(String serial_number);
	String getRemark();
	void setRemark(String remark);
}
