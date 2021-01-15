package com.gcard.flutterboost.init;

import android.app.Application;

import com.gcard.flutterboost.PageRouter;
import com.idlefish.flutterboost.Utils;
import com.idlefish.flutterboost.init.FlutterInit;

/**
 * @author guobihai
 * 创建日期：2021/1/7
 * desc：初始化flutter的引擎
 */
public class FlutterEngineInit {

    public static void init(Application application) {
        //初始化flutter的引擎
        FlutterInit.initFlutterBoost(application, (context, url, urlParams, requestCode, exts) -> {
            //解析 flutter 调用原生界面路由跳转
            String assembleUrl = Utils.assembleUrl(url, urlParams);
            PageRouter.openPageByUrl(context, assembleUrl, urlParams);
        });
    }
}
