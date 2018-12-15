
window.onload=function (ev) {
    var btn= document.getElementsByClassName("to")[0].getElementsByTagName("button")[0];
    btn.onclick=function (ev) {
        $.ajax({
            url: "/shenmu_war_exploded/renyuan/logout",
            type: "get",
            success: function (data) {
                alert("安全退出成功！");
                console.log("aaaa");
                window,location.href="../../login.html";

            },
            error: function (data) {
                alert("安全退出成功！");
                console.log("aaaa");
                window,location.href="../../login.html";

            }

        });
    }
}

// history.go(1);

