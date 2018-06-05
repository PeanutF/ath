$(document).ready(function () {
    $("#arrange").click(function () {
        var jsonObj = new Object();
        jsonObj.athNames = new Array();
        jsonObj.athNames[0] = $("#ath_name1").val();
        jsonObj.athNames[1] = $("#ath_name2").val();
        jsonObj.objectName = $("#object_name").val();
        jsonObj.refereeName = $("#referee_name").val();
        jsonObj.groupNumber = $("#group_number").val();

        $.ajax({
            url:"grade/mark",
            type:"POST",
            contentType:"application/json; charset=utf-8",
            data:JSON.stringify(jsonObj),
            dataType:"json",
            success:function () {
                alert("提交成功");
                window.location.reload();
            }
        });

        alert("stop");
    })
})