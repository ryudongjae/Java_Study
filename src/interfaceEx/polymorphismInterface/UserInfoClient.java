package interfaceEx.polymorphismInterface;

import java.io.FileInputStream;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws Exception{
        //FileInputStream 는 InputStream 를 상속받았으며, 파일로 부터 바이트로 입력받아, 바이트 단위로 출력할 수 있는 클래스이다.
        FileInputStream fis = new FileInputStream("db.properties");

        //Properties 객체는 Hashtable 을 상속받은 객체로  HashTable 과 마찬가지로 key-value 값을 저장하는데 사용된다.
        //generic 클래스가 아니고, Serializable 을 구현하여 stream으로부터 입출력이 가능한 특징이 있습니다.
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("ryu");
        userInfo.setPassword("asdsad");
        userInfo.setUserName("ryu");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.endsWith("MYSQL")){
            userInfoDao = new UserInfoMysqlDao();
        }
        else{
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.UpdateUserInfo(userInfo);
        userInfoDao.UpdateUserInfo(userInfo);

    }
}
