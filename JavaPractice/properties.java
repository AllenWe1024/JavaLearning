import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
    @Test
    public void test01() {
        Properties properties = System.getProperties();
        String fileEncoding = properties.getProperty("file.encoding");//当前源文件字符编码
        System.out.println("fileEncoding = " + fileEncoding);
    }

    @Test
    public void test02() {
        Properties properties = new Properties();
        properties.setProperty("user", "songhk");
        properties.setProperty("password", "123456");
        System.out.println(properties);
    }

    @Test
    public void test03() throws IOException {
        Properties pros = new Properties();
        // 不存在文件
        pros.load(new FileInputStream("jdbc.properties"));
        String user = pros.getProperty("user");
        System.out.println(user);
    }
}
