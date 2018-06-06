$(document).ready(function () {
    $.get("/query/grade/all",function (data) {
        for(var i = 0; i < data.length; i++){
            var tr = document.createElement('tr');
            var athNameTd = document.createElement('td');
            athNameTd.append(data[i].athName);
            var gradeTd = document.createElement('td');
            gradeTd.append(data[i].grade);
            var refereeNameTd = document.createElement('td');
            refereeNameTd.append(data[i].refereeName);
            var objectNTd = document.createElement('td');
            objectNTd.append(data[i].objName);
            tr.appendChild(athNameTd);
            tr.appendChild(gradeTd);
            tr.appendChild(refereeNameTd);
            tr.appendChild(objectNTd);
            $("#gradeTable").append(tr);
        }
    })
})