package io.javabrains.isthesiteup.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.kaazing.netx.http.HttpURLConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UrlCheckController {
    private final String IS_SITE_UP = "Site is Up!";
    private final String IS_SITE_DOWN = "Site is DOWN!";
    private final String INCORRECT_URL = "Url is incorrect!";

    @GetMapping("/check")
    public String getUrlStatusMessage(@RequestParam String url){
        String returnMessage = "";
        try {
            URL urlObj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCodeCategory = conn.getResponseCode() / 100;
            if(responseCodeCategory != 2 || responseCodeCategory != 3){
                returnMessage = IS_SITE_DOWN;
           } else {
                returnMessage = IS_SITE_UP;
           }
        } catch (MalformedURLException e){
            returnMessage = INCORRECT_URL;
        } catch (IOException e){
            returnMessage = IS_SITE_DOWN;
        }
        return returnMessage;

        }
           
    }


