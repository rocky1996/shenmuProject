package com.acat.controller;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/banzu")
public class BanzuController {

    @Autowired
    private IBanzuService iBanzuService;

    @PostMapping("/add")
    public void add(@RequestBody Banzu banzu,@RequestParam("file") MultipartFile[] file,HttpServletRequest request) {
        int count = 1;

        String url = request.getSession().getServletContext().getRealPath("/uploadFiles");
        try{
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);

            //解析请求
            List<FileItem> items = upload.parseRequest(request);
            for(FileItem item:items){
                if(item.isFormField()){
                    //封装数据到JavaBean中
                    String fieldName = item.getFieldName();//字段名，即javabean的属性名，除了图片
                    String fieldValue = item.getString(request.getCharacterEncoding());
                    BeanUtils.setProperty(banzu, fieldName, fieldValue);//除了图片路径，其他数据都有了
                }else {
                    for (MultipartFile mf : file) {
                        if (!mf.isEmpty()) {
                            String name = UUID.randomUUID().toString().replaceAll("-", "");
                            String ext = GetFileExt.getFileExt(mf.getOriginalFilename());
                            mf.transferTo(new File(url + "/" + name + "." + ext));
                            String path = "upload/" + name + "." + ext;
                            if (count == 1) {
                                banzu.setBanzulogo(path);
                            } else if (count == 2) {
                                banzu.setZuzhijigou(path);
                            } else if (count == 3) {
                                banzu.setYuangognfengcai(path);
                            }
                        }
                        count++;
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        iBanzuService.addBanzu(banzu);
    }
}
