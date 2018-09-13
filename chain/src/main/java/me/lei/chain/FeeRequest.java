package me.lei.chain;

import java.math.BigDecimal;

/**
 * 费用报销请求
 */
public class FeeRequest {

    private String name;

    private BigDecimal amount;

    public FeeRequest(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
