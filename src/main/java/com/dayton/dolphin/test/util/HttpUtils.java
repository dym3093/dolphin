/**
 * @author Damian
 * @since 2016-7-22 下午5:04:46
 */
package com.dayton.dolphin.test.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Damian
 * @since 2016-7-22 下午5:04:46
 */
public class HttpUtils {

	private static Logger log = Logger.getLogger(HttpUtils.class);

	public static final String CODE = "code";

    //
	public enum Req{
		GET, POST, DELETE, PUT, HEAD, TRACE, OPTIONS, CONNECT
	}

	public enum EType{
		BASIC_HTTP, BYTE_ARRAY, STRING, INPUT_STREAM, FILE, BUFFERED_HTTP
	}

	public enum Param{
		URL, METHOD, PARAMETERS, CODE, MESSAGE, DATA, CONTENT_TYPE;
	}

	private enum Status{
		OK("OK"), ERROR("ERROR");
		private String status;
		Status(String status){
			this.status = status;
		}

		public String status(){return this.status;}
	}

	private static final CloseableHttpClient client = HttpClients.createDefault();

	private static RequestConfig requestConfig = RequestConfig.custom()
			.setSocketTimeout(15000)
			.setConnectTimeout(15000)
			.setConnectionRequestTimeout(15000)
			.build();

	public static final String URL = "url";
	public static final String CONTENT_TYPE = "contentType";
	//	public static final String CONTENT_TYPE = "application/json;charset=utf-8";

	public static void main(String[] args) throws IOException, HttpException {
//		testRequest();
//		testResponse();
		int status = HttpStatus.SC_OK;
		StringEntity stringEntity = null;
		String url = "https://www.baidu.com/s";
		Map<String,String> map = new HashMap<String, String>();
		map.put("ie",""+Consts.UTF_8);
		map.put("wd", "apache");
		HttpPost post = createPost(url, map);
		HttpResponse response = sendPost(post);
		HttpEntity httpEntity = response.getEntity();
		EntityUtils.consume(httpEntity);
		if (httpEntity!=null) {
			System.out.println(httpEntity.getContent());
		}
	}

