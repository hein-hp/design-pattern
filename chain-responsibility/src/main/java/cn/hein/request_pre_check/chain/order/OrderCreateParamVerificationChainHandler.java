package cn.hein.request_pre_check.chain.order;

import org.springframework.stereotype.Component;

/**
 * 订单创建参数正确性检验
 *
 * @author hein
 */
@Component
public final class OrderCreateParamVerificationChainHandler implements OrderCreateChainHandler<OrderCreateCommand> {
    
    @Override
    public void handler(OrderCreateCommand requestParam) {
	    // 逻辑执行
    }
    
    @Override
    public int getOrder() {
        return 1;
    }
}