package com.acat.controller;

import com.acat.service.IRenyuanService;
import com.acat.vo.RenyuanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/renyuan")
public class RenyuanController {


    @Autowired
    private IRenyuanService renyuanService;

    @RequestMapping(value="addRenyuan.do",method = RequestMethod.POST)
    @ResponseBody
    public void addRenyuan(HttpServletRequest request, HttpServletResponse response) {

    }
}
