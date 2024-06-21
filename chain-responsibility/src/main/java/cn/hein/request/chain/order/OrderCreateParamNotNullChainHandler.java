package cn.hein.request.chain.order;

import org.springframework.stereotype.Component;

/**
 * 订单创建参数必填检验
 *
 * @author hein
 */
@Component
public final class OrderCreateParamNotNullChainHandler implements OrderCreateChainHandler<OrderCreateCommand> {
    
    @Override
    public void handler(OrderCreateCommand requestParam) {
	    // 逻辑执行
    }
    
    @Override
    public int getOrder() {
        return 0;
    }
}