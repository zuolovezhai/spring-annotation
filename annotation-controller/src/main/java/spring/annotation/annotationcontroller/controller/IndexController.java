package spring.annotation.annotationcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 测试Controller注解
 * @Author zuoshengli
 **/
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "inddex";
    }
}
