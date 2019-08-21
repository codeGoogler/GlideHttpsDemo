package com.fffbom.glidehttpsdemo;

public interface See {
    /**
     * OkHttpStreamFetcher/OkHttpUrlLoader/MyAppGlideModel
     * 代码来自Glide的官方项目中
     * 其中Fetcher 代码不用变
     * OkHttpUrlLoader 把client替换成自己写的UnsafeOkHttpClient类配置的okhttpClient,
     private static Call.Factory getInternalClient() {
     if (internalClient == null) {
     synchronized (Factory.class) {
     if (internalClient == null) {
     internalClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();
     }
     }
     }
     return internalClient;
     }
     UnsafeOkHttpClient 主要关闭okhttp中各种在证书言验证
     最后需要再 manifests 中注册MyAppGlideModel,代码格式参照 manifests
     */
}
