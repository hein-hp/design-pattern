package cn.hein.request.chain.order;

import org.springframework.stereotype.Component;

/**
 * 订单创建商品 SKU 库存验证
 *
 * @author hein
 */
@Component
public final class OrderCreateProductSkuStockChainHandler implements OrderCreateChainHandler<OrderCreateCommand> {

    @Override
    public void handler(OrderCreateCommand requestParam) {
        // 逻辑执行
    }

    @Override
    public int getOrder() {
        return 2;
    }
}