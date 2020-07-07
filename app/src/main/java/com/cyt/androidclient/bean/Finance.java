package com.cyt.androidclient.bean;

import java.io.Serializable;
import java.util.List;

public class Finance implements Serializable {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2020-06-29 10:00","title":"总理召开座谈会研究稳外贸新措施，尤其要保住两类企业","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/770/327.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8027875"},{"ctime":"2020-06-29 09:00","title":"首批4只创业板注册制战略配售基金来了：这四家基金公司在列","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/768/460.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8027661"},{"ctime":"2020-06-29 09:00","title":"银行系保险信托都表现平平，商业银行若拿到券商牌照能否做好","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/769/361.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8027785"},{"ctime":"2020-06-29 09:00","title":"华夏幸福增资诺港集团，布局上海临港科学社区业务","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/769/97.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8027709"},{"ctime":"2020-06-29 09:00","title":"C919飞机开启高温专项试飞，成功降落新疆吐鲁番交河机场","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/773/620.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8028222"},{"ctime":"2020-06-29 09:00","title":"爱沙尼亚环境保护局在空气中检测到少量的核粒子","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/773/692.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8028229"},{"ctime":"2020-06-29 09:00","title":"瑞幸咖啡退市前夜：开店数量半年减少八成，零售未受影响","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/837/236.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8033075"},{"ctime":"2020-06-29 09:00","title":"华建集团董事长病逝，总经理暂履其职","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/821/148.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8031768"},{"ctime":"2020-06-29 09:00","title":"中证报：结构性\u201c宽信用\u201d政策操作有望延续更长时间","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/852/373.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8034363"},{"ctime":"2020-06-29 09:00","title":"银亿股份重整申请被裁定受理：账面资产大于负债，有重整可能","description":"澎湃财经","picUrl":"https://imagecloud.thepaper.cn/thepaper/image/74/838/692.jpg","url":"https://www.thepaper.cn/newsDetail_forward_8028225"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2020-06-29 10:00
         * title : 总理召开座谈会研究稳外贸新措施，尤其要保住两类企业
         * description : 澎湃财经
         * picUrl : https://imagecloud.thepaper.cn/thepaper/image/74/770/327.jpg
         * url : https://www.thepaper.cn/newsDetail_forward_8027875
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
