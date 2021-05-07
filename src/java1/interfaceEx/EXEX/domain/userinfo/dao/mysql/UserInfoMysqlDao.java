package java1.interfaceEx.EXEX.domain.userinfo.dao.mysql;

import java1.interfaceEx.EXEX.domain.userinfo.UserInfo;
import java1.interfaceEx.EXEX.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId = "+userInfo.getUserId());
    }

    @Override
    public void UpdateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = "+userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId = "+userInfo.getUserId());
    }
}
