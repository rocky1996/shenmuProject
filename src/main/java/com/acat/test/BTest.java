package com.acat.test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;


public class BTest {
    public static void main(String[] args) {
        doc2pdf("/home/rocky1996/Downloads/shixi.doc","1.html");
    }

    public static boolean getLicense() {
        boolean result = false;
        try {
            InputStream is = BTest.class.getClassLoader().getResourceAsStream("license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void doc2pdf(String inPath, String outPath) {
//         if (!getLicense()) { // 验证License 若不验证则转化出的pdf文档会有水印产生
//            return;
//        }
        try {
            long old = System.currentTimeMillis();


            File file = new File("/home/rocky1996/"+outPath); // 新建一个空白pdf文档
              if (!file.exists()){
                   file.createNewFile();
              }
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(inPath); // Address是将要被转化的word文档
            doc.save(os, SaveFormat.HTML);// 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
            // EPUB, XPS, SWF 相互转换
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
