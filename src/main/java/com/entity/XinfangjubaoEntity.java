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
 * 信访举报
 *
 * @author 
 * @email
 */
@TableName("xinfangjubao")
public class XinfangjubaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinfangjubaoEntity() {

	}

	public XinfangjubaoEntity(T t) {
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
     * 信访举报标题
     */
    @TableField(value = "xinfangjubao_name")

    private String xinfangjubaoName;


    /**
     * 信访举报类型
     */
    @TableField(value = "xinfangjubao_types")

    private Integer xinfangjubaoTypes;


    /**
     * 附件
     */
    @TableField(value = "xinfangjubao_file")

    private String xinfangjubaoFile;


    /**
     * 信访举报内容
     */
    @TableField(value = "xinfangjubao_content")

    private String xinfangjubaoContent;


    /**
     * 添加时间
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
	 * 设置：信访举报标题
	 */
    public String getXinfangjubaoName() {
        return xinfangjubaoName;
    }


    /**
	 * 获取：信访举报标题
	 */

    public void setXinfangjubaoName(String xinfangjubaoName) {
        this.xinfangjubaoName = xinfangjubaoName;
    }
    /**
	 * 设置：信访举报类型
	 */
    public Integer getXinfangjubaoTypes() {
        return xinfangjubaoTypes;
    }


    /**
	 * 获取：信访举报类型
	 */

    public void setXinfangjubaoTypes(Integer xinfangjubaoTypes) {
        this.xinfangjubaoTypes = xinfangjubaoTypes;
    }
    /**
	 * 设置：附件
	 */
    public String getXinfangjubaoFile() {
        return xinfangjubaoFile;
    }


    /**
	 * 获取：附件
	 */

    public void setXinfangjubaoFile(String xinfangjubaoFile) {
        this.xinfangjubaoFile = xinfangjubaoFile;
    }
    /**
	 * 设置：信访举报内容
	 */
    public String getXinfangjubaoContent() {
        return xinfangjubaoContent;
    }


    /**
	 * 获取：信访举报内容
	 */

    public void setXinfangjubaoContent(String xinfangjubaoContent) {
        this.xinfangjubaoContent = xinfangjubaoContent;
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

    @Override
    public String toString() {
        return "Xinfangjubao{" +
            "id=" + id +
            ", xueshengganbuId=" + xueshengganbuId +
            ", xinfangjubaoName=" + xinfangjubaoName +
            ", xinfangjubaoTypes=" + xinfangjubaoTypes +
            ", xinfangjubaoFile=" + xinfangjubaoFile +
            ", xinfangjubaoContent=" + xinfangjubaoContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
