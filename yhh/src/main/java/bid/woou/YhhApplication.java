package bid.woou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ServletComponentScan
@SpringBootApplication
@MapperScan("bid.woou.**.mapper")
public class YhhApplication {
    public static void main(String[] args) {
        SpringApplication.run(YhhApplication.class, args);
    }
}