	/**
	 * 发送HttpPost请求
	 * @param httpPost HttpPost
	 * @return HttpResponse
	 * @author Damian
	 * @since 2016-7-25 下午4:52:21
	 */
	public static HttpResponse sendPost(HttpPost httpPost) {
	    CloseableHttpResponse response = null;
	    try {  
	        // 创建默认的httpClient实例.  
	        httpPost.setConfig(requestConfig);
	        // 执行请求  
	        response = client.execute(httpPost);
	    } catch (Exception e) {
	        log.info(e);
	    } finally {
	        try {  
	            // 关闭连接,释放资源  
	        	if(httpPost != null){
	        		httpPost.releaseConnection();
	        	}
	            if (response != null) {  
	                response.close();  
	            }  
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }  
	    return response;  
	 }
	
	/**
	 * 发送请求，并获取HttpPost返回的文本内容
	 * @param httpPost
	 * @return String
	 * @author Damian
	 * @throws IOException 
	 * @throws ParseException
	 * @since 2016-7-25 下午4:53:30
	 */
	public static String fetchPostContent(HttpPost httpPost) throws ParseException, IOException {
	    CloseableHttpResponse response = null;
	    HttpEntity entity;
	    String respContent;
	    try {  
	        // 执行请求  
	        response = (CloseableHttpResponse) sendPost(httpPost);
	        entity = response.getEntity();  
	        respContent = EntityUtils.toString(entity, Consts.UTF_8);
	    }finally {  
	        try {  
	            // 关闭连接,释放资源  
	        	if(httpPost != null){
	        		httpPost.releaseConnection();
	        	}
	            if (response != null) {  
	                response.close();  
	            }  
	        } catch (IOException e) {
	            log.info(e);
	        }
	    }  
	    log.info("content: "+respContent);
	    return respContent;  
	 }
	
	/**
	 * 获取HttpPost返回的JSONObject
	 * @param httpPost HttpPost
	 * @return JSONObject
	 * @throws ParseException
	 * @throws IOException
	 * @author Damian
	 * @throws JSONException
	 * @since 2016-7-29 下午6:40:50
	 */
	public static JSONObject fetchPostJson(HttpPost httpPost) throws ParseException, IOException, JSONException {
		JSONObject json = null;
		String respContent;
		if(httpPost!=null){
			respContent = fetchPostContent(httpPost);
			if(respContent!=null&&respContent.length()>0){
				json = new JSONObject(respContent);
			}
		}
		return json;
	}
	
	/**
	 * 发送HttpGet请求
	 * @param get HttpGet
	 * @return HttpResponse
	 * @author Damian
	 * @since 2016-7-25 下午4:31:47
	 */
	public static HttpResponse sendGet(HttpGet get) {
	    CloseableHttpClient httpClient = null;
	    CloseableHttpResponse response = null;
	    try {  
	        // 创建默认的httpClient实例.  
	        httpClient = HttpClients.createDefault();
	        get.setConfig(requestConfig);
	        // 执行请求  
	        response = httpClient.execute(get);
	    } catch (Exception e) {
	        log.info(e);
	    } finally {
	        try {  
	            // 关闭连接,释放资源  
	        	if(get != null){
	        		get.releaseConnection();
	        	}
	            if (response != null) {  
	                response.close();  
	            }  
	            if (httpClient != null) {  
	                httpClient.close();  
	            }  
	        } catch (IOException e) {
	            log.info(e);
	        }
	    }  
	    return response;  
	 }
	
	/**
	 * 获取HttpGet返回的文本内容
	 * @param get  HttpGet
	 * @return String
	 * @author Damian
	 * @since 2016-7-25 下午4:31:47
	 */
	public static String fetchGetContent(HttpGet get) {
		HttpResponse response;
	    HttpEntity entity;
	    String respContent = null;  
        try {
	        response = sendGet(get);
	        entity = response.getEntity();
			respContent = EntityUtils.toString(entity, Consts.UTF_8);
		} catch (ParseException e) {
            log.info(e);
		} catch (IOException e) {
			log.info(e);
		}
        log.info("content: "+respContent);
	    return respContent;  
	 }
	
	
	public static HttpGet createHttpGet(String jsonStr) throws JSONException {
		HttpGet myGet = null;
		if(jsonStr!=null&&jsonStr.length()>0){
			JSONObject json = new JSONObject(jsonStr);
			if(json!=null&&json.length()>0){
				myGet = createHttpGet(json);
			}
		}
		return myGet;
	}
	
	public static HttpGet createHttpGet(JSONObject json) throws JSONException {
		HttpGet myGet = null;
		if(json!=null&&json.length()>0){
			String urlOrg = json.getString(URL)==null?"":json.getString(URL);
			if(json.getString(URL)!=null){
				json.remove(URL);
			}
		
			String contentType = json.getString(CONTENT_TYPE)==null?CONTENT_TYPE:json.getString(CONTENT_TYPE);
			if(json.getString(CONTENT_TYPE)!=null){
				json.remove(CONTENT_TYPE);
			}
			String urlParam = GeneratorUtils.jsonToURLParams(json,false);
			myGet = new HttpGet(urlOrg+"?"+urlParam);
			myGet.setHeader(CONTENT_TYPE, contentType);
		}
		return myGet;
	}

	public static String fetchRespContent(HttpUriRequest request){
		String content = null;
		HttpResponse response = sendRequest(request);
		HttpEntity entity = response.getEntity();
		try {
			content = EntityUtils.toString(entity, Consts.UTF_8);
		} catch (IOException e) {
		    log.info(e);
		}
		return content;
	}
	/**
	 * 发送HTTP请求
	 * @param request
	 * @return HttpResponse
	 * @author Damian
	 * @since 2017-04-12 14:17
	 */
	public static HttpResponse sendRequest(HttpUriRequest request){
		HttpResponse response = null;
		if (request!=null){
			try {
				response = client.execute(request);
			} catch (Exception e) {
			    log.info(e);
			}
		}
		return response;
	}
	/**
	 * 根据url创建HttpPost，默认使用UTF-8编码
	 * @param url URL字符串
	 * @param params 传输的数据
	 * @return HttpPost
	 * @author Damian
	 * @since 2017-04-12 14:17
	 */
	public static HttpPost createPost(String url, Map<String,String> params){
		HttpPost post = null;
		if (url!=null&&url.trim().length()>0){
			post = new HttpPost(url);
			List<NameValuePair> nameValuePairs = mapToNvpList(params);
			if (nameValuePairs!=null&&nameValuePairs.size()>0) {
                post.setEntity(new UrlEncodedFormEntity(nameValuePairs, Consts.UTF_8));
            }
		}
		return post;
	}

	/**
	 * 传输参数转换成 List<NameValuePair>
	 * @param params Map
	 * @return List
	 * @author Damian
	 * @since 2017-04-12 14:17
	 */
	public static List<NameValuePair> mapToNvpList(Map<String,String> params){
		List<NameValuePair> nameValuePairs = null;
		if (!params.isEmpty()){
			nameValuePairs = new ArrayList<NameValuePair>();
			for (String key: params.keySet()) {
				nameValuePairs.add(new BasicNameValuePair(key, params.get(key)));
			}
		}
		return nameValuePairs;
	}


	/**
	 * 发送JSON字符串的POST请求
	 * @param url 请求地址
	 * @param jsonStr JSON格式的字符串
	 * @return String 结果集的字符串
	 * @throws Exception
	 */
	public static String sendRequest(String url, String jsonStr) throws Exception{
	    return sendRequest(url, Req.POST, CONTENT_TYPE, jsonStr);
    }
	/**
	 * 
	 * @param url
	 * @param method
	 * @param contentType
	 * @param jsonStr
	 * @return String
	 * @throws Exception
	 * @author Damian
	 * @since 2016-10-19 下午6:29:05
	 */
	public static String sendRequest(String url, Req method, String contentType, String jsonStr) throws Exception{
		Logger log = Logger.getLogger("sendRequest");
		log.info("url: "+url);
		log.info("method: "+method);
		log.info("contentType: "+contentType);
		log.info("jsonStr: "+jsonStr);
		String content = null;
		if(method == null){
			method = Req.POST;
		}
		if(StringUtils.isEmpty(contentType)){
			contentType = CONTENT_TYPE;
		}
		HttpEntity entity = sendRequestEntity(url, method, contentType, jsonStr);
		if(entity!=null){
			content = EntityUtils.toString(entity, Consts.UTF_8);
		}
		log.info("返回结果 content:"+content);
		return content;
	}
	
	/**
	 * 发起请求，返回HttpEntity
	 * @param url 
	 * @param method post/get
	 * @param contentType
	 * @param jsonStr
	 * @return HttpEntity
	 * @throws Exception
	 * @author Damian
	 * @since 2016-10-19 下午6:33:18
	 */
	public static HttpEntity sendRequestEntity(String url, Req method, String contentType, String jsonStr) throws Exception{
		log.info("url: "+url);
		log.info("method: "+method);
		log.info("contentType: "+contentType);
		log.info("jsonStr: "+jsonStr);
		HttpRequestBase requestBase = null;
		HttpResponse response;
		HttpEntity entity = null;
		
		if(StringUtils.isEmpty(url)){
			log.info("url为空");
			return entity;
		}
		if(StringUtils.isEmpty(jsonStr)){
			log.info("jsonStr为空");
			return entity;
		}

		response = client.execute(requestBase);
		if(response!=null){
			entity = response.getEntity();
		}
		return entity;
	}

	public static HttpUriRequest requestInstance(String url, Req method, String contentType, String jsonStr){
		HttpRequestBase request = null;
		HttpUriRequest uriRequest = null;
		ContentType ct = null;
		if (contentType!=null&&contentType.trim().length()>0){
			ct = ContentType.create(contentType, Consts.UTF_8);
		}else {
			ct = ContentType.APPLICATION_OCTET_STREAM;
		}
		try {
            switch (method){
                case GET:
//                    request = HttpUtils.createHttpPost(url, contentType, jsonStr);
					StringEntity stringEntity = new StringEntity(jsonStr, Consts.UTF_8);
					stringEntity.setContentEncoding(Consts.UTF_8.name());
					new HttpPost(url).setEntity(stringEntity);
					log.info(" createHttpPost jsonStr: "+jsonStr);
					log.info(" createHttpPost entity.toString(): "+ stringEntity.toString());
                    break;
                case POST:
//                    request = HttpUtils.createHttpGet(url, contentType, jsonStr);
                    break;
                case DELETE:
                    break;
                case PUT:
                    break;
                case HEAD:
                    break;
                case TRACE:
                    break;
                case OPTIONS:
                    break;
                case CONNECT:
                    break;
                default:
                    request = null;
            }
		} catch (Exception e) {
		    log.info(e);
		}
		return request;
	}
	public static boolean isEmpty(String content){
		return content==null||content.length()==0;
	}
	
	public static boolean isNotEmpty(String content){
		return !isEmpty(content);
	}
	
}
