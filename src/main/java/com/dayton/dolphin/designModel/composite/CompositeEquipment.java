package com.dayton.dolphin.designModel.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * Created by bruce on 17-5-23.
 */
public class CompositeEquipment extends Equipment{

    private int i = 0;

    //存放其他的部分
    private ArrayList<Equipment> sub = new ArrayList<>();

    public CompositeEquipment(String name) {
        super(name);
    }

    public boolean add(Equipment equipment){
        return this.sub.add(equipment);
    }

    @Override
    public double netPrice() {
        double netPrice = 0;
        double tmpNetPrice = 0;
        Iterator<Equipment> iterator = sub.iterator();
        while (iterator.hasNext()){
            tmpNetPrice = iterator.next().netPrice();
            System.out.println("tmpNetPrice: "+tmpNetPrice);
            netPrice += tmpNetPrice;
            System.out.println("netPrice: "+netPrice);
        }
        return netPrice;
    }

    @Override
    public double discountPrice() {
        double discountPrice = 0;
        double tmpDiscountPrice = 0;
        Iterator<Equipment> iterator = sub.iterator();
        while (iterator.hasNext()){
            tmpDiscountPrice = iterator.next().discountPrice();
            System.out.println("tmpDiscountPrice= "+tmpDiscountPrice);
            discountPrice += tmpDiscountPrice;
            System.out.println("discountPrice= "+discountPrice);
        }
        return discountPrice;
    }

    public Iterator<Equipment> iter(){
        return sub.iterator();
    }

    public boolean hasNext(){
        return i<sub.size();
    }

    public Equipment next(){
        if (this.hasNext()){
            return sub.get(i++);
        }else {
            throw new NoSuchElementException();
        }
    }

}
