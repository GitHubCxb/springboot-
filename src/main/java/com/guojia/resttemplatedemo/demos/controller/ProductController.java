package com.guojia.resttemplatedemo.demos.controller;


import com.alibaba.fastjson2.JSON;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.guojia.resttemplatedemo.demos.entity.Product;
import com.guojia.resttemplatedemo.demos.mapper.ProductMapper;
import com.guojia.resttemplatedemo.demos.result.DateResult;
import com.guojia.resttemplatedemo.demos.result.Result;
import com.guojia.resttemplatedemo.demos.result.ResultCode;
import com.guojia.resttemplatedemo.demos.sevice.ProductImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private Result result;

    @Autowired
    private DateResult dateResult;

    @Autowired
    private ProductImplService productImplService;

    @GetMapping("/findall")
    public String findAll(){
        List<Product> products = productImplService.findAllProduct();
        dateResult.setCode(ResultCode.SUCCESS.code());
        dateResult.setMsg("查询成功");
        dateResult.setResult(products);
        return dateResult.toString();
    }
    @GetMapping("/findallById/{pid}")
    public String findAllById(@PathVariable("pid") Integer pid){
        Product products = productImplService.findProductById(pid);
        dateResult.setCode(ResultCode.SUCCESS.code());
        dateResult.setMsg("查询成功");
        dateResult.setResult(products);
        return dateResult.toString();
    }
    @GetMapping("/deleteProductById/{pid}")
    public String deleteProductById(@PathVariable("pid") Integer pid){
        System.out.println(pid);
        int i =  productImplService.DeleteProductById(pid);
        if(i!=0){
            dateResult.setCode(ResultCode.SUCCESS.code());
            dateResult.setMsg("删除成功");
        }else{
            dateResult.setCode(ResultCode.NOT_FOUNDID.code());
            dateResult.setMsg("删除失败,制定删除ID不存在");
        }
        return dateResult.toString();
    }
    @GetMapping("/UpdateProductById")
    public String UpdateProductById(Product product){
        System.out.println(product.toString());
        int i = productImplService.UpdateProductById(product);
        if(i!=0){
            dateResult.setCode(ResultCode.SUCCESS.code());
            dateResult.setMsg("更新成功");
        }else{
            dateResult.setCode(ResultCode.FAIL.code());
            dateResult.setMsg("更新失败");
        }
        return dateResult.toString();
    }
}
