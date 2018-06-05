$(document).ready(function () {
    $.get("/query/team/all",function (data) {

        for(var i = 0;i < data.length; i++){
            var tr = document.createElement('tr');
            var idTd = document.createElement('td');
            idTd.append(data[i].id);
            tr.append(idTd);
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

            $("#teamTable").append(tr);
        }
    },

    $("#findTeam").click(function () {
        var jsonObj = new Object();
        jsonObj.teamName = $("#teamName").val();
        $.ajax({
            url:"/team/name",
            type:"POST",
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(jsonObj),
            success:function (data) {
                $("#teamTable").innerText="";
                for(var i = 0;i < data.length; i++){
                    var tr = document.createElement('tr');
                    var idTd = document.createElement('td');
                    idTd.append(data[i].id);
                    tr.append(idTd);
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

                    $("#teamTable").append(tr);
                }
            }
        })
    })
    )


})