package com.hua.huanetty.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: hua
 * @date: 2019/3/18 10:56
 */
@Component
public class ChildChannelHandler extends ChannelInitializer<SocketChannel> {

    @Resource
    private DiscardServerHandler discardServerHandler;

    public void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(discardServerHandler);
    }

}
