## 产品表
CREATE TABLE product(
  id INT(11) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  name VARCHAR(50) NOT NULL COMMENT '名称',
  threshold_amount DECIMAL(15,3) NOT NULL DEFAULT 0 COMMENT '起投金额',
  step_amount DECIMAL(15,3) NOT NULL DEFAULT 0 COMMENT '投资步长',
  lock_term SMALLINT NOT NULL DEFAULT 0 COMMENT '锁定期',
  reward_rate DECIMAL(5,3) NOT NULL COMMENT '收益率, 0-100百分比',
  status VARCHAR(20) NOT NULL COMMENT '状态,销售中,锁定,已结束',
  memo VARCHAR(200) DEFAULT NULL COMMENT '备注',
  create_user VARCHAR(50) DEFAULT NULL COMMENT '创建者',
  update_user VARCHAR(50) DEFAULT NULL COMMENT '更新者',
  create_time DATETIME DEFAULT current_timestamp COMMENT '创建时间',
  modify_time DATETIME DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
  KEY `idx_name` (name)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET = utf8;

## 订单表
CREATE TABLE `order`(
  id INT(11) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  channel_id INT(11) NOT NULL COMMENT '渠道Id',
  product_id INT(11) NOT NULL COMMENT '产品Id',
  channel_user_id INT(11) NOT NULL COMMENT '用户Id',
  order_type VARCHAR(10) NOT NULL COMMENT '订单类型, 申购:APPLE, 赎回:REDEEM',
  order_status VARCHAR(20) NOT NULL COMMENT '订单状态, 初始化:INIT, 处理中:PROCESS, 成功:SUCCESS, 失败:FAIL',
  outer_order_id VARCHAR(20) NOT NULL COMMENT '外部订单编号',
  amount DECIMAL(15,3) DEFAULT NULL COMMENT '订单金额',
  memo VARCHAR(200) DEFAULT NULL COMMENT '备注',
  create_time DATETIME DEFAULT current_timestamp COMMENT '创建时间',
  modify_time DATETIME DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
  KEY `idx_cid` (channel_id),
  KEY `idx_pid` (product_id),
  KEY `idx_uid` (channel_user_id)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET = utf8;