package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(
//        basePackages = "hello.core.member", // 어디서 부터 찾는지 지정
//        basePackageClasses = AutoAppConfig.class, // 클래스가 존재하는 패키지 부터 찾는다
        // 지정하지 않으면 @ComponentScan 붙어있는 클래스 패키지 부터 하위 패키지 탐색한다
//        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
//)
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {

}
