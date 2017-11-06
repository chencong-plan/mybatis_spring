package cc.ccoder.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author chencong , Created in 2017/11/6 14:59
 */

@Controller
public class IndexController {

    @RequestMapping(value = {"","/index"})
    public ModelAndView dicts(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("now",new Date());
        return mv;
    }

}
