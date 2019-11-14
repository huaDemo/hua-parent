<!-- jQuery -->
document.write("<script type='text/javascript' src='../gentelella/vendors/jquery/dist/jquery.min.js'></script>");
<!-- Bootstrap -->
document.write("<script type='text/javascript' src='../gentelella/vendors/bootstrap/dist/js/bootstrap.min.js'></script>");
<!-- FastClick -->
document.write("<script type='text/javascript' src='../gentelella/vendors/fastclick/lib/fastclick.js'></script>");
<!-- NProgress -->
document.write("<script type='text/javascript' src='../gentelella/vendors/nprogress/nprogress.js'></script>");
<!-- jQuery Smart Wizard -->
document.write("<script type='text/javascript' src='../gentelella/vendors/jQuery-Smart-Wizard/js/jquery.smartWizard.js'></script>");
<!-- Custom Theme Scripts -->
document.write("<script type='text/javascript' src='../gentelella/build/js/custom.min.js'></script>");
<!-- validator -->
document.write("<script type='text/javascript' src='../gentelella/vendors/validator/validator.js'></script>");
<!-- iCheck -->
document.write('<script src="../gentelella/vendors/iCheck/icheck.min.js"></script>');
<!-- Datatables -->
document.write('<script src="../gentelella/vendors/datatables.net/js/jquery.dataTables.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>');
document.write('<script src="../gentelella/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>');
document.write('<script src="../gentelella/vendors/jszip/dist/jszip.min.js"></script>');
document.write('<script src="../gentelella/vendors/pdfmake/build/pdfmake.min.js"></script>');
document.write('<script src="../gentelella/vendors/pdfmake/build/vfs_fonts.js"></script>');
<!-- jh-window -->
document.write('<script src="../common/js/jh-window.js"></script>');
window.jh = {};
//jh初始化
(function () {
    /**
     * 表单ajax提交
     * @param form
     * @param url
     * @param func
     */
    jh.formAjax = function (form, url, func) {
        if (url) {
            url = jh.getRootPath() + url;
        } else {
            return;
        }
        if (validator.checkAll(form)) {
            $.ajax({
                    url: url,
                    data: form.serialize(),
                    contentType: 'application/x-www-form-urlencoded',//'application/json',数据提交类型
                    type: "POST",
                    dataType: 'json',
                    async: false, //异步加载(默认是false)
                    success: function (data) {
                        if (typeof(func) === "function") {
                            try {
                                func(data)
                            } catch (err) {

                            }
                        }
                    },
                    error: function (data) {
                        alert("出错了！！:" + data.msg);
                    }
                }
            );
        }
    };

    /**
     * ajax提交
     * @param url
     * @param data
     * @param func
     */
    jh.ajax = function (url, data, func) {
        if (url) {
            url = jh.getRootPath() + url;
        } else {
            return;
        }
        $.ajax({
                url: url,
                data: data,
                contentType: 'application/x-www-form-urlencoded',//'application/json',数据提交类型
                type: "POST",
                dataType: 'json',
                async: true, //异步加载(默认是false)
                success: function (data) {
                    if (typeof(func) === "function") {
                        try {
                            func(data)
                        } catch (err) {

                        }
                    }
                },
                error: function (data) {
                    alert("出错了！！:" + data.msg);
                }
            }
        );
    };
    /**
     * 获取相对路径
     * @returns {string}
     */
    jh.getRootPath = function () {
        //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
        var curWwwPath = window.document.location.href;
        //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
        var pathName = window.document.location.pathname;
        var pos = curWwwPath.indexOf(pathName);
        //获取主机地址，如： http://localhost:8083
        var localhostPaht = curWwwPath.substring(0, pos);
        //获取带"/"的项目名，如：/uimcardprj
        //var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
        return (localhostPaht/* + projectName*/);
    };

    /**
     * 加载表格
     * @param data
     */
    jh.loadTable = function (data, content, id) {
        var num = true;
        for (var key in data) {
            var _html = "";
            if (num) {
                _html += '<tr class="even pointer">';
                num = false;
            } else {
                _html += '<tr class="odd pointer">';
                num = true;
            }
            _html += '<td class="a-center ">';
            _html += '<input type="checkbox" class="flat" name="table_records">';
            _html += '</td>';
            var flag = true;
            for (var j in data[key]) {
                if (flag) {
                    var id = data[key]["id"];
                    _html += '<td class=" "><a onclick="jhWindow.window(&quot;' + content + '?' + id + '&quot;)">' + data[key][j] + '</a></td>';
                    flag = false;
                } else {
                    _html += '<td class=" ">' + data[key][j] + '</td>';
                }
            }
            _html += '</tr>';
            $("#tableBody").append(_html);
        }
    };

    /**
     * 加载分页
     * @param data
     */
    jh.loadPage = function (data) {
        var currentPage = parseInt(data.currentPage);
        var totalPage = parseInt(data.totalPage);
        var _html = "";
        _html += '<li class="paginate_button previous disabled" id="datatable-checkbox_previous"><a onclick="goPage(&quot;' + (currentPage - 1) + '&quot;)"  aria-controls="datatable-checkbox" data-dt-idx="0" tabindex="0">Previous</a></li>';
        for (var i = 0; i < totalPage; i++) {
            if (i >= 5) {
                _html += '<li class="paginate_button active"><a aria-controls="datatable-checkbox" data-dt-idx="1" tabindex="0">...</a></li>';
                break;
            }
            if (i === 0) {
                _html += '<li class="paginate_button active"><a onclick="goPage(&quot;' + (currentPage + i) + '&quot;)" aria-controls="datatable-checkbox" data-dt-idx="1" tabindex="0">' + (currentPage + i) + '</a></li>';
            } else {
                _html += '<li class="paginate_button"><a onclick="goPage(&quot;' + (currentPage + i) + '&quot;)" aria-controls="datatable-checkbox" data-dt-idx="1" tabindex="0">' + (currentPage + i) + '</a></li>';
            }
        }
        _html += '<li class="paginate_button next" id="datatable-checkbox_next"><a onclick="goPage(&quot;' + (currentPage + 1) + '&quot;)" aria-controls="datatable-checkbox" data-dt-idx="7" tabindex="0">Next</a></li>';
        $("#page").html(_html);
    };

    /**
     * 提交表格
     * @param url
     * @param data
     */
    jh.submitTable = function (url, data, content, id) {
        jh.ajax(url, data, function (data) {
            if (data != null && data.code === 0) {
                jh.loadPage(data.data);//加载分页
                jh.loadTable(data.data.data, content, id);//加载表格
            } else {
                alert(data.message);
            }
        });
    };

    /**
     * 获取url?号后面的参数
     * @returns {Object}
     */
    jh.getUrlParams = function () {
        var url = location.search; //获取url中"?"符后的字串
        var theRequest = new Object();
        if (url.indexOf("?") != -1) {
            var str = url.substr(1);
            strs = str.split("&");
            for (var i = 0; i < strs.length; i++) {
                theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
            }
        }
        return theRequest;
    };

    /**
     * 给表单赋值
     * @param jsonValue
     * @param id
     */
    jh.setForm = function (jsonValue, id) {
        var obj = $("#" + id + "");
        $.each(jsonValue, function (name, ival) {
            var $oinput = obj.find("input[name=" + name + "]");
            if ($oinput.attr("type") == "radio" || $oinput.attr("type") == "checkbox") {
                $oinput.each(function () {
                    if (Object.prototype.toString.apply(ival) == '[object Array]') {//是复选框，并且是数组
                        for (var i = 0; i < ival.length; i++) {
                            if ($("#" + id + "").val() == ival[i])
                                $("#" + id + "").attr("checked", "checked");
                        }
                    } else {
                        if ($("#" + id + "").val() == ival)
                            $("#" + id + "").attr("checked", "checked");
                    }
                });
            } else if ($oinput.attr("type") == "textarea") {//多行文本框
                obj.find("[name=" + name + "]").html(ival);
            } else {
                obj.find("[name=" + name + "]").val(ival);
            }
        });
    };

    /**
     * 表单修改
     * @param form
     * @param url
     */
    jh.formUpdate = function (form, url) {
        jh.formAjax(form, url, function (data) {
            if (data.code === 0) {
                alert("修改成功！");
                window.location.reload();
            } else {
                alert(data.message);
            }
        });
    };

    /**
     * 表单删除
     * @param form
     * @param url
     */
    jh.formDelete = function (form, url) {
        var data = {};
        var $oinput = form.find("input[name='id']");
        console.info($oinput);
        data.id = $oinput.val();
        jh.ajax(url, data, function (data) {
            if (data.code === 0) {
                alert("删除成功！");
                window.parent.location.reload();
            } else {
                alert(data.message);
            }
        });
    }

    /**
     * 新增数据
     */
    jh.save = function(){
        jhWindow.window();
    }

})();
//jh初始化结束

