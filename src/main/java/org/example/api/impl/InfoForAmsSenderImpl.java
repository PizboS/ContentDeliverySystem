package org.example.api.impl;

import org.aspectj.apache.bcel.classfile.annotation.NameValuePair;
import org.example.api.InfoForAmsSender;
import org.example.model.ViewedDto;
import org.springframework.http.HttpEntity;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class InfoForAmsSenderImpl implements InfoForAmsSender {
    private static final String URL = "http://amshost:amsport/viewed/save";

    @Override
    public void sendInfo(List<ViewedDto> viewedList) {
        try {
            HttpClient httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost("http://www.a-domain.example/foo/%22);

                    List < NameValuePair > params = new ArrayList<NameValuePair>(2);
            params.add(new BasicNameValuePair("param-1", "12345"));
            params.add(new BasicNameValuePair("param-2", "Hello!"));
            httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                try (InputStream instream = entity.getContent()) {

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
