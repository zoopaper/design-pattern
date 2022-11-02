package com.pattern.statemachine.test;

import com.pattern.statemachine.cola.Action;
import com.pattern.statemachine.cola.Condition;
import com.pattern.statemachine.cola.StateMachine;
import com.pattern.statemachine.cola.builder.StateMachineBuilder;
import com.pattern.statemachine.cola.builder.StateMachineBuilderFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dingchenchen
 * @since 2021/1/6
 */
public class StateMachineChoiceTest {

    static class Context{
        private String condition;

        public Context(String condition){
            this.condition = condition;
        }

        public String getCondition() {
            return condition;
        }
    }

    /**
     * 测试选择分支，针对同一个事件：EVENT1
     * if condition == "1", STATE1 --> STATE1
     * if condition == "2" , STATE1 --> STATE2
     * if condition == "3" , STATE1 --> STATE3
     */
    @Test
    public void testChoice(){
        StateMachineBuilder<StateMachineTest.States, StateMachineTest.Events, Context> builder = StateMachineBuilderFactory.create();
        builder.internalTransition()
            .within(StateMachineTest.States.STATE1)
            .on(StateMachineTest.Events.EVENT1)
            .when(checkCondition1())
            .perform(doAction());
        builder.externalTransition()
            .from(StateMachineTest.States.STATE1)
            .to(StateMachineTest.States.STATE2)
            .on(StateMachineTest.Events.EVENT1)
            .when(checkCondition2())
            .perform(doAction());
        builder.externalTransition()
            .from(StateMachineTest.States.STATE1)
            .to(StateMachineTest.States.STATE3)
            .on(StateMachineTest.Events.EVENT1)
            .when(checkCondition3())
            .perform(doAction());

        StateMachine<StateMachineTest.States, StateMachineTest.Events, Context> stateMachine = builder.build("ChoiceConditionMachine");
        StateMachineTest.States target1 = stateMachine.fireEvent(StateMachineTest.States.STATE1, StateMachineTest.Events.EVENT1, new Context("1"));
        Assert.assertEquals(StateMachineTest.States.STATE1,target1);
        StateMachineTest.States target2 = stateMachine.fireEvent(StateMachineTest.States.STATE1, StateMachineTest.Events.EVENT1, new Context("2"));
        Assert.assertEquals(StateMachineTest.States.STATE2,target2);
        StateMachineTest.States target3 = stateMachine.fireEvent(StateMachineTest.States.STATE1, StateMachineTest.Events.EVENT1, new Context("3"));
        Assert.assertEquals(StateMachineTest.States.STATE3,target3);
    }

    private Condition<Context> checkCondition1() {
        return  (ctx) -> "1".equals(ctx.getCondition());
    }

    private Condition<Context> checkCondition2() {
        return (ctx) -> "2".equals(ctx.getCondition());
    }

    private Condition<Context> checkCondition3() {
        return (ctx) -> "3".equals(ctx.getCondition());
    }

    private Action<StateMachineTest.States, StateMachineTest.Events, Context> doAction() {
        return (from, to, event, ctx)->{
            System.out.println("from:"+from+" to:"+to+" on:"+event+" condition:" + ctx.getCondition());
        };
    }
}
