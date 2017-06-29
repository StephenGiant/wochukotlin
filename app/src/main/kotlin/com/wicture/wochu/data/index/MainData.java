package com.wicture.wochu.data.index;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */

public class MainData {

    private List<ActsBean> acts;
    /**
     * imgUrl : https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/11643a6d-0a37-4742-97cb-1e79f0fa0583.jpg
     * type : 2
     * source : 7a76ba9d-8494-4747-b18f-d5917915b8cc
     * pos : 1
     * $$hashKey : object:5729
     * posDes : 中粮家佳康小排400g
     * goodsName : 中粮家佳康小排400g
     * price : 12.99
     * unit : 400g
     * marketPrice : 24.8
     * preSale : 0
     * currentDate : 1498732379
     * deadLineDate : null
     */

    private String imgUrl;
    private String type;
    private String source;
    private int pos;
    private String $$hashKey;
    private String posDes;
    private String goodsName;
    private double price;
    private String unit;
    private double marketPrice;
    private int preSale;
    private int currentDate;
    private Object deadLineDate;
    /**
     * price : 12.99
     * marketPrice : 24.8
     * deadLineDate : null
     */

    @SerializedName("price")
    private double priceX;
    @SerializedName("marketPrice")
    private double marketPriceX;
    @SerializedName("deadLineDate")
    private Object deadLineDateX;

    public List<ActsBean> getActs() {
        return acts;
    }

    public void setActs(List<ActsBean> acts) {
        this.acts = acts;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String get$$hashKey() {
        return $$hashKey;
    }

    public void set$$hashKey(String $$hashKey) {
        this.$$hashKey = $$hashKey;
    }

    public String getPosDes() {
        return posDes;
    }

    public void setPosDes(String posDes) {
        this.posDes = posDes;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getPreSale() {
        return preSale;
    }

    public void setPreSale(int preSale) {
        this.preSale = preSale;
    }

    public int getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(int currentDate) {
        this.currentDate = currentDate;
    }

    public Object getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(Object deadLineDate) {
        this.deadLineDate = deadLineDate;
    }

    public double getPriceX() {
        return priceX;
    }

    public void setPriceX(double priceX) {
        this.priceX = priceX;
    }

    public double getMarketPriceX() {
        return marketPriceX;
    }

    public void setMarketPriceX(double marketPriceX) {
        this.marketPriceX = marketPriceX;
    }

    public Object getDeadLineDateX() {
        return deadLineDateX;
    }

    public void setDeadLineDateX(Object deadLineDateX) {
        this.deadLineDateX = deadLineDateX;
    }

    public static class ActsBean {
        /**
         * items : [{"imgUrl":"https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/61b533f0-466f-4fa2-afb4-d25fa0bb0339.jpg","type":"1","source":"http://wmall.wochu.cn/h5/activityTemplate/html/activityPage.html?activityId=176","pos":1,"$$hashKey":"object:6934","posDes":"48小时保质保价"}]
         * templateType : 5
         * $$hashKey : object:6920
         * sortIndex : 3
         * sortIndexDes : 48小时保质保价
         */

        private String templateType;
        private String $$hashKey;
        private int sortIndex;
        private String sortIndexDes;
        private List<ItemsBean> items;

        public String getTemplateType() {
            return templateType;
        }

        public void setTemplateType(String templateType) {
            this.templateType = templateType;
        }

        public String get$$hashKey() {
            return $$hashKey;
        }

        public void set$$hashKey(String $$hashKey) {
            this.$$hashKey = $$hashKey;
        }

        public int getSortIndex() {
            return sortIndex;
        }

        public void setSortIndex(int sortIndex) {
            this.sortIndex = sortIndex;
        }

        public String getSortIndexDes() {
            return sortIndexDes;
        }

        public void setSortIndexDes(String sortIndexDes) {
            this.sortIndexDes = sortIndexDes;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }


    }
    public static class ItemsBean {
        /**
         * imgUrl : https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/11643a6d-0a37-4742-97cb-1e79f0fa0583.jpg
         * type : 2
         * source : 7a76ba9d-8494-4747-b18f-d5917915b8cc
         * pos : 1
         * $$hashKey : object:5729
         * posDes : 中粮家佳康小排400g
         * goodsName : 中粮家佳康小排400g
         * price : 12.99
         * unit : 400g
         * marketPrice : 24.8
         * preSale : 0
         * currentDate : 1498732379
         * deadLineDate : null
         */

        private String imgUrl;
        private String type;
        private String source;
        private int pos;
        private String $$hashKey;
        private String posDes;
        private String goodsName;
        private double price;
        private String unit;
        private double marketPrice;
        private int preSale;
        private int currentDate;
        private Object deadLineDate;

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public String get$$hashKey() {
            return $$hashKey;
        }

        public void set$$hashKey(String $$hashKey) {
            this.$$hashKey = $$hashKey;
        }

        public String getPosDes() {
            return posDes;
        }

        public void setPosDes(String posDes) {
            this.posDes = posDes;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public double getMarketPrice() {
            return marketPrice;
        }

        public void setMarketPrice(double marketPrice) {
            this.marketPrice = marketPrice;
        }

        public int getPreSale() {
            return preSale;
        }

        public void setPreSale(int preSale) {
            this.preSale = preSale;
        }

        public int getCurrentDate() {
            return currentDate;
        }

        public void setCurrentDate(int currentDate) {
            this.currentDate = currentDate;
        }

        public Object getDeadLineDate() {
            return deadLineDate;
        }

        public void setDeadLineDate(Object deadLineDate) {
            this.deadLineDate = deadLineDate;
        }
    }
}
