package com.kailaisi.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述：商品信息
 * <p/>作者：wu
 * <br/>创建时间：2019/4/10 15:02
 */
@Controller
public class ProductController {
    @RequestMapping("/getProductInfo")
    @ResponseBody
    public String getProductInfo(Long productId) {
        return "{\"id\":" + productId + ", \"name\": \"iphone7手机\", " +
                "\"price\": 5599, \"pictureList\":\"a.jpg,b.jpg\", \"specification\": \"iphone7的规格\"," +
                " \"service\": \"iphone7的售后服务\", \"color\": \"红色,白色,黑色\", \"size\": \"5.5\"," +
                " \"shopId\": 1, \"modifiedTime\": \"2017-01-01 12:01:00\",\"cityId\":1,\"brandId\":1}";
    }

    @RequestMapping("/getProductInfos")
    @ResponseBody
    public String getProductInfos(String productIds) {
        String[] ids = productIds.split(",");
        JSONArray jsonArray = new JSONArray();
        for (String id : ids) {
            String info = "{\"id\":" + id + ", \"name\": \"iphone7手机\", " +
                    "\"price\": 5599, \"pictureList\":\"a.jpg,b.jpg\", \"specification\": \"iphone7的规格\"," +
                    " \"service\": \"iphone7的售后服务\", \"color\": \"红色,白色,黑色\", \"size\": \"5.5\"," +
                    " \"shopId\": 1, \"modifiedTime\": \"2017-01-01 12:01:00\",\"cityId\":1,\"brandId\":1}";
            jsonArray.add(JSONObject.parseObject(info));
        }
        return jsonArray.toJSONString();
    }
}
