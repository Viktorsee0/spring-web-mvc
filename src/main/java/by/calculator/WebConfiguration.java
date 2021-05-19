package by.calculator;

import by.calculator.model.calc.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "by.calculator")
public class WebConfiguration {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setPrefix("/pages/");
        return internalResourceViewResolver;
    }

    @Bean
    public Map<String, Action> getAction(Sum sum, Sub sub, Mul mul, Div div){
        Map<String, Action> map = new HashMap<>();
        map.put("sum", sum);
        map.put("sub", sub);
        map.put("mul", mul);
        map.put("div", div);
        return map;
    }

}
