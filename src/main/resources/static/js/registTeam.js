$(document).ready(function () {
    $("#registTeamSub").click(function () {
        var team = new Object();
        team.teamName = $("#team_name").val();
        team.leaderName = $("#leader_name").val();
        team.leaderPhoneN = $("#leader_phoneN").val();
        team.leaderIdCard = $("#leader_idCard").val();
        team.doctorName = $("#doctor_name").val();
        team.doctorPhoneN = $("#doctor_phoneN").val();
        team.doctorIdCard = $("#doctor_idCard").val();

        var athName1 = $("#ath_name").val();
        var athAgeGroup1 = $('[name=ageBox]:checkbox:checked').id;
        var athIdCard1 = $("#ath_idCard").val();
        var athCultureGrade1 = $("#ath_culture_grade").val();
        var athAge1 = $("#ath_age").val();

        var athlete = new Object();
        athlete.athName = athName1;
        athlete.athAgeGroup = athAgeGroup1;
        athlete.athIdCard = athIdCard1;
        athlete.athCultureGrade = athCultureGrade1;
        athlete.athAge = athAge1;

        var athletes = [];
        athletes[0] = athlete;

        var jsonObj = new Object();
        jsonObj.team = team;
        jsonObj.members = athletes;

        var jsonData = JSON.stringify(jsonObj);
        console.log(jsonData);

        $.ajax({
            url:"add/team",
            type:"POST",
            contentType:"application/json; charset=utf-8",
            data:jsonData,
            dataType:"json",
            success:function () {
                alert("success");
            }
        });
        alert("stop");
        //这里的post地址是本地的，记得后面修改
    })
})