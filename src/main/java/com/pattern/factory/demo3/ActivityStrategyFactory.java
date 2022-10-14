package com.pattern.factory.demo3;

/**
 * @author kris
 * @date 2022/10/14
 */
public class ActivityStrategyFactory {

    /**
     * 获得渠道类型对应的策略
     *
     * @param channelType channelType
     * @return OperationServiceStrategy
     */
    public static ActivityStrategy getActivityStrategy(ChannelTypeEnum channelType) {

        ChannelTypeStrategyEnum channelTypeStrategyEnum = ChannelTypeStrategyEnum.getByChannelType(channelType);
        Assert.notNull(channelTypeStrategyEnum , "指定的渠道类型[channelType=" + channelType + "]不存在");

        String strategyName= channelTypeStrategyEnum.getHandlerName();
        Assert.notNull(strategyName, "指定的渠道类型[channelType=" + channelType + "未配置策略");

        return (ActivityStrategy)SpringContextHolder.getBean(handlerName);
    }


    public enum ChannelTypeStrategyEnum {
        /**
         * 短信渠道
         */
        SMS(ChannelTypeEnum.SMS, "smsActivityStrategy"),
        /**
         * 微信渠道
         */
        WX_NEWS(ChannelTypeEnum.WX, "wxActivityStrategy"),
        /**
         * push渠道
         */
        PUSH(ChannelTypeEnum.PUSH, "pushActivityStrategy"),;

        private final ChannelTypeEnum channelTypeEnum;

        private final String strategyName;

        ChannelTypeStrategyEnum (ChannelTypeEnum channelTypeEnum, String strategyName) {
            this.channelTypeEnum = channelTypeEnum;
            this.strategyName= strategyName;
        }


        public String getStrategyName() {
            return strategyName;
        }

        public static ChannelTypeStrategyEnum getByChannelType(ChannelTypeEnum channelTypeEnum) {
            for (ChannelTypeStrategyEnum channelTypeStrategyEnum : values()) {
                if (channelTypeEnum == channelTypeStrategyEnum.channelTypeEnum) {
                    return channelTypeStrategyEnum ;
                }
            }
            return null;
        }
    }
}
