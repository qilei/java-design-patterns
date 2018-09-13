package me.lei.chain;

import java.math.BigDecimal;

public class ProjectManager extends Handler {

    @Override
    public String handle(FeeRequest feeRequest) {
        if (feeRequest.getAmount().compareTo(BigDecimal.valueOf(500)) <= 0) {
            return "项目经理批准" + feeRequest.getName() + "的申请金额：" + feeRequest.getAmount();
        } else {
            return super.invokeNext(feeRequest);
        }
    }
}
