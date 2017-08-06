$(document).ready(function(){
	console.log(stateEnum[0].$name.code);
	console.log(stateEnum[1]);
	/*$.each(stateEnum, function(key, val){
		console.log(key +"  " + val);
	});*/
	$("#country").change(function() {
		console.log(stateEnum[0].$name.code);
		console.log($(this).val());
		 sendAjaxRequest();
	});
});

var stateList = [];
function sendAjaxRequest(){
	var country = $("#country").val();
	$.get( "/states?country=" + country, function( data ) {
	$("#stateDropDown").empty();
	   /* data.forEach(function(item, i) {
	    	var option = ("<option value = " + item + ">" + item+  "</option>");
	    	$("#stateDropDown").append(option);
	    });*/
		$("#stateDropDown").append(data);
	});
	 
};


/*var SizeEnum = {
		//var mySize = SizeEnum.MEDIUM;
		//var myCode = SizeEnum.properties[mySize].code; // myCode == "M"
		  AL: 1,
		  NY: 2,
		  NJ: 3,
		  MY: 4,
		  properties: {
		    1: {name: "Alaska", value: 1, code: "USA"},
		    2: {name: "New York", value: 2, code: "USA"},
		    3: {name: "New Jersey", value: 3, code: "USA"},
		    4: {name: "Miami", value: 4, code: "CAN"}
		  }
		};
*/