/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sender.request;

//import org.apache.commons.httpclient.HttpClient;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author JuglarM
 */
public class SenderUtil {

    public static void main(String[] args) {
        try {
        post();    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void post() throws Exception {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("http://localhost:8080/ServicioWebUtil/ServicioUtil?wsdl");
        String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:util=\"http://util.servicio.com/\">\n" +
"   <soapenv:Header/>\n" +
"   <soapenv:Body>\n" +
"      <util:saludar/>\n" +
"   </soapenv:Body>\n" +
"</soapenv:Envelope>";
        HttpEntity entity = new ByteArrayEntity(xml.getBytes("UTF-8"));
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        String result = EntityUtils.toString(response.getEntity());
        
        System.out.println("Resultado: " + result);
    }

//      PostMethod post = new PostMethod("http://jakarata.apache.org/");
//NameValuePair[] data = {
//  new NameValuePair("user", "joe"),
//  new NameValuePair("password", "bloggs")
//};
//post.setRequestBody(data);
//post.setRequestHeader("Content-type", "application/xhtml+xml");
//// execute method and handle any error responses.
//...
//InputStream in = post.getResponseBodyAsStream();
}
