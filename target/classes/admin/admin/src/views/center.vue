<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                    <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='学生干部姓名' prop="xueshengganbuName">
               <el-input v-model="ruleForm.xueshengganbuName"  placeholder='学生干部姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='学生干部手机号' prop="xueshengganbuPhone">
               <el-input v-model="ruleForm.xueshengganbuPhone"  placeholder='学生干部手机号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='学生干部身份证号' prop="xueshengganbuIdNumber">
               <el-input v-model="ruleForm.xueshengganbuIdNumber"  placeholder='学生干部身份证号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='xueshengganbu'" label='头像' prop="xueshengganbuPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.xueshengganbuPhoto?ruleForm.xueshengganbuPhoto:''"
                         @change="xueshengganbuPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='电子邮箱' prop="xueshengganbuEmail">
               <el-input v-model="ruleForm.xueshengganbuEmail"  placeholder='电子邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='xueshengganbu'"  label='部门' prop="bumenTypes">
                 <el-select v-model="ruleForm.bumenTypes" disabled placeholder='请选择部门'>
                     <el-option
                             v-for="(item,index) in bumenTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='xueshengganbu'"  label='职位' prop="zhiweiTypes">
                 <el-select v-model="ruleForm.zhiweiTypes" disabled placeholder='请选择职位'>
                     <el-option
                             v-for="(item,index) in zhiweiTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='考核' prop="kaohe">
               <el-input v-model="ruleForm.kaohe" disabled  placeholder='考核' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='纪检' prop="jijian">
               <el-input v-model="ruleForm.jijian" disabled placeholder='纪检' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='信访' prop="xinfang">
               <el-input v-model="ruleForm.xinfang" disabled placeholder='信访' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='履历' prop="lvli">
               <el-input v-model="ruleForm.lvli" disabled placeholder='履历' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xueshengganbu'"  label='审计' prop="shenji">
               <el-input v-model="ruleForm.shenji" disabled placeholder='审计' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-form-item v-if="flag=='users'" label="用户名" prop="username">
             <el-input v-model="ruleForm.username"
                       placeholder="用户名"></el-input>
         </el-form-item>
         <el-col :span="12">
             <el-form-item v-if="flag!='users'"  label="性别" prop="sexTypes">
                 <el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
                     <el-option
                             v-for="(item,index) in sexTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item>
                 <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
             </el-form-item>
         </el-col>
     </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      sexTypesOptions : [],
     bumenTypesOptions : [],
     zhiweiTypesOptions : [],
    };
  },
  mounted() {
    //获取当前登录用户的信息
    var table = this.$storage.get("sessionTable");
    this.sessionTable = this.$storage.get("sessionTable");
    this.role = this.$storage.get("role");
    if (this.role != "管理员"){
    }

    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
      this.$http({
          url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
          method: "get"
      }).then(({ data }) => {
          if (data && data.code === 0) {
          this.sexTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
  });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=bumen_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.bumenTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhiwei_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.zhiweiTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
  },
  methods: {
    xueshengganbuPhotoUploadChange(fileUrls) {
        this.ruleForm.xueshengganbuPhoto = fileUrls;
    },

    onUpdateHandler() {
                         if((!this.ruleForm.xueshengganbuName)&& 'xueshengganbu'==this.flag){
                             this.$message.error('学生干部姓名不能为空');
                             return
                         }

                             if( 'xueshengganbu' ==this.flag && this.ruleForm.xueshengganbuPhone&&(!isMobile(this.ruleForm.xueshengganbuPhone))){
                                 this.$message.error(`手机应输入手机格式`);
                                 return
                             }
                         if((!this.ruleForm.xueshengganbuIdNumber)&& 'xueshengganbu'==this.flag){
                             this.$message.error('学生干部身份证号不能为空');
                             return
                         }

                         if((!this.ruleForm.xueshengganbuPhoto)&& 'xueshengganbu'==this.flag){
                             this.$message.error('头像不能为空');
                             return
                         }

                             if( 'xueshengganbu' ==this.flag && this.ruleForm.xueshengganbuEmail&&(!isEmail(this.ruleForm.xueshengganbuEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.bumenTypes)&& 'xueshengganbu'==this.flag){
                             this.$message.error('部门不能为空');
                             return
                         }

                         if((!this.ruleForm.zhiweiTypes)&& 'xueshengganbu'==this.flag){
                             this.$message.error('职位不能为空');
                             return
                         }

                         if((!this.ruleForm.kaohe)&& 'xueshengganbu'==this.flag){
                             this.$message.error('考核不能为空');
                             return
                         }

                         if((!this.ruleForm.jijian)&& 'xueshengganbu'==this.flag){
                             this.$message.error('纪检不能为空');
                             return
                         }

                         if((!this.ruleForm.xinfang)&& 'xueshengganbu'==this.flag){
                             this.$message.error('信访不能为空');
                             return
                         }

                         if((!this.ruleForm.lvli)&& 'xueshengganbu'==this.flag){
                             this.$message.error('履历不能为空');
                             return
                         }

                         if((!this.ruleForm.shenji)&& 'xueshengganbu'==this.flag){
                             this.$message.error('审计不能为空');
                             return
                         }

        if((!this.ruleForm.sexTypes)&& this.flag !='users'){
            this.$message.error('性别不能为空');
            return
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
        this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
