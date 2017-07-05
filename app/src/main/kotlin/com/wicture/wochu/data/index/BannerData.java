package com.wicture.wochu.data.index;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */

public class BannerData {

    private List<CarouselBean> carousel;
    private List<RecommendedContentBean> recommendedContent;

    public List<CarouselBean> getCarousel() {
        return carousel;
    }

    public void setCarousel(List<CarouselBean> carousel) {
        this.carousel = carousel;
    }

    public List<RecommendedContentBean> getRecommendedContent() {
        return recommendedContent;
    }

    public void setRecommendedContent(List<RecommendedContentBean> recommendedContent) {
        this.recommendedContent = recommendedContent;
    }

    public static class CarouselBean {
        /**
         * title : 暑假喂孩子
         * picUrl : https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/2ac948b1-4cd1-44da-8030-c879f3ed2423.jpg
         * enabled : 1
         * sortIndex : 1
         * sortIndexDes : 暑假喂孩子
         * action : {"type":2,"data":{"type":1,"target":"http://wmall.wochu.cn/h5/activityTemplate/html/activityPage.html?activityId=200"}}
         */

        private String title;
        private String picUrl;
        private int enabled;
        private int sortIndex;
        private String sortIndexDes;
        private ActionBean action;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public int getEnabled() {
            return enabled;
        }

        public void setEnabled(int enabled) {
            this.enabled = enabled;
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

        public ActionBean getAction() {
            return action;
        }

        public void setAction(ActionBean action) {
            this.action = action;
        }

        public static class ActionBean {
            /**
             * type : 2
             * data : {"type":1,"target":"http://wmall.wochu.cn/h5/activityTemplate/html/activityPage.html?activityId=200"}
             */

            private int type;
            private DataBean data;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public DataBean getData() {
                return data;
            }

            public void setData(DataBean data) {
                this.data = data;
            }

            public static class DataBean {
                /**
                 * type : 1
                 * target : http://wmall.wochu.cn/h5/activityTemplate/html/activityPage.html?activityId=200
                 */

                private int type;
                private String target;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTarget() {
                    return target;
                }

                public void setTarget(String target) {
                    this.target = target;
                }
            }
        }
    }

    public static class RecommendedContentBean {
        /**
         * items : [{"imgUrl":"https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/512492dd-256a-497d-9bd8-a9d8657f70ba.jpg","type":"3","source":"本周特惠","pos":1,"$$hashKey":"object:4320","posDes":"今日特惠"},{"imgUrl":"https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/4fc75772-2270-4cd5-b9bd-e9d14c974bb1.jpg","type":"5","source":"http://wmall.wochu.cn/h5/tg/groupList.html","pos":2,"$$hashKey":"object:4342","posDes":"超值团购"},{"imgUrl":"https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/7f30e32a-53a1-48d6-97d5-d4a374b919f7.jpg","type":"8","source":"","pos":3,"$$hashKey":"object:4353","posDes":"套餐"},{"imgUrl":"https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/2c3b7ddd-73c5-4551-8279-5141c617f8a6.jpg","type":"3","source":"特价净菜专区","pos":4,"$$hashKey":"object:4364","posDes":"特价净菜专区"}]
         * templateType : 8
         * $$hashKey : object:4292
         * sortIndex : 1
         * sortIndexDes : icon
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

        public static class ItemsBean {
            /**
             * imgUrl : https://wochu.oss-cn-hangzhou.aliyuncs.com/upload/512492dd-256a-497d-9bd8-a9d8657f70ba.jpg
             * type : 3
             * source : 本周特惠
             * pos : 1
             * $$hashKey : object:4320
             * posDes : 今日特惠
             */

            private String imgUrl;
            private int type;
            private String source;
            private int pos;
            private String $$hashKey;
            private String posDes;

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
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
        }
    }
}
