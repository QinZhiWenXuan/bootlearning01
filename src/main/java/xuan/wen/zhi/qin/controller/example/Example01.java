package xuan.wen.zhi.qin.controller.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/***
 * <pre>第一个spring-boot controller</pre>
 *
 * Created by qinzhiwenxuan on 2017/3/15.
 */
@RestController
@ResponseBody
public class Example01 {
    @RequestMapping(value = "/")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
