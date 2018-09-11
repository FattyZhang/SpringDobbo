package zhaojinshuai.top.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("zhaojinshuai.top.provider.dao")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        System.err.println("\n" +
                "============================╆━━━━━━+━━━━━━╅============================\n" +
                "  <<<<<=====<<<<<======<<<<<┃ Service 服务端启动成功!┃>>>>>======>>>>>=====>>>>>\n" +
                "============================╄━━━━━━+━━━━━━╃============================");
    }
}
