package com.acat.controller;

import com.acat.model.Renyuan;
import com.acat.service.IRenyuanService;
import com.acat.vo.RenyuanVo;
import org.junit.Test;
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

    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public void addRenyuan( @RequestBody Renyuan renyuan) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(renyuan);
        System.out.println(renyuan.getID());
        renyuanService.addRenyuan(renyuan);
    }

    @RequestMapping(value = "/listAll")
    @ResponseBody
    public List<RenyuanVo> listAll() {
        List<RenyuanVo> list = renyuanService.getRenyuanVo();
        return list;
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.POST)
    public String getById(@PathVariable("id") Integer id) {
        System.out.println(renyuanService.getRenyuanById(id));
        return renyuanService.getRenyuanById(id).toString();
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public void delete(@PathVariable("id") Integer id) {
        renyuanService.deleteRenyuanById(id);
    }

    @RequestMapping(value="/update/{id}",method = RequestMethod.POST)
    public Renyuan updateRenyuan(@PathVariable("id") Integer id){
        System.out.println("id是"+id);
        Renyuan renyuan = renyuanService.getRenyuanById(id);
        return renyuan;
    }
    @Test
    public void test(){
        Renyuan renyuan = renyuanService.getRenyuanById(108);
        System.out.println(renyuan);
    }
}
