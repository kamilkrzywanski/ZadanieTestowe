$( document ).ready(function() {

	// GET REQUEST
	$("#getUni").click(function(event){
		event.preventDefault();
		ajaxGetUni();


	});

	$("#getDub").click(function(event){
    		event.preventDefault();
    		ajaxGetDub();


    	});

	// Funkcja get dla Unikalnych wpisów
	function ajaxGetUni(){
		$.ajax({
			type : "GET",
			url : "http://"+window.location.host+ "/getUniAjax/" +document.getElementById("kolumna").value,
			success: function(result){
				if(result.status == "Done"){
					$('#getResultDiv ul').empty();
					var custList = "";
					$.each(result.data, function(i, kolumna){
						var kolumna =  kolumna.id + ";" + kolumna.kolumna1 + ";" + kolumna.kolumna2 + ";"+kolumna.kolumna3+ ";"+kolumna.kolumna4+"<br>";
						$('#getResultDiv .list-group').append(kolumna)
			        });
					console.log("Success: ", result);
				}else{
					$("#getResultDiv").html("Error");
					console.log("Fail: ", result);
				}
			},
			error : function(e) {
				$("#getResultDiv").html("Error");
				console.log("ERROR: ", e);
			}
		});
	}

	function ajaxGetDub(){
    		$.ajax({
    			type : "GET",
    			url : "http://"+window.location.host+ "/getDubAjax/" +document.getElementById("kolumna").value,
    			success: function(result){
    				if(result.status == "Done"){
    					$('#getResultDiv ul').empty();
    					var custList = "";
    					$.each(result.data, function(i, kolumna){
    						var kolumna =  kolumna.id + ";" + kolumna.kolumna1 + ";" + kolumna.kolumna2 + ";"+kolumna.kolumna3+ ";"+kolumna.kolumna4+"<br>";
    						$('#getResultDiv .list-group').append(kolumna)
    			        });
    					console.log("Success: ", result);
    				}else{
    					$("#getResultDiv").html("Error");
    					console.log("Fail: ", result);
    				}
    			},
    			error : function(e) {
    				$("#getResultDiv").html("Error");
    				console.log("ERROR: ", e);
    			}
    		});
    	}

})