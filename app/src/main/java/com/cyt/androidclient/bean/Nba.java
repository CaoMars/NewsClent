package com.cyt.androidclient.bean;

import java.io.Serializable;
import java.util.List;

public class Nba implements Serializable {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2020-06-30 00:00","title":"詹皇10年前首选是纽约 尼克斯毫无准备搞砸了","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200630/14d06a0738b395a9502ac3df8dca585b.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200630/48652.html"},{"ctime":"2020-06-30 00:00","title":"辽宁男篮大胜青岛男篮 这场比赛的胜利是什么原因?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200630/cbc1895a3bdf2be68002b144cf7bbcf3.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200630/48628.html"},{"ctime":"2020-06-28 00:00","title":"辽宁男篮决定更换主教练 现任主教练郭士强下课","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200628/f7356e0d3418f648478acf58d2b92d9f.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200628/48449.html"},{"ctime":"2020-06-22 00:00","title":"辽宁男篮启用梅奥 再也不是全华班了?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200622/8f856aefab23600f279470ba62b2ae0d.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200622/48216.html"},{"ctime":"2020-06-18 00:00","title":"第一詹吹帕金斯又炮轰欧文 杜兰特发推反击为队友出头","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200618/354ce1604dcdd103efaf2cdd502daded.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200618/47947.html"},{"ctime":"2020-06-17 00:00","title":"詹姆斯签名卡售价将破世界纪录 预计卖出100万美元","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200617/a13c75fe84afe1ca116d5492f5445485.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200617/47851.html"},{"ctime":"2020-06-16 00:00","title":"库里季后赛不行?命中率超过乔丹，半场33分!","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200616/e79011a04ed62198362e87e8efd08655.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200616/47757.html"},{"ctime":"2020-06-15 00:00","title":"下一个进NBA的中国球员是17岁高中生?ESPN评分超周琦王哲林","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200615/8ebb8e267f2fcb4950352a6304223b05.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200615/47677.html"},{"ctime":"2020-06-12 00:00","title":"姚明十大经典比赛战役 看看姚明当年在NBA的统治力有多强","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200612/e4f7dd0e30e70d8adf949daaa826f7e4.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200612/47554.html"},{"ctime":"2020-06-10 00:00","title":"曝湖人跟篮网抢人 多次试图得到东部第一后卫","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200610/60a247796f59fbebc17f911ff9d68112.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200610/47340.html"},{"ctime":"2020-06-09 00:00","title":"瓦妮莎起诉直升机公司! 文件曝光要求索赔数亿美元","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200609/88fa4d2b8b6075748a5636b82f8fb40c.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200609/47224.html"},{"ctime":"2020-06-05 00:00","title":"广东独臂篮球少年被库里称赞 独臂少年回应库里：我超喜欢你","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200605/a80d945686ffa1f9b2a6a51a1e2853d3.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200605/46907.html"},{"ctime":"2020-06-05 00:00","title":"2020NBA什么时候恢复比赛 NBA8月1日复赛时间确定","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200605/903ecb0c972b95a9d1a84423cbd3fe9a.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200605/46915.html"},{"ctime":"2020-05-29 00:00","title":"赚了2亿美元的前NBA球星艾弗森现在连汉堡都买不起，他是怎么做到的?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200529/5fe3bf526e0a6c02170c87ab52d92e65.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200529/46515.html"},{"ctime":"2020-05-28 00:00","title":"詹姆斯爆粗、库里为被暴力执法致死黑人发声：他是被谋杀的","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200528/455e38b8dc61835c0584b821f94c676b.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200528/46402.html"},{"ctime":"2020-05-28 00:00","title":"詹皇没拿过DPOY表示防守比乔丹差吗?进阶数据给答案","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200528/9ea1cb23f858f59cf243c640d957615a.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200528/46398.html"},{"ctime":"2020-05-27 00:00","title":"NBA季后赛史上极具争议的5场比赛 乔丹科比均在其中","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200527/3ac87a06356be84470bcca0eb5f98338.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200527/46332.html"},{"ctime":"2020-05-26 00:00","title":"NBA最狠人妻杰姬!捏蛋判断是否出轨，克里斯蒂曾差点被她害死","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200526/9b549ca0ea0e3be50c4ce1d5b3bfa825.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200526/46231.html"},{"ctime":"2020-05-25 00:00","title":"2020篮球名人堂什么时候开始?今年的名人堂仪式或将推迟到明年","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200525/22904164f50267ef1c602da80ff3d9db.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200525/46150.html"},{"ctime":"2020-05-25 00:00","title":"2020NBA什么时候恢复比赛?疑似NBA复赛日程曝光","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200525/33bce35faaeed1ef6b50164a8ac4a937.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200525/46126.html"},{"ctime":"2020-05-23 00:00","title":"NBA众球星悼念斯隆:定义无私，想到爵士就想到他","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200523/3b3288065e90b241da4af0d466cc04ab.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200523/46050.html"},{"ctime":"2020-05-18 00:00","title":"黄蜂小将布里奇斯邀请老板乔丹单挑 乔丹会接受他的挑战吗?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200518/90a654b06282c375e41025cc7637c328.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200518/45627.html"},{"ctime":"2020-05-16 00:00","title":"科比遇难事故完整尸检报告出炉，飞行员体内未发现酒精与药物","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200516/9e35526e10f0d07ad1944afa6a57fd77.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200516/45588.html"},{"ctime":"2020-05-15 00:00","title":"NBA2K模拟总决赛结果出炉：湖人1-3落后雄鹿连赢3场逆转夺冠","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200515/872747216934697beca6e7090ff399df.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200515/45503.html"},{"ctime":"2020-05-15 00:00","title":"NBA球员明天降薪25% 只有詹姆斯等6人不降薪","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200515/471badef9a63254a85f39e911436b186.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200515/45504.html"},{"ctime":"2020-05-09 00:00","title":"谁才是NBA历史第一人?奥胖：乔丹才是GOAT","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200509/89df02fae8921b3218a7a1346c663acb.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200509/45090.html"},{"ctime":"2020-05-07 00:00","title":"詹姆斯为什么离开骑士?勒夫谈詹姆斯离队原因","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200507/cd50daa2706bed87814ccff725df1032.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200507/44871.html"},{"ctime":"2020-05-04 00:00","title":"詹姆斯被曝出轨是真的吗?詹姆斯被曝出轨23岁嫩模","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200504/18ce2b466d525e54e63496035baf3f4a.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200504/44698.html"},{"ctime":"2020-04-30 00:00","title":"林书豪和安东尼有何恩怨?曝林书豪纽约往事：曾被安东尼排挤","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200430/62c49adfaef9fb80999f15dc00e7076c.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200430/44602.html"},{"ctime":"2020-04-29 00:00","title":"曾被誉为亚洲第一控卫的郭艾伦为什么没有入选NBA?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200429/8305a0f9dd150a304e7edb69c6bb3348.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200429/44471.html"},{"ctime":"2020-04-26 00:00","title":"如果杜兰特和詹姆斯在80年代 你们认为谁才是最强球员","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200426/e649d0cb0bcc224420f191948ec7f21c.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200426/44147.html"},{"ctime":"2020-04-24 00:00","title":"詹姆斯和乔丹谁更出色?专家解释：詹皇总决赛对手都是冠军","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200424/fb7f9590b9526d61b362f3b56b29e5df.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200424/44028.html"},{"ctime":"2020-04-23 00:00","title":"NBA球员降薪25%达成一致 所有球员的年薪被分为24份","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200423/fe89dae65af55326815d4663d1ec80e8.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200423/43890.html"},{"ctime":"2020-04-22 00:00","title":"追梦格林批评乔丹是怎么回事?格林称3600万年薪的林丹不该指责皮蓬","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200422/a5c38e9091c12bcc256b3b8ef410d7a1.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200422/43794.html"},{"ctime":"2020-04-17 00:00","title":"NBA勇士队老板拍卖2015年总冠军戒指 拍卖所得将用于支援抗疫","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200417/ba725db7123ba0bf06dacf9f5ed36c22.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200417/43448.html"},{"ctime":"2020-04-16 00:00","title":"尼克杨与陌生男子牵手!难道他也出柜了吗?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200416/0a85c884a54c62f43c40010266df87e2.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200416/43347.html"},{"ctime":"2020-04-15 00:00","title":"CBA高管都集体降薪了，姚明却不降薪是为什么?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200415/49725dcdc4e7d66163ef807f94c9a39c.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200415/43227.html"},{"ctime":"2020-04-14 00:00","title":"拉文向初恋女友求婚成功 两人在高中时期就开始相恋","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200414/c3cf056038a12aac49bbf72a9d480601.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200414/43103.html"},{"ctime":"2020-04-13 00:00","title":"NBA什么时候恢复比赛?文霍斯特：NBA复赛需要25天恢复期","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200413/c4b1482aed9a488daca8adc29ddcba80.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200413/42985.html"},{"ctime":"2020-04-10 00:00","title":"NBA名嘴杰伦罗斯称詹姆斯今年如果不夺冠就再也拿不到总冠军了!","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200410/d65ac6d2c9802aab3328b291dc6814b4.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200410/42863.html"},{"ctime":"2020-04-09 00:00","title":"NBA现在谁最厉害?塔图姆谈现役NBA最佳阵容：詹姆斯仍是头号球员","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200409/820729744c3e99feef1dbc9b9a03caf0.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200409/42713.html"},{"ctime":"2020-03-31 00:00","title":"NBA开始讨论复赛方案，或效仿CBA集中在安全场地进行比赛","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200331/3969d50afb0543777bb0bfe5932dc9a4.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200331/41959.html"},{"ctime":"2020-03-27 00:00","title":"湖人主场或改造成方舱医院 美国疫情暂没有控制住的迹象","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200327/e3b8a72bbf84c9b9800792ff6957e24c.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200327/41791.html"},{"ctime":"2020-03-26 00:00","title":"快船4亿美元收购新球馆  该球馆原属于詹姆斯-多兰","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200326/55a8795729263543b4c2d4afe257de41.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200326/41691.html"},{"ctime":"2020-03-21 00:00","title":"前FIBA秘书长斯坦科维奇去世，他用一生为篮球带来前所未有的辉煌","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200321/f383b321190f0d051457ccffbefb15b6.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200321/41445.html"},{"ctime":"2020-03-20 00:00","title":"NBA多队现确诊病例，又有4支球队沦陷了","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200320/44da5d4c8263de2c943630c6f967fa71.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200320/41385.html"},{"ctime":"2020-03-19 00:00","title":"网曝有人挖掘科比墓地，警方赶到时草皮已经被掘开","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200319/7294da61f2cc5172c63eeab98283b158.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200319/41373.html"},{"ctime":"2020-03-18 00:00","title":"杜兰特感染新冠病毒，NBA确诊人数已经达到7例","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200318/54e7fb7e6cd911e4228c9eb6650a8554.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200318/41227.html"},{"ctime":"2020-03-13 00:00","title":"FIBA暂停所有赛事是什么情况?NBA也停赛了吗?","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200313/f1494d6c29b7fa83f40cda161d7812b6.jpg","url":"https://www.baizhan.net/tiyu/lanqiu/20200313/41043.html"},{"ctime":"2020-03-13 00:00","title":"爵士后卫米切尔确诊新冠，NBA宣布第19-20赛季暂停","description":"百战NBA","picUrl":"https://img.baizhan.net/d/file/20200313/7f79cc2834412efae5c4664ad7d24eff.png","url":"https://www.baizhan.net/tiyu/lanqiu/20200313/41042.html"}]
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
         * ctime : 2020-06-30 00:00
         * title : 詹皇10年前首选是纽约 尼克斯毫无准备搞砸了
         * description : 百战NBA
         * picUrl : https://img.baizhan.net/d/file/20200630/14d06a0738b395a9502ac3df8dca585b.jpg
         * url : https://www.baizhan.net/tiyu/lanqiu/20200630/48652.html
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
