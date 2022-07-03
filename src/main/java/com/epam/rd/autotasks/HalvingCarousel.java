package com.epam.rd.autotasks;

import com.epam.rd.autotasks.CarouselRun;
public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) throws UnsupportedOperationException{
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (getState()==1) {
            return null;
        }
        setState((byte)1);
        return new CarouselRun(getArr(),getI(),1);
    }
}
