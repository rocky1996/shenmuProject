package com.acat.controller;

import com.acat.model.Renyuan;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 人员管理Controller
 */
@RestController
@RequestMapping("/renyuan")
public class RenyuanController {
    @Autowired
    private IRenyuanService iRenyuanService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public void addRenyuan(@RequestBody Renyuan renyuan) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(renyuan);
        System.out.println(renyuan.getID());
        iRenyuanService.addRenyuan(renyuan);
    }

    @RequestMapping(value = "/listAll")
    @ResponseBody
    public List<RenyuanVo> listAll() {
        List<RenyuanVo> list = iRenyuanService.findRenyuanVo();
        return list;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Renyuan getById(@PathVariable("id") Integer id) {
        System.out.println(iRenyuanService.getRenyuanById(id));
        return iRenyuanService.getRenyuanById(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public void delete(@PathVariable("id") Integer id) {
        iRenyuanService.deleteRenyuanById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String updateRenyuan(@RequestBody Renyuan renyuan) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("renyuan是" + renyuan);
        System.out.println(renyuan.getID());
        iRenyuanService.updateRenyuanById(renyuan);
        System.out.println("****************************************************************************8888");
        return "修改成功";
    }

    @Test
    public void test() {
        Renyuan renyuan = iRenyuanService.getRenyuanById(108);
        System.out.println(renyuan);

    }

}
