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

window.jh = {};
//jh初始化
(function () {
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
    };

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

})();
//jh初始化结束

