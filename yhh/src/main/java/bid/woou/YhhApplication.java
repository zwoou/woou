package bid.woou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("bid.woou.*.dao")
public class YhhApplication {

	public static void main(String[] args) {
		SpringApplication.run(YhhApplication.class, args);
	}
}
