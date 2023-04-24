package com.guojia.resttemplatedemo.demos.sevice;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.guojia.resttemplatedemo.demos.entity.Product;
import com.guojia.resttemplatedemo.demos.mapper.ProductMapper;
import com.guojia.resttemplatedemo.demos.sevice.impl.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImplService implements ProductImpl {

    @Autowired
    private ProductMapper productMapper;


    //添加多数据源，读用从  写用主

    @Override
    @DS("slave_1")
    public List<Product> findAllProduct() {
        List <Product> products = productMapper.findAllProduct();
        return products;
    }

    @Override
    @DS("slave_1")
    public Product findProductById(Integer pid) {

        return productMapper.findProductById(pid);
    }

    @Override
    @DS("master")
    public int DeleteProductById(Integer pid) {
        return productMapper.DeleteProductById(pid);
    }

    @Override
    @DS("master")
    public int UpdateProductById(Product product) {

        return productMapper.UpdateProductById(product);
    }
}
