package com.cyt.androidclient.bean;

import java.io.Serializable;
import java.util.List;

public class Apple implements Serializable {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2020-06-30 11:00","title":"Apple 推送 HomePod 14 开发者预览 Beta 版本","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593483702751.jpg","url":"https://www.i4.cn/news_detail_42199.html"},{"ctime":"2020-06-30 11:00","title":"Apple 推出「Path to Apple Card」计划，帮助被拒绝的申请人","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593484057152.jpg","url":"https://www.i4.cn/news_detail_42200.html"},{"ctime":"2020-06-30 11:00","title":"「纽约时报」宣布终止与 Apple News 的合作","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593484413426.jpg","url":"https://www.i4.cn/news_detail_42201.html"},{"ctime":"2020-06-30 11:00","title":"苹果强势逼迫整个 CA 行业进入一年的证书寿命期","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593485355552.jpg","url":"https://www.i4.cn/news_detail_42203.html"},{"ctime":"2020-06-30 11:00","title":"Apple 夏令营居家版开放注册，为儿童提供乐趣十足的在线课程","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593485626049.jpg","url":"https://www.i4.cn/news_detail_42204.html"},{"ctime":"2020-06-30 10:00","title":"苹果 iPhone 12 Pro 将支持录制 120fps 和 240fps 的 4K 视频","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593479554000.jpg","url":"https://www.i4.cn/news_detail_42190.html"},{"ctime":"2020-06-30 10:00","title":"苹果公布 2020 年设计大奖，8 位开发者获奖","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593479957834.jpg","url":"https://www.i4.cn/news_detail_42191.html"},{"ctime":"2020-06-30 10:00","title":"A12Z Mac mini 开始陆续到达开发者手中","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593480244292.jpg","url":"https://www.i4.cn/news_detail_42192.html"},{"ctime":"2020-06-30 10:00","title":"因未通过苹果验证，iPhone 12 5G 首批不含京东方 OLED 版","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593480781941.jpg","url":"https://www.i4.cn/news_detail_42193.html"},{"ctime":"2020-06-30 10:00","title":"国外网友分享苹果 iPhone 12 系列机模上手图","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593481258489.jpg","url":"https://www.i4.cn/news_detail_42195.html"},{"ctime":"2020-06-30 10:00","title":"五年前苹果就已开始研发 Apple Watch 睡眠追踪功能","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593481650021.jpg","url":"https://www.i4.cn/news_detail_42196.html"},{"ctime":"2020-06-30 10:00","title":"苹果将使用 Apple Watch 为新冠肺炎诊断研究提供支持","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-30/1593481898411.jpg","url":"https://www.i4.cn/news_detail_42198.html"},{"ctime":"2020-06-29 11:00","title":"2020 年 D&AD 设计奖出炉：苹果凭借出色广告获得 20 支「Pencil」","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593396100445.jpg","url":"https://www.i4.cn/news_detail_42168.html"},{"ctime":"2020-06-29 11:00","title":"苹果 SF Symbols 获更新：带来 750 个全新图标及新功能","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593396623059.jpg","url":"https://www.i4.cn/news_detail_42169.html"},{"ctime":"2020-06-29 11:00","title":"郭明錤再次确认：iPhone 12 将取消随机附赠充电器、耳机","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593396969350.jpg","url":"https://www.i4.cn/news_detail_42170.html"},{"ctime":"2020-06-29 11:00","title":"消息称苹果上海代工厂将生产 iPhone 12 4G 版","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593398439571.jpg","url":"https://www.i4.cn/news_detail_42173.html"},{"ctime":"2020-06-29 11:00","title":"苹果明年发布 iPad Air 4：新 mini 屏幕将升级至 8.5 寸","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593398724084.jpg","url":"https://www.i4.cn/news_detail_42174.html"},{"ctime":"2020-06-29 10:00","title":"找回丢失的 iPhone：苹果将开放由数亿台设备组成的「查找」 网络","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593393533979.jpg","url":"https://www.i4.cn/news_detail_42162.html"},{"ctime":"2020-06-29 10:00","title":"未来或将发布的 iPhone SE 2 Plus 仍将搭载 A13 处理器","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593393844568.jpg","url":"https://www.i4.cn/news_detail_42163.html"},{"ctime":"2020-06-29 10:00","title":"搭载 A12X Bionic 的 Apple TV 6 可能会在 9 月发布","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593394921510.jpg","url":"https://www.i4.cn/news_detail_42164.html"},{"ctime":"2020-06-29 10:00","title":"苹果新专利：模块化框架部件让 Apple Glass 能实现功能扩展","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-29/1593395933209.jpg","url":"https://www.i4.cn/news_detail_42167.html"},{"ctime":"2020-06-28 12:00","title":"苹果正在为开发者引入一个新的应用内购买通知系统","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593313664584.jpg","url":"https://www.i4.cn/news_detail_42153.html"},{"ctime":"2020-06-28 12:00","title":"iOS 14 与 macOS Big Sur 将支持 DNS 加密通信","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593314423087.jpg","url":"https://www.i4.cn/news_detail_42154.html"},{"ctime":"2020-06-28 11:01","title":"iOS 14 越狱进展顺利：开发者亲晒 Cydia 运行截图","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593309895647.jpg","url":"https://www.i4.cn/news_detail_42144.html"},{"ctime":"2020-06-28 10:00","title":"巴克莱：苹果 iPhone 12 不提供 EarPods 耳机，可能充电头也没有","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593306887462.jpg","url":"https://www.i4.cn/news_detail_42133.html"},{"ctime":"2020-06-28 10:00","title":"iOS 14 和 macOS Big Sur：游戏中心复活","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593307164830.jpg","url":"https://www.i4.cn/news_detail_42134.html"},{"ctime":"2020-06-28 10:00","title":"传苹果 iPhone 12 Pro 将配 120Hz 高刷新率屏幕：9月发布","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593308160968.jpg","url":"https://www.i4.cn/news_detail_42136.html"},{"ctime":"2020-06-28 10:00","title":"苹果发明超薄触摸显示技术：iPhone 未来或将回归轻薄化","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593308395193.jpg","url":"https://www.i4.cn/news_detail_42138.html"},{"ctime":"2020-06-28 10:00","title":"苹果 iPhone SE DXO 拍照评分出炉：综合 101 分","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593308764874.jpg","url":"https://www.i4.cn/news_detail_42139.html"},{"ctime":"2020-06-28 10:00","title":"供应商爆料：苹果 iPhone 13 将换用 USB-C 接口","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593308996005.jpg","url":"https://www.i4.cn/news_detail_42140.html"},{"ctime":"2020-06-28 10:00","title":"苹果 iPhone 12 系列\u201c亮相\u201d国外运营商官网","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593309423717.jpg","url":"https://www.i4.cn/news_detail_42141.html"},{"ctime":"2020-06-28 10:00","title":"苹果 iOS 14/iPadOS 14 新增 APFS 加密驱动器","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-28/1593309639949.jpg","url":"https://www.i4.cn/news_detail_42142.html"},{"ctime":"2020-06-24 12:00","title":"iOS 14 新增 AirPods 健康充电模式：减缓电池老化","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592968754101.jpg","url":"https://www.i4.cn/news_detail_42116.html"},{"ctime":"2020-06-24 12:00","title":"苹果 iOS 14/iPadOS 14 原生输入法已支持五笔输入","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592969078272.jpg","url":"https://www.i4.cn/news_detail_42117.html"},{"ctime":"2020-06-24 12:00","title":"苹果向开发人员开放 U1 芯片，可感知两部 iPhone 相对位置","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592970106235.jpg","url":"https://www.i4.cn/news_detail_42118.html"},{"ctime":"2020-06-24 11:00","title":"苹果官方介绍 watchOS 7：全新表盘共享、睡眠追踪、洗手自动检测","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592966624734.jpg","url":"https://www.i4.cn/news_detail_42110.html"},{"ctime":"2020-06-24 11:00","title":"iOS 14 出现刷新率选项，预示 iPhone 12 系列有望采用高刷屏","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592967101359.jpg","url":"https://www.i4.cn/news_detail_42113.html"},{"ctime":"2020-06-24 11:00","title":"iOS 14 已支持谷歌 VP9 编码：可在 iPhone 上看 4K YouTube 视频","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592967318991.jpg","url":"https://www.i4.cn/news_detail_42114.html"},{"ctime":"2020-06-24 10:00","title":"iOS 14 新功能：Apple Watch 充电完成后通知用户","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592960988928.jpg","url":"https://www.i4.cn/news_detail_42095.html"},{"ctime":"2020-06-24 10:00","title":"AirPods Pro 固件升级至 2D27","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592961306948.jpg","url":"https://www.i4.cn/news_detail_42096.html"},{"ctime":"2020-06-24 10:00","title":"iOS 14 将在应用或小部件访问剪贴板时通知用户","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592961519371.jpg","url":"https://www.i4.cn/news_detail_42097.html"},{"ctime":"2020-06-24 10:00","title":"iOS 14 可以通知用户火警和门铃等声音","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592961699108.jpg","url":"https://www.i4.cn/news_detail_42098.html"},{"ctime":"2020-06-24 10:00","title":"tvOS 14 支持 AirPods 音频共享、4K YouTube","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592961876422.jpg","url":"https://www.i4.cn/news_detail_42099.html"},{"ctime":"2020-06-24 10:00","title":"苹果开售 2 米长的雷电 3 Pro 线缆，标价 129 美元","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592962665465.jpg","url":"https://www.i4.cn/news_detail_42101.html"},{"ctime":"2020-06-24 10:00","title":"分析师预计采用全新设计的 24 英寸 iMac 将于 2020 年 4 季度发布","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592963117750.jpg","url":"https://www.i4.cn/news_detail_42103.html"},{"ctime":"2020-06-24 10:00","title":"Apple Silicon 处理器将使苹果研发成本增加，但不一定影响产品售价","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-24/1592963799999.jpg","url":"https://www.i4.cn/news_detail_42105.html"},{"ctime":"2020-06-23 19:00","title":"WWDC 2020 汇总：五大系统更新，发布自研芯片","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-23/1592906741034.jpg","url":"https://www.i4.cn/news_detail_42093.html"},{"ctime":"2020-06-23 15:00","title":"苹果 iOS 14 将支持 FaceTime 眼神接触校正功能","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-23/1592894143903.jpg","url":"https://www.i4.cn/news_detail_42085.html"},{"ctime":"2020-06-23 14:00","title":"苹果强调：iOS 应用是否上架 Mac 商城完全取决于开发者","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-23/1592891783400.jpg","url":"https://www.i4.cn/news_detail_42084.html"},{"ctime":"2020-06-23 11:00","title":"苹果发布 macOS Big Sur：全新界面、更像 iOS","description":"苹果新闻","picUrl":"https://d-image.i4.cn/i4web/image/news/2020-06-23/1592878279650.jpg","url":"https://www.i4.cn/news_detail_42069.html"}]
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
         * ctime : 2020-06-30 11:00
         * title : Apple 推送 HomePod 14 开发者预览 Beta 版本
         * description : 苹果新闻
         * picUrl : https://d-image.i4.cn/i4web/image/news/2020-06-30/1593483702751.jpg
         * url : https://www.i4.cn/news_detail_42199.html
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
