/**
 * Project Name:dt48_springMVC3
 * File Name:FilesUpload.java
 * Package Name:cn.java.utils
 * Date:上午11:54:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package com.myway.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

/**
 * Description: 此工具类可以同时上传多个文件<br/>
 * Date: 上午11:54:12 <br/>
 *
 * @author dingP
 * @see
 */
public class FilesUpload {
    /**
     * Description: 多文件上传<br/>
     *
     * @param request：类型为HttpServletRequest
     * @param files：类型为MultipartRequest
     * @author dingP
     */
    public static Map<String, Object> uploadFiles(HttpServletRequest request, MultipartRequest files) {
        Map<String, Object> filePathMap = new HashMap<String, Object>();
        try {
            Map<String, MultipartFile> filesMap = files.getFileMap();
            Set<String> keySet = filesMap.keySet();
            for (String key : keySet) {
                MultipartFile file = filesMap.get(key);
                String originalFilename = file.getOriginalFilename();
                String path = request.getServletContext().getRealPath("/upload");
                File dir = new File(path + "\\" + originalFilename);
                file.transferTo(dir);
                // 开始将路劲保存到map集合中
                filePathMap.put(originalFilename, dir);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filePathMap;
    }
}
