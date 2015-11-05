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

});

