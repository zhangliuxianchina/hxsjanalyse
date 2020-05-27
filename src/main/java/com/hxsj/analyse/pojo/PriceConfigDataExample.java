package com.hxsj.analyse.pojo;

import java.util.ArrayList;
import java.util.List;

public class PriceConfigDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceConfigDataExample() {
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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(String value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(String value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(String value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(String value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(String value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLike(String value) {
            addCriterion("apply_id like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotLike(String value) {
            addCriterion("apply_id not like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<String> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<String> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(String value1, String value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(String value1, String value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andParentTypeIsNull() {
            addCriterion("parent_type is null");
            return (Criteria) this;
        }

        public Criteria andParentTypeIsNotNull() {
            addCriterion("parent_type is not null");
            return (Criteria) this;
        }

        public Criteria andParentTypeEqualTo(String value) {
            addCriterion("parent_type =", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotEqualTo(String value) {
            addCriterion("parent_type <>", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeGreaterThan(String value) {
            addCriterion("parent_type >", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_type >=", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeLessThan(String value) {
            addCriterion("parent_type <", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeLessThanOrEqualTo(String value) {
            addCriterion("parent_type <=", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeLike(String value) {
            addCriterion("parent_type like", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotLike(String value) {
            addCriterion("parent_type not like", value, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeIn(List<String> values) {
            addCriterion("parent_type in", values, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotIn(List<String> values) {
            addCriterion("parent_type not in", values, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeBetween(String value1, String value2) {
            addCriterion("parent_type between", value1, value2, "parentType");
            return (Criteria) this;
        }

        public Criteria andParentTypeNotBetween(String value1, String value2) {
            addCriterion("parent_type not between", value1, value2, "parentType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andCustomeNameIsNull() {
            addCriterion("custome_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomeNameIsNotNull() {
            addCriterion("custome_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeNameEqualTo(String value) {
            addCriterion("custome_name =", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameNotEqualTo(String value) {
            addCriterion("custome_name <>", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameGreaterThan(String value) {
            addCriterion("custome_name >", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameGreaterThanOrEqualTo(String value) {
            addCriterion("custome_name >=", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameLessThan(String value) {
            addCriterion("custome_name <", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameLessThanOrEqualTo(String value) {
            addCriterion("custome_name <=", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameLike(String value) {
            addCriterion("custome_name like", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameNotLike(String value) {
            addCriterion("custome_name not like", value, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameIn(List<String> values) {
            addCriterion("custome_name in", values, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameNotIn(List<String> values) {
            addCriterion("custome_name not in", values, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameBetween(String value1, String value2) {
            addCriterion("custome_name between", value1, value2, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeNameNotBetween(String value1, String value2) {
            addCriterion("custome_name not between", value1, value2, "customeName");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileIsNull() {
            addCriterion("custome_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileIsNotNull() {
            addCriterion("custome_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileEqualTo(String value) {
            addCriterion("custome_mobile =", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileNotEqualTo(String value) {
            addCriterion("custome_mobile <>", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileGreaterThan(String value) {
            addCriterion("custome_mobile >", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileGreaterThanOrEqualTo(String value) {
            addCriterion("custome_mobile >=", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileLessThan(String value) {
            addCriterion("custome_mobile <", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileLessThanOrEqualTo(String value) {
            addCriterion("custome_mobile <=", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileLike(String value) {
            addCriterion("custome_mobile like", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileNotLike(String value) {
            addCriterion("custome_mobile not like", value, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileIn(List<String> values) {
            addCriterion("custome_mobile in", values, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileNotIn(List<String> values) {
            addCriterion("custome_mobile not in", values, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileBetween(String value1, String value2) {
            addCriterion("custome_mobile between", value1, value2, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeMobileNotBetween(String value1, String value2) {
            addCriterion("custome_mobile not between", value1, value2, "customeMobile");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailIsNull() {
            addCriterion("custome_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailIsNotNull() {
            addCriterion("custome_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailEqualTo(String value) {
            addCriterion("custome_email =", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailNotEqualTo(String value) {
            addCriterion("custome_email <>", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailGreaterThan(String value) {
            addCriterion("custome_email >", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("custome_email >=", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailLessThan(String value) {
            addCriterion("custome_email <", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailLessThanOrEqualTo(String value) {
            addCriterion("custome_email <=", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailLike(String value) {
            addCriterion("custome_email like", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailNotLike(String value) {
            addCriterion("custome_email not like", value, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailIn(List<String> values) {
            addCriterion("custome_email in", values, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailNotIn(List<String> values) {
            addCriterion("custome_email not in", values, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailBetween(String value1, String value2) {
            addCriterion("custome_email between", value1, value2, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andCustomeEmailNotBetween(String value1, String value2) {
            addCriterion("custome_email not between", value1, value2, "customeEmail");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
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