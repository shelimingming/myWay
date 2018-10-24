package com.myway.product.service;

import com.myway.product.domain.ProductDO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductDO getById(Integer id);

    List<ProductDO> getAll();

    long count();

    List<ProductDO> getByPage(int start, int pageSize);
}
