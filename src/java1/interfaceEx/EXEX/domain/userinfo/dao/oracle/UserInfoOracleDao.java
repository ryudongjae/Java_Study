package java1.interfaceEx.EXEX.domain.userinfo.dao.oracle;

import java1.interfaceEx.EXEX.domain.userinfo.UserInfo;
import java1.interfaceEx.EXEX.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB userId ="+ userInfo.getUserId());
    }

    @Override
    public void UpdateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB userId ="+ userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from ORACLE DB userId ="+ userInfo.getUserId());
    }
}
