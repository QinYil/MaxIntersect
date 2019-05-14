package com.qy;

public class Region implements Inter{
    private int[] source;
    Region(int[] source){
        this.source = source;
    }
    @Override
    public Integer MaxIntesect(Inter inter) {
        int low = Math.max(this.source[0],inter.getSource()[0]);
        int high = Math.min(this.source[1],inter.getSource()[1]);
        int intersect = high - low;
        return intersect >0?intersect:-1;
    }

    @Override
    public boolean isContanin(Inter inter) {
        return this.source[0]<=inter.getSource()[0]&&this.source[1]>=inter.getSource()[1];
    }

    @Override
    public int[] getSource() {
        return this.source;
    }
}
