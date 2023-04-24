package com.guojia.resttemplatedemo.demos.sevice.impl;

import com.guojia.resttemplatedemo.demos.entity.Product;

import java.util.List;

public interface ProductImpl {
    //    编写查询所有商品抽象方法
    List<Product> findAllProduct();
    //    根据id查询商品
    Product findProductById(Integer pid);
    //    根据id删除商品
    int DeleteProductById(Integer pid);

    //根据id更新商品信息
    int UpdateProductById(Product product);

}
