class Amount {
    private double amount;
    private String transactionType;
    /**
     * @param amount    The amount of transaction
     * @param transactionType The type of transaction
     * */
    public Amount(double amount, String transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public double getAmount(){
        return amount;
    }
    public String getTransactionType(){
        return transactionType;
    }
}
