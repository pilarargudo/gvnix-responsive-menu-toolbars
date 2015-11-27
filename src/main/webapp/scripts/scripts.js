// Init slick for overmenu & mediaqueries conditional

$(document).ready(function(){
    var width = $(window).width();
    if( width >= 768 ){
        // code for desktop view

    	//init Slick
  	  	$('.overmenu').slick({
		  infinite: false,
		  speed: 300,
		  variableWidth: true,
		  });

  	  	//overwrite styles Smartmenu + Slick
    	if ( $( 'ul.navbar-nav' ).hasClass( "overmenu" ) ) {
    	      $('.sm ul').addClass('smartmenu-slick');
    	};

    }
});

//Init slick for overmenu & mediaqueries conditional when window resize

$(window).resize(function() {
	 var width = $(window).width();
	    if( width >= 768 ){
	        // code for desktop view

	    	//init Slick
	  	  	$('.overmenu').slick({
			  infinite: false,
			  speed: 300,
			  variableWidth: true,
			  });

	  	  	//overwrite styles Smartmenu + Slick
	    	if ( $( 'ul.navbar-nav' ).hasClass( "overmenu" ) ) {
	    	      $('.sm ul').addClass('smartmenu-slick');
	    	};

	    }
});

$(window).resize();



