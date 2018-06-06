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
        team.teamUsername = $("#team_username").val();
        team.teamPassword = $("#team_password").val();

        var athName1 = $("#ath_name").val();
        var athAgeGroup1 = $("input[name='ageBox']:checked").val();
        var athIdCard1 = $("#ath_idCard").val();
        var athCultureGrade1 = $("#ath_culture_grade").val();
        var athAge1 = $("#ath_age").val();

        var athlete = new Object();
        athlete.name = athName1;
        athlete.ageGroupId = athAgeGroup1;
        athlete.idCard = athIdCard1;
        athlete.cultureGrade = athCultureGrade1;
        athlete.age = athAge1;

        var athletes = [];
        athletes[0] = athlete;
        athletes[1] = new Object();
        athletes[1].name = $("#ath_name2").val();
        athletes[1].ageGroupId = $("input[name='ageBox2']:checked").val();
        athletes[1].cultureGrade = $("#ath_culture_grade2").val();
        athletes[1].idCard = $("#ath_idCard2").val();
        athletes[1].age = $("#ath_age2").val();

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
                alert("提交成功");
                window.location.reload();
            }
        });
        //这里的post地址是本地的，记得后面修改
    })
})