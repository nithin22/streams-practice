package com.begginer.arrays;

public class Inter {
    public interface nestedInterface{
        boolean isBooleanTrueOrFalse(int a);
    }

    public class Anoterzclass implements Inter.nestedInterface{

        @Override
        public boolean isBooleanTrueOrFalse(int a) {
            return a<0?false:true;
        }
    }
}
