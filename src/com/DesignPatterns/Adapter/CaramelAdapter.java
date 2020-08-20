package com.DesignPatterns.Adapter;

import com.DesignPatterns.Adapter.AvaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
