/* HTML*/
<div row  id="header-table">


<div class="col-md-4 col-xs-4" data-value="10">
   
          <div class="row">
            <span>TipoPago</span>
              <div data-colum="7" class="sort-icons col-md-6" id = "" >
                 <i id="btn-up-1" class="glyphicon glyphicon-menu-up"> </i>
                 <i id="btn-down-1" class="glyphicon glyphicon-menu-down"> </i>
              </div>
                                              </div>
                                         </div>                                 
                                

									    <div class="col-md-4 col-xs-4" data-value="11">
                                        
                                              <div class="row">
                                                 <span>Referencia</span>
                                                 <div data-colum="7" class="sort-icons icon-order-container col-md-3">
                                                <i id="btn-up-2" class="glyphicon glyphicon-menu-up"> </i>
                                                <i id="btn-up-2" class="glyphicon glyphicon-menu-down"> </i>
                                                 </div>
                                              </div>
                                                                         
                                    </div>

				<div class="col-md-4 col-xs-4" id="last-head-title" data-value="12">
                                       
                                              <div class="row">
                                                 <span>Estado</span>
                                                 <div data-colum="7" class="sort-icons icon-order-container col-md-3">
                                                    <i id="btn-up-3" class="glyphicon glyphicon-menu-up"> </i>
                                                    <i id="btn-down-3" class="glyphicon glyphicon-menu-down"> </i>
                                                 </div>
                                              </div>
                                                                     
             </div>
</div>

/*JS*/

$('#header-table').on('click', '.glyphicon-menu-up', function(){
	
});

$('#header-table').on('click', '.glyphicon-menu-up', function(){
	alert('ocultando');
  hideAllOrders();
  $(this).parent().children('.glyphicon-menu-down').show();
  
});

$('#header-table').on('click', '.glyphicon-menu-down', function(){
	alert('ocultando');
  hideAllOrders();
   $(this).parent().children('.glyphicon-menu-up').show();
});




function hideAllOrders(){
	$('#header-table .glyphicon-menu-up').each(function(index){
				//var columnTable = $(this).data("value");
				$(this).hide();
	});
  
  $('#header-table .glyphicon-menu-down').each(function(index){
				//var columnTable = $(this).data("value");
				$(this).hide();
	});
  
  
  
  
}

/*CSS*/
@import url('http://getbootstrap.com/dist/css/bootstrap.css');

/*URL*/
http://jsfiddle.net/Herst/humotrj0/
