package com.myway.controller;

import com.myway.util.FilesUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("upload")
public class UploadController {
    @RequestMapping("uploadFile")
    public void upload(@RequestParam("bigHeadImage") MultipartFile file, HttpServletRequest request) throws IOException {
        String originalFilename = file.getOriginalFilename();

        String path = request.getServletContext().getRealPath("/upload");
        File dir = new File(path +"\\"+originalFilename);
        file.transferTo(dir);
    }

    @RequestMapping("mutiUploadFile")
    public void mutiUploadFile(MultipartRequest files, HttpServletRequest request) throws IOException {
        FilesUpload.uploadFiles(request,files);
    }
}
