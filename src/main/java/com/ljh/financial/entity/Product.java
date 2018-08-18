package com.ljh.financial.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 起投金额
     */
    @Column(name = "threshold_amount")
    private BigDecimal thresholdAmount;

    /**
     * 投资步长
     */
    @Column(name = "step_amount")
    private BigDecimal stepAmount;

    /**
     * 锁定期
     */
    @Column(name = "lock_term")
    private Short lockTerm;

    /**
     * 收益率, 0-100百分比
     */
    @Column(name = "reward_rate")
    private BigDecimal rewardRate;

    /**
     * 状态,销售中,锁定,已结束
     */
    private String status;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建者
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 更新者
     */
    @Column(name = "update_user")
    private String updateUser;

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取起投金额
     *
     * @return threshold_amount - 起投金额
     */
    public BigDecimal getThresholdAmount() {
        return thresholdAmount;
    }

    /**
     * 设置起投金额
     *
     * @param thresholdAmount 起投金额
     */
    public void setThresholdAmount(BigDecimal thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    /**
     * 获取投资步长
     *
     * @return step_amount - 投资步长
     */
    public BigDecimal getStepAmount() {
        return stepAmount;
    }

    /**
     * 设置投资步长
     *
     * @param stepAmount 投资步长
     */
    public void setStepAmount(BigDecimal stepAmount) {
        this.stepAmount = stepAmount;
    }

    /**
     * 获取锁定期
     *
     * @return lock_term - 锁定期
     */
    public Short getLockTerm() {
        return lockTerm;
    }

    /**
     * 设置锁定期
     *
     * @param lockTerm 锁定期
     */
    public void setLockTerm(Short lockTerm) {
        this.lockTerm = lockTerm;
    }

    /**
     * 获取收益率, 0-100百分比
     *
     * @return reward_rate - 收益率, 0-100百分比
     */
    public BigDecimal getRewardRate() {
        return rewardRate;
    }

    /**
     * 设置收益率, 0-100百分比
     *
     * @param rewardRate 收益率, 0-100百分比
     */
    public void setRewardRate(BigDecimal rewardRate) {
        this.rewardRate = rewardRate;
    }

    /**
     * 获取状态,销售中,锁定,已结束
     *
     * @return status - 状态,销售中,锁定,已结束
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态,销售中,锁定,已结束
     *
     * @param status 状态,销售中,锁定,已结束
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
     * 获取创建者
     *
     * @return create_user - 创建者
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建者
     *
     * @param createUser 创建者
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 获取更新者
     *
     * @return update_user - 更新者
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置更新者
     *
     * @param updateUser 更新者
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
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