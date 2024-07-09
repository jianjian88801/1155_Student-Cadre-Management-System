package com.entity.model;

import com.entity.ZuzhipingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 组织评价
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuzhipingjiaModel implements Serializable {
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
     * 评价标题
     */
    private String zuzhipingjiaName;


    /**
     * 评价类型
     */
    private Integer zuzhipingjiaTypes;


    /**
     * 附件
     */
    private String zuzhipingjiaFile;


    /**
     * 评价内容
     */
    private String zuzhipingjiaContent;


    /**
     * 评价时间
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
	 * 获取：评价标题
	 */
    public String getZuzhipingjiaName() {
        return zuzhipingjiaName;
    }


    /**
	 * 设置：评价标题
	 */
    public void setZuzhipingjiaName(String zuzhipingjiaName) {
        this.zuzhipingjiaName = zuzhipingjiaName;
    }
    /**
	 * 获取：评价类型
	 */
    public Integer getZuzhipingjiaTypes() {
        return zuzhipingjiaTypes;
    }


    /**
	 * 设置：评价类型
	 */
    public void setZuzhipingjiaTypes(Integer zuzhipingjiaTypes) {
        this.zuzhipingjiaTypes = zuzhipingjiaTypes;
    }
    /**
	 * 获取：附件
	 */
    public String getZuzhipingjiaFile() {
        return zuzhipingjiaFile;
    }


    /**
	 * 设置：附件
	 */
    public void setZuzhipingjiaFile(String zuzhipingjiaFile) {
        this.zuzhipingjiaFile = zuzhipingjiaFile;
    }
    /**
	 * 获取：评价内容
	 */
    public String getZuzhipingjiaContent() {
        return zuzhipingjiaContent;
    }


    /**
	 * 设置：评价内容
	 */
    public void setZuzhipingjiaContent(String zuzhipingjiaContent) {
        this.zuzhipingjiaContent = zuzhipingjiaContent;
    }
    /**
	 * 获取：评价时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：评价时间
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
