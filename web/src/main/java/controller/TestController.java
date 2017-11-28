package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IBeanService;

@Controller
@RequestMapping({"/index","/"})
public class TestController {

    /*@Resource
    ComService comService;引入dubbo*/

    @Autowired
    IBeanService service;

    @ResponseBody
    @RequestMapping()
    public Object index(){
        return "result>>>" + service.get();
    }

}
