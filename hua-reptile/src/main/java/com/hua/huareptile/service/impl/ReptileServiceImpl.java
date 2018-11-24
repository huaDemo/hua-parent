package com.hua.huareptile.service.impl;

import com.hua.huacommon.Util.PubTools;
import com.hua.huareptile.service.ReptileService;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: hua
 * @date: 2018/11/24 19:33
 */
@Service
public class ReptileServiceImpl implements ReptileService {

    @Override
    public Map<String, Integer> reptileZhiHu() throws Exception {
        int java = 0;
        int python = 0;
        int csharp = 0;
        int go = 0;
        int csum = 0;
        int php = 0;
        Map<String, Integer> map = new HashMap<String, Integer>(16);
        for (int i = 5; i <= 400; i += 10) {
            System.out.println("limit:" + i);
            //创建httpclient实例
            CloseableHttpClient httpclient = HttpClients.createDefault();
            // 创建httpget实例
            String url = "https://www.zhihu.com/api/v4/search_v3?t=general&q=%E7%BC%96%E7%A8%8B%E8%AF%AD%E8%A8%80%E6%8E%92%E5%90%8D&correction=1&offset=" + i + "&limit=10&show_all_topics=0&search_hash_id=92de0ccfb9a673bb72c0ac337432d436";
            HttpGet httpget = new HttpGet(url);
            //HttpGet httpget = new HttpGet("https://www.zhihu.com/api/v4/search_v3");
            //设置请求的报文头部的编码
            //httpget.addHeader("Content-Type","application/json;charset=UTF-8");
            //设置期望服务端返回的编码
            //httpget.addHeader("Accept", "application/json;charset=GBK");
            //模拟游览器信息
            httpget.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36");
            // 执行get请求
            CloseableHttpResponse response = httpclient.execute(httpget);
            Header[] headers = response.getHeaders("Content-Encoding");
            // 获取返回实体
            String responseString = null;
            responseString = EntityUtils.toString(response.getEntity());
            //将unicode转换为中文
            String str = PubTools.unicodeToString(responseString);
            //统计字符出现次数
            java += PubTools.countStr(str, "JAVA");
            python += PubTools.countStr(str, "PYTHON");
            go += PubTools.countStr(str, "GO");
            csum += PubTools.countStr(str, "C++");
            csharp += PubTools.countStr(str, "C#");
            php += PubTools.countStr(str, "PHP");
            //关闭
            response.close();
            //关闭
            httpclient.close();
        }
        //给集合赋值
        map.put("JAVA", java);
        map.put("PYTHON", python);
        map.put("GO", go);
        map.put("C++", csum);
        map.put("C#", csharp);
        map.put("PHP", php);
        return map;
    }

}
