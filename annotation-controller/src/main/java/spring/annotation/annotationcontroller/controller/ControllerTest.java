package spring.annotation.annotationcontroller.controller;

import org.springframework.stereotype.Controller;

/**
 * @Description 测试controller注解
 * @Author zuoshengli
 **/
@Controller
public class ControllerTest {
    public String index() {
        return "hello world";
    }
}
