package com.ootb.mybatis.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoxEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoxEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNull() {
            addCriterion("delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNotNull() {
            addCriterion("delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdEqualTo(Integer value) {
            addCriterion("delivery_id =", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotEqualTo(Integer value) {
            addCriterion("delivery_id <>", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThan(Integer value) {
            addCriterion("delivery_id >", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_id >=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThan(Integer value) {
            addCriterion("delivery_id <", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_id <=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIn(List<Integer> values) {
            addCriterion("delivery_id in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotIn(List<Integer> values) {
            addCriterion("delivery_id not in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id not between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andSendManIsNull() {
            addCriterion("send_man is null");
            return (Criteria) this;
        }

        public Criteria andSendManIsNotNull() {
            addCriterion("send_man is not null");
            return (Criteria) this;
        }

        public Criteria andSendManEqualTo(String value) {
            addCriterion("send_man =", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManNotEqualTo(String value) {
            addCriterion("send_man <>", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManGreaterThan(String value) {
            addCriterion("send_man >", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManGreaterThanOrEqualTo(String value) {
            addCriterion("send_man >=", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManLessThan(String value) {
            addCriterion("send_man <", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManLessThanOrEqualTo(String value) {
            addCriterion("send_man <=", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManLike(String value) {
            addCriterion("send_man like", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManNotLike(String value) {
            addCriterion("send_man not like", value, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManIn(List<String> values) {
            addCriterion("send_man in", values, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManNotIn(List<String> values) {
            addCriterion("send_man not in", values, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManBetween(String value1, String value2) {
            addCriterion("send_man between", value1, value2, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendManNotBetween(String value1, String value2) {
            addCriterion("send_man not between", value1, value2, "sendMan");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIsNull() {
            addCriterion("send_company is null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIsNotNull() {
            addCriterion("send_company is not null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyEqualTo(String value) {
            addCriterion("send_company =", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotEqualTo(String value) {
            addCriterion("send_company <>", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyGreaterThan(String value) {
            addCriterion("send_company >", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("send_company >=", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyLessThan(String value) {
            addCriterion("send_company <", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyLessThanOrEqualTo(String value) {
            addCriterion("send_company <=", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyLike(String value) {
            addCriterion("send_company like", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotLike(String value) {
            addCriterion("send_company not like", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIn(List<String> values) {
            addCriterion("send_company in", values, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotIn(List<String> values) {
            addCriterion("send_company not in", values, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyBetween(String value1, String value2) {
            addCriterion("send_company between", value1, value2, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotBetween(String value1, String value2) {
            addCriterion("send_company not between", value1, value2, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendTelIsNull() {
            addCriterion("send_tel is null");
            return (Criteria) this;
        }

        public Criteria andSendTelIsNotNull() {
            addCriterion("send_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSendTelEqualTo(String value) {
            addCriterion("send_tel =", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotEqualTo(String value) {
            addCriterion("send_tel <>", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelGreaterThan(String value) {
            addCriterion("send_tel >", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelGreaterThanOrEqualTo(String value) {
            addCriterion("send_tel >=", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLessThan(String value) {
            addCriterion("send_tel <", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLessThanOrEqualTo(String value) {
            addCriterion("send_tel <=", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLike(String value) {
            addCriterion("send_tel like", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotLike(String value) {
            addCriterion("send_tel not like", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelIn(List<String> values) {
            addCriterion("send_tel in", values, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotIn(List<String> values) {
            addCriterion("send_tel not in", values, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelBetween(String value1, String value2) {
            addCriterion("send_tel between", value1, value2, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotBetween(String value1, String value2) {
            addCriterion("send_tel not between", value1, value2, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdIsNull() {
            addCriterion("box_order_id is null");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdIsNotNull() {
            addCriterion("box_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdEqualTo(Integer value) {
            addCriterion("box_order_id =", value, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdNotEqualTo(Integer value) {
            addCriterion("box_order_id <>", value, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdGreaterThan(Integer value) {
            addCriterion("box_order_id >", value, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("box_order_id >=", value, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdLessThan(Integer value) {
            addCriterion("box_order_id <", value, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("box_order_id <=", value, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdIn(List<Integer> values) {
            addCriterion("box_order_id in", values, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdNotIn(List<Integer> values) {
            addCriterion("box_order_id not in", values, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("box_order_id between", value1, value2, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andBoxOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("box_order_id not between", value1, value2, "boxOrderId");
            return (Criteria) this;
        }

        public Criteria andClientTelIsNull() {
            addCriterion("client_tel is null");
            return (Criteria) this;
        }

        public Criteria andClientTelIsNotNull() {
            addCriterion("client_tel is not null");
            return (Criteria) this;
        }

        public Criteria andClientTelEqualTo(String value) {
            addCriterion("client_tel =", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotEqualTo(String value) {
            addCriterion("client_tel <>", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelGreaterThan(String value) {
            addCriterion("client_tel >", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelGreaterThanOrEqualTo(String value) {
            addCriterion("client_tel >=", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelLessThan(String value) {
            addCriterion("client_tel <", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelLessThanOrEqualTo(String value) {
            addCriterion("client_tel <=", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelLike(String value) {
            addCriterion("client_tel like", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotLike(String value) {
            addCriterion("client_tel not like", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelIn(List<String> values) {
            addCriterion("client_tel in", values, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotIn(List<String> values) {
            addCriterion("client_tel not in", values, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelBetween(String value1, String value2) {
            addCriterion("client_tel between", value1, value2, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotBetween(String value1, String value2) {
            addCriterion("client_tel not between", value1, value2, "clientTel");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andTackPinIsNull() {
            addCriterion("tack_pin is null");
            return (Criteria) this;
        }

        public Criteria andTackPinIsNotNull() {
            addCriterion("tack_pin is not null");
            return (Criteria) this;
        }

        public Criteria andTackPinEqualTo(String value) {
            addCriterion("tack_pin =", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinNotEqualTo(String value) {
            addCriterion("tack_pin <>", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinGreaterThan(String value) {
            addCriterion("tack_pin >", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinGreaterThanOrEqualTo(String value) {
            addCriterion("tack_pin >=", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinLessThan(String value) {
            addCriterion("tack_pin <", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinLessThanOrEqualTo(String value) {
            addCriterion("tack_pin <=", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinLike(String value) {
            addCriterion("tack_pin like", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinNotLike(String value) {
            addCriterion("tack_pin not like", value, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinIn(List<String> values) {
            addCriterion("tack_pin in", values, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinNotIn(List<String> values) {
            addCriterion("tack_pin not in", values, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinBetween(String value1, String value2) {
            addCriterion("tack_pin between", value1, value2, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackPinNotBetween(String value1, String value2) {
            addCriterion("tack_pin not between", value1, value2, "tackPin");
            return (Criteria) this;
        }

        public Criteria andTackTimeIsNull() {
            addCriterion("tack_time is null");
            return (Criteria) this;
        }

        public Criteria andTackTimeIsNotNull() {
            addCriterion("tack_time is not null");
            return (Criteria) this;
        }

        public Criteria andTackTimeEqualTo(Date value) {
            addCriterion("tack_time =", value, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeNotEqualTo(Date value) {
            addCriterion("tack_time <>", value, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeGreaterThan(Date value) {
            addCriterion("tack_time >", value, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tack_time >=", value, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeLessThan(Date value) {
            addCriterion("tack_time <", value, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeLessThanOrEqualTo(Date value) {
            addCriterion("tack_time <=", value, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeIn(List<Date> values) {
            addCriterion("tack_time in", values, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeNotIn(List<Date> values) {
            addCriterion("tack_time not in", values, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeBetween(Date value1, Date value2) {
            addCriterion("tack_time between", value1, value2, "tackTime");
            return (Criteria) this;
        }

        public Criteria andTackTimeNotBetween(Date value1, Date value2) {
            addCriterion("tack_time not between", value1, value2, "tackTime");
            return (Criteria) this;
        }

        public Criteria andExpressStatusIsNull() {
            addCriterion("express_status is null");
            return (Criteria) this;
        }

        public Criteria andExpressStatusIsNotNull() {
            addCriterion("express_status is not null");
            return (Criteria) this;
        }

        public Criteria andExpressStatusEqualTo(Integer value) {
            addCriterion("express_status =", value, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusNotEqualTo(Integer value) {
            addCriterion("express_status <>", value, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusGreaterThan(Integer value) {
            addCriterion("express_status >", value, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_status >=", value, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusLessThan(Integer value) {
            addCriterion("express_status <", value, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusLessThanOrEqualTo(Integer value) {
            addCriterion("express_status <=", value, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusIn(List<Integer> values) {
            addCriterion("express_status in", values, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusNotIn(List<Integer> values) {
            addCriterion("express_status not in", values, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusBetween(Integer value1, Integer value2) {
            addCriterion("express_status between", value1, value2, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andExpressStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("express_status not between", value1, value2, "expressStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyDateIsNull() {
            addCriterion("notify_date is null");
            return (Criteria) this;
        }

        public Criteria andNotifyDateIsNotNull() {
            addCriterion("notify_date is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyDateEqualTo(Date value) {
            addCriterion("notify_date =", value, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateNotEqualTo(Date value) {
            addCriterion("notify_date <>", value, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateGreaterThan(Date value) {
            addCriterion("notify_date >", value, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_date >=", value, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateLessThan(Date value) {
            addCriterion("notify_date <", value, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateLessThanOrEqualTo(Date value) {
            addCriterion("notify_date <=", value, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateIn(List<Date> values) {
            addCriterion("notify_date in", values, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateNotIn(List<Date> values) {
            addCriterion("notify_date not in", values, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateBetween(Date value1, Date value2) {
            addCriterion("notify_date between", value1, value2, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andNotifyDateNotBetween(Date value1, Date value2) {
            addCriterion("notify_date not between", value1, value2, "notifyDate");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Integer value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Integer value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Integer value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Integer value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Integer value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Integer> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Integer> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Integer value1, Integer value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(String value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(String value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(String value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(String value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLike(String value) {
            addCriterion("serial_number like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotLike(String value) {
            addCriterion("serial_number not like", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<String> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<String> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(String value1, String value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(String value1, String value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}