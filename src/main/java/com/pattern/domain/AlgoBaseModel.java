package com.pattern.domain;

import java.util.Date;
import java.util.Map;

/**
 * @author krisjin
 * @date 2020/11/24
 */
public class AlgoBaseModel {

    /**
     * 唯一主键
     */
    private Long id;
    /**
     * 训练实验id,溯源关联训练
     */
    private Long eid;
    /**
     * 模型名称
     */
    private String modelName;
    /**
     * 模型版本，整数递增
     */
    private Long modelVersion;
    /**
     * 模型大小，单位是字节
     */
    private Long modelSize;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 负责人
     */
    private String owner;
    /**
     * 应用id
     */
    private String appId;
    /**
     * 模型超参数设置
     */
    private Map<String, Double> tp;
    /**
     * 评估指标
     */
    private Map<String, Double> metric;
    /**
     * 扩展字典
     */
    private Map<Object, Object> extMap;
    /**
     * 模型运行框架，例如：TensorFlow、PyTorch、XGB、scikit-learn
     */
    private String modelFramework;
    /**
     * 模型类型，例如 LR、GBDT、LightGBM
     */
    private String modelType;
    /**
     * 模型描述，文本描述
     */
    private String modelDesc;
    /**
     * 运行的镜像版本环境
     */
    private String mirror;
    /**
     * 运行内存资源
     */
    private Integer memory;
    /**
     * 运行cpu资源
     */
    private Integer cpu;
    /**
     * 运行gpu资源
     */
    private Integer gpu;
    /**
     * 模型云存储地址
     */
    private String modelOssAddr;
    /**
     * 模型HDFS存储地址
     */
    private String modelHdfsAddr;
    /**
     * 业务类型，模型业务应用范围，例如：搜索排序
     */
    private String bizType;
    /**
     * 模型训练代码地址，存储在git中，就是一个地址
     */
    private String modelCodeAddr;

    /**
     * 1=lambda训练 2=AutoML 3=外部接口 4=手动上传
     */
    private int sourceId;
    /**
     * 输入特征schema
     */
    private String featureSchema;

    /**
     * 依赖模型Id,  例如：模型1,模型2  支持多模型依赖，以逗号分隔
     */
    private String dependentModelId;

}
