package com.cyt.androidclient.bean;

import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2020-06-30 14:00","title":"考斯特柯斯达11座点内现车 更多车型请关注","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_df270de3fded43278d8d3f30721bb053.jpg","url":"http://www.chexun.com/2020-06-30/111279987.html"},{"ctime":"2020-06-30 14:00","title":"考斯特商务车考斯特商务车北京价格","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_57f274160769438da82f84cece466997.jpg","url":"http://www.chexun.com/2020-06-30/111280009.html"},{"ctime":"2020-06-30 14:00","title":"丰田考斯特商务车 北京底价","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_060c3fe9e3db47b1b46994c3679db33d.jpg","url":"http://www.chexun.com/2020-06-30/111280071.html"},{"ctime":"2020-06-30 14:00","title":"19款丰田FJ酷路泽4.0 动感四驱  清仓特价","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_b178067ca6d74248b58424f56c2d5b59.jpg","url":"http://www.chexun.com/2020-06-30/111280101.html"},{"ctime":"2020-06-30 14:00","title":"2020款柯斯达、高端设计北京现车","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_e1b9eb5bbf094a5595d0248f4650c61e.jpg","url":"http://www.chexun.com/2020-06-30/111280107.html"},{"ctime":"2020-06-30 14:00","title":"丰田害怕特斯拉吗？（2）","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_05380cc5b985491f9fb768358e3f8282.jpg","url":"http://www.chexun.com/2020-06-30/111280109.html"},{"ctime":"2020-06-30 14:00","title":"凯迪拉克：CTS没做到的CT5做到了","description":"车讯网","picUrl":"http://i0.chexun.net/images/2020/0628/41520/news_default_79C10712C3BA33F08A86D10919E4720E.jpg","url":"http://www.chexun.com/2020-06-30/111280111.html"},{"ctime":"2020-06-30 14:00","title":"2020款美规奔驰G63 七月优惠 特价促销","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_d7049a6165294ad4b9eda6e1a6dfa837.jpg","url":"http://www.chexun.com/2020-06-30/111280117.html"},{"ctime":"2020-06-30 14:00","title":"不到10万元能买到什么SUV？刚上市的江淮嘉悦X4值不值","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_bc931dfc119546f28c16cafcf3d072ef.jpg","url":"http://www.chexun.com/2020-06-30/111280145.html"},{"ctime":"2020-06-30 14:00","title":"20款加版塞纳四驱LTD全国优惠促销销售","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_3d9626dbd58c4d45b1b3c8d7ec3cc07d.JPG","url":"http://www.chexun.com/2020-06-30/111280157.html"},{"ctime":"2020-06-30 13:00","title":"新款奔驰V260L改装迈巴赫VS980定车优惠多多","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_97b1ef5107704821a97ecb04aff4f72e.jpg","url":"http://www.chexun.com/2020-06-30/111279783.html"},{"ctime":"2020-06-30 13:00","title":"金冠格林卡诺无拓展房车 你想拥有的它都能带给你","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_0beee6e45f2c4f13a53866d88271a543.jpg","url":"http://www.chexun.com/2020-06-30/111279787.html"},{"ctime":"2020-06-30 13:00","title":"奔驰V260L改装商务个性化功能经济适用","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_729c00270fa34f9a88c7d31dfe606344.jpg","url":"http://www.chexun.com/2020-06-30/111279801.html"},{"ctime":"2020-06-30 13:00","title":"进口宾利20款地表最豪的SUV五座现车添越汽油4.0版 百年礼赞报价","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_99dd831911c54a8ab8e8a9ce539feec4.jpg","url":"http://www.chexun.com/2020-06-30/111279815.html"},{"ctime":"2020-06-30 13:00","title":"进口奔驰乌尼莫克越野房车陆地上谁不服","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_7b5d337ec0674915a1a7b2fabf0760b1.jpg","url":"http://www.chexun.com/2020-06-30/111279827.html"},{"ctime":"2020-06-30 13:00","title":"新款奔驰威霆改装商务不到四十现车在店","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_2936a3f5736040608672335cb02ef32c.jpg","url":"http://www.chexun.com/2020-06-30/111279843.html"},{"ctime":"2020-06-30 12:00","title":"2020沃德十佳内饰出炉，SUV占7席，奔驰GLB、全新丰田汉兰达获奖","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_c19a0bf890e7440ba574d08e6cd55afe.jpg","url":"http://www.chexun.com/2020-06-30/111279699.html"},{"ctime":"2020-06-30 12:00","title":"奔驰召回67万辆，快看看你的奔驰召回了没？","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_e8702b8012214ac585fea65a5d183d56.jpg","url":"http://www.chexun.com/2020-06-30/111279715.html"},{"ctime":"2020-06-30 11:00","title":"越野世界领导者 20款奔驰G63时光铭刻特别版","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_22f0da0d1c734c5a8e9f506c94427b0f.jpg","url":"http://www.chexun.com/2020-06-30/111278859.html"},{"ctime":"2020-06-30 11:00","title":"又一款SUV申报图曝光，颜值大幅提升，上市有望成销量王","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_bdc38163511540578606d55abcf5a747.jpg","url":"http://www.chexun.com/2020-06-30/111278985.html"},{"ctime":"2020-06-30 11:00","title":"20款奔驰G63现车到店 最低价格销售全国","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_cf7ae368d1614d6185ab5db2f49f46a3.jpg","url":"http://www.chexun.com/2020-06-30/111279207.html"},{"ctime":"2020-06-30 11:00","title":"高端大气上档次 20款奔驰G500暗夜特别版","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_6c57796a49aa4e1c8e1cce1ffe3976a6.jpg","url":"http://www.chexun.com/2020-06-30/111279217.html"},{"ctime":"2020-06-30 11:00","title":"四种驾驶模式 20款奔驰G500现车到店","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_1055dc8b33e2491780d79bee0dc4dc2f.jpg","url":"http://www.chexun.com/2020-06-30/111279221.html"},{"ctime":"2020-06-30 11:00","title":"依维柯房车价格优惠依维柯房车","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_8a521a0137c24a1ab2ef195d1fc5bdd3.jpg","url":"http://www.chexun.com/2020-06-30/111279241.html"},{"ctime":"2020-06-30 11:00","title":"坚持动能永不松懈 20款奔驰G500时光铭刻特别版","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_01467687a2eb408d8c507747fcdec106.jpg","url":"http://www.chexun.com/2020-06-30/111279273.html"},{"ctime":"2020-06-30 11:00","title":"20款奔驰G500时光铭刻特别版 现车钜惠酬宾","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_7886bff3ee4143e4bb35a569f85c47a7.jpg","url":"http://www.chexun.com/2020-06-30/111279397.html"},{"ctime":"2020-06-30 11:00","title":"每月花1505元，长安UNI-T购车、养车成本分析","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_6a7b1798c79d4c33aa485b3df3dda96d.jpg","url":"http://www.chexun.com/2020-06-30/111279399.html"},{"ctime":"2020-06-30 11:00","title":"20款奔驰GLC43现车到店 越野世界生力军","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_ebc1161121974f188e87e837841083fb.jpg","url":"http://www.chexun.com/2020-06-30/111279431.html"},{"ctime":"2020-06-30 10:00","title":"BJ40城市猎人新动力总成可靠性深度报告：兼顾城市与越野","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_4592b39c7e2441fc8c6ee675cc6ab91f.jpg","url":"http://www.chexun.com/2020-06-30/111277665.html"},{"ctime":"2020-06-30 10:00","title":"心态年轻的人，也绕不开一台思域Hatchback|新车","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_f1734eeeed294ca291cfefa049e5db9e.jpg","url":"http://www.chexun.com/2020-06-30/111277667.html"},{"ctime":"2020-06-30 10:00","title":"或将开启品牌新篇章，解读观致7的\u201c方界美学\u201d","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_d67a97f6df4e477c98865fd9ffdb8688.png","url":"http://www.chexun.com/2020-06-30/111277669.html"},{"ctime":"2020-06-30 10:00","title":"22.38万元起售，斯巴鲁森林人喜迎新车型|新车","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_e7a74f41deac408da5ad1a87de70732f.jpg","url":"http://www.chexun.com/2020-06-30/111277671.html"},{"ctime":"2020-06-30 10:00","title":"中期改款奥迪Q5发布，有惊喜也有遗憾？","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_f0e53cc76e084797b4c44dbc130f91f3.jpg","url":"http://www.chexun.com/2020-06-30/111277675.html"},{"ctime":"2020-06-30 10:00","title":"2020款丰田考斯特价格  考斯特商务车","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_2245bd58d61d43a49916a9223c31ec57.jpg","url":"http://www.chexun.com/2020-06-30/111278135.html"},{"ctime":"2020-06-30 10:00","title":"迈巴赫VS980价格 精品商务降价促销","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_4f63e5c4fbe8402ca2e875d6813b6d91.jpg","url":"http://www.chexun.com/2020-06-30/111278169.html"},{"ctime":"2020-06-30 10:00","title":"迈巴赫VS980对比迈巴赫VS680多哪些配置","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_858f56860e894efd9f68313cede26ab4.jpg","url":"http://www.chexun.com/2020-06-30/111278199.html"},{"ctime":"2020-06-30 10:00","title":"迈巴赫VS980双色报价 奔驰V260国六改装","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_3766f25699dd4f3a94e9a09d583e2e0a.jpg","url":"http://www.chexun.com/2020-06-30/111278223.html"},{"ctime":"2020-06-30 10:00","title":"挑战Model 3！宝马纯电3系已经在路上|新车","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_c484d60f714d4860a5152c1607b34379.jpg","url":"http://www.chexun.com/2020-06-30/111278225.html"},{"ctime":"2020-06-29 23:00","title":"奔驰V260七座豪华商务车 尊享舒适气质耀眼","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_223073a6c3604477bd171ae14928cf35.jpg","url":"http://www.chexun.com/2020-06-29/111277547.html"},{"ctime":"2020-06-29 23:00","title":"新款奔驰V260L 全新黑棕内饰带您感受别样的运动美","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_20520b0d1268401b846f5bb612622a6d.jpg","url":"http://www.chexun.com/2020-06-29/111277549.html"},{"ctime":"2020-06-29 23:00","title":"奔驰GLC四驱系统形同虚设？奔驰减配已经不是第一次了？","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_e0c260bb1cf44c21a3c364a9d03edf6f.jpg","url":"http://www.chexun.com/2020-06-29/111277551.html"},{"ctime":"2020-06-29 23:00","title":"车联网系统，福特今天于欧洲市场全面启用","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_fa506b10664e464ea3c1c65a743a47eb.jpg","url":"http://www.chexun.com/2020-06-29/111277555.html"},{"ctime":"2020-06-29 23:00","title":"电池不动，EPA续航破647公里，特斯拉：还有谁？","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_590ad9b56d2d40f1b6d138afa8d757a5.jpg","url":"http://www.chexun.com/2020-06-29/111277557.html"},{"ctime":"2020-06-29 23:00","title":"不用花大钱改装，想买最骚气兰博基尼Urus的机会来了","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_66590383fe8f4e44b446cb904ed422c0.jpg","url":"http://www.chexun.com/2020-06-29/111277563.html"},{"ctime":"2020-06-29 23:00","title":"这个动力版本的CX-5，在美国卖得实在太差，直接面临停售？","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_da76c9e47bd74b70a9e6da1aa363f233.jpg","url":"http://www.chexun.com/2020-06-29/111277567.html"},{"ctime":"2020-06-29 23:00","title":"国产大众最高配置水平，全系搭2.0T动力，探岳X前瞻","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_638ccfb56cf441b3856851fe010018f1.png","url":"http://www.chexun.com/2020-06-29/111277569.html"},{"ctime":"2020-06-29 23:00","title":"新一代雅力士上市延迟，新飞度强敌，是不是真值得期待？","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_f5c9e444e1574cd58ca0fdb679761591.jpg","url":"http://www.chexun.com/2020-06-29/111277573.html"},{"ctime":"2020-06-29 23:00","title":"TUV南德出席2020中国轨道交通创新材料应用发展论坛","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_cc92f943ebf943a8a30742d79a3f464f.jpg","url":"http://www.chexun.com/2020-06-29/111277647.html"},{"ctime":"2020-06-29 20:00","title":"奔驰V260高顶商务车懂你所需 以智能杰作致敬社会中坚力量","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_8ea84b2d1e294f5784e6452bb11d27a5.jpg","url":"http://www.chexun.com/2020-06-29/111277545.html"},{"ctime":"2020-06-29 19:00","title":"《韩系动向134》2020年最受韩国人关注的汽车是谁？","description":"车讯网","picUrl":"https://img1.chexun.com/chexunimg/erpimg/2020/0629/icon_default_c0a0c59e51de4b5da3b1f2848a0761aa.png","url":"http://www.chexun.com/2020-06-29/111277387.html"}]
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
         * ctime : 2020-06-30 14:00
         * title : 考斯特柯斯达11座点内现车 更多车型请关注
         * description : 车讯网
         * picUrl : https://img1.chexun.com/chexunimg/erpimg/2020/0630/icon_default_df270de3fded43278d8d3f30721bb053.jpg
         * url : http://www.chexun.com/2020-06-30/111279987.html
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
