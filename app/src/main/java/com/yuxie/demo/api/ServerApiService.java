package com.yuxie.demo.api;

import com.apkupdate.ApkUpdateParamSet;
import com.apkupdate.widget.ApkVersionModel;
import com.baselib.basebean.BaseRespose;
import com.yuxie.demo.bean.VideoListBean;

import java.util.List;
import java.util.Map;

import retrofit2.adapter.rxjava.Result;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by luo on 2018/3/3.
 */
public interface ServerApiService {
    @FormUrlEncoded
    @POST("")
    Observable<String> getUrl(@Url String url, @FieldMap Map<String, String> options);

    @GET("")
    Observable<Result<String>> getSmsApi(@Url String url);

    @GET("")
    Observable<String> getUrl(@Url String url);

    /**
     * 升级app https://raw.githubusercontent.com/yuxie2025/douyin/douyin/download/updateApp.json
     */
    @GET("/yuxie2025/douyin/douyin/download/updateApp.json")
    Observable<BaseRespose<ApkVersionModel>>
    updateApp();

    /**
     * 热门视频 列表
     */
    @GET("/api/videoList.json")
    Observable<BaseRespose<List<VideoListBean>>>
    videoList();

}
