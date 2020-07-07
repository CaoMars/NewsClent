package com.cyt.androidclient.net;

import com.cyt.androidclient.bean.Apple;
import com.cyt.androidclient.bean.Beauty;
import com.cyt.androidclient.bean.Car;
import com.cyt.androidclient.bean.Finance;
import com.cyt.androidclient.bean.Militery;
import com.cyt.androidclient.bean.NationNews;
import com.cyt.androidclient.bean.Nba;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 新闻接口
 */
public interface ApiService {
    //国内新闻
    @GET("bulletin/index")
    Observable<NationNews> getNationNews(@Query("key") String name);
    //财经新闻
    @GET("caijing/index")
    Observable<Finance> getFinanceNews(@Query("key") String word);
    //美女图片
    @GET("meinv/index")
    Observable<Beauty> getBeautyPic(@Query("key") String name, @Query("num") String num);
    //苹果新闻
    @GET("apple/index")
    Observable<Apple> getAppleNews(@Query("key") String name,@Query("num") String num);
    //军事新闻
    @GET("military/index")
    Observable<Militery> getMiliteryNews(@Query("key") String name,@Query("num") String num);
    //汽车新闻
    @GET("auto/index")
    Observable<Car> getCarNews(@Query("key") String name, @Query("num") String num);
    //NBA新闻
    @GET("nba/index")
    Observable<Nba> getNbaNews(@Query("key") String name, @Query("num") String num);
}
