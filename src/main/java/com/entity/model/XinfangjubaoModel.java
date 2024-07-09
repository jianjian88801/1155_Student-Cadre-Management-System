package com.entity.model;

import com.entity.XinfangjubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 信访举报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinfangjubaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生干部
     */
    private Integer xueshengganbuId;


    /**
     * 信访举报标题
     */
    private String xinfangjubaoName;


    /**
     * 信访举报类型
     */
    private Integer xinfangjubaoTypes;


    /**
     * 附件
     */
    private String xinfangjubaoFile;


    /**
     * 信访举报内容
     */
    private String xinfangjubaoContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生干部
	 */
    public Integer getXueshengganbuId() {
        return xueshengganbuId;
    }


    /**
	 * 设置：学生干部
	 */
    public void setXueshengganbuId(Integer xueshengganbuId) {
        this.xueshengganbuId = xueshengganbuId;
    }
    /**
	 * 获取：信访举报标题
	 */
    public String getXinfangjubaoName() {
        return xinfangjubaoName;
    }


    /**
	 * 设置：信访举报标题
	 */
    public void setXinfangjubaoName(String xinfangjubaoName) {
        this.xinfangjubaoName = xinfangjubaoName;
    }
    /**
	 * 获取：信访举报类型
	 */
    public Integer getXinfangjubaoTypes() {
        return xinfangjubaoTypes;
    }


    /**
	 * 设置：信访举报类型
	 */
    public void setXinfangjubaoTypes(Integer xinfangjubaoTypes) {
        this.xinfangjubaoTypes = xinfangjubaoTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getXinfangjubaoFile() {
        return xinfangjubaoFile;
    }


    /**
	 * 设置：附件
	 */
    public void setXinfangjubaoFile(String xinfangjubaoFile) {
        this.xinfangjubaoFile = xinfangjubaoFile;
    }
    /**
	 * 获取：信访举报内容
	 */
    public String getXinfangjubaoContent() {
        return xinfangjubaoContent;
    }


    /**
	 * 设置：信访举报内容
	 */
    public void setXinfangjubaoContent(String xinfangjubaoContent) {
        this.xinfangjubaoContent = xinfangjubaoContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
