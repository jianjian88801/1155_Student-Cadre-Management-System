<template>
    <div class="addEdit-block">
        <el-form
                class="detail-form-content"
                ref="ruleForm"
                :model="ruleForm"
                :rules="rules"
                label-width="80px"
                :style="{backgroundColor:addEditForm.addEditBoxColor}">
            <el-row>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu'">
                    <el-form-item class="select" v-if="type!='info'"  label="学生干部" prop="xueshengganbuId">
                        <el-select v-model="ruleForm.xueshengganbuId" :disabled="ro.xueshengganbuId" filterable placeholder="请选择学生干部" @change="xueshengganbuChange">
                            <el-option
                                    v-for="(item,index) in xueshengganbuOptions"
                                    v-bind:key="item.id"
                                    :label="item.xueshengganbuName"
                                    :value="item.id">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>

                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="学生干部姓名" prop="xueshengganbuName">
                        <el-input v-model="xueshengganbuForm.xueshengganbuName"
                                  placeholder="学生干部姓名" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="学生干部姓名" prop="xueshengganbuName">
                            <el-input v-model="ruleForm.xueshengganbuName"
                                      placeholder="学生干部姓名" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="学生干部手机号" prop="xueshengganbuPhone">
                        <el-input v-model="xueshengganbuForm.xueshengganbuPhone"
                                  placeholder="学生干部手机号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="学生干部手机号" prop="xueshengganbuPhone">
                            <el-input v-model="ruleForm.xueshengganbuPhone"
                                      placeholder="学生干部手机号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="学生干部身份证号" prop="xueshengganbuIdNumber">
                        <el-input v-model="xueshengganbuForm.xueshengganbuIdNumber"
                                  placeholder="学生干部身份证号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="学生干部身份证号" prop="xueshengganbuIdNumber">
                            <el-input v-model="ruleForm.xueshengganbuIdNumber"
                                      placeholder="学生干部身份证号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="24" v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="upload" v-if="type!='info' && !ro.xueshengganbuPhoto" label="头像" prop="xueshengganbuPhoto">
                        <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (xueshengganbuForm.xueshengganbuPhoto || '').split(',')" :src="item" width="100" height="100">
                    </el-form-item>
                    <div v-else>
                        <el-form-item v-if="ruleForm.xueshengganbuPhoto" label="头像" prop="xueshengganbuPhoto">
                            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (ruleForm.xueshengganbuPhoto || '').split(',')" :src="item" width="100" height="100">
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="电子邮箱" prop="xueshengganbuEmail">
                        <el-input v-model="xueshengganbuForm.xueshengganbuEmail"
                                  placeholder="电子邮箱" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="电子邮箱" prop="xueshengganbuEmail">
                            <el-input v-model="ruleForm.xueshengganbuEmail"
                                      placeholder="电子邮箱" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="部门" prop="bumenValue">
                        <el-input v-model="xueshengganbuForm.bumenValue"
                                  placeholder="部门" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="部门" prop="bumenValue">
                            <el-input v-model="ruleForm.bumenValue"
                                      placeholder="部门" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="职位" prop="zhiweiValue">
                        <el-input v-model="xueshengganbuForm.zhiweiValue"
                                  placeholder="职位" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="职位" prop="zhiweiValue">
                            <el-input v-model="ruleForm.zhiweiValue"
                                      placeholder="职位" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="考核" prop="kaohe">
                        <el-input v-model="xueshengganbuForm.kaohe"
                                  placeholder="考核" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="考核" prop="kaohe">
                            <el-input v-model="ruleForm.kaohe"
                                      placeholder="考核" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="纪检" prop="jijian">
                        <el-input v-model="xueshengganbuForm.jijian"
                                  placeholder="纪检" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="纪检" prop="jijian">
                            <el-input v-model="ruleForm.jijian"
                                      placeholder="纪检" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="信访" prop="xinfang">
                        <el-input v-model="xueshengganbuForm.xinfang"
                                  placeholder="信访" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="信访" prop="xinfang">
                            <el-input v-model="ruleForm.xinfang"
                                      placeholder="信访" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="履历" prop="lvli">
                        <el-input v-model="xueshengganbuForm.lvli"
                                  placeholder="履历" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="履历" prop="lvli">
                            <el-input v-model="ruleForm.lvli"
                                      placeholder="履历" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='xueshengganbu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="审计" prop="shenji">
                        <el-input v-model="xueshengganbuForm.shenji"
                                  placeholder="审计" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="审计" prop="shenji">
                            <el-input v-model="ruleForm.shenji"
                                      placeholder="审计" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <input id="updateId" name="id" type="hidden">
            <input id="xueshengganbuId" name="xueshengganbuId" type="hidden">
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="信访举报标题" prop="xinfangjubaoName">
                       <el-input v-model="ruleForm.xinfangjubaoName"
                                 placeholder="信访举报标题" clearable  :readonly="ro.xinfangjubaoName"></el-input>
                   </el-form-item>
                   <div v-else>
                       <el-form-item class="input" label="信访举报标题" prop="xinfangjubaoName">
                           <el-input v-model="ruleForm.xinfangjubaoName"
                                     placeholder="信访举报标题" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
                <el-col :span="12">
                    <el-form-item class="select" v-if="type!='info'"  label="信访举报类型" prop="xinfangjubaoTypes">
                        <el-select v-model="ruleForm.xinfangjubaoTypes" :disabled="ro.xinfangjubaoTypes" placeholder="请选择信访举报类型">
                            <el-option
                                v-for="(item,index) in xinfangjubaoTypesOptions"
                                v-bind:key="item.codeIndex"
                                :label="item.indexName"
                                :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <div v-else>
                        <el-form-item class="input" label="信访举报类型" prop="xinfangjubaoValue">
                        <el-input v-model="ruleForm.xinfangjubaoValue"
                            placeholder="信访举报类型" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="24">
                    <el-form-item class="upload" v-if="type!='info' && !ro.xinfangjubaoFile" label="附件" prop="xinfangjubaoFile">
                        <file-upload
                                tip="点击上传附件"
                                action="file/upload"
                                :limit="3"
                                :multiple="true"
                                :fileUrls="ruleForm.xinfangjubaoFile?ruleForm.xinfangjubaoFile:''"
                                @change="xinfangjubaoFileUploadChange"
                        ></file-upload>
                    </el-form-item>
                    <div v-else>
                        <el-form-item v-if="ruleForm.xinfangjubaoFile" label="附件" prop="xinfangjubaoFile">
                            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (ruleForm.xinfangjubaoFile || '').split(',')" :src="item" width="100" height="100">
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="24">
                    <el-form-item v-if="type!='info'"  label="信访举报内容" prop="xinfangjubaoContent">
                        <editor style="min-width: 200px; max-width: 600px;"
                                v-model="ruleForm.xinfangjubaoContent"
                                class="editor"
                                action="file/upload">
                        </editor>
                    </el-form-item>
                    <div v-else>
                        <el-form-item v-if="ruleForm.xinfangjubaoContent" label="信访举报内容" prop="xinfangjubaoContent">
                            <span v-html="ruleForm.xinfangjubaoContent"></span>
                        </el-form-item>
                    </div>
                </el-col>
            </el-row>
            <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
                <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
                <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>
