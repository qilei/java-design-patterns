package me.lei.chain;

public abstract class Handler {

    private Handler successor;

    public abstract String handle(FeeRequest feeRequest);

    public String invokeNext(FeeRequest feeRequest) {
        if (this.successor != null) {
            return this.successor.handle(feeRequest);
        }
        return null;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
