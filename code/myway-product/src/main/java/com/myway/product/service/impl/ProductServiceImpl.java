package com.myway.product.service.impl;

import com.myway.product.dao.ProductDOMapper;
import com.myway.product.domain.ProductDO;
import com.myway.product.domain.ProductDOExample;
import com.myway.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDOMapper productDOMapper;

    @Override
    public ProductDO getById(Integer id) {
        ProductDOExample example = new ProductDOExample();
        example.createCriteria().andIdEqualTo(id);
        List<ProductDO> productDOList = productDOMapper.selectByExample(example);

        if (CollectionUtils.isEmpty(productDOList)) {
            return null;
        } else {
            return productDOList.get(0);
        }

    }

    @Override
    public List<ProductDO> getAll() {
        ProductDOExample example = new ProductDOExample();
        List<ProductDO> productDOList = productDOMapper.selectByExample(example);

        return productDOList;
    }

    @Override
    public long count() {
        ProductDOExample example = new ProductDOExample();
        long count = productDOMapper.countByExample(example);
        return count;
    }

    @Override
    public List<ProductDO> getByPage(int start, int pageSize) {
        ProductDOExample example = new ProductDOExample();
        example.setStartRow(start);
        example.setPageSize(pageSize);
        List<ProductDO> productDOList = productDOMapper.selectByExample(example);
        return productDOList;
    }
}
