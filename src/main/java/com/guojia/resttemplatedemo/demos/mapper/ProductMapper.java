package com.guojia.resttemplatedemo.demos.mapper;

import com.guojia.resttemplatedemo.demos.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//编写商品查询接口
@Repository
public interface ProductMapper {
//    编写查询所有商品抽象方法
    List<Product> findAllProduct();
//    根据id查询商品
    Product findProductById(Integer pid);
//    根据id删除商品
    int DeleteProductById(Integer pid);

    //根据id更新商品信息
    int UpdateProductById(Product product);

}
