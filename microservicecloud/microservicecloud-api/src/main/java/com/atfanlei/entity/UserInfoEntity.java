package com.atfanlei.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description 学生信息实体类
 * @Author f
 * @CreateTime 2019/5/26 21:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("serial")
@TableName("user_info") //@TableName中的值对应着表名
public class UserInfoEntity  implements Serializable {

  /**
   * 主键
   * TableId中可以决定主键的类型,不写会采取默认值,默认值可以在yml中配置
   * AUTO: 数据库ID自增
   * INPUT: 用户输入ID
   * ID_WORKER: 全局唯一ID，Long类型的主键
   * ID_WORKER_STR: 字符串全局唯一ID
   * UUID: 全局唯一ID，UUID类型的主键
   * NONE: 该类型为未设置主键类型
   */
  @TableId(type = IdType.AUTO)
  private Integer id;
  /**
   * 姓名
   */
  @Excel(name = "学生姓名", height = 20, width = 30, isImportField = "true_st")
  private String userName;
  /**
   * 年龄
   */
  private  String password;

  @TableField(value = "user_age",exist = true)
  @Excel(name = "学生年龄", height = 20, width = 30, isImportField = "true_st")
  private String userAge;
  /**
   * 技能
   */
  @Excel(name = "技能", height = 20, width = 30, isImportField = "true_st")
  private String skill;
  /**
   * 评价
   */
  @Excel(name = "评论", height = 20, width = 30, isImportField = "true_st")
  private String evaluate;
  /**
   * 分数
   */
  @Excel(name = "分数", height = 20, width = 30, isImportField = "true_st")
  private Integer fraction;

 @Excel(name = "出生日期",height = 20,width = 30,exportFormat = "yyyy-MM-dd")
  private Date userBirth;

 //连接的那个数据库
 private String dbSource;

 //权限id
 private Integer menuId;
}
