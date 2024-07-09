package com.entity.vo;

import com.entity.XinfangjubaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 信访举报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinfangjubao")
public class XinfangjubaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
