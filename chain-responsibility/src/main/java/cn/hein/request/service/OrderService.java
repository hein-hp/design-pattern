package cn.hein.request.service;

import cn.hein.request.chain.order.OrderCreateCommand;

/**
 * 订单创建接口层
 *
 * @author hein
 */
public interface OrderService {

    /**
     * 订单创建
     */
    void createOrder(OrderCreateCommand requestParam);
}
