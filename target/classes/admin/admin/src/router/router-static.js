import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggao from '@/views/modules/gonggao/list'
    import liuyan from '@/views/modules/liuyan/list'
    import xinfangjubao from '@/views/modules/xinfangjubao/list'
    import xueshengganbu from '@/views/modules/xueshengganbu/list'
    import zuzhipingjia from '@/views/modules/zuzhipingjia/list'
    import dictionaryBumen from '@/views/modules/dictionaryBumen/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXinfangjubao from '@/views/modules/dictionaryXinfangjubao/list'
    import dictionaryZhiwei from '@/views/modules/dictionaryZhiwei/list'
    import dictionaryZuzhipingjia from '@/views/modules/dictionaryZuzhipingjia/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBumen',
        name: '部门',
        component: dictionaryBumen
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXinfangjubao',
        name: '信访举报类型',
        component: dictionaryXinfangjubao
    }
    ,{
        path: '/dictionaryZhiwei',
        name: '职位',
        component: dictionaryZhiwei
    }
    ,{
        path: '/dictionaryZuzhipingjia',
        name: '评价类型',
        component: dictionaryZuzhipingjia
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggao',
        name: '公告信息',
        component: gonggao
      }
    ,{
        path: '/liuyan',
        name: '留言',
        component: liuyan
      }
    ,{
        path: '/xinfangjubao',
        name: '信访举报',
        component: xinfangjubao
      }
    ,{
        path: '/xueshengganbu',
        name: '学生干部',
        component: xueshengganbu
      }
    ,{
        path: '/zuzhipingjia',
        name: '组织评价',
        component: zuzhipingjia
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
