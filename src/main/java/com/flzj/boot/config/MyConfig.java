package com.flzj.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.flzj.boot.bean.Pet01;
import com.flzj.boot.bean.User01;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({User01.class})
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({User01.class})
public class MyConfig {

    //@ConditionalOnBean(name = "tom")
    @Bean // 给容器添加组件 （方法名组件为id,返回类型为组件类型，返回值就是组件在容器中的实例）
    public User01 user01(){
        return new User01();
    }

    @Bean("tom")
    public Pet01 pet01(){
        return new Pet01("bbb");
    }


}
