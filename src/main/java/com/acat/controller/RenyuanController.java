package com.acat.controller;

import com.acat.model.Renyuan;
import com.acat.service.IRenyuanService;
import com.acat.vo.RenyuanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/renyuan")
public class RenyuanController {


    @Autowired
    private IRenyuanService renyuanService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addRenyuan( @RequestBody Renyuan renyuan) {
        System.out.println(renyuan);
        renyuanService.addRunyuan(renyuan);
    }

    @RequestMapping(value = "/listAll", produces = "application/json;charset=utf-8")
    public String listAll(HttpServletResponse response) throws Exception {
        System.out.println(renyuanService.getRenyuanVo().toString());
        return renyuanService.getRenyuanVo().toString();
    }

    @RequestMapping("/get/{id}")
    public String getById(@PathVariable("id") Integer id) {
        System.out.println(renyuanService.getRenyuanById(id));
        return renyuanService.getRenyuanById(id).toString();
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        renyuanService.deleteRenyuanById(id);
    }
}
