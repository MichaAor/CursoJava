package com.bootcamp.ApiDia23.Controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GenericController{
    OkHttpClient ok = new OkHttpClient().newBuilder().build();
    Request request = new Request.Builder()
                        .url(null)
            .addHeader()
            .addHeader()
            .build();
    Call

}
