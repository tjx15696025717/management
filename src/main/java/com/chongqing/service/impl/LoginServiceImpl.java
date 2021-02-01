package com.chongqing.service.impl;

import com.chongqing.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:29
 */
@Service
public class LoginServiceImpl implements LoginService {


//    @Autowired
//    private AdminMapper adminMapper;
//
//    @Autowired
//    private UserMapper userMapper;
//
//
//    @Autowired
//    private ManagementMapper managementMapper;





    /**
     * 登录功能
     * @param name
     * @param password
     * @param type 登录类型，0,user,1,admin,2,manager
     * @return
     */
    @Override
    public String login(String name,String password,String type) {
        // TODO Auto-generated method stub
        //根据type查询数据库,判断哪种类型的登录
//        if (null ==type) return null;
//        else if(type.equals("0")){
//            User user = new User();
//
//
//        }else if(type.equals("1")){
//
//            AdminExample adminExample=new AdminExample();
//            adminExample.createCriteria().andLoginAcctEqualTo(loginAcct);
//            //执行查询
//            List<Admin> list=adminMapper.selectByExample(adminExample);
//            if(!CrowdFundingUtils.collcetionEffective(list)){
//                return null;
//            }
//            Admin admin=list.get(0);
//
//        }else if(type.equals("2")){
//
//        }else return null;
//
//
//        if(admin==null){
//            return null;
//        }
//        String usrPswdDataBase=admin.getUserPswd();
//        try {
//            String usrPswdBroswer=CrowdFundingUtils.md5(userPswd);
//            if(Objects.equals(usrPswdDataBase,usrPswdBroswer)){
//                return admin;
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
        return null;

    }


}
