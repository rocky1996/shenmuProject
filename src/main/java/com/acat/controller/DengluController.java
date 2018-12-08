package com.acat.controller;

import com.acat.model.Denglu;
import com.acat.service.IDengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class DengluController {
    @Autowired
    private IDengluService iDengluService;

    @PostMapping(value = "/login/{username}/{password}",produces = "application/json;charset=utf-8")
    public String login(@PathVariable("username") String username, @PathVariable("password") String password) {

        if (password.equals("123456")) {
            return "false";
        } else {
            Denglu denglu = new Denglu();
            denglu.setYonghuming(username);
            denglu.setMima(password);
            Denglu newDenglu = iDengluService.login(denglu);
            int zhiwei = iDengluService.getRenyuanZhiwei(newDenglu.getYonghuming());
            if (zhiwei == 0) {
                return "0";
            } else if (zhiwei == 1) {
                return "1";
            } else if (zhiwei == 2) {
                return "2";
            } else if (zhiwei == 3) {
                return "3";
            }
        }

        return null;

    }

    @PostMapping(value="/getMima/{yonghuming}")
    public String getMima(@PathVariable("yonghuming") String yonghuming,@PathVariable("newMima") String newMima){
        String mima = iDengluService.getMimaByYonghuming(yonghuming);
        if(mima.equals(newMima)){
            return "新密码不能与初始密码一致";
        }
        Denglu denglu = new Denglu();
        denglu.setMima(newMima);
        denglu.setYonghuming(yonghuming);
        iDengluService.update(denglu);

        return "密码更新成功";
    }

}

/*
0是职工
1是组长，丁
2是段长
3是局长
 */
