package spring_boot_auto_configure.template;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;
import spring_boot_auto_configure.template.model.SystemIntegrationConfiguration;

import java.util.List;

public class MyAutoConfigurationImportSelector implements ImportSelector {

    // 方式1: 直接通过完整路径(全类名路径)导入 ==> 不推荐
    // @Override
    // public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    //   return new String[]{"spring_framework.bean.import_bean.PersonClass"};
    // }

    // 方式2: 通过读取properties文件中的配置来解耦 ==> 不推荐
    // @Override
    // public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    //      Properties properties = new Properties();
    //      properties.load(classLoader.getResourceAsStream("auto-main.config.properties"));
    //      String value = properties.getProperty("key");
    //      return new String[]{value};
    // }

    // TODO: 基于SPI机制的自动装配的实现效果, 批量加载bean定义，自动解析
    // 读取配置文件: META-INF/spring.factories, 提供要加载的factoryName
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> configurations = SpringFactoriesLoader.loadFactoryNames(SystemIntegrationConfiguration.class,
                MyAutoConfigurationImportSelector.class.getClassLoader());
        return StringUtils.toStringArray(configurations);
    }
}
