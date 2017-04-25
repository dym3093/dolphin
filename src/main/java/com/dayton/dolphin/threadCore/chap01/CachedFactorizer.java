package com.dayton.dolphin.threadCore.chap01;
/**
 * Created by daimian on 17-4-20.
 */

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Nothing
 *
 * @author Damian
 * @create 2017-04-20 下午4:54
 **/
public class CachedFactorizer implements Servlet{

    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private long hits;
    private long cacheHits;

    //请求的队列
    private ConcurrentLinkedQueue<ServletRequest> requestQueue = new ConcurrentLinkedQueue<ServletRequest>();

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        requestQueue.add(servletRequest);
        String result = this.dealReq();
        writeToClient(servletResponse, result);
    }

    private String dealReq(){
        String result = null;
        ServletRequest currReq;
        //出栈
        if(!requestQueue.isEmpty()){
            System.out.println("size: "+requestQueue.size());
            currReq = requestQueue.poll();
            result = currReq.getRemoteAddr();
        }
        return result;
    }

    private String writeToClient(ServletResponse response, Object target) throws IOException {
        String result = "未处理请求";
        if (response!=null){
            response.getOutputStream().println(target.toString());
        }
        return result;
    }

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }

    public BigInteger getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(BigInteger lastNumber) {
        this.lastNumber = lastNumber;
    }

    public BigInteger[] getLastFactors() {
        return lastFactors;
    }

    public void setLastFactors(BigInteger[] lastFactors) {
        this.lastFactors = lastFactors;
    }

    public synchronized long getHits() {
        return hits;
    }

    public void setHits(long hits) {
        this.hits = hits;
    }

    public long getCacheHits() {
        return cacheHits;
    }

    public void setCacheHits(long cacheHits) {
        this.cacheHits = cacheHits;
    }

    /**
     * 获取命中率
     * @return double
     */
    public synchronized double getCacheHitRadio(){
        return (double)cacheHits/ (double)hits;
    }

}
