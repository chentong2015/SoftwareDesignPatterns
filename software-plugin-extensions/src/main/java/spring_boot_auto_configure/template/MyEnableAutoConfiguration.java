package spring_boot_auto_configure.template;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

// 1: .xml配置
// 2: Java配置版本(使用注解)
// 3: 使用@Import导入配置类(@Configuration，包含多个bean定义) 硬编码
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
// @AutoConfigurationPackage
@Import({MyAutoConfigurationImportSelector.class})
public @interface MyEnableAutoConfiguration {

}
