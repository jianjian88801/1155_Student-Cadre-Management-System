package com.entity.vo;

import com.entity.ZuzhipingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 组织评价
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zuzhipingjia")
public class ZuzhipingjiaVO implements Serializable {
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

}