<script>
    import styleJs from "../../../utils/style.js";
    // 数字，邮件，手机，url，身份证校验
    import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
    export default {
        data() {
            return {
                addEditForm:null,
                id: '',
                type: '',
                sessionTable : "",//登录账户所在表名
                role : "",//权限
                userId:"",//当前登录人的id
                xueshengganbuForm: {},
                ro:{
                    xueshengganbuId: false,
                    xinfangjubaoName: false,
                    xinfangjubaoTypes: false,
                    xinfangjubaoFile: false,
                    xinfangjubaoContent: false,
                    insertTime: false,
                },
                ruleForm: {
                    xueshengganbuId: '',
                    xinfangjubaoName: '',
                    xinfangjubaoTypes: '',
                    xinfangjubaoFile: '',
                    xinfangjubaoContent: '',
                    insertTime: '',
                },
                xinfangjubaoTypesOptions : [],
                xueshengganbuOptions : [],
                rules: {
                   xueshengganbuId: [
                              { required: true, message: '学生干部不能为空', trigger: 'blur' },
                              {  pattern: /^[1-9][0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   xinfangjubaoName: [
                              { required: true, message: '信访举报标题不能为空', trigger: 'blur' },
                          ],
                   xinfangjubaoTypes: [
                              { required: true, message: '信访举报类型不能为空', trigger: 'blur' },
                              {  pattern: /^[1-9][0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   xinfangjubaoFile: [
                              { required: true, message: '附件不能为空', trigger: 'blur' },
                          ],
                   xinfangjubaoContent: [
                              { required: true, message: '信访举报内容不能为空', trigger: 'blur' },
                          ],
                   insertTime: [
                              { required: true, message: '添加时间不能为空', trigger: 'blur' },
                          ],
                }
            };
        },
        props: ["parent"],
        computed: {
        },
        created() {
            //获取当前登录用户的信息
            this.sessionTable = this.$storage.get("sessionTable");
            this.role = this.$storage.get("role");
            this.userId = this.$storage.get("userId");

            if (this.role != "管理员"){
            }
            this.addEditForm = styleJs.addStyle();
            this.addEditStyleChange()
            this.addEditUploadStyleChange()
            //获取下拉框信息
                this.$http({
                    url:`dictionary/page?page=1&limit=100&sort=&order=&dicCode=xinfangjubao_types`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.xinfangjubaoTypesOptions = data.data.list;
                    }
                });

         this.$http({
             url: `xueshengganbu/page?page=1&limit=100`,
             method: "get"
         }).then(({ data }) => {
             if (data && data.code === 0) {
                this.xueshengganbuOptions = data.data.list;
            }
         });

        },
        mounted() {
        },
        methods: {
            // 下载
            download(file){
                window.open(`${file}`)
            },
            // 初始化
            init(id,type) {
                if (id) {
                    this.id = id;
                    this.type = type;
                }
                if(this.type=='info'||this.type=='else'){
                    this.info(id);
                }
                // 获取用户信息
                this.$http({
                    url:`${this.$storage.get("sessionTable")}/session`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        var json = data.data;
                    } else {
                        this.$message.error(data.msg);
                    }
                });
            },
            xueshengganbuChange(id){
                this.$http({
                    url: `xueshengganbu/info/`+id,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.xueshengganbuForm = data.data;
                    }
                });
            },
            // 多级联动参数
            info(id) {
                let _this =this;
                _this.$http({
                    url: `xinfangjubao/info/${id}`,
                    method: 'get'
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        _this.ruleForm = data.data;
                        _this.xueshengganbuChange(data.data.xueshengganbuId)
                    } else {
                        _this.$message.error(data.msg);
                    }
                });
            },
            // 提交
            onSubmit() {
                this.$refs["ruleForm"].validate(valid => {
                    if (valid) {
                        this.$http({
                            url:`xinfangjubao/${!this.ruleForm.id ? "save" : "update"}`,
                            method: "post",
                            data: this.ruleForm
                        }).then(({ data }) => {
                            if (data && data.code === 0) {
                                this.$message({
                                    message: "操作成功",
                                    type: "success",
                                    duration: 1500,
                                    onClose: () => {
                                        this.parent.showFlag = true;
                                        this.parent.addOrUpdateFlag = false;
                                        this.parent.xinfangjubaoCrossAddOrUpdateFlag = false;
                                        this.parent.search();
                                        this.parent.contentStyleChange();
                                    }
                                });
                            } else {
                                this.$message.error(data.msg);
                            }
                        });
                    }
                });
            },
            // 获取uuid
            getUUID () {
                return new Date().getTime();
            },
            // 返回
            back() {
                this.parent.showFlag = true;
                this.parent.addOrUpdateFlag = false;
                this.parent.xinfangjubaoCrossAddOrUpdateFlag = false;
                this.parent.contentStyleChange();
            },
            //图片
            xinfangjubaoFileUploadChange(fileUrls){
                this.ruleForm.xinfangjubaoFile = fileUrls;
                this.addEditUploadStyleChange()
            },

            addEditStyleChange() {
                this.$nextTick(()=>{
                    // input
                    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputFontColor
                        el.style.fontSize = this.addEditForm.inputFontSize
                        el.style.borderWidth = this.addEditForm.inputBorderWidth
                        el.style.borderStyle = this.addEditForm.inputBorderStyle
                        el.style.borderColor = this.addEditForm.inputBorderColor
                        el.style.borderRadius = this.addEditForm.inputBorderRadius
                        el.style.backgroundColor = this.addEditForm.inputBgColor
                    })
                    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputLableColor
                        el.style.fontSize = this.addEditForm.inputLableFontSize
                    })
                    // select
                    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectFontColor
                        el.style.fontSize = this.addEditForm.selectFontSize
                        el.style.borderWidth = this.addEditForm.selectBorderWidth
                        el.style.borderStyle = this.addEditForm.selectBorderStyle
                        el.style.borderColor = this.addEditForm.selectBorderColor
                        el.style.borderRadius = this.addEditForm.selectBorderRadius
                        el.style.backgroundColor = this.addEditForm.selectBgColor
                    })
                    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectLableColor
                        el.style.fontSize = this.addEditForm.selectLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
                        el.style.color = this.addEditForm.selectIconFontColor
                        el.style.fontSize = this.addEditForm.selectIconFontSize
                    })
                    // date
                    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateFontColor
                        el.style.fontSize = this.addEditForm.dateFontSize
                        el.style.borderWidth = this.addEditForm.dateBorderWidth
                        el.style.borderStyle = this.addEditForm.dateBorderStyle
                        el.style.borderColor = this.addEditForm.dateBorderColor
                        el.style.borderRadius = this.addEditForm.dateBorderRadius
                        el.style.backgroundColor = this.addEditForm.dateBgColor
                    })
                    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateLableColor
                        el.style.fontSize = this.addEditForm.dateLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
                        el.style.color = this.addEditForm.dateIconFontColor
                        el.style.fontSize = this.addEditForm.dateIconFontSize
                        el.style.lineHeight = this.addEditForm.dateHeight
                    })
                    // upload
                    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
                    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.uploadHeight
                        el.style.color = this.addEditForm.uploadLableColor
                        el.style.fontSize = this.addEditForm.uploadLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
                        el.style.color = this.addEditForm.uploadIconFontColor
                        el.style.fontSize = this.addEditForm.uploadIconFontSize
                        el.style.lineHeight = iconLineHeight
                        el.style.display = 'block'
                    })
                    // 多文本输入框
                    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
                        el.style.height = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaFontColor
                        el.style.fontSize = this.addEditForm.textareaFontSize
                        el.style.borderWidth = this.addEditForm.textareaBorderWidth
                        el.style.borderStyle = this.addEditForm.textareaBorderStyle
                        el.style.borderColor = this.addEditForm.textareaBorderColor
                        el.style.borderRadius = this.addEditForm.textareaBorderRadius
                        el.style.backgroundColor = this.addEditForm.textareaBgColor
                    })
                    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
                        // el.style.lineHeight = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaLableColor
                        el.style.fontSize = this.addEditForm.textareaLableFontSize
                    })
                    // 保存
                    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
                        el.style.width = this.addEditForm.btnSaveWidth
                        el.style.height = this.addEditForm.btnSaveHeight
                        el.style.color = this.addEditForm.btnSaveFontColor
                        el.style.fontSize = this.addEditForm.btnSaveFontSize
                        el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
                        el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
                        el.style.borderColor = this.addEditForm.btnSaveBorderColor
                        el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnSaveBgColor
                    })
                    // 返回
                    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
                        el.style.width = this.addEditForm.btnCancelWidth
                        el.style.height = this.addEditForm.btnCancelHeight
                        el.style.color = this.addEditForm.btnCancelFontColor
                        el.style.fontSize = this.addEditForm.btnCancelFontSize
                        el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
                        el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
                        el.style.borderColor = this.addEditForm.btnCancelBorderColor
                        el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnCancelBgColor
                    })
                })
            },
            addEditUploadStyleChange() {
                this.$nextTick(()=>{
                    document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                })
            },
        }
    };
</script>
<style lang="scss">
.editor{
  height: 500px;

  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}</style>

