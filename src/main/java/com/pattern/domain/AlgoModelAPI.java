package com.pattern.domain;

/**
 * @author krisjin
 * @date 2020/11/24
 */
interface AlgoModelAPI {

    /**
     * 注册模型
     *
     * @param algoModelAPI
     * @return
     */
    ResultResp saveModel(AlgoModelAPI algoModelAPI);

    /**
     * 删除模型
     *
     * @param algoModelAPI
     * @return
     */
    ResultResp deleteModel(AlgoModelAPI algoModelAPI);

    /**
     * 查询模型
     *
     * @param algoBaseModel
     * @return
     */
    ResultResp queryModelList(AlgoBaseModel algoBaseModel);

}
