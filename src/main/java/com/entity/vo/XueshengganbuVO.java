package com.entity.vo;

import com.entity.XueshengganbuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生干部
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xueshengganbu")
public class XueshengganbuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 学生干部姓名
     */

    @TableField(value = "xueshengganbu_name")
    private String xueshengganbuName;


    /**
     * 学生干部手机号
     */

    @TableField(value = "xueshengganbu_phone")
    private String xueshengganbuPhone;


    /**
     * 学生干部身份证号
     */

    @TableField(value = "xueshengganbu_id_number")
    private String xueshengganbuIdNumber;


    /**
     * 头像
     */

    @TableField(value = "xueshengganbu_photo")
    private String xueshengganbuPhoto;


    /**
     * 电子邮箱
     */

    @TableField(value = "xueshengganbu_email")
    private String xueshengganbuEmail;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 部门
     */

    @TableField(value = "bumen_types")
    private Integer bumenTypes;


    /**
     * 职位
     */

    @TableField(value = "zhiwei_types")
    private Integer zhiweiTypes;


    /**
     * 考核
     */

    @TableField(value = "kaohe")
    private Integer kaohe;


    /**
     * 纪检
     */

    @TableField(value = "jijian")
    private Integer jijian;


    /**
     * 信访
     */

    @TableField(value = "xinfang")
    private Integer xinfang;


    /**
     * 履历
     */

    @TableField(value = "lvli")
    private Integer lvli;


    /**
     * 审计
     */

    @TableField(value = "shenji")
    private Integer shenji;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：学生干部姓名
	 */
    public String getXueshengganbuName() {
        return xueshengganbuName;
    }


    /**
	 * 获取：学生干部姓名
	 */

    public void setXueshengganbuName(String xueshengganbuName) {
        this.xueshengganbuName = xueshengganbuName;
    }
    /**
	 * 设置：学生干部手机号
	 */
    public String getXueshengganbuPhone() {
        return xueshengganbuPhone;
    }


    /**
	 * 获取：学生干部手机号
	 */

    public void setXueshengganbuPhone(String xueshengganbuPhone) {
        this.xueshengganbuPhone = xueshengganbuPhone;
    }
    /**
	 * 设置：学生干部身份证号
	 */
    public String getXueshengganbuIdNumber() {
        return xueshengganbuIdNumber;
    }


    /**
	 * 获取：学生干部身份证号
	 */

    public void setXueshengganbuIdNumber(String xueshengganbuIdNumber) {
        this.xueshengganbuIdNumber = xueshengganbuIdNumber;
    }
    /**
	 * 设置：头像
	 */
    public String getXueshengganbuPhoto() {
        return xueshengganbuPhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setXueshengganbuPhoto(String xueshengganbuPhoto) {
        this.xueshengganbuPhoto = xueshengganbuPhoto;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getXueshengganbuEmail() {
        return xueshengganbuEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setXueshengganbuEmail(String xueshengganbuEmail) {
        this.xueshengganbuEmail = xueshengganbuEmail;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：部门
	 */
    public Integer getBumenTypes() {
        return bumenTypes;
    }


    /**
	 * 获取：部门
	 */

    public void setBumenTypes(Integer bumenTypes) {
        this.bumenTypes = bumenTypes;
    }
    /**
	 * 设置：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 获取：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：考核
	 */
    public Integer getKaohe() {
        return kaohe;
    }


    /**
	 * 获取：考核
	 */

    public void setKaohe(Integer kaohe) {
        this.kaohe = kaohe;
    }
    /**
	 * 设置：纪检
	 */
    public Integer getJijian() {
        return jijian;
    }


    /**
	 * 获取：纪检
	 */

    public void setJijian(Integer jijian) {
        this.jijian = jijian;
    }
    /**
	 * 设置：信访
	 */
    public Integer getXinfang() {
        return xinfang;
    }


    /**
	 * 获取：信访
	 */

    public void setXinfang(Integer xinfang) {
        this.xinfang = xinfang;
    }
    /**
	 * 设置：履历
	 */
    public Integer getLvli() {
        return lvli;
    }


    /**
	 * 获取：履历
	 */

    public void setLvli(Integer lvli) {
        this.lvli = lvli;
    }
    /**
	 * 设置：审计
	 */
    public Integer getShenji() {
        return shenji;
    }


    /**
	 * 获取：审计
	 */

    public void setShenji(Integer shenji) {
        this.shenji = shenji;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
