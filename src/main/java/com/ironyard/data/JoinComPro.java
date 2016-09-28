package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 9/28/16.
 */
public class JoinComPro {
    private int jpoID;
    private int jpoProID;
    private int jpoOrdId;
    private List<Product> productList;
    private List<Order> orderList;

    public JoinComPro(int jpoID, int jpoProID, int jpoOrdId, List<Product> productList, List<Order> orderList) {
        this.jpoID = jpoID;
        this.jpoProID = jpoProID;
        this.jpoOrdId = jpoOrdId;
        this.productList = productList;
        this.orderList = orderList;
    }

    public int getJpoID() {
        return jpoID;
    }

    public void setJpoID(int jpoID) {
        this.jpoID = jpoID;
    }

    public int getJpoProID() {
        return jpoProID;
    }

    public void setJpoProID(int jpoProID) {
        this.jpoProID = jpoProID;
    }

    public int getJpoOrdId() {
        return jpoOrdId;
    }

    public void setJpoOrdId(int jpoOrdId) {
        this.jpoOrdId = jpoOrdId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
