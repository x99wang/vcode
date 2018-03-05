package com.wx.controller;

import com.wx.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public @ResponseBody
    String getVcode(@RequestParam("base64") String baseCode) {
        String result = "error";
        try {
            result = new MainService().getAllOcr(baseCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
