package com.cyt.androidclient.bean;

import java.io.Serializable;
import java.util.List;

public class Beauty implements Serializable {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2020-06-27 11:00","title":"白嫩清纯美少女黎千千小清新写真[30P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2018/08/18/4764.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9175569-0-1.html"},{"ctime":"2020-06-27 11:00","title":"清新靓丽，有着漂亮的脸蛋，展现出自身的独特魅力[18P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2018/08/18/4515.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9175578-0-1.html"},{"ctime":"2020-06-25 22:00","title":"杨钰莹姐模仿者福遥","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/25/20/20200625205814511-6310692.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9175145-0-1.html"},{"ctime":"2020-06-24 17:00","title":"小姐姐的沙漠私拍第二期","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/24/16/20200624160846352-6411737.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9174733-0-1.html"},{"ctime":"2020-06-21 15:00","title":"[原创]充满风韵的气质小少妇出游[贴图]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/21/13/202006211350583711-5091369.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9172895-0-1.html"},{"ctime":"2020-06-20 11:00","title":"在美丽的户外尽展时尚靓丽的气质魅力，让人陶醉在其中[32P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/08/15/70_4936.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9172498-0-1.html"},{"ctime":"2020-06-20 11:00","title":"美女有着甜美靓丽的面容，白皙诱人的美肤，在展台上身穿不同的时尚美裙[19P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/08/15/70_4579.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9172513-0-1.html"},{"ctime":"2020-06-20 10:00","title":"妩媚动人的双眸和甜美迷人的笑容[26P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/01/10/70_4472.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9172475-0-1.html"},{"ctime":"2020-06-20 10:00","title":"美女身穿时尚服饰,让人看了离不开眼呢，欣赏她的火辣自拍照[20P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/01/10/70_4434.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9172488-0-1.html"},{"ctime":"2020-06-20 10:00","title":"独特可爱的迷人魅力，再加上一个浅浅的笑，迷得众人神魂颠倒[20P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/08/15/70_5288.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9172493-0-1.html"},{"ctime":"2020-06-19 23:00","title":"来一组漂亮小姐姐的沙漠私拍","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/19/22/202006192250033731-6411737.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9172364-0-1.html"},{"ctime":"2020-06-15 12:47","title":"靓女情怀-66","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/15/07/20200615072736631-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9169349-0-1.html"},{"ctime":"2020-06-15 12:47","title":"黄衫百褶裙小妹","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/15/07/202006150723457851-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9169346-0-1.html"},{"ctime":"2020-06-14 12:00","title":"甜美标准的瓜子脸，散发出时尚的迷人气质魅力[36P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/01/10/70_4820.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9169104-0-1.html"},{"ctime":"2020-06-14 11:00","title":"披肩的气质长发，一个浅浅的笑，迷得让人神魂颠倒[25P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/01/10/70_4875.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9169099-0-1.html"},{"ctime":"2020-06-14 11:00","title":"甜美标准的瓜子脸，散发出时尚的迷人气质魅力[48P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2017/01/10/70_4820.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9169104-0-1.html"},{"ctime":"2020-06-12 09:00","title":"玫瑰园de妹子","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/12/08/202006120805217691-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9168225-0-1.html"},{"ctime":"2020-06-12 09:00","title":"靓女情怀-65","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/12/08/202006120809239861-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9168226-0-1.html"},{"ctime":"2020-06-12 08:00","title":"靓女情怀-64","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/11/07/202006110755355121-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9167563-0-1.html"},{"ctime":"2020-06-12 08:00","title":"品摄初夏","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/11/07/20200611075329521-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9167562-0-1.html"},{"ctime":"2020-06-10 10:00","title":"靓女情怀-63","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/10/08/20200610085626881-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9166954-0-1.html"},{"ctime":"2020-06-09 10:00","title":"麦田里的女孩","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/09/09/202006090900343471-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9166264-0-1.html"},{"ctime":"2020-06-09 10:00","title":"靓女情怀-62","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/09/09/20200609090412961-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9166269-0-1.html"},{"ctime":"2020-06-09 09:00","title":"林海莉","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/08/07/202006080712401911-4747767.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9165605-0-1.html"},{"ctime":"2020-06-08 13:00","title":"美女白衬衫配黑色短裙,演绎妖娆身段，将优美曲线展现到极致，散发迷人魅力[7P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/08/12/8051b53ca88849f4329fb8067431c3d2-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9165831-0-1.html"},{"ctime":"2020-06-08 10:00","title":"形象照","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/08/09/20200608090058221-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9165648-0-1.html"},{"ctime":"2020-06-08 10:00","title":"靓女情怀-61","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/08/09/202006080902403121-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9165649-0-1.html"},{"ctime":"2020-06-07 19:00","title":"[推荐]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/07/16/202006071618117611-6402860.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9165464-0-1.html"},{"ctime":"2020-06-06 10:00","title":"气质模特金敏英养眼写真[50P]","description":"华声美女","picUrl":"http://ppic.meituba.com:84/uploads/allimg/2018/01/25/70_1104.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9165020-0-1.html"},{"ctime":"2020-06-05 09:00","title":"初夏的快乐","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/05/08/20200605080600411-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9164443-0-1.html"},{"ctime":"2020-06-05 09:00","title":"靓女情怀-60","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/05/08/20200605080907631-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9164444-0-1.html"},{"ctime":"2020-06-05 08:00","title":"浅色调人像","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/04/08/2020060408213231-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163729-0-1.html"},{"ctime":"2020-06-04 09:00","title":"靓女情怀-59","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/04/08/20200604082321791-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163732-0-1.html"},{"ctime":"2020-06-03 22:52","title":"美女模特靓丽迷人，有着甜美姣好的面容，在镜头中尽展女性特有的魅力[9P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/22/0f1a9de0249d4aa6e8348c355697ae09-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163639-0-1.html"},{"ctime":"2020-06-03 22:09","title":"高挑养眼模特长袖连衣裙魅力[10P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/21/01a11143cacefeccf4772ced7c1878f7-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163635-0-1.html"},{"ctime":"2020-06-03 21:59","title":"美女模特气质魅力高清写真[8P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/21/5c8ed2cf616711770c6fd59dd9169300-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163622-0-1.html"},{"ctime":"2020-06-03 21:59","title":"她有着俏丽的容貌，白皙水嫩嫩的肌肤，高挑的完美身材[30P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/21/e0a681ab98ea0b111e29ff97da44d9b9-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163626-0-1.html"},{"ctime":"2020-06-03 13:00","title":"我心依然","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/12/20200603122637791-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163258-0-1.html"},{"ctime":"2020-06-03 13:00","title":"靓女情怀-58","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/12/202006031229462321-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163259-0-1.html"},{"ctime":"2020-06-03 12:00","title":"尽展凹凸有致魔鬼般的火辣身材，再加上勾魂夺魄的眼神，简直令人窒息[28P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/10/9667c8e521bd08792cea2a0d44f3c7a2-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163186-0-1.html"},{"ctime":"2020-06-03 11:00","title":"车展美女模特林静莹气质写真[9P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/10/94cc2d7c0a5755fb4c1b59ee68ad4d74-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163126-0-1.html"},{"ctime":"2020-06-03 11:00","title":"身形娇小却饱满的美女，拥有一身完美的S型曲线的比例身材[21P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/03/10/37764e2814eb667d2cd1a01bf42bbb0e-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9163167-0-1.html"},{"ctime":"2020-06-03 09:00","title":"Shh","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/02/17/202006021731194871-4747767.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9162797-0-1.html"},{"ctime":"2020-06-02 21:00","title":"邻家女孩2p","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/02/20/202006022039493251-6396767.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9162903-0-1.html"},{"ctime":"2020-06-02 16:00","title":"巧","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/02/15/202006021524132981-4747767.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9162672-0-1.html"},{"ctime":"2020-06-02 10:00","title":"女人的风采","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/02/09/202006020936295141-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9162405-0-1.html"},{"ctime":"2020-06-02 10:00","title":"靓女情怀-57","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/02/09/202006020947302491-239867.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9162423-0-1.html"},{"ctime":"2020-06-01 14:00","title":"美女金美熙薰衣草花田清新写真[5P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-05/27/11/1cd792cc0b755aa44a07df265b4bf345-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9159012-0-1.html"},{"ctime":"2020-06-01 12:00","title":"她身材高桃，长相靓丽清纯，相信你一定会喜欢[50P]","description":"华声美女","picUrl":"http://image.hnol.net/c/2020-06/01/10/d7854be7327a20869a43456103735980-6072437.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9161848-0-1.html"},{"ctime":"2020-06-01 11:00","title":"[贴图]邻家美女初长成","description":"华声美女","picUrl":"https://p9.fijipic.xyz/bit20/upload/image/20200601/60101062087.jpg","url":"http://bbs.voc.com.cn/mm/meinv-9161794-0-1.html"}]
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
         * ctime : 2020-06-27 11:00
         * title : 白嫩清纯美少女黎千千小清新写真[30P]
         * description : 华声美女
         * picUrl : http://ppic.meituba.com:84/uploads/allimg/2018/08/18/4764.jpg
         * url : http://bbs.voc.com.cn/mm/meinv-9175569-0-1.html
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
