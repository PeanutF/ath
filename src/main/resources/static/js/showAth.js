$(document).ready(function () {
    var teamName = document.URL.split("teamName=")[1];
    var jsonObj = new Object();
    jsonObj.teamName = teamName;
    $.ajax({
        url: "/query/athlete/teamName",
        dataType: "json",
        type:"POST",
        contentType: "application/json;charset=utf8",
        data:JSON.stringify(jsonObj),
        success:function (data) {
            for(var i = 0;i < data.length; i++){
                var tr = document.createElement('tr');
                var nameTd = document.createElement('td');
                nameTd.append(data[i].name);
                var ageTd = document.createElement('td');
                ageTd.append(data[i].age);
                var cultureGradetd = document.createElement('td');
                cultureGradetd.append(data[i].cultureGrade);
                var idCardTd = document.createElement('td');
                idCardTd.append(data[i].idCard);
                var ageGroupTd = document.createElement('td');
                switch (data[i].ageGroupId) {
                    case 1:
                        ageGroupTd.append("male 7-8");
                        break;

                    case 2:
                        ageGroupTd.append("male 9-10");
                        break;

                    case 3:
                        ageGroupTd.append("male 10-11");
                        break;

                    case 4:
                        ageGroupTd.append("female 7-8");
                        break;

                    case 5:
                        ageGroupTd.append("female 9-10");
                        break;

                    case 6:
                        ageGroupTd.append("female 10-11");
                        break;
                }
                tr.appendChild(nameTd);
                tr.appendChild(ageTd);
                tr.appendChild(cultureGradetd);
                tr.appendChild(idCardTd);
                tr.appendChild(ageGroupTd);
                $("#tableAth").append(tr);
            }
        }
    })
})