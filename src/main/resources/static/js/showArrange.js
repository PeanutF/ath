$(document).ready(function () {
    $.get("/query/arrange/all",function (data) {
        for(var i = 0;i < data.length;i++){
            var tr = document.createElement('tr');
            var athNameTd = document.createElement('td');
            athNameTd.append(data[i].athName);
            var objNameTd = document.createElement('td');
            objNameTd.append(data[i].objName);
            var groupNTd = document.createElement('td');
            groupNTd.append(data[i].groupNumber);
            tr.appendChild(objNameTd);
            tr.appendChild(groupNTd);
            tr.appendChild(athNameTd);
            $("#tableForm").append(tr);
        }
    })
})