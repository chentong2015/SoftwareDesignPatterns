package spring_boot_auto_configure.template.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemIntegrationConfiguration {

    // @ConditionalOnMissingBean
    @Bean
    AutoConfigService autoConfigService() {
        return new AutoConfigService();
    }

    // 自定义注入的bean的类型
    public class AutoConfigService {

    }
}
