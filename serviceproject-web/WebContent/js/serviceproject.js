function bodyLoad(){
	$('#newProject').hide();
	$('#title').html('Projects');
}

function getTasks(project) {
	
	$('#title').html('Projects: '+project);
	
		$('#tasks').empty();
	    $.ajax({
       type: "GET",
       url: "ReadTasks?p="+project,
	    contentType: "application/json; charset=utf-8",
       dataType: "json",
       success: function(res) {
		$('#tasks').append(CreateTableView(res.serviceproject.projects, "lightPro", true,1, "ReadTasks?name=", "name")).fadeIn();
       }
	   });
}

function newProject() {
	$('#newProject').show();
	
}

function postForm(formName, parentDiv){
	$(formName).submit(function(event) {

		
		
	    // stop form from submitting normally
	    event.preventDefault(); 
	        
	    // get some values from elements on the page:
	    var $form = $(formName),
	        term = $form.serialize(),
	        url = $form.attr( 'action' );

	    // Send the data using post and put the results in a div
	    $.post( url, term  ,
	      function( data ) {
	          $(parentDiv).hide();
	          $( "#result" ).html( 'damicao' );
	      },"json");
	  });
}