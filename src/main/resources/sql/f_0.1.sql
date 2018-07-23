## 产品表
CREATE TABLE product(
  id INT(11) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  name VARCHAR(50) NOT NULL COMMENT '名称',
  threshold_amount DECIMAL(15,3) NOT NULL COMMENT '起投金额',
  step_amount DECIMAL(15,3) NOT NULL COMMENT '投资步长',
  lock_term SMALLINT NOT NULL COMMENT '锁定期',
  reward_rate DECIMAL(5,3) NOT NULL COMMENT '收益率, 0-100百分比',
  status VARCHAR(20) NOT NULL COMMENT '状态,销售中,锁定,已结束',
  memo VARCHAR(200) DEFAULT NULL COMMENT '备注',
  create_user VARCHAR(50) DEFAULT NULL COMMENT '创建者',
  update_user VARCHAR(50) DEFAULT NULL COMMENT '更新者',
  create_time DATETIME DEFAULT current_timestamp COMMENT '创建时间',
  modify_time DATETIME DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '更新时间',
  KEY `idx_name` (name)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET = utf8;