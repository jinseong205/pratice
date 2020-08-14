function send(){
 
	var inputText = $("#inputText").val();
	
    var allData = { "inputText": inputText};
     
    $.ajax({
        url:"/pratice/test/hashingAjax",
        type:'POST',
        data: allData,
        
        success:function(allData){
            $('#resultDiv').text(allData);
        },
        
        error:function(jqXHR, textStatus, errorThrown){
            alert("Error");
        }
        
    });
}