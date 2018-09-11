package zhaojinshuai.top.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages="zhaojinshuai.top.consumer.system.filter")
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        System.err.println("\n" +
                "============================╆━━━━━━━━━━╅============================\n" +
                "  <<<<<=====<<<<<======<<<<<┃ Web 服务端启动成功!┃>>>>>======>>>>>=====>>>>>\n" +
                "============================╄━━━━━━━━━━╃============================");
    }
}
