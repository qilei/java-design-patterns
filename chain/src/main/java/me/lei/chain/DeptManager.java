package me.lei.chain;

import java.math.BigDecimal;

public class DeptManager extends Handler {

    @Override
    public String handle(FeeRequest feeRequest) {
        if (feeRequest.getAmount().compareTo(BigDecimal.valueOf(500)) > 0
                && feeRequest.getAmount().compareTo(BigDecimal.valueOf(1000)) <= 0) {
            return "部门经理批准" + feeRequest.getName() + "的申请金额：" + feeRequest.getAmount();
        } else {
            return super.invokeNext(feeRequest);
        }
    }
}
