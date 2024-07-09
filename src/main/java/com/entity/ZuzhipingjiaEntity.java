package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 组织评价
 *
 * @author 
 * @email
 */
@TableName("zuzhipingjia")
public class ZuzhipingjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZuzhipingjiaEntity() {

	}

	public ZuzhipingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生干部
     */
    @TableField(value = "xueshengganbu_id")

    private Integer xueshengganbuId;


    /**
     * 评价标题
     */
    @TableField(value = "zuzhipingjia_name")

    private String zuzhipingjiaName;


    /**
     * 评价类型
     */
    @TableField(value = "zuzhipingjia_types")

    private Integer zuzhipingjiaTypes;


    /**
     * 附件
     */
    @TableField(value = "zuzhipingjia_file")

    private String zuzhipingjiaFile;


    /**
     * 评价内容
     */
    @TableField(value = "zuzhipingjia_content")

    private String zuzhipingjiaContent;


    /**
     * 评价时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：学生干部
	 */
    public Integer getXueshengganbuId() {
        return xueshengganbuId;
    }


    /**
	 * 获取：学生干部
	 */

    public void setXueshengganbuId(Integer xueshengganbuId) {
        this.xueshengganbuId = xueshengganbuId;
    }
    /**
	 * 设置：评价标题
	 */
    public String getZuzhipingjiaName() {
        return zuzhipingjiaName;
    }


    /**
	 * 获取：评价标题
	 */

    public void setZuzhipingjiaName(String zuzhipingjiaName) {
        this.zuzhipingjiaName = zuzhipingjiaName;
    }
    /**
	 * 设置：评价类型
	 */
    public Integer getZuzhipingjiaTypes() {
        return zuzhipingjiaTypes;
    }


    /**
	 * 获取：评价类型
	 */

    public void setZuzhipingjiaTypes(Integer zuzhipingjiaTypes) {
        this.zuzhipingjiaTypes = zuzhipingjiaTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getZuzhipingjiaFile() {
        return zuzhipingjiaFile;
    }


    /**
	 * 获取：附件
	 */

    public void setZuzhipingjiaFile(String zuzhipingjiaFile) {
        this.zuzhipingjiaFile = zuzhipingjiaFile;
    }
    /**
	 * 设置：评价内容
	 */
    public String getZuzhipingjiaContent() {
        return zuzhipingjiaContent;
    }


    /**
	 * 获取：评价内容
	 */

    public void setZuzhipingjiaContent(String zuzhipingjiaContent) {
        this.zuzhipingjiaContent = zuzhipingjiaContent;
    }
    /**
	 * 设置：评价时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：评价时间
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

    @Override
    public String toString() {
        return "Zuzhipingjia{" +
            "id=" + id +
            ", xueshengganbuId=" + xueshengganbuId +
            ", zuzhipingjiaName=" + zuzhipingjiaName +
            ", zuzhipingjiaTypes=" + zuzhipingjiaTypes +
            ", zuzhipingjiaFile=" + zuzhipingjiaFile +
            ", zuzhipingjiaContent=" + zuzhipingjiaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
