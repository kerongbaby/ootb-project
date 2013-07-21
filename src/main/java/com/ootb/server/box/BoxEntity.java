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

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BoxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, length=10)
    private Integer id;
	@Column(nullable=false)
    private Integer device_id;
    @Column(nullable=false)
	private Integer delivery_id;
    @Column(nullable=true, length=20)
    private String send_man;
    @Column(nullable=true, length=50)
    private String send_company;
    @Column(nullable=true, length=11)
    private String send_tel;
    private Date send_time;
    @Column(nullable=false)
    private Integer box_order_id;
    @Column(nullable=true, length=11)
    private String client_tel;
    @Column(nullable=true, length=30)
    private String bar_code;
    @Column(nullable=false, length=6)
    private String tack_pin;
    private Date tack_time;
    private Integer express_status;
    private Date notify_date;
    private Date receive_time;
    private Integer is_check;
    private Date check_time;
    @Column(nullable=true, length=50)
    private String serial_number;
    private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDevice_id() {
		return device_id;
	}
	public void setDevice_id(Integer device_id) {
		this.device_id = device_id;
	}
	public Integer getDelivery_id() {
		return delivery_id;
	}
	public void setDelivery_id(Integer delivery_id) {
		this.delivery_id = delivery_id;
	}
	public String getSend_man() {
		return send_man;
	}
	public void setSend_man(String send_man) {
		this.send_man = send_man;
	}
	public String getSend_company() {
		return send_company;
	}
	public void setSend_company(String send_company) {
		this.send_company = send_company;
	}
	public String getSend_tel() {
		return send_tel;
	}
	public void setSend_tel(String send_tel) {
		this.send_tel = send_tel;
	}
	public Date getSend_time() {
		return send_time;
	}
	public void setSend_time(Date send_time) {
		this.send_time = send_time;
	}
	public Integer getBox_order_id() {
		return box_order_id;
	}
	public void setBox_order_id(Integer box_order_id) {
		this.box_order_id = box_order_id;
	}
	public String getClient_tel() {
		return client_tel;
	}
	public void setClient_tel(String client_tel) {
		this.client_tel = client_tel;
	}
	public String getBar_code() {
		return bar_code;
	}
	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}
	public String getTack_pin() {
		return tack_pin;
	}
	public void setTack_pin(String tack_pin) {
		this.tack_pin = tack_pin;
	}
	public Date getTack_time() {
		return tack_time;
	}
	public void setTack_time(Date tack_time) {
		this.tack_time = tack_time;
	}
	public Integer getExpress_status() {
		return express_status;
	}
	public void setExpress_status(Integer express_status) {
		this.express_status = express_status;
	}
	public Date getNotify_date() {
		return notify_date;
	}
	public void setNotify_date(Date notify_date) {
		this.notify_date = notify_date;
	}
	public Date getReceive_time() {
		return receive_time;
	}
	public void setReceive_time(Date receive_time) {
		this.receive_time = receive_time;
	}
	public Integer getIs_check() {
		return is_check;
	}
	public void setIs_check(Integer is_check) {
		this.is_check = is_check;
	}
	public Date getCheck_time() {
		return check_time;
	}
	public void setCheck_time(Date check_time) {
		this.check_time = check_time;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
}
