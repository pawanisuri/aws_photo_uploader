package com.sliit.ctse.photo_uploader.controller;
import com.sliit.ctse.photo_uploader.service.photoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class photoController
{
    private photoService photoservice;
    @Autowired
    photoController(photoService photoservice) {
        this.photoservice=photoservice;
    }

    @CrossOrigin
    @PostMapping("/photoUpload")
    public String photoUpload(@RequestPart(value = "file")MultipartFile pic)
    {
        System.out.print("controller");
        return this.photoservice.photoUpload(pic);

    }
}