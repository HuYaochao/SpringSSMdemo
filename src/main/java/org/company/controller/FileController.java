package org.company.controller;


import org.company.util.MinioUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private MinioUtil minioUtil;

    @Value("${minio.bucket}")
    private String bucketName;

    @PostMapping("/fileUploadAdv")
    @ResponseBody
    public String fileUpload(@RequestParam("f") MultipartFile f, HttpServletResponse response) throws Exception {
        String url = minioUtil.uploadFile(f, bucketName);
        return  url;
    }
}
