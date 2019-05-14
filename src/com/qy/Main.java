package com.qy;

public class Main {
    public static void main(String[] args) {
        int[][] sources = {{1,2},{2,3},{4,9},{3,8},{1,10}};
        IntersectContext intersectContext = new IntersectContext(sources);
        System.out.println("max:"+intersectContext.maxIntersect());
    }
}
