$(document).ready(function () {
    $.get("/query/team/all",function (data) {
        for (var i = 0; i < data.length; i++) {
            var tr = document.createElement('tr');
            var teamNameTd = document.createElement('td');
            teamNameTd.append(data[i].teamName);
            tr.append(teamNameTd);
            //leaderName	leaderPhoneNumber	leaderIdCard	doctorName	doctorPhoneNumber	doctorIdCard
            var leaderNameTd = document.createElement('td');
            leaderNameTd.append(data[i].leaderName);
            tr.append(leaderNameTd);

            var leaderPhoneNumberTd = document.createElement('td');
            leaderPhoneNumberTd.append(data[i].leaderPhoneN);
            tr.append(leaderPhoneNumberTd);

            var leaderIdCardTd = document.createElement('td');
            leaderIdCardTd.append(data[i].leaderIdCard);
            tr.append(leaderIdCardTd);

            var doctorNameTd = document.createElement('td');
            doctorNameTd.append(data[i].doctorName);
            tr.append(doctorNameTd);

            var doctorPhoneNumberTd = document.createElement('td');
            doctorPhoneNumberTd.append(data[i].doctorPhoneN);
            tr.append(doctorPhoneNumberTd);

            var doctorIdCardTd = document.createElement('td');
            doctorIdCardTd.append(data[i].doctorIdCard);
            tr.append(doctorIdCardTd);


            var operaTd = document.createElement('td');
            var operaA = document.createElement('a');
            operaA.text = "查看";
            operaA.href = "showAth.html?teamName=" + data[i].teamName;
            operaTd.append(operaA);
            tr.append(operaTd);

            $("#teamTable").append(tr);
        }
    })
});

$(document).ready(function () {
    $("#findTeam").click(function () {
        var jsonObj = new Object();
        jsonObj.teamName = $("#teamName").val();
        $.ajax({
            url:"/query/team/name",
            type:"POST",
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(jsonObj),
            dataType:"json",
            success:function (data) {
                $("#teamTable").empty();
                if(data.teamName == undefined){
                    alert("无法找到");
                    window.location.reload();
                }
                    var tr = document.createElement('tr');
                    var teamNameTd = document.createElement('td');
                    teamNameTd.append(data.teamName);
                    tr.append(teamNameTd);
                    //leaderName	leaderPhoneNumber	leaderIdCard	doctorName	doctorPhoneNumber	doctorIdCard
                    var leaderNameTd = document.createElement('td');
                    leaderNameTd.append(data.leaderName);
                    tr.append(leaderNameTd);

                    var leaderPhoneNumberTd = document.createElement('td');
                    leaderPhoneNumberTd.append(data.leaderPhoneN);
                    tr.append(leaderPhoneNumberTd);

                    var leaderIdCardTd = document.createElement('td');
                    leaderIdCardTd.append(data.leaderIdCard);
                    tr.append(leaderIdCardTd);

                    var doctorNameTd = document.createElement('td');
                    doctorNameTd.append(data.doctorName);
                    tr.append(doctorNameTd);

                    var doctorPhoneNumberTd = document.createElement('td');
                    doctorPhoneNumberTd.append(data.doctorPhoneN);
                    tr.append(doctorPhoneNumberTd);

                    var doctorIdCardTd = document.createElement('td');
                    doctorIdCardTd.append(data.doctorIdCard);
                    tr.append(doctorIdCardTd);

                    var operaTd = document.createElement('td');
                    var operaA = document.createElement('a');
                    operaA.text = "查看";
                    operaA.href = "showAth.html?teamName=" + data[i].teamName;
                    operaTd.append(operaA);
                    tr.append(operaTd);

                    $("#teamTable").append(tr);
                }
        })
    })
})