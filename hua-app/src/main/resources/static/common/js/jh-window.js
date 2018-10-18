<!-- layerui -->
document.write('<script src="../layer/layer.js"></script>');

window.jhWindow = {};
//jhWindow初始化
jhWindow.params = {
    "type": 2, //弹出链接类型 默认2为html
    "shade": 0.1, //遮罩层透明度
    "width": "850px",
    "height": "500px", //弹出层宽高
    "title": "表单", //弹出层标题
    "content": null //这里content是一个html地址
};

jhWindow.window = function (content) {
    if (content != null) {
        jhWindow.params["content"] = content;
    }
    layer.open({
        type: jhWindow.params["type"],
        shade: jhWindow.params["shade"], //遮罩层透明度
        area: [jhWindow.params["width"], jhWindow.params["height"]], //弹出层宽高
        title: jhWindow.params["title"],//弹出层标题
        content: jhWindow.params["content"] //这里content是一个html地址
    });
};