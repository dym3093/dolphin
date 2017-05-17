package com.dayton.dolphin.util;

/**
 * Created by daimian on 17-4-12.
 */

import org.apache.http.HttpEntity;
import org.apache.http.entity.*;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author Damian
 * @create 2017-04-12 上午10:07
 **/
public class HttpFactory {

    Logger log = Logger.getLogger(HttpFactory.class);

    public static HttpEntity createEntity(HttpUtils.EType entityType, Object obj){
        HttpEntity entity = null;
        int index = Arrays.binarySearch(HttpUtils.EType.values(), entityType);
        if (index>-1){
            switch (entityType) {
                case BASIC_HTTP:
                    entity = new BasicHttpEntity();
                    break;
                case BYTE_ARRAY:
                    entity = new ByteArrayEntity(new byte[]{1,2,3}, ContentType.APPLICATION_OCTET_STREAM);
                    break;
                case STRING:
                    entity = new StringEntity(obj.toString(), ContentType.APPLICATION_OCTET_STREAM);
                    break;
                case INPUT_STREAM:
                    break;
                case FILE:
                    break;
                case BUFFERED_HTTP:
                    break;
                default:
                    break;
            }
        }else{
            throw new NoSuchElementException("No such Entity type: " + entityType.name());
        }
        return entity;
    }
}

