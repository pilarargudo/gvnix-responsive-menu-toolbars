$(document).ready(function() {

//toolbar loaded
  if ( $( 'div' ).hasClass( "top-navbar-collapse" ) ) {
      $('body').addClass('top');
  };
  if ( $( 'div' ).hasClass( "bottom-navbar-collapse" ) ) {
      $('body').addClass('bottom');
  };
  if ( $( 'div' ).hasClass( "left-navbar-collapse" ) ) {
      $('body').addClass('left');
  };
  if ( $( 'div' ).hasClass( "right-navbar-collapse" ) ) {
      $('body').addClass('right');
  };

//init tooltip and position
   $('.sidebar.navbar-fixed-side-left [data-toggle="tooltip"]').tooltip({"placement":"right"});
   $('.sidebar.navbar-fixed-side-right [data-toggle="tooltip"]').tooltip({"placement":"left"});
   $('.navbar-default.navbar-fixed-top [data-toggle="tooltip"]').tooltip({"placement":"bottom"});
   $('.navbar-default.navbar-fixed-bottom [data-toggle="tooltip"]').tooltip({"placement":"top"});
});


