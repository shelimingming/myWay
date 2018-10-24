package com.myway.product.controller;

import com.myway.product.domain.ProductDO;
import com.myway.product.service.ProductService;
import com.myway.product.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/getById")
    public ProductDO getById(Integer id) {
        return productService.getById(id);
    }

    @RequestMapping("/getByPage")
    public Page<ProductDO> getByPage(int pageNum,int pageSize,long totalCount) {
        if(totalCount==0) {
            totalCount = productService.count();
        }
        int start = (pageNum-1)*pageSize;
        List<ProductDO> productDOList = productService.getByPage(start, pageSize);

        Page<ProductDO> page = new Page<ProductDO>();
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);
        page.setStart(start);
        page.setTotalCount(totalCount);
        page.setObjectList(productDOList);

        return page;
    }
}
