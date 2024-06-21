package cn.hein.request.chain.order;

import cn.hein.request.chain.AbstractChainHandler;

/**
 * 抽象订单创建责任链处理器
 *
 * @author hein
 */
public interface OrderCreateChainHandler<T extends OrderCreateCommand> extends AbstractChainHandler<OrderCreateCommand> {

    @Override
    default String mark() {
        // 此处可以使用 enum 或 constant
        return "订单创建";
    }
}
