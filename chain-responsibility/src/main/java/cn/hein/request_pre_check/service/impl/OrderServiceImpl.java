package cn.hein.request_pre_check.service.impl;

import cn.hein.request_pre_check.chain.AbstractChainContext;
import cn.hein.request_pre_check.chain.order.OrderCreateCommand;
import cn.hein.request_pre_check.service.OrderService;
import lombok.RequiredArgsConstructor;

/**
 * 订单创建接口实现层
 *
 * @author hein
 */
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final AbstractChainContext<OrderCreateCommand> abstractChainContext;

    public void createOrder(OrderCreateCommand requestParam) {
        // 责任链模式: 执行订单创建参数验证
        abstractChainContext.handler("订单创建", requestParam);
    }
}