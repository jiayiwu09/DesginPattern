package com.DesignPatterns.Proxy.Exercise;

public class ProductProxy extends Product{
    private DbContext context;

    public ProductProxy(DbContext context, int id) {
        super(id);
        this.context = context;
    }

    @Override
    public void setName(String name) {
        super.setName(name);

        context.markAsChanged(this);
    }
}
