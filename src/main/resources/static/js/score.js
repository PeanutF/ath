$(document).ready(function () {
    $("#scoreSubmit").click(function () {
        var jsonObj = new Object();
        jsonObj.refereeName = $("#refName").val();
        jsonObj.grades = new Array();
        jsonObj.grades[0] = new Object();
        jsonObj.grades[0].grade = $("#grade").val();
        jsonObj.athNames = new Array();
        jsonObj.athNames[0] = new Object();
        jsonObj.athNames[0].athName = $("#athName").val();

        $.ajax({
            url:"/grade/setGrade",
            type:"POST",
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(jsonObj),
            success:function () {
                alert("提交成功");
                window.location.reload();
            }
        })
    })
});