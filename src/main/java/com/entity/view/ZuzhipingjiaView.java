package com.entity.view;

import com.entity.ZuzhipingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 组织评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zuzhipingjia")
public class ZuzhipingjiaView extends ZuzhipingjiaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 评价类型的值
		*/
		private String zuzhipingjiaValue;



		//级联表 xueshengganbu
			/**
			* 学生干部姓名
			*/
			private String xueshengganbuName;
			/**
			* 学生干部手机号
			*/
			private String xueshengganbuPhone;
			/**
			* 学生干部身份证号
			*/
			private String xueshengganbuIdNumber;
			/**
			* 头像
			*/
			private String xueshengganbuPhoto;
			/**
			* 电子邮箱
			*/
			private String xueshengganbuEmail;
			/**
			* 部门
			*/
			private Integer bumenTypes;
				/**
				* 部门的值
				*/
				private String bumenValue;
			/**
			* 职位
			*/
			private Integer zhiweiTypes;
				/**
				* 职位的值
				*/
				private String zhiweiValue;
			/**
			* 考核
			*/
			private Integer kaohe;
			/**
			* 纪检
			*/
			private Integer jijian;
			/**
			* 信访
			*/
			private Integer xinfang;
			/**
			* 履历
			*/
			private Integer lvli;
			/**
			* 审计
			*/
			private Integer shenji;

	public ZuzhipingjiaView() {

	}

	public ZuzhipingjiaView(ZuzhipingjiaEntity zuzhipingjiaEntity) {
		try {
			BeanUtils.copyProperties(this, zuzhipingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 评价类型的值
			*/
			public String getZuzhipingjiaValue() {
				return zuzhipingjiaValue;
			}
			/**
			* 设置： 评价类型的值
			*/
			public void setZuzhipingjiaValue(String zuzhipingjiaValue) {
				this.zuzhipingjiaValue = zuzhipingjiaValue;
			}












				//级联表的get和set xueshengganbu
					/**
					* 获取： 学生干部姓名
					*/
					public String getXueshengganbuName() {
						return xueshengganbuName;
					}
					/**
					* 设置： 学生干部姓名
					*/
					public void setXueshengganbuName(String xueshengganbuName) {
						this.xueshengganbuName = xueshengganbuName;
					}
					/**
					* 获取： 学生干部手机号
					*/
					public String getXueshengganbuPhone() {
						return xueshengganbuPhone;
					}
					/**
					* 设置： 学生干部手机号
					*/
					public void setXueshengganbuPhone(String xueshengganbuPhone) {
						this.xueshengganbuPhone = xueshengganbuPhone;
					}
					/**
					* 获取： 学生干部身份证号
					*/
					public String getXueshengganbuIdNumber() {
						return xueshengganbuIdNumber;
					}
					/**
					* 设置： 学生干部身份证号
					*/
					public void setXueshengganbuIdNumber(String xueshengganbuIdNumber) {
						this.xueshengganbuIdNumber = xueshengganbuIdNumber;
					}
					/**
					* 获取： 头像
					*/
					public String getXueshengganbuPhoto() {
						return xueshengganbuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setXueshengganbuPhoto(String xueshengganbuPhoto) {
						this.xueshengganbuPhoto = xueshengganbuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengganbuEmail() {
						return xueshengganbuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengganbuEmail(String xueshengganbuEmail) {
						this.xueshengganbuEmail = xueshengganbuEmail;
					}
					/**
					* 获取： 部门
					*/
					public Integer getBumenTypes() {
						return bumenTypes;
					}
					/**
					* 设置： 部门
					*/
					public void setBumenTypes(Integer bumenTypes) {
						this.bumenTypes = bumenTypes;
					}


						/**
						* 获取： 部门的值
						*/
						public String getBumenValue() {
							return bumenValue;
						}
						/**
						* 设置： 部门的值
						*/
						public void setBumenValue(String bumenValue) {
							this.bumenValue = bumenValue;
						}
					/**
					* 获取： 职位
					*/
					public Integer getZhiweiTypes() {
						return zhiweiTypes;
					}
					/**
					* 设置： 职位
					*/
					public void setZhiweiTypes(Integer zhiweiTypes) {
						this.zhiweiTypes = zhiweiTypes;
					}


						/**
						* 获取： 职位的值
						*/
						public String getZhiweiValue() {
							return zhiweiValue;
						}
						/**
						* 设置： 职位的值
						*/
						public void setZhiweiValue(String zhiweiValue) {
							this.zhiweiValue = zhiweiValue;
						}
					/**
					* 获取： 考核
					*/
					public Integer getKaohe() {
						return kaohe;
					}
					/**
					* 设置： 考核
					*/
					public void setKaohe(Integer kaohe) {
						this.kaohe = kaohe;
					}
					/**
					* 获取： 纪检
					*/
					public Integer getJijian() {
						return jijian;
					}
					/**
					* 设置： 纪检
					*/
					public void setJijian(Integer jijian) {
						this.jijian = jijian;
					}
					/**
					* 获取： 信访
					*/
					public Integer getXinfang() {
						return xinfang;
					}
					/**
					* 设置： 信访
					*/
					public void setXinfang(Integer xinfang) {
						this.xinfang = xinfang;
					}
					/**
					* 获取： 履历
					*/
					public Integer getLvli() {
						return lvli;
					}
					/**
					* 设置： 履历
					*/
					public void setLvli(Integer lvli) {
						this.lvli = lvli;
					}
					/**
					* 获取： 审计
					*/
					public Integer getShenji() {
						return shenji;
					}
					/**
					* 设置： 审计
					*/
					public void setShenji(Integer shenji) {
						this.shenji = shenji;
					}




}
