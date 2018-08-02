package com.ljh.financial.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 渠道Id
     */
    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 产品Id
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 用户Id
     */
    @Column(name = "channel_user_id")
    private Integer channelUserId;

    /**
     * 订单类型, 申购:APPLE, 赎回:REDEEM
     */
    @Column(name = "order_type")
    private String orderType;

    /**
     * 订单状态, 初始化:INIT, 处理中:PROCESS, 成功:SUCCESS, 失败:FAIL
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 外部订单编号
     */
    @Column(name = "outer_order_id")
    private String outerOrderId;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取渠道Id
     *
     * @return channel_id - 渠道Id
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道Id
     *
     * @param channelId 渠道Id
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取产品Id
     *
     * @return product_id - 产品Id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置产品Id
     *
     * @param productId 产品Id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 获取用户Id
     *
     * @return channel_user_id - 用户Id
     */
    public Integer getChannelUserId() {
        return channelUserId;
    }

    /**
     * 设置用户Id
     *
     * @param channelUserId 用户Id
     */
    public void setChannelUserId(Integer channelUserId) {
        this.channelUserId = channelUserId;
    }

    /**
     * 获取订单类型, 申购:APPLE, 赎回:REDEEM
     *
     * @return order_type - 订单类型, 申购:APPLE, 赎回:REDEEM
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型, 申购:APPLE, 赎回:REDEEM
     *
     * @param orderType 订单类型, 申购:APPLE, 赎回:REDEEM
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * 获取订单状态, 初始化:INIT, 处理中:PROCESS, 成功:SUCCESS, 失败:FAIL
     *
     * @return order_status - 订单状态, 初始化:INIT, 处理中:PROCESS, 成功:SUCCESS, 失败:FAIL
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态, 初始化:INIT, 处理中:PROCESS, 成功:SUCCESS, 失败:FAIL
     *
     * @param orderStatus 订单状态, 初始化:INIT, 处理中:PROCESS, 成功:SUCCESS, 失败:FAIL
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * 获取外部订单编号
     *
     * @return outer_order_id - 外部订单编号
     */
    public String getOuterOrderId() {
        return outerOrderId;
    }

    /**
     * 设置外部订单编号
     *
     * @param outerOrderId 外部订单编号
     */
    public void setOuterOrderId(String outerOrderId) {
        this.outerOrderId = outerOrderId == null ? null : outerOrderId.trim();
    }

    /**
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return modify_time - 更新时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param modifyTime 更新时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}