package com.pattern;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author krisjin
 * @date 2020/11/24
 */
public class Ku {

    private String modelName = "Rec_CF_Recal";
    private String appId = "Rec_sys";
    private String owner = "shijingui";
    private String algoPlatform = "Tensorflow";
    private String modelOSSAddr = "oss地址";
    private String modelHdfsAddr = "oss地址";

    private String cpu = "12";
    private String mem = "8";
    private String mirror = "abc";


    private Map<String, String> hp = new HashMap<>();
    private Map<String, String> metric = new HashMap<>();

    public Map<String, String> buildHP() {
        hp.put("alpha", "0.3");
        hp.put("beta", "0.3");
        hp.put("epoch", "6");

        return hp;
    }

    public Map<String, String> buildMetric() {
        metric.put("Accuracy", "0.3");
        metric.put("F1", "0.3");
        metric.put("Precision", "6");
        metric.put("Recall", "6");
        metric.put("AUC", "6");
        return hp;
    }

    public Map<String, String> getHp() {
        return hp;
    }

    public void setHp(Map<String, String> hp) {
        this.hp = hp;
    }

    public Map<String, String> getMetric() {
        return metric;
    }

    public void setMetric(Map<String, String> metric) {
        this.metric = metric;
    }

    public static void main(String[] args) {
        Ku ku = new Ku();
        ku.buildHP();
        ku.buildMetric();

        String str = JSONObject.toJSONString(ku);
        System.err.println(str);
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public String getAlgoPlatform() {
        return algoPlatform;
    }

    public void setAlgoPlatform(String algoPlatform) {
        this.algoPlatform = algoPlatform;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public String getMirror() {
        return mirror;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }

    public String getModelOSSAddr() {
        return modelOSSAddr;
    }

    public void setModelOSSAddr(String modelOSSAddr) {
        this.modelOSSAddr = modelOSSAddr;
    }

    public String getModelHdfsAddr() {
        return modelHdfsAddr;
    }

    public void setModelHdfsAddr(String modelHdfsAddr) {
        this.modelHdfsAddr = modelHdfsAddr;
    }
}
