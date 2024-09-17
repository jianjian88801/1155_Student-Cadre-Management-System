const base = {
    get() {
        return {
            url : "http://localhost:8080/banganbuguanli/",
            name: "banganbuguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/banganbuguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生干部管理系统"
        } 
    }
}
export default base
