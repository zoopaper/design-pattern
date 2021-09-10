package com.pattern.adapter.base;

/**
 * Target是目标业务类，它可以定义为一个接口或抽象类，提供给适配器实现或继承。
 * 在实际的业务场景中，如果要应用适配器模式时，须要有这样的接口或者抽象类
 * 如基于接口开发的设计原则，适配器模式也是基于这样的原则应用的一个实例。
 * 当掌握了本质的设计思想，在应用中才会顺其自然，水到渠成。不需要你过多的思考。
 *
 * @author krisjin
 * @date 2020/11/25
 */
public interface Target {

    public void pull();

}
