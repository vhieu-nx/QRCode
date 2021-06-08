package com.qrcode.controller;

import com.qrcode.helpers.ZXingHelper;
import com.qrcode.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@Controller
@RequestMapping("products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String index(ModelMap modelMap){
        modelMap.put("products",productService.findAll());
        return "index";
    }

    @GetMapping(value = "qrcode/{name}")
    public void qrcode(@PathVariable("name") String name, HttpServletResponse response) throws Exception {
        response.setContentType("image/png");
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(ZXingHelper.getQrcodeImage(name, 200, 200));
        outputStream.flush();
        outputStream.close();
    }
}
